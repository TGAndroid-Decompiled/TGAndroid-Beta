package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Shaker;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.StarGiftPatterns;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.HintView2;

public class GiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private int TAB_ALL;
    private int TAB_IN_STOCK;
    private int TAB_LIMITED;
    private int TAB_MY_GIFTS;
    private UniversalAdapter adapter;
    private final StarsIntroActivity.StarsBalanceView balanceView;
    private boolean birthday;
    private final Runnable closeParentSheet;
    private final int currentAccount;
    private final long dialogId;
    private final DefaultItemAnimator itemAnimator;
    private final ExtendedGridLayoutManager layoutManager;
    private final StarsController.GiftsList myGifts;
    private final String name;
    private List options;
    private final FrameLayout premiumHeaderView;
    private final ArrayList premiumTiers;
    private int selectedTab;
    private final boolean self;
    private final LinearLayout starsHeaderView;
    private final ArrayList tabs;
    private final FrameLayout topView;
    private TLRPC.DisallowedGiftsSettings userSettings;

    public static class CardBackground extends Drawable {
        private AnimatedFloat animatedSelected;
        private TL_stars.starGiftAttributeBackdrop backdrop;
        private final Path clipPath;
        private RadialGradient gradient;
        private final Matrix gradientMatrix;
        private int gradientRadius;
        public final Paint paint;
        private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean selected;
        private final Paint selectedPaint;
        private final View view;

        public CardBackground(View view, Theme.ResourcesProvider resourcesProvider, boolean z) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.rect = new RectF();
            this.clipPath = new Path();
            this.gradientMatrix = new Matrix();
            Paint paint2 = new Paint(1);
            this.selectedPaint = paint2;
            this.animatedSelected = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    GiftSheet.CardBackground.this.invalidate();
                }
            }, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.view = view;
            this.resourcesProvider = resourcesProvider;
            this.pattern = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(28.0f)) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    if (CardBackground.this.getCallback() != null) {
                        CardBackground.this.getCallback().invalidateDrawable(CardBackground.this);
                    }
                }
            };
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view2) {
                    CardBackground.this.pattern.attach();
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    CardBackground.this.pattern.detach();
                }
            });
            if (view.isAttachedToWindow()) {
                this.pattern.attach();
            }
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            if (z) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), Theme.getColor(Theme.key_dialogCardShadow, resourcesProvider));
            }
            paint2.setStyle(Paint.Style.STROKE);
        }

        @Override
        public void draw(Canvas canvas) {
            draw(canvas, 0.0f);
        }

        public void draw(Canvas canvas, float f) {
            Paint paint;
            RadialGradient radialGradient;
            Rect bounds = getBounds();
            float f2 = this.animatedSelected.set(this.selected);
            this.rect.set(bounds);
            this.rect.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
            if (this.backdrop != null) {
                int lerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f);
                if (this.gradient == null || this.gradientRadius != lerp) {
                    this.gradientRadius = lerp;
                    float f3 = lerp;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
                    this.gradient = new RadialGradient(0.0f, 0.0f, f3, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.gradientMatrix.reset();
                this.gradientMatrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
                this.gradient.setLocalMatrix(this.gradientMatrix);
                paint = this.paint;
                radialGradient = this.gradient;
            } else {
                paint = this.paint;
                radialGradient = null;
            }
            paint.setShader(radialGradient);
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.paint);
            if (this.backdrop != null && !this.pattern.isEmpty()) {
                this.pattern.setColor(Integer.valueOf((-16777216) | this.backdrop.pattern_color));
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.rect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                canvas.translate(bounds.centerX(), bounds.centerY());
                float lerp2 = AndroidUtilities.lerp(1.0f, 0.925f, f2);
                canvas.scale(lerp2, lerp2);
                if (f < 1.0f) {
                    StarGiftPatterns.drawPattern(canvas, 2, this.pattern, bounds.width(), bounds.height(), 1.0f - f, 1.0f);
                }
                if (f > 0.0f) {
                    canvas.translate(0.0f, AndroidUtilities.dp(-31.0f));
                    StarGiftPatterns.drawPattern(canvas, 0, this.pattern, bounds.width(), bounds.height(), f, 1.0f);
                }
                canvas.restore();
            }
            if (f2 > 0.0f) {
                this.selectedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.selectedPaint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.rect);
                float lerp3 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dp(5.166f), f2);
                rectF.inset(lerp3, lerp3);
                float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dpf2(11.0f), AndroidUtilities.dpf2(6.66f), f2);
                canvas.drawRoundRect(rectF, lerp4, lerp4, this.selectedPaint);
            }
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

        public void invalidate() {
            this.view.invalidate();
            if (getCallback() != null) {
                getCallback().invalidateDrawable(this);
            }
        }

        @Override
        public void setAlpha(int i) {
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (this.backdrop != stargiftattributebackdrop) {
                this.gradient = null;
            }
            this.backdrop = stargiftattributebackdrop;
            invalidate();
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public void setPattern(TL_stars.starGiftAttributePattern stargiftattributepattern) {
            if (stargiftattributepattern == null) {
                this.pattern.set((Drawable) null, false);
            } else {
                this.pattern.set(stargiftattributepattern.document, false);
            }
        }

        public void setSelected(boolean z, boolean z2) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            if (!z2) {
                this.animatedSelected.force(z);
            }
            invalidate();
        }
    }

    public static class GiftCell extends FrameLayout {
        private final AnimatedFloat animatedReordering;
        private final AvatarDrawable avatarDrawable;
        private final BackupImageView avatarView;
        private Runnable cancel;
        private final FrameLayout card;
        private final CardBackground cardBackground;
        private final Rect cardBackgroundPadding;
        private final int currentAccount;
        private TL_stars.StarGift gift;
        private boolean giftMine;
        public final BackupImageView imageView;
        private final FrameLayout.LayoutParams imageViewLayoutParams;
        private TLRPC.Document lastDocument;
        private long lastDocumentId;
        private GiftPremiumBottomSheet$GiftTier lastTier;
        private TL_stars.SavedStarGift lastUserGift;
        private final PremiumLockIconView lockView;
        private final PremiumLockIconView pinView;
        private boolean pinned;
        private boolean pinnedIcon;
        private final ImageView pinnedImageView;
        private final FrameLayout pinnedView;
        private GiftPremiumBottomSheet$GiftTier premiumTier;
        private final TextView priceView;
        private boolean reordering;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Ribbon ribbon;
        private final Shaker shaker;
        private final TextView starsPriceView;
        private Text subtitle;
        private final TextView subtitleView;
        private Text title;
        private final TextView titleView;
        private TL_stars.SavedStarGift userGift;

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.object = giftPremiumBottomSheet$GiftTier;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.SavedStarGift savedStarGift, boolean z) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = savedStarGift;
                spanCount.accent = z;
                return spanCount;
            }

            public static UItem asStarGift(int i, TL_stars.StarGift starGift, boolean z, boolean z2) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = starGift;
                spanCount.checked = z;
                spanCount.object2 = Boolean.valueOf(z2);
                return spanCount;
            }

            @Override
            public void attachedView(View view, UItem uItem) {
                ((GiftCell) view).setReordering(uItem.reordering, false);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                Object obj = uItem.object;
                if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                    ((GiftCell) view).setPremiumGift((GiftPremiumBottomSheet$GiftTier) obj);
                } else if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    GiftCell giftCell = (GiftCell) view;
                    boolean z2 = uItem.checked;
                    Object obj2 = uItem.object2;
                    giftCell.setStarsGift(starGift, z2, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false);
                } else if (obj instanceof TL_stars.SavedStarGift) {
                    ((GiftCell) view).setStarsGift((TL_stars.SavedStarGift) obj, uItem.accent);
                }
                ((GiftCell) view).setReordering(uItem.reordering, false);
            }

            @Override
            public GiftCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, i, resourcesProvider);
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                if (uItem.accent != uItem2.accent) {
                    return false;
                }
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
                    if (obj instanceof TL_stars.SavedStarGift) {
                        Object obj3 = uItem2.object;
                        if (obj3 instanceof TL_stars.SavedStarGift) {
                            return ((TL_stars.SavedStarGift) obj).gift.id == ((TL_stars.SavedStarGift) obj3).gift.id;
                        }
                    }
                }
                return uItem.intValue == uItem2.intValue && uItem.checked == uItem2.checked && uItem.longValue == uItem2.longValue && TextUtils.equals(uItem.text, uItem2.text);
            }
        }

        public GiftCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.cardBackgroundPadding = new Rect();
            this.animatedReordering = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ScaleStateListAnimator.apply(this, 0.04f, 1.5f);
            this.shaker = new Shaker(this);
            FrameLayout frameLayout = new FrameLayout(context);
            this.card = frameLayout;
            CardBackground cardBackground = new CardBackground(frameLayout, resourcesProvider, true);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            Ribbon ribbon = new Ribbon(context);
            this.ribbon = ribbon;
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
            this.imageViewLayoutParams = createFrame;
            frameLayout.addView(backupImageView, createFrame);
            PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_GIFT_LOCK, resourcesProvider);
            this.lockView = premiumLockIconView;
            premiumLockIconView.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView, LayoutHelper.createFrame(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            PremiumLockIconView premiumLockIconView2 = new PremiumLockIconView(context, PremiumLockIconView.TYPE_GIFT_PIN, resourcesProvider);
            this.pinView = premiumLockIconView2;
            premiumLockIconView2.setImageReceiver(backupImageView.getImageReceiver());
            frameLayout.addView(premiumLockIconView2, LayoutHelper.createFrame(44, 44, 17));
            premiumLockIconView2.setAlpha(0.0f);
            premiumLockIconView2.setScaleX(0.3f);
            premiumLockIconView2.setScaleY(0.3f);
            premiumLockIconView2.setVisibility(8);
            TextView textView = new TextView(context);
            this.titleView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setGravity(17);
            textView2.setTextSize(1, 12.0f);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.priceView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            textView3.setBackground(new StarsBackground(Theme.isCurrentThemeDark() ? 518759725 : 1088989954));
            textView3.setTextColor(-13397548);
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, 26.0f, 49, 0.0f, 130.0f, 0.0f, 11.0f));
            TextView textView4 = new TextView(context);
            this.starsPriceView = textView4;
            textView4.setTextSize(1, 10.66f);
            textView4.setGravity(17);
            textView4.setTextColor(Theme.isCurrentThemeDark() ? -1333971 : -2722014);
            textView4.setVisibility(8);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.avatarView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(20.0f));
            backupImageView2.setVisibility(8);
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.pinnedView = frameLayout2;
            frameLayout2.setAlpha(0.0f);
            frameLayout2.setScaleX(0.3f);
            frameLayout2.setScaleY(0.3f);
            frameLayout2.setVisibility(8);
            ImageView imageView = new ImageView(context);
            this.pinnedImageView = imageView;
            imageView.setImageResource(R.drawable.msg_limit_pin);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            frameLayout2.addView(imageView, LayoutHelper.createFrame(12.66f, 12.66f, 17));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        }

        private TL_stars.TL_starGiftUnique getUniqueStarGift() {
            TL_stars.SavedStarGift savedStarGift = this.userGift;
            if (savedStarGift == null) {
                return null;
            }
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }

        public void lambda$setPinned$0(boolean z) {
            if (z) {
                return;
            }
            this.pinnedView.setVisibility(8);
        }

        public void lambda$setShowPinIcon$1(boolean z) {
            if (z) {
                return;
            }
            this.pinView.setVisibility(8);
        }

        private void setSticker(TLRPC.Document document, Object obj) {
            if (document == null) {
                this.imageView.clearImage();
                this.lastDocument = null;
                this.lastDocumentId = 0L;
            } else {
                if (this.lastDocument == document) {
                    return;
                }
                this.lastDocument = document;
                this.lastDocumentId = document.id;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
                this.imageView.setImage(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), obj);
            }
        }

        private void updateRibbonText() {
            Ribbon ribbon;
            int i;
            String string;
            TL_stars.SavedStarGift savedStarGift = this.userGift;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                    if (starGift.limited) {
                        this.ribbon.setVisibility(0);
                        this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                        this.ribbon.setBackdrop(null);
                        ribbon = this.ribbon;
                        string = LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.userGift.gift.availability_total, 0));
                    }
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setVisibility(8);
                    return;
                }
                this.ribbon.setVisibility(0);
                this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.userGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (this.pinned) {
                    ribbon = this.ribbon;
                    string = "#" + LocaleController.formatNumber(this.userGift.gift.num, ',');
                } else {
                    ribbon = this.ribbon;
                    string = LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.userGift.gift.availability_issued, 0));
                }
                ribbon.setText(string, true);
            }
            TL_stars.StarGift starGift2 = this.gift;
            if (starGift2 == null) {
                GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
                if (giftPremiumBottomSheet$GiftTier != null) {
                    if (giftPremiumBottomSheet$GiftTier.getDiscount() <= 0) {
                        this.ribbon.setVisibility(8);
                        this.ribbon.setBackdrop(null);
                        return;
                    } else {
                        this.ribbon.setVisibility(0);
                        this.ribbon.setBackdrop(null);
                        this.ribbon.setColors(-2535425, -8229377);
                        this.ribbon.setText(12, LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.premiumTier.getDiscount())), true);
                        return;
                    }
                }
                return;
            }
            if (this.giftMine) {
                this.ribbon.setVisibility(0);
                this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                this.ribbon.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                ribbon = this.ribbon;
                string = LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.gift.availability_issued, 0));
            } else {
                boolean z = starGift2.limited;
                if (!z || starGift2.availability_remains > 0) {
                    if (z) {
                        this.ribbon.setVisibility(0);
                        this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon, this.resourcesProvider));
                        this.ribbon.setBackdrop(null);
                        ribbon = this.ribbon;
                        i = R.string.Gift2LimitedRibbon;
                    }
                    this.ribbon.setBackdrop(null);
                    this.ribbon.setVisibility(8);
                    return;
                }
                this.ribbon.setVisibility(0);
                this.ribbon.setColor(Theme.getColor(Theme.key_gift_ribbon_soldout, this.resourcesProvider));
                this.ribbon.setBackdrop(null);
                ribbon = this.ribbon;
                i = R.string.Gift2SoldOut;
                string = LocaleController.getString(i);
            }
            ribbon.setText(string, true);
        }

        public void customDraw(View view, Canvas canvas, float f, float f2, float f3) {
            float f4;
            float f5;
            canvas.save();
            canvas.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            float dp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f3 : 0.0f;
            this.cardBackground.setBounds(0, 0, (int) f, (int) f2);
            this.cardBackground.draw(canvas, f3);
            this.cardBackground.getPadding(this.cardBackgroundPadding);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f3);
            float f6 = f2 - dp;
            this.imageView.getImageReceiver().setImageCoords((f - lerp) / 2.0f, (f6 - lerp) / 2.0f, lerp, lerp);
            this.imageView.getImageReceiver().draw(canvas);
            if (this.imageView.getImageReceiver().isLottieRunning()) {
                view.invalidate();
            }
            if (this.lockView.getVisibility() != 0 || this.lockView.getAlpha() <= 0.0f) {
                f4 = 1.0f;
            } else {
                canvas.save();
                canvas.translate((f - this.lockView.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(this.lockView.getY(), (f6 - this.lockView.getMeasuredHeight()) / 2.0f, f3));
                f4 = 1.0f;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.lockView.getWidth(), this.lockView.getHeight(), (int) ((1.0f - f3) * 255.0f * this.lockView.getAlpha()), 31);
                this.lockView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            if (this.pinnedView.getVisibility() == 0 && this.pinnedView.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(this.cardBackgroundPadding.left + AndroidUtilities.dp(2.0f), this.cardBackgroundPadding.top + AndroidUtilities.dp(2.0f));
                canvas.saveLayerAlpha(0.0f, 0.0f, this.pinnedView.getWidth(), this.pinnedView.getHeight(), (int) (this.pinnedView.getAlpha() * 255.0f), 31);
                this.pinnedView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            if (this.avatarView.getVisibility() == 0 && this.avatarView.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(this.cardBackgroundPadding.left + AndroidUtilities.dp(2.0f), this.cardBackgroundPadding.top + AndroidUtilities.dp(2.0f));
                this.avatarView.draw(canvas);
                canvas.restore();
            }
            if (this.ribbon.getVisibility() != 0 || this.ribbon.getAlpha() <= 0.0f) {
                f5 = 1.0f;
            } else {
                canvas.save();
                canvas.translate(f - AndroidUtilities.dp(f4), AndroidUtilities.dp(2.0f));
                f5 = 1.0f;
                float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f3);
                canvas.scale(lerp2, lerp2);
                canvas.translate(-this.ribbon.getWidth(), 0.0f);
                this.ribbon.draw(canvas);
                canvas.restore();
            }
            if (uniqueStarGift != null) {
                if (this.title == null) {
                    this.title = new Text(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
                }
                if (this.subtitle == null) {
                    this.subtitle = new Text(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f);
                }
                float f7 = f5 - f3;
                this.title.ellipsize(f - AndroidUtilities.dp(8.0f)).draw(canvas, (f - this.title.getWidth()) / 2.0f, ((f2 - AndroidUtilities.dp(40.0f)) - (this.title.getHeight() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f7), -1, f3);
                this.subtitle.ellipsize(f - AndroidUtilities.dp(8.0f)).draw(canvas, (f - this.subtitle.getWidth()) / 2.0f, (AndroidUtilities.dp(50.0f) * f7) + ((f2 - AndroidUtilities.dp(19.0f)) - (this.subtitle.getHeight() / 2.0f)), -1, f3 * 0.6f);
            }
            canvas.restore();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            float alpha = this.animatedReordering.set(this.reordering) * this.pinnedView.getAlpha();
            if (alpha > 0.0f) {
                this.shaker.concat(canvas, alpha);
            }
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public TL_stars.StarGift getGift() {
            return this.gift;
        }

        public GiftPremiumBottomSheet$GiftTier getPremiumTier() {
            return this.premiumTier;
        }

        public TL_stars.SavedStarGift getSavedGift() {
            return this.userGift;
        }

        public void invalidateCustom() {
            this.card.invalidate();
            this.card.invalidateDrawable(this.cardBackground);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }

        public void setPinned(final boolean z, boolean z2) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.pinned == z) {
                return;
            }
            this.pinned = z;
            boolean z3 = false;
            FrameLayout frameLayout = this.pinnedView;
            if (z2) {
                frameLayout.setVisibility(0);
                this.pinnedView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.GiftCell.this.lambda$setPinned$0(z);
                    }
                }).start();
            } else {
                frameLayout.setVisibility(z ? 0 : 8);
                this.pinnedView.setAlpha(z ? 1.0f : 0.0f);
                this.pinnedView.setScaleX(z ? 1.0f : 0.3f);
                this.pinnedView.setScaleY(z ? 1.0f : 0.3f);
            }
            if (!this.pinned && this.reordering && (savedStarGift = this.userGift) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                z3 = true;
            }
            setShowPinIcon(z3, z2);
            updateRibbonText();
        }

        public void setPremiumGift(GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier) {
            int months = giftPremiumBottomSheet$GiftTier.getMonths();
            if (this.lastTier != giftPremiumBottomSheet$GiftTier) {
                BackupImageView backupImageView = this.imageView;
                Runnable premiumGiftImage = StarsIntroActivity.setPremiumGiftImage(backupImageView, backupImageView.getImageReceiver(), months);
                this.cancel = premiumGiftImage;
                if (premiumGiftImage != null) {
                    premiumGiftImage.run();
                    this.cancel = null;
                }
            }
            this.cardBackground.setBackdrop(null);
            this.cardBackground.setPattern(null);
            this.titleView.setText(LocaleController.formatPluralString("Gift2Months", months, new Object[0]));
            this.subtitleView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            this.titleView.setVisibility(0);
            this.subtitleView.setVisibility(0);
            this.imageView.setTranslationY(-AndroidUtilities.dp(8.0f));
            this.avatarView.setVisibility(8);
            this.lockView.setVisibility(8);
            if (giftPremiumBottomSheet$GiftTier.isStarsPaymentAvailable()) {
                this.starsPriceView.setTextColor(Theme.isCurrentThemeDark() ? -1333971 : -2722014);
                this.starsPriceView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(giftPremiumBottomSheet$GiftTier.getStarsPrice(), ','));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
                this.starsPriceView.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, coloredImageSpanArr));
                coloredImageSpanArr[0].spaceScaleX = 0.8f;
            } else {
                this.starsPriceView.setVisibility(8);
            }
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.gravity = 49;
            this.imageView.setLayoutParams(layoutParams);
            this.priceView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.priceView.setTextSize(1, 12.0f);
            this.priceView.setText(giftPremiumBottomSheet$GiftTier.getFormattedPrice());
            this.priceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), 422810068));
            this.priceView.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) this.priceView.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            this.lastTier = giftPremiumBottomSheet$GiftTier;
            this.lastDocument = null;
            this.premiumTier = giftPremiumBottomSheet$GiftTier;
            this.gift = null;
            this.giftMine = false;
            this.userGift = null;
            this.title = null;
            this.subtitle = null;
            setPinned(false, false);
            updateRibbonText();
        }

        public void setReordering(boolean z, boolean z2) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            if (!z2) {
                this.animatedReordering.force(z);
            }
            invalidate();
            setShowPinIcon(!this.pinned && z && (savedStarGift = this.userGift) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique), z2);
        }

        public void setShowPinIcon(final boolean z, boolean z2) {
            if (this.pinnedIcon == z) {
                return;
            }
            this.pinnedIcon = z;
            if (z2) {
                this.pinView.setVisibility(0);
                this.pinView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.GiftCell.this.lambda$setShowPinIcon$1(z);
                    }
                }).start();
            } else {
                this.pinView.setVisibility(z ? 0 : 8);
                this.pinView.setAlpha(z ? 1.0f : 0.0f);
                this.pinView.setScaleX(z ? 1.0f : 0.3f);
                this.pinView.setScaleY(z ? 1.0f : 0.3f);
            }
        }

        public void setStarsGift(org.telegram.tgnet.tl.TL_stars.SavedStarGift r18, boolean r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.GiftCell.setStarsGift(org.telegram.tgnet.tl.TL_stars$SavedStarGift, boolean):void");
        }

        public void setStarsGift(TL_stars.StarGift starGift, boolean z, boolean z2) {
            TextView textView;
            int i;
            Runnable runnable = this.cancel;
            if (runnable != null) {
                runnable.run();
                this.cancel = null;
            }
            setSticker(starGift.getDocument(), starGift);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.cardBackground.setBackdrop(stargiftattributebackdrop);
            this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            this.titleView.setVisibility(8);
            this.subtitleView.setVisibility(8);
            this.imageView.setTranslationY(0.0f);
            this.lockView.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = this.imageViewLayoutParams;
            layoutParams.gravity = 49;
            this.imageView.setLayoutParams(layoutParams);
            this.avatarView.setVisibility(8);
            this.priceView.setTextSize(1, 12.0f);
            if (z) {
                this.priceView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                this.priceView.setText(LocaleController.getString(R.string.Gift2TransferMine));
                int blendOver = stargiftattributebackdrop != null ? Theme.blendOver(stargiftattributebackdrop.center_color | (-16777216), Theme.multAlpha(stargiftattributebackdrop.pattern_color | (-16777216), 0.55f)) : 1090519039;
                this.priceView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(13.0f), blendOver, Theme.blendOver(blendOver, 822083583)));
                textView = this.priceView;
                i = -1;
            } else {
                this.priceView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                long j = starGift.stars;
                long j2 = (z2 && starGift.can_upgrade) ? starGift.upgrade_stars : 0L;
                this.priceView.setText(StarsIntroActivity.replaceStarsWithPlain("XTR " + LocaleController.formatNumber(j + j2, ','), 0.71f));
                this.priceView.setBackground(new StarsBackground(starGift instanceof TL_stars.TL_starGiftUnique ? 1090519039 : Theme.isCurrentThemeDark() ? 518759725 : 1088989954));
                textView = this.priceView;
                i = Theme.isCurrentThemeDark() ? -1333971 : -2722014;
            }
            textView.setTextColor(i);
            ((ViewGroup.MarginLayoutParams) this.priceView.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
            this.starsPriceView.setVisibility(8);
            this.lastTier = null;
            this.premiumTier = null;
            this.gift = starGift;
            this.giftMine = z;
            this.userGift = null;
            this.title = null;
            this.subtitle = null;
            setPinned(false, false);
            updateRibbonText();
        }
    }

    public static class Ribbon extends View {
        private RibbonDrawable drawable;

        public Ribbon(Context context) {
            super(context);
            this.drawable = new RibbonDrawable(this, 1.0f);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.drawable.setBounds(0, 0, getWidth(), getHeight());
            this.drawable.draw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            this.drawable.setBackdrop(stargiftattributebackdrop, false);
            invalidate();
        }

        public void setColor(int i) {
            this.drawable.setColor(i);
        }

        public void setColors(int i, int i2) {
            this.drawable.setColors(i, i2);
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.drawable.setText(i, charSequence, z);
        }

        public void setText(CharSequence charSequence, boolean z) {
            this.drawable.setText(z ? 10 : 11, charSequence, z);
        }
    }

    public static class RibbonDrawable extends CompatDrawable {
        private Path path;
        private Text text;
        private int textColor;

        public RibbonDrawable(View view, float f) {
            super(view);
            Path path = new Path();
            this.path = path;
            this.textColor = -1;
            fillRibbonPath(path, f);
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
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas.drawPath(this.path, this.paint);
            if (this.text != null) {
                canvas.save();
                canvas.rotate(45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(6.0f));
                float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.text.getCurrentWidth());
                canvas.scale(min, min, (getBounds().width() / 2.0f) + AndroidUtilities.dp(6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(6.0f));
                this.text.draw(canvas, ((getBounds().width() / 2.0f) + AndroidUtilities.dp(6.0f)) - (this.text.getWidth() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(5.0f), this.textColor, 1.0f);
                canvas.restore();
            }
            canvas.restore();
        }

        public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z) {
            if (stargiftattributebackdrop == null) {
                this.paint.setShader(null);
            } else {
                this.paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{Theme.adaptHSV(stargiftattributebackdrop.center_color | (-16777216), z ? 0.07f : 0.05f, z ? -0.15f : -0.1f), Theme.adaptHSV(stargiftattributebackdrop.edge_color | (-16777216), z ? 0.07f : 0.05f, z ? -0.15f : -0.1f)}, new float[]{z ? 1.0f : 0.0f, z ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        public void setColor(int i) {
            this.paint.setShader(null);
            this.paint.setColor(i);
        }

        public void setColors(int i, int i2) {
            this.paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        public void setText(int i, CharSequence charSequence, boolean z) {
            this.text = new Text(charSequence, i, z ? AndroidUtilities.bold() : null);
        }

        public void setTextColor(int i) {
            this.textColor = i;
        }
    }

    public static class StarsBackground extends Drawable {
        public final Paint backgroundPaint;
        private final int color;
        public final StarsReactionsSheet.Particles particles;
        public final RectF rectF = new RectF();
        public final Path path = new Path();

        public StarsBackground(int i) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.particles = new StarsReactionsSheet.Particles(1, 25);
            this.color = i;
            paint.setColor(i);
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
            this.particles.draw(canvas, ColorUtils.setAlphaComponent(this.color, 128));
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
                    rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }

                @Override
                protected void dispatchDraw(android.graphics.Canvas r7) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.Tabs.AnonymousClass1.dispatchDraw(android.graphics.Canvas):void");
                }
            };
            this.layout = linearLayout;
            linearLayout.setClipToPadding(false);
            linearLayout.setClipChildren(false);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
            addView(linearLayout);
            setHorizontalScrollBarEnabled(false);
            setClipToPadding(false);
            setClipChildren(false);
            this.animatedSelected = new AnimatedFloat(linearLayout, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public void lambda$set$0(int i, Utilities.Callback callback, View view) {
            TextView textView = (TextView) this.tabs.get(i);
            smoothScrollTo((textView.getLeft() + (textView.getWidth() / 2)) - (getWidth() / 2), 0);
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
                    textView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
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

    public GiftSheet(Context context, int i, long j, Runnable runnable) {
        this(context, i, j, null, runnable);
    }

    public GiftSheet(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.<init>(android.content.Context, int, long, java.util.List, java.lang.Runnable):void");
    }

    public boolean lambda$fillItems$15(TL_stars.StarGift starGift) {
        boolean z;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            z = this.userSettings.disallow_unique_stargifts;
        } else {
            if (starGift.limited) {
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.userSettings;
                if (disallowedGiftsSettings.disallow_limited_stargifts) {
                    return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                }
                return true;
            }
            z = this.userSettings.disallow_unlimited_stargifts;
        }
        return !z;
    }

    public void lambda$new$0(View view) {
        BaseFragment lastFragment;
        if (this.balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    public void lambda$new$1(long j, View view) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(ProfileActivity.of(j));
    }

    public void lambda$new$10(Context context, int i, final Runnable runnable, long j, View view, int i2) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TL_stars.SavedStarGift savedStarGift;
        UItem item = this.adapter.getItem(i2 - 1);
        if (item != null && item.instanceOf(GiftCell.Factory.class)) {
            Object obj = item.object;
            if (obj instanceof GiftPremiumBottomSheet$GiftTier) {
                new SendGiftSheet(context, i, (GiftPremiumBottomSheet$GiftTier) obj, this.dialogId, new Runnable() {
                    @Override
                    public final void run() {
                        GiftSheet.this.lambda$new$7(runnable);
                    }
                }).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                StarsController.GiftsList giftsList = this.myGifts;
                if (giftsList == null || this.selectedTab != this.TAB_MY_GIFTS) {
                    if (starGift.sold_out) {
                        StarsIntroActivity.showSoldOutGiftSheet(context, i, starGift, this.resourcesProvider);
                        return;
                    }
                    long j2 = this.dialogId;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            GiftSheet.this.lambda$new$9(runnable);
                        }
                    };
                    boolean z = starGift.limited;
                    new SendGiftSheet(context, i, starGift, j2, runnable2, z && (disallowedGiftsSettings2 = this.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z && (disallowedGiftsSettings = this.userSettings) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                    return;
                }
                Iterator it = giftsList.gifts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        savedStarGift = null;
                        break;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) it.next();
                    if (savedStarGift2.gift.id == starGift.id) {
                        savedStarGift = savedStarGift2;
                        break;
                    }
                }
                if (savedStarGift == null) {
                    return;
                }
                new StarGiftSheet(getContext(), i, UserConfig.getInstance(i).getClientUserId(), this.resourcesProvider) {
                    @Override
                    public BulletinFactory getBulletinFactory() {
                        GiftSheet giftSheet = GiftSheet.this;
                        return BulletinFactory.of(giftSheet.container, giftSheet.resourcesProvider);
                    }
                }.set(savedStarGift, (StarsController.GiftsList) null).openTransferAlert(j, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        GiftSheet.this.lambda$new$8(runnable, (TLRPC.TL_error) obj2);
                    }
                });
            }
        }
    }

    public static void lambda$new$2() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PremiumPreviewFragment("gifts"), bottomSheetParams);
    }

    public void lambda$new$3(Runnable runnable, long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        if (runnable != null) {
            runnable.run();
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", j);
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    public static void lambda$new$4(Context context) {
        new ExplainStarsSheet(context).show();
    }

    public void lambda$new$5(StarsController.GiftsList giftsList, final long j, LinkSpanDrawable.LinksTextView linksTextView, final Runnable runnable, final Context context) {
        Runnable runnable2;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsInfo, this.name)));
        spannableStringBuilder.append((CharSequence) " ");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < giftsList.gifts.size() && hashSet.size() < 3; i++) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) giftsList.gifts.get(i);
            if (savedStarGift != null && (starGift = savedStarGift.gift) != null && (document = starGift.getDocument()) != null && !hashSet.contains(Long.valueOf(document.id))) {
                hashSet2.add(document);
                hashSet.add(Long.valueOf(document.id));
            }
        }
        if (hashSet2.size() > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatString(R.string.Gift2StarsInfoProfileLink, DialogObject.getShortName(j)).replaceAll(" ", " "));
            spannableStringBuilder2.append((CharSequence) " ");
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                TLRPC.Document document2 = (TLRPC.Document) it.next();
                spannableStringBuilder2.append((CharSequence) "\u2060e");
                spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document2, linksTextView.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            }
            spannableStringBuilder2.append((CharSequence) " >");
            runnable2 = new Runnable() {
                @Override
                public final void run() {
                    GiftSheet.this.lambda$new$3(runnable, j);
                }
            };
            str = spannableStringBuilder2;
        } else {
            String string = LocaleController.getString(R.string.Gift2StarsInfoLink);
            runnable2 = new Runnable() {
                @Override
                public final void run() {
                    GiftSheet.lambda$new$4(context);
                }
            };
            str = string;
        }
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(str, runnable2), true));
        linksTextView.setText(spannableStringBuilder);
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
    }

    public static void lambda$new$6(StarsController.GiftsList giftsList, Runnable runnable, Object[] objArr) {
        if (objArr[1] == giftsList) {
            runnable.run();
        }
    }

    public void lambda$new$7(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$new$8(Runnable runnable, TLRPC.TL_error tL_error) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$new$9(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$updatePremiumTiers$12() {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    public void lambda$updatePremiumTiers$13(BillingResult billingResult, List list) {
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
                GiftSheet.this.lambda$updatePremiumTiers$12();
            }
        });
    }

    public void lambda$updatePremiumTiers$14(List list) {
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

    public void selectTab(int i) {
        if (this.selectedTab == i) {
            return;
        }
        this.selectedTab = i;
        this.itemAnimator.endAnimations();
        this.adapter.update(true);
    }

    private void updatePremiumTiers() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        this.premiumTiers.clear();
        if (this.premiumTiers.isEmpty() && (list = this.options) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            long j = 0;
            for (int size = this.options.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.options.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.options.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = new GiftPremiumBottomSheet$GiftTier(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    this.premiumTiers.add(giftPremiumBottomSheet$GiftTier);
                    if (BuildVars.useInvoiceBilling()) {
                        if (giftPremiumBottomSheet$GiftTier.getPricePerMonth() > j) {
                            j = giftPremiumBottomSheet$GiftTier.getPricePerMonth();
                        }
                    } else if (giftPremiumBottomSheet$GiftTier.getStoreProduct() != null && BillingController.getInstance().isReady()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(giftPremiumBottomSheet$GiftTier.getStoreProduct()).build());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                Iterator it2 = this.premiumTiers.iterator();
                while (it2.hasNext()) {
                    ((GiftPremiumBottomSheet$GiftTier) it2.next()).setPricePerMonthRegular(j);
                }
            } else if (!arrayList.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList, new ProductDetailsResponseListener() {
                    @Override
                    public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                        GiftSheet.this.lambda$updatePremiumTiers$13(billingResult, list2);
                    }
                });
            }
        }
        if (this.premiumTiers.isEmpty()) {
            BoostRepository.loadGiftOptions(this.currentAccount, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftSheet.this.lambda$updatePremiumTiers$14((List) obj);
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
        } else if (i == NotificationCenter.userInfoDidLoad) {
            if (!isShown()) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.dialogId;
            if (longValue == j && j > 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = userFull != null ? userFull.disallowed_stargifts : null;
                this.userSettings = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    lambda$new$0();
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.dialogId)))).show();
                        return;
                    }
                    return;
                }
                UniversalAdapter universalAdapter2 = this.adapter;
                if (universalAdapter2 != null) {
                    universalAdapter2.update(true);
                }
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
        } else if (i == NotificationCenter.starGiftSoldOut) {
            if (!isShown()) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            BulletinFactory.of(this.container, this.resourcesProvider).createEmojiBulletin(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).show();
            universalAdapter = this.adapter;
            if (universalAdapter == null) {
                return;
            }
        } else if (i != NotificationCenter.starUserGiftsLoaded || objArr[1] != this.myGifts || (universalAdapter = this.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    @Override
    public void lambda$new$0() {
        super.lambda$new$0();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public void fillItems(java.util.ArrayList r18, org.telegram.ui.Components.UniversalAdapter r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.GiftSheet.fillItems(java.util.ArrayList, org.telegram.ui.Components.UniversalAdapter):void");
    }

    @Override
    protected CharSequence getTitle() {
        return this.self ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.name), null, false);
    }

    public GiftSheet setBirthday() {
        return setBirthday(true);
    }

    public GiftSheet setBirthday(boolean z) {
        this.birthday = z;
        this.adapter.update(false);
        return this;
    }

    @Override
    public void show() {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.userSettings;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.dialogId)))).show();
        }
    }
}
