package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.HintView2;

public class GiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private final int TAB_ALL;
    private final int TAB_LIMITED;
    private UniversalAdapter adapter;
    private final Runnable closeParentSheet;
    private final int currentAccount;
    private final long dialogId;
    private final DefaultItemAnimator itemAnimator;
    private final ExtendedGridLayoutManager layoutManager;
    private final String name;
    private List options;
    private final FrameLayout premiumHeaderView;
    private final ArrayList premiumTiers;
    private int selectedTab;
    private final LinearLayout starsHeaderView;
    private final ArrayList tabs;

    public static class CardBackground extends Drawable {
        public final Paint paint;
        private final RectF rect;

        public CardBackground() {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.rect = new RectF();
            paint.setColor(Theme.getColor(Theme.key_dialogCardBackground));
            paint.setShadowLayer(AndroidUtilities.dp(2.66f), 0.0f, AndroidUtilities.dp(1.66f), Theme.getColor(Theme.key_dialogCardShadow));
        }

        @Override
        public void draw(Canvas canvas) {
            this.rect.set(getBounds());
            this.rect.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.paint);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public boolean getPadding(Rect rect) {
            rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            return true;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public static class GiftCell extends FrameLayout {
        private final AvatarDrawable avatarDrawable;
        private final BackupImageView avatarView;
        private Runnable cancel;
        private final FrameLayout card;
        private final int currentAccount;
        private final BackupImageView imageView;
        private TLRPC.Document lastDocument;
        private GiftPremiumBottomSheet$GiftTier lastTier;
        private TL_stars.UserStarGift lastUserGift;
        private final PremiumLockIconView lockView;
        private final TextView priceView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Ribbon ribbon;
        private final TextView subtitleView;
        private final TextView titleView;

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.object = giftPremiumBottomSheet$GiftTier;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.StarGift starGift) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = starGift;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.UserStarGift userStarGift) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = userStarGift;
                return spanCount;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                Object obj = uItem.object;
                if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                    ((GiftCell) view).setPremiumGift((GiftPremiumBottomSheet$GiftTier) obj);
                    return;
                }
                if (obj instanceof TL_stars.StarGift) {
                    ((GiftCell) view).setStarsGift((TL_stars.StarGift) obj);
                } else if (obj instanceof TL_stars.UserStarGift) {
                    ((GiftCell) view).setStarsGift((TL_stars.UserStarGift) obj);
                }
            }

            @Override
            public GiftCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, i, resourcesProvider);
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                Object obj = uItem.object;
                if (obj != null || uItem2.object != null) {
                    if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                        return obj == uItem2.object;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        Object obj2 = uItem2.object;
                        if (obj2 instanceof TL_stars.StarGift) {
                            return ((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id;
                        }
                    }
                    if (obj instanceof TL_stars.UserStarGift) {
                        Object obj3 = uItem2.object;
                        if (obj3 instanceof TL_stars.UserStarGift) {
                            return ((TL_stars.UserStarGift) obj).gift.id == ((TL_stars.UserStarGift) obj3).gift.id;
                        }
                    }
                }
                return uItem.intValue == uItem2.intValue && uItem.checked == uItem2.checked && uItem.longValue == uItem2.longValue && TextUtils.equals(uItem.text, uItem2.text);
            }
        }

        public GiftCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ScaleStateListAnimator.apply(this, 0.04f, 1.5f);
            FrameLayout frameLayout = new FrameLayout(context);
            this.card = frameLayout;
            frameLayout.setBackground(new CardBackground());
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            Ribbon ribbon = new Ribbon(context);
            this.ribbon = ribbon;
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(100, 100.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_GIFT_LOCK, resourcesProvider);
            this.lockView = premiumLockIconView;
            premiumLockIconView.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView, LayoutHelper.createFrame(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 93.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setGravity(17);
            textView2.setTextSize(1, 12.0f);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 111.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.priceView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            textView3.setBackground(new StarsBackground());
            textView3.setTextColor(-13397548);
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, 26.0f, 49, 0.0f, 133.0f, 0.0f, 11.0f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.avatarView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(20.0f));
            backupImageView2.setVisibility(8);
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        }

        private void setSticker(TLRPC.Document document, Object obj) {
            if (document == null) {
                this.imageView.clearImage();
                this.lastDocument = null;
            } else {
                if (this.lastDocument == document) {
                    return;
                }
                this.lastDocument = document;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
                this.imageView.setImage(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), obj);
            }
        }

        public void setPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
            int months = giftPremiumBottomSheet$GiftTier.getMonths();
            int i = 3;
            if (months <= 3) {
                i = 2;
            } else if (months > 6) {
                i = 4;
            }
            if (this.lastTier != giftPremiumBottomSheet$GiftTier) {
                BackupImageView backupImageView = this.imageView;
                Runnable giftImage = StarsIntroActivity.setGiftImage((View) backupImageView, backupImageView.getImageReceiver(), i);
                this.cancel = giftImage;
                if (giftImage != null) {
                    giftImage.run();
                    this.cancel = null;
                }
            }
            this.titleView.setText(LocaleController.formatPluralString("Gift2Months", months, new Object[0]));
            this.subtitleView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            this.titleView.setVisibility(0);
            this.subtitleView.setVisibility(0);
            this.imageView.setTranslationY(-AndroidUtilities.dp(8.0f));
            this.avatarView.setVisibility(8);
            this.lockView.setVisibility(8);
            if (giftPremiumBottomSheet$GiftTier.getDiscount() > 0) {
                this.ribbon.setVisibility(0);
                this.ribbon.setColor(-698031);
                this.ribbon.setText(12, LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(giftPremiumBottomSheet$GiftTier.getDiscount())), true);
            } else {
                this.ribbon.setVisibility(8);
            }
            this.priceView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.priceView.setText(giftPremiumBottomSheet$GiftTier.getFormattedPrice());
            this.priceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), 422810068));
            this.priceView.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) this.priceView.getLayoutParams()).topMargin = AndroidUtilities.dp(133.0f);
            this.lastTier = giftPremiumBottomSheet$GiftTier;
            this.lastDocument = null;
        }

        public void setStarsGift(TL_stars.StarGift starGift) {
            Runnable runnable = this.cancel;
            if (runnable != null) {
                runnable.run();
                this.cancel = null;
            }
            setSticker(starGift.sticker, starGift);
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            this.imageView.setTranslationY(0.0f);
            this.lockView.setVisibility(8);
            if (starGift.limited) {
                this.ribbon.setVisibility(0);
                this.ribbon.setColor(-12147470);
                this.ribbon.setText(LocaleController.getString(R.string.Gift2LimitedRibbon), false);
            } else {
                this.ribbon.setVisibility(8);
            }
            this.avatarView.setVisibility(8);
            this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.priceView.setText(StarsIntroActivity.replaceStarsWithPlain("XTR " + LocaleController.formatNumber(starGift.stars, ','), 0.71f));
            this.priceView.setBackground(new StarsBackground());
            this.priceView.setTextColor(-4229632);
            ((ViewGroup.MarginLayoutParams) this.priceView.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            this.lastTier = null;
        }

        public void setStarsGift(TL_stars.UserStarGift userStarGift) {
            Runnable runnable = this.cancel;
            if (runnable != null) {
                runnable.run();
                this.cancel = null;
            }
            setSticker(userStarGift.gift.sticker, userStarGift);
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            this.imageView.setTranslationY(0.0f);
            this.lockView.setWaitingImage();
            this.lockView.setVisibility(0);
            if (this.lastUserGift == userStarGift) {
                this.lockView.animate().alpha(userStarGift.unsaved ? 1.0f : 0.0f).scaleX(userStarGift.unsaved ? 1.0f : 0.4f).scaleY(userStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            } else {
                this.lockView.setAlpha(userStarGift.unsaved ? 1.0f : 0.0f);
                this.lockView.setScaleX(userStarGift.unsaved ? 1.0f : 0.4f);
                this.lockView.setScaleY(userStarGift.unsaved ? 1.0f : 0.4f);
            }
            if (userStarGift.gift.limited) {
                this.ribbon.setVisibility(0);
                this.ribbon.setColor(-12147470);
                this.ribbon.setText(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(userStarGift.gift.availability_total, 0)), true);
            } else {
                this.ribbon.setVisibility(8);
            }
            if (userStarGift.name_hidden) {
                this.avatarView.setVisibility(0);
                CombinedDrawable platformDrawable = StarsIntroActivity.StarsTransactionView.getPlatformDrawable("anonymous");
                platformDrawable.setIconSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                this.avatarView.setImageDrawable(platformDrawable);
            } else {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(userStarGift.from_id));
                if (user != null) {
                    this.avatarView.setVisibility(0);
                    this.avatarDrawable.setInfo(user);
                    this.avatarView.setForUserOrChat(user, this.avatarDrawable);
                } else {
                    this.avatarView.setVisibility(8);
                }
            }
            this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            TextView textView = this.priceView;
            StringBuilder sb = new StringBuilder();
            sb.append("XTR ");
            long j = userStarGift.convert_stars;
            if (j <= 0) {
                j = userStarGift.gift.convert_stars;
            }
            sb.append(LocaleController.formatNumber(j, ','));
            textView.setText(StarsIntroActivity.replaceStarsWithPlain(sb.toString(), 0.66f));
            this.priceView.setBackground(new StarsBackground());
            this.priceView.setTextColor(-4229632);
            ((ViewGroup.MarginLayoutParams) this.priceView.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            this.lastUserGift = userStarGift;
            this.lastTier = null;
        }
    }

    public static class Ribbon extends View {
        private Paint paint;
        private Path path;
        private Text text;

        public Ribbon(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.path = new Path();
            this.paint.setColor(-698031);
            this.paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        }

        public static void fillRibbonPath(Path path, float f) {
            path.rewind();
            float f2 = 24.5f * f;
            path.moveTo(AndroidUtilities.dp(46.83f * f), AndroidUtilities.dp(f2));
            path.lineTo(AndroidUtilities.dp(23.5f * f), AndroidUtilities.dp(1.17f * f));
            path.cubicTo(AndroidUtilities.dp(22.75f * f), AndroidUtilities.dp(0.42f * f), AndroidUtilities.dp(21.73f * f), 0.0f, AndroidUtilities.dp(20.68f * f), 0.0f);
            float f3 = 0.05f * f;
            path.cubicTo(AndroidUtilities.dp(19.62f * f), 0.0f, AndroidUtilities.dp(2.73f * f), AndroidUtilities.dp(f3), AndroidUtilities.dp(1.55f * f), AndroidUtilities.dp(f3));
            path.cubicTo(AndroidUtilities.dp(0.36f * f), AndroidUtilities.dp(f3), AndroidUtilities.dp((-0.23f) * f), AndroidUtilities.dp(1.4885f * f), AndroidUtilities.dp(0.6f * f), AndroidUtilities.dp(2.32f * f));
            path.lineTo(AndroidUtilities.dp(45.72f * f), AndroidUtilities.dp(47.44f * f));
            float f4 = 48.0f * f;
            path.cubicTo(AndroidUtilities.dp(46.56f * f), AndroidUtilities.dp(48.28f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(47.68f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(46.5f * f));
            path.cubicTo(AndroidUtilities.dp(f4), AndroidUtilities.dp(45.31f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(28.38f * f), AndroidUtilities.dp(f4), AndroidUtilities.dp(27.32f * f));
            path.cubicTo(AndroidUtilities.dp(f4), AndroidUtilities.dp(26.26f * f), AndroidUtilities.dp(47.5f * f), AndroidUtilities.dp(25.24f * f), AndroidUtilities.dp(f * 46.82f), AndroidUtilities.dp(f2));
            path.close();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.drawPath(this.path, this.paint);
            if (this.text != null) {
                canvas.save();
                canvas.rotate(45.0f, (getWidth() / 2.0f) + AndroidUtilities.dp(6.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(6.0f));
                this.text.ellipsize(AndroidUtilities.dp(72.0f));
                float min = Math.min(1.0f, AndroidUtilities.dp(56.0f) / this.text.getCurrentWidth());
                canvas.scale(min, min, (getWidth() / 2.0f) + AndroidUtilities.dp(6.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(6.0f));
                this.text.draw(canvas, ((getWidth() / 2.0f) + AndroidUtilities.dp(6.0f)) - (this.text.getWidth() / 2.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(5.0f), -1, 1.0f);
                canvas.restore();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            fillRibbonPath(this.path, 1.0f);
            setMeasuredDimension(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.text = new Text(charSequence, i, z ? AndroidUtilities.bold() : null);
            invalidate();
        }

        public void setText(CharSequence charSequence, boolean z) {
            setText(z ? 10 : 11, charSequence, z);
        }
    }

    public static class StarsBackground extends Drawable {
        public final Paint backgroundPaint;
        public final StarsReactionsSheet.Particles particles;
        public final RectF rectF = new RectF();
        public final Path path = new Path();

        public StarsBackground() {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setColor(1088989954);
            this.particles = new StarsReactionsSheet.Particles(1, 25);
        }

        @Override
        public void draw(Canvas canvas) {
            float min = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
            this.rectF.set(getBounds());
            this.path.rewind();
            this.path.addRoundRect(this.rectF, min, min, Path.Direction.CW);
            canvas.drawPath(this.path, this.backgroundPaint);
            canvas.save();
            canvas.clipPath(this.path);
            this.particles.setBounds(this.rectF);
            this.particles.process();
            this.particles.draw(canvas, -1009635);
            canvas.restore();
            invalidateSelf();
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
            this.backgroundPaint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.backgroundPaint.setColorFilter(colorFilter);
        }
    }

    public static class Tabs extends HorizontalScrollView {
        private AnimatedFloat animatedSelected;
        private final RectF ceiledRect;
        private final RectF flooredRect;
        private int lastId;
        private final LinearLayout layout;
        private final Theme.ResourcesProvider resourcesProvider;
        private int selected;
        private final Paint selectedPaint;
        private final RectF selectedRect;
        private final ArrayList tabs;

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asTabs(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.object = arrayList;
                ofFactory.intValue = i2;
                ofFactory.object2 = callback;
                return ofFactory;
            }

            private static boolean eq(ArrayList arrayList, ArrayList arrayList2) {
                if (arrayList == arrayList2) {
                    return true;
                }
                if (arrayList == null && arrayList2 == null) {
                    return true;
                }
                if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                    return false;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) arrayList2.get(i))) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                ((Tabs) view).set(uItem.id, (ArrayList) uItem.object, uItem.intValue, (Utilities.Callback) uItem.object2);
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.object2 == uItem2.object2 && equals(uItem, uItem2);
            }

            @Override
            public Tabs createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Tabs(context, resourcesProvider);
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id && eq((ArrayList) uItem.object, (ArrayList) uItem2.object);
            }
        }

        public Tabs(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.tabs = new ArrayList();
            this.flooredRect = new RectF();
            this.ceiledRect = new RectF();
            this.selectedRect = new RectF();
            this.selectedPaint = new Paint(1);
            this.lastId = Integer.MIN_VALUE;
            this.resourcesProvider = resourcesProvider;
            LinearLayout linearLayout = new LinearLayout(context) {
                private final void setBounds(RectF rectF, View view) {
                    rectF.set(view.getLeft() + AndroidUtilities.dp(5.0f), view.getTop(), view.getRight() - AndroidUtilities.dp(5.0f), view.getBottom());
                }

                @Override
                protected void dispatchDraw(android.graphics.Canvas r7) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.Tabs.AnonymousClass1.dispatchDraw(android.graphics.Canvas):void");
                }
            };
            this.layout = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f));
            addView(linearLayout);
            setHorizontalScrollBarEnabled(false);
            this.animatedSelected = new AnimatedFloat(linearLayout, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public void lambda$set$0(int i, Utilities.Callback callback, View view) {
            TextView textView = (TextView) this.tabs.get(i);
            smoothScrollTo(textView.getLeft() - (textView.getWidth() / 2), 0);
            if (callback != null) {
                callback.run(Integer.valueOf(i));
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void set(int i, ArrayList arrayList, int i2, final Utilities.Callback callback) {
            boolean z = this.lastId == i;
            this.lastId = i;
            if (this.tabs.size() != arrayList.size()) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.tabs.size()) {
                    CharSequence charSequence = i4 < arrayList.size() ? (CharSequence) arrayList.get(i4) : null;
                    if (charSequence == null) {
                        this.layout.removeView((View) this.tabs.remove(i3));
                        i3--;
                    } else {
                        ((TextView) this.tabs.get(i3)).setText(charSequence);
                    }
                    i4++;
                    i3++;
                }
                while (i4 < arrayList.size()) {
                    TextView textView = new TextView(getContext());
                    textView.setGravity(17);
                    textView.setText((CharSequence) arrayList.get(i4));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(Theme.blendOver(Theme.getColor(Theme.key_dialogGiftsBackground), Theme.getColor(Theme.key_dialogGiftsTabText)));
                    textView.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    ScaleStateListAnimator.apply(textView, 0.075f, 1.4f);
                    this.layout.addView(textView, LayoutHelper.createLinear(-2, 26));
                    this.tabs.add(textView);
                    i4++;
                }
            }
            this.selected = i2;
            if (!z) {
                this.animatedSelected.set(i2, true);
            }
            this.layout.invalidate();
            for (final int i5 = 0; i5 < this.tabs.size(); i5++) {
                ((TextView) this.tabs.get(i5)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        GiftSheet.Tabs.this.lambda$set$0(i5, callback, view);
                    }
                });
            }
        }
    }

    public GiftSheet(final Context context, final int i, long j, List list, final Runnable runnable) {
        super(context, null, false, false, false, null);
        this.premiumTiers = new ArrayList();
        this.TAB_ALL = 0;
        this.TAB_LIMITED = 1;
        this.tabs = new ArrayList();
        this.currentAccount = i;
        this.dialogId = j;
        this.options = list;
        this.closeParentSheet = runnable;
        int i2 = Theme.key_dialogGiftsBackground;
        setBackgroundColor(Theme.getColor(i2));
        fixNavigationBar(Theme.getColor(i2));
        StarsController.getInstance(i).loadStarGifts();
        final TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        String forcedFirstName = UserObject.getForcedFirstName(user);
        this.name = forcedFirstName;
        this.topPadding = 0.15f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.premiumHeaderView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(StarsIntroActivity.makeParticlesView(context, 70, 0), LayoutHelper.createFrame(-1, -1.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        frameLayout2.addView(backupImageView, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 150.0f));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 145.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 4, 0, 4, 0));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, this.resourcesProvider);
        int i4 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i4, this.resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        linksTextView.setGravity(17);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 4, 9, 4, 10));
        textView.setText(LocaleController.getString(R.string.Gift2Premium));
        linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, forcedFirstName)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new Runnable() {
            @Override
            public final void run() {
                GiftSheet.lambda$new$0();
            }
        }), true)));
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.starsHeaderView = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        textView2.setGravity(17);
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 4, 16, 4, 0));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, this.resourcesProvider);
        linksTextView2.setLinkTextColor(Theme.getColor(i4, this.resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        linksTextView2.setGravity(17);
        linearLayout2.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 1, 4, 9, 4, 10));
        textView2.setText(LocaleController.getString(R.string.Gift2Stars));
        linksTextView2.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsInfo, forcedFirstName)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new Runnable() {
            @Override
            public final void run() {
                GiftSheet.lambda$new$1(context);
            }
        }), true)));
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 3);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i5) {
                UItem item;
                int i6;
                return (GiftSheet.this.adapter == null || i5 == 0 || (item = GiftSheet.this.adapter.getItem(i5 + (-1))) == null || (i6 = item.spanCount) == -1) ? GiftSheet.this.layoutManager.getSpanCount() : i6;
            }
        });
        this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.3f;
            }
        };
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayIncrement(40L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                GiftSheet.this.lambda$new$11(user, runnable, i, context, view, i5);
            }
        });
        updatePremiumTiers();
        this.adapter.update(false);
        updateTitle();
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.userInfoDidLoad);
    }

    public void lambda$fillItems$16(UniversalAdapter universalAdapter, Integer num) {
        if (this.selectedTab == num.intValue()) {
            return;
        }
        this.selectedTab = num.intValue();
        this.itemAnimator.endAnimations();
        universalAdapter.update(true);
    }

    public static void lambda$new$0() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PremiumPreviewFragment("gifts"), bottomSheetParams);
    }

    public static void lambda$new$1(Context context) {
        new ExplainStarsSheet(context).show();
    }

    public void lambda$new$10(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
    }

    public void lambda$new$11(final TLRPC.User user, final Runnable runnable, final int i, Context context, View view, int i2) {
        UItem item = this.adapter.getItem(i2 - 1);
        if (item != null && item.instanceOf(GiftCell.Factory.class)) {
            Object obj = item.object;
            if (!(obj instanceof GiftPremiumBottomSheet$GiftTier)) {
                if (obj instanceof TL_stars.StarGift) {
                    new SendGiftSheet(context, i, (TL_stars.StarGift) obj, this.dialogId, new Runnable() {
                        @Override
                        public final void run() {
                            GiftSheet.this.lambda$new$10(runnable);
                        }
                    }).show();
                    return;
                }
                return;
            }
            final GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) obj;
            final BaseFragment baseFragment = new BaseFragment() {
                @Override
                public Context getContext() {
                    return GiftSheet.this.getContext();
                }

                @Override
                public Activity getParentActivity() {
                    Activity ownerActivity = GiftSheet.this.getOwnerActivity();
                    if (ownerActivity == null || ownerActivity.isFinishing()) {
                        ownerActivity = LaunchActivity.instance;
                    }
                    return (ownerActivity == null || ownerActivity.isFinishing()) ? AndroidUtilities.findActivity(getContext()) : ownerActivity;
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return ((BottomSheet) GiftSheet.this).resourcesProvider;
                }
            };
            if (giftPremiumBottomSheet$GiftTier.giftCodeOption != null) {
                BoostRepository.payGiftCode(new ArrayList(Arrays.asList(user)), giftPremiumBottomSheet$GiftTier.giftCodeOption, null, null, baseFragment, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        GiftSheet.this.lambda$new$3(runnable, user, (Void) obj2);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        GiftSheet.this.lambda$new$4((TLRPC.TL_error) obj2);
                    }
                });
                return;
            }
            if (BuildVars.useInvoiceBilling()) {
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    Uri parse = Uri.parse(giftPremiumBottomSheet$GiftTier.giftOption.bot_url);
                    if (parse.getHost().equals("t.me")) {
                        if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                            launchActivity.setNavigateToPremiumGiftCallback(new Runnable() {
                                @Override
                                public final void run() {
                                    GiftSheet.this.lambda$new$5();
                                }
                            });
                        } else {
                            launchActivity.setNavigateToPremiumBot(true);
                        }
                    }
                    Browser.openUrl(launchActivity, giftPremiumBottomSheet$GiftTier.giftOption.bot_url);
                    dismiss();
                    return;
                }
                return;
            }
            if (!BillingController.getInstance().isReady() || giftPremiumBottomSheet$GiftTier.googlePlayProductDetails == null) {
                return;
            }
            final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
            tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(i).getInputUser(user);
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = giftPremiumBottomSheet$GiftTier.googlePlayProductDetails.getOneTimePurchaseOfferDetails();
            tL_inputStorePaymentGiftPremium.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
            double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
            double pow = Math.pow(10.0d, 6.0d);
            Double.isNaN(priceAmountMicros);
            tL_inputStorePaymentGiftPremium.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)));
            BillingController.getInstance().addResultListener(giftPremiumBottomSheet$GiftTier.giftOption.store_product, new Consumer() {
                @Override
                public final void accept(Object obj2) {
                    GiftSheet.this.lambda$new$7((BillingResult) obj2);
                }
            });
            final TLRPC.TL_payments_canPurchasePremium tL_payments_canPurchasePremium = new TLRPC.TL_payments_canPurchasePremium();
            tL_payments_canPurchasePremium.purpose = tL_inputStorePaymentGiftPremium;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_canPurchasePremium, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GiftSheet.lambda$new$9(BaseFragment.this, i, tL_inputStorePaymentGiftPremium, giftPremiumBottomSheet$GiftTier, tL_payments_canPurchasePremium, tLObject, tL_error);
                }
            });
        }
    }

    public static void lambda$new$2(TLRPC.User user) {
        PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(user)));
    }

    public void lambda$new$3(Runnable runnable, final TLRPC.User user, Void r4) {
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.lambda$new$2(TLRPC.User.this);
            }
        }, 250L);
    }

    public void lambda$new$4(TLRPC.TL_error tL_error) {
        BoostDialogs.showToastError(getContext(), tL_error);
    }

    public void lambda$new$5() {
        onGiftSuccess(false);
    }

    public void lambda$new$6() {
        onGiftSuccess(true);
    }

    public void lambda$new$7(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GiftSheet.this.lambda$new$6();
                }
            });
        }
    }

    public static void lambda$new$8(TLObject tLObject, BaseFragment baseFragment, int i, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchasePremium tL_payments_canPurchasePremium) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().launchBillingFlow(baseFragment.getParentActivity(), AccountInstance.getInstance(i), tL_inputStorePaymentGiftPremium, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(giftPremiumBottomSheet$GiftTier.googlePlayProductDetails).build()));
        } else if (tL_error != null) {
            AlertsCreator.processError(i, tL_error, null, tL_payments_canPurchasePremium, new Object[0]);
        }
    }

    public static void lambda$new$9(final BaseFragment baseFragment, final int i, final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, final GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, final TLRPC.TL_payments_canPurchasePremium tL_payments_canPurchasePremium, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.lambda$new$8(TLObject.this, baseFragment, i, tL_inputStorePaymentGiftPremium, giftPremiumBottomSheet$GiftTier, tL_error, tL_payments_canPurchasePremium);
            }
        });
    }

    public void lambda$onGiftSuccess$12(INavigationLayout iNavigationLayout) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.dialogId);
        iNavigationLayout.presentFragment(new ChatActivity(bundle), true);
    }

    public void lambda$updatePremiumTiers$13() {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    public void lambda$updatePremiumTiers$14(BillingResult billingResult, List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            ProductDetails productDetails = (ProductDetails) it.next();
            Iterator it2 = this.premiumTiers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = (GiftPremiumBottomSheet$GiftTier) it2.next();
                    if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && giftPremiumBottomSheet$GiftTier.getStoreProduct().equals(productDetails.getProductId())) {
                        giftPremiumBottomSheet$GiftTier.setGooglePlayProductDetails(productDetails);
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > j) {
                            j = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        }
                    }
                }
            }
        }
        Iterator it3 = this.premiumTiers.iterator();
        while (it3.hasNext()) {
            ((GiftPremiumBottomSheet$GiftTier) it3.next()).setPricePerMonthRegular(j);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GiftSheet.this.lambda$updatePremiumTiers$13();
            }
        });
    }

    public void lambda$updatePremiumTiers$15(List list) {
        if (getContext() == null || !isShown()) {
            return;
        }
        List filterGiftOptions = BoostRepository.filterGiftOptions(list, 1);
        this.options = filterGiftOptions;
        List filterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(filterGiftOptions);
        this.options = filterGiftOptionsByBilling;
        if (filterGiftOptionsByBilling.isEmpty()) {
            return;
        }
        updatePremiumTiers();
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    private void onGiftSuccess(boolean z) {
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.dialogId);
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(this.currentAccount).putUser(user, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null && (safeLastFragment.getParentActivity() instanceof LaunchActivity)) {
            ArrayList<BaseFragment> arrayList = new ArrayList(((LaunchActivity) safeLastFragment.getParentActivity()).getActionBarLayout().getFragmentStack());
            final INavigationLayout parentLayout = safeLastFragment.getParentLayout();
            ChatActivity chatActivity = null;
            for (BaseFragment baseFragment : arrayList) {
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                    if (chatActivity.getDialogId() != this.dialogId) {
                        baseFragment.removeSelfFromStack();
                    }
                } else if (baseFragment instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == baseFragment) {
                        baseFragment.lambda$onBackPressed$300();
                    }
                    baseFragment.removeSelfFromStack();
                }
            }
            if (chatActivity == null || chatActivity.getDialogId() != this.dialogId) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.this.lambda$onGiftSuccess$12(parentLayout);
                    }
                }, 200L);
            }
        }
        dismiss();
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void updatePremiumTiers() {
        List list;
        this.premiumTiers.clear();
        if (this.premiumTiers.isEmpty() && (list = this.options) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            long j = 0;
            for (int size = this.options.size() - 1; size >= 0; size--) {
                GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = new GiftPremiumBottomSheet$GiftTier((TLRPC.TL_premiumGiftCodeOption) this.options.get(size));
                this.premiumTiers.add(giftPremiumBottomSheet$GiftTier);
                if (BuildVars.useInvoiceBilling()) {
                    if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > j) {
                        j = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                    }
                } else if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && BillingController.getInstance().isReady()) {
                    arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(giftPremiumBottomSheet$GiftTier.getStoreProduct()).build());
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                Iterator it = this.premiumTiers.iterator();
                while (it.hasNext()) {
                    ((GiftPremiumBottomSheet$GiftTier) it.next()).setPricePerMonthRegular(j);
                }
            } else if (!arrayList.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList, new ProductDetailsResponseListener() {
                    @Override
                    public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                        GiftSheet.this.lambda$updatePremiumTiers$14(billingResult, list2);
                    }
                });
            }
        }
        if (this.premiumTiers.isEmpty()) {
            BoostRepository.loadGiftOptions(this.currentAccount, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftSheet.this.lambda$updatePremiumTiers$15((List) obj);
                }
            });
        }
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.billingProductDetailsUpdated) {
            updatePremiumTiers();
            return;
        }
        if (i == NotificationCenter.starGiftsLoaded) {
            universalAdapter = this.adapter;
            if (universalAdapter == null) {
                return;
            }
        } else {
            if (i != NotificationCenter.userInfoDidLoad || !isShown()) {
                return;
            }
            ArrayList arrayList = this.premiumTiers;
            if (arrayList != null && !arrayList.isEmpty()) {
                return;
            }
            updatePremiumTiers();
            universalAdapter = this.adapter;
            if (universalAdapter == null) {
                return;
            }
        }
        universalAdapter.update(true);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
    }

    public void fillItems(ArrayList arrayList, final UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.premiumHeaderView));
        ArrayList arrayList2 = this.premiumTiers;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            arrayList.add(UItem.asFlicker(1, 34).setSpanCount(1));
            arrayList.add(UItem.asFlicker(2, 34).setSpanCount(1));
            arrayList.add(UItem.asFlicker(3, 34).setSpanCount(1));
        } else {
            Iterator it = this.premiumTiers.iterator();
            while (it.hasNext()) {
                arrayList.add(GiftCell.Factory.asPremiumGift((GiftPremiumBottomSheet$GiftTier) it.next()));
            }
        }
        ArrayList arrayList3 = StarsController.getInstance(this.currentAccount).gifts;
        if (MessagesController.getInstance(this.currentAccount).stargiftsBlocked || arrayList3.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asCustom(this.starsHeaderView));
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < arrayList3.size(); i++) {
            treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i)).stars));
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(LocaleController.getString(R.string.Gift2TabAll));
        arrayList4.add(LocaleController.getString(R.string.Gift2TabLimited));
        Iterator it2 = treeSet.iterator();
        ArrayList arrayList5 = new ArrayList();
        while (it2.hasNext()) {
            Long l = (Long) it2.next();
            arrayList4.add(StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber(l.longValue(), ','), 0.8f));
            arrayList5.add(l);
        }
        arrayList.add(Tabs.Factory.asTabs(1, arrayList4, this.selectedTab, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                GiftSheet.this.lambda$fillItems$16(universalAdapter, (Integer) obj);
            }
        }));
        int i2 = this.selectedTab - 2;
        long longValue = (i2 < 0 || i2 >= arrayList5.size()) ? 0L : ((Long) arrayList5.get(this.selectedTab - 2)).longValue();
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i3);
            int i4 = this.selectedTab;
            if (i4 == 0 || ((i4 == 1 && starGift.limited) || (i4 >= 2 && starGift.stars == longValue))) {
                arrayList.add(GiftCell.Factory.asStarGift(i4, starGift));
            }
        }
        if (StarsController.getInstance(this.currentAccount).giftsLoading) {
            arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
            arrayList.add(UItem.asFlicker(5, 34).setSpanCount(1));
            arrayList.add(UItem.asFlicker(6, 34).setSpanCount(1));
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(40.0f)));
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.formatString(R.string.Gift2User, this.name);
    }
}
