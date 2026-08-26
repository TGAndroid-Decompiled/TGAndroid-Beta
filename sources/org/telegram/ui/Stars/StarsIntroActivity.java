package org.telegram.ui.Stars;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.AccountIdentifiers;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import j$.util.Objects;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.DataAutoDownloadActivity$$ExternalSyntheticLambda2;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda6;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.ImageReceiverSpan;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda66;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda52;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda68;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;
import org.telegram.ui.QrActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.web.BookmarksFragment$$ExternalSyntheticLambda1;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class StarsIntroActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat floatFormat;
    public static DecimalFormat floatFormat2;
    public FrameLayout aboveTitleView;
    public AnonymousClass5 adapter;
    public LinearLayout balanceLayout;
    public ButtonWithCounterView buyButton;
    public RichDetailsCell.AnonymousClass2 emptyLayout;
    public FireworksOverlay fireworksOverlay;
    public ButtonWithCounterView giftButton;
    public boolean hadTransactions;
    public GLIconTextureView iconTextureView;
    public LoginActivity.AnonymousClass4 oneButtonsLayout;
    public SpannableStringBuilder starBalanceIcon;
    public AnimatedTextView starBalanceTextView;
    public TextView starBalanceTitleView;
    public ButtonWithCounterView topupButton;
    public StarsTransactionsLayout transactionsLayout;
    public boolean twoButtons;
    public PhotoViewer.AnonymousClass35 twoButtonsLayout;
    public ButtonWithCounterView withdrawButton;

    public final class AnonymousClass4 extends StarParticlesView {
        public Paint[] paints;
        public final int val$particlesCount;
        public final int val$type;

        public AnonymousClass4(Context context, int i, int i2) {
            super(context);
            this.val$particlesCount = i;
            this.val$type = i2;
            setClipWithGradient();
        }

        @Override
        public final void configure() {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(this.val$particlesCount);
            this.drawable = drawable;
            drawable.type = 105;
            int i = 0;
            drawable.roundEffect = false;
            drawable.useRotate = false;
            drawable.useBlur = true;
            drawable.checkBounds = true;
            drawable.isCircle = false;
            drawable.useScale = true;
            drawable.startFromCenter = true;
            if (this.val$type == 1) {
                drawable.centerOffsetY = AndroidUtilities.dp(24.0f);
            }
            this.paints = new Paint[20];
            while (true) {
                Paint[] paintArr = this.paints;
                if (i >= paintArr.length) {
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.getPaint = new WebActionBar$$ExternalSyntheticLambda9(this, 10);
                    drawable2.size1 = 17;
                    drawable2.size2 = 18;
                    drawable2.size3 = 19;
                    drawable2.colorKey = Theme.key_windowBackgroundWhiteBlackText;
                    drawable2.init();
                    return;
                }
                paintArr[i] = new Paint(1);
                this.paints[i].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(i / (this.paints.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i++;
            }
        }

        @Override
        public final int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public final class ExpandView extends FrameLayout {
        public final ImageView arrowView;
        public int lastId;
        public boolean needDivider;
        public final AnimatedTextView textView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ExpandView expandView = (ExpandView) view;
                int i = expandView.lastId;
                int i2 = uItem.id;
                boolean z2 = i == i2;
                expandView.lastId = i2;
                AnimatedTextView animatedTextView = expandView.textView;
                animatedTextView.setText(uItem.text, z2, true);
                int color = Theme.getColor(null, uItem.accent ? Theme.key_windowBackgroundWhiteBlueText2 : Theme.key_windowBackgroundWhiteBlackText, false);
                animatedTextView.setTextColor(color);
                ImageView imageView = expandView.arrowView;
                imageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (z2) {
                    imageView.animate().rotation(uItem.collapsed ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                } else {
                    imageView.setRotation(uItem.collapsed ? 0.0f : 180.0f);
                }
                expandView.needDivider = z;
                expandView.setWillNotDraw(!z);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ExpandView(context);
            }
        }

        public ExpandView(Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
            this.textView = animatedTextView;
            animatedTextView.getDrawable().setHacks(true, true);
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.arrowView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.arrow_more);
            addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.lastId = Integer.MAX_VALUE;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public final void set(String str) {
            boolean z = this.lastId == -1;
            this.lastId = -1;
            AnimatedTextView animatedTextView = this.textView;
            animatedTextView.setText(str, z, true);
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText2, false);
            animatedTextView.setTextColor(color);
            ImageView imageView = this.arrowView;
            imageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (z) {
                imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                imageView.setRotation(0.0f);
            }
            this.needDivider = false;
            setWillNotDraw(true);
        }
    }

    public final class GiftStarsSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public boolean expanded;
        public final FrameLayout footerView;
        public final ColorPicker.AnonymousClass1 headerView;
        public final TLRPC.User user;
        public final UserSelectorBottomSheet$$ExternalSyntheticLambda0 whenPurchased;

        public GiftStarsSheet(Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, UserSelectorBottomSheet$$ExternalSyntheticLambda0 userSelectorBottomSheet$$ExternalSyntheticLambda0) {
            super(context, null, false, false, false, resourcesProvider);
            this.user = user;
            this.whenPurchased = userSelectorBottomSheet$$ExternalSyntheticLambda0;
            this.topPadding = 0.2f;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            final int i2 = 0;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 9));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider));
            ColorPicker.AnonymousClass1 anonymousClass1 = new ColorPicker.AnonymousClass1(context, 2, resourcesProvider);
            this.headerView = anonymousClass1;
            ((TextView) anonymousClass1.paint).setText(LocaleController.getString(R.string.GiftStarsTitle));
            LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) anonymousClass1.this$0;
            final int i3 = 1;
            linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
                public final StarsIntroActivity.GiftStarsSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    BaseFragment baseFragment;
                    switch (i2) {
                        case 0:
                            StarsIntroActivity.GiftStarsSheet giftStarsSheet = this.f$0;
                            StarAppsSheet starAppsSheet = new StarAppsSheet(giftStarsSheet.getContext());
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(giftStarsSheet.attachedFragment) && (baseFragment = giftStarsSheet.attachedFragment) != null) {
                                starAppsSheet.makeAttached(baseFragment);
                            }
                            starAppsSheet.show();
                            break;
                        default:
                            Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }), true)));
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()) + 1);
            this.actionBar.setTitle(getTitle());
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            BackupImageView backupImageView = (BackupImageView) anonymousClass1.rect;
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView2.setTextSize(1, 12.0f);
            linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
                public final StarsIntroActivity.GiftStarsSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    BaseFragment baseFragment;
                    switch (i3) {
                        case 0:
                            StarsIntroActivity.GiftStarsSheet giftStarsSheet = this.f$0;
                            StarAppsSheet starAppsSheet = new StarAppsSheet(giftStarsSheet.getContext());
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(giftStarsSheet.attachedFragment) && (baseFragment = giftStarsSheet.attachedFragment) != null) {
                                starAppsSheet.makeAttached(baseFragment);
                            }
                            starAppsSheet.show();
                            break;
                        default:
                            Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }));
            linksTextView2.setGravity(17);
            linksTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextView2.getText(), linksTextView2.getPaint()));
            frameLayout.addView(linksTextView2, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            this.containerView.addView(new FireworksOverlay(getContext()), LayoutHelper.createFrame(-1.0f, -1));
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 21), this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if ((i == NotificationCenter.starGiftOptionsLoaded || i == NotificationCenter.starBalanceUpdated) && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
            }
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
            arrayList.add(UItem.asCustom(this.headerView));
            String string = LocaleController.getString(R.string.TelegramStarsChoose);
            UItem uItem = new UItem(0);
            uItem.text = string;
            arrayList.add(uItem);
            ArrayList giftOptions = StarsController.getInstance(this.currentAccount, false).getGiftOptions();
            if (giftOptions == null || giftOptions.isEmpty()) {
                UItem uItem2 = new UItem(34);
                uItem2.intValue = 31;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem2, 34);
                uItemM.intValue = 31;
                UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
                uItemM2.intValue = 31;
                arrayList.add(uItemM2);
            } else {
                int i = 0;
                int i2 = 1;
                for (int i3 = 0; i3 < giftOptions.size(); i3++) {
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) giftOptions.get(i3);
                    if (this.expanded || !tL_starsGiftOption.extended) {
                        int i4 = i2 + 1;
                        int i5 = StarTierView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(StarTierView.Factory.class);
                        uItemOfFactory.id = i3;
                        uItemOfFactory.intValue = i2;
                        long j = tL_starsGiftOption.stars;
                        uItemOfFactory.longValue = j;
                        uItemOfFactory.text = LocaleController.formatPluralStringSpaced("StarsCount", (int) j);
                        uItemOfFactory.subtext = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                        uItemOfFactory.object = tL_starsGiftOption;
                        arrayList.add(uItemOfFactory);
                        i2 = i4;
                    } else {
                        i++;
                    }
                }
                boolean z = this.expanded;
                if (!z && i > 0) {
                    String string2 = LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                    boolean z2 = !this.expanded;
                    int i6 = ExpandView.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(ExpandView.Factory.class);
                    uItemOfFactory2.id = -1;
                    uItemOfFactory2.text = string2;
                    uItemOfFactory2.collapsed = z2;
                    uItemOfFactory2.accent = true;
                    arrayList.add(uItemOfFactory2);
                }
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        @Override
        public final CharSequence getTitle() {
            ColorPicker.AnonymousClass1 anonymousClass1 = this.headerView;
            if (anonymousClass1 == null) {
                return null;
            }
            return ((TextView) anonymousClass1.paint).getText();
        }

        public final void lambda$new$0$5(int i) {
            UItem item;
            int i2 = 1;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            UniversalAdapter universalAdapter2 = this.adapter;
            if (item.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter2.update(true);
                this.recyclerListView.smoothScrollBy(0, AndroidUtilities.dp(200.0f), CubicBezierInterpolator.EASE_OUT);
                return;
            }
            if (item.instanceOf(StarTierView.Factory.class) && (item.object instanceof TL_stars.TL_starsGiftOption)) {
                Context contextFindActivity = AndroidUtilities.findActivity(getContext());
                if (contextFindActivity == null) {
                    contextFindActivity = LaunchActivity.instance;
                }
                Context context = contextFindActivity;
                if (context == null) {
                    return;
                }
                long j = this.user.id;
                StarsController starsController = StarsController.getInstance(this.currentAccount, false);
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) item.object;
                JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3 = new JoinGroupAlert$$ExternalSyntheticLambda3(this, item, j, 2);
                int i3 = starsController.currentAccount;
                if (!MessagesController.getInstance(i3).starsPurchaseAvailable()) {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment == null || lastFragment.getContext() == null) {
                        StarsController.showNoSupportDialog(context, null);
                        return;
                    } else {
                        StarsController.showNoSupportDialog(lastFragment.getContext(), lastFragment.getResourceProvider());
                        return;
                    }
                }
                if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                    TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                    tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                    tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                    tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                    tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i3).getInputUser(j);
                    AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                    accountIdentifiers.zzb = "inapp";
                    accountIdentifiers.zza = tL_starsGiftOption.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(accountIdentifiers.build()), new StarsController$$ExternalSyntheticLambda104(starsController, joinGroupAlert$$ExternalSyntheticLambda3, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    return;
                }
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i3).getInputUser(j);
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(StarsController.getResourceProvider(), false);
                if (jSONObjectMakeThemeParams != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda7(starsController, joinGroupAlert$$ExternalSyntheticLambda3, tL_inputInvoiceStars, i2));
            }
        }

        public final void lambda$onItemClick$4(UItem uItem, long j, Boolean bool, String str) {
            UserSelectorBottomSheet$$ExternalSyntheticLambda0 userSelectorBottomSheet$$ExternalSyntheticLambda0;
            if (getContext() == null) {
                return;
            }
            if ((bool.booleanValue() || str != null) && (userSelectorBottomSheet$$ExternalSyntheticLambda0 = this.whenPurchased) != null) {
                userSelectorBottomSheet$$ExternalSyntheticLambda0.run();
            }
            lambda$showGiftOfferSheet$15();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            LaunchActivity.AnonymousClass5 anonymousClass5 = LaunchActivity.instance.fireworksOverlay;
            if (safeLastFragment == null) {
                return;
            }
            if (!bool.booleanValue()) {
                if (str != null) {
                    zzks.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(safeLastFragment), R.raw.error);
                }
            } else {
                Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) uItem.longValue, UserObject.getForcedFirstName(this.user))), LocaleController.getString(R.string.ViewInChat), new PaymentFormActivity$$ExternalSyntheticLambda66(j, 2));
                bulletinCreateSimpleBulletin.duration = 5000;
                bulletinCreateSimpleBulletin.show(true);
                if (anonymousClass5 != null) {
                    anonymousClass5.start(true);
                }
                StarsController.getInstance(this.currentAccount, false).invalidateTransactions(true);
            }
        }

        @Override
        public final void show() {
            ChatActivity.AnonymousClass39 anonymousClass39;
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass39.messageEditText);
                }
            }
            super.show();
        }
    }

    public final class StarTierView extends FrameLayout {
        public final AnimatedFloat animatedStarsCount;
        public SpannableString loading;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final Drawable starDrawable;
        public final Drawable starDrawableOutline;
        public int starsCount;
        public final TextView textView;
        public final AnimatedTextView textView2;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asStarTier(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.intValue = i2;
                long j = tL_starsTopupOption.stars;
                uItemOfFactory.longValue = j;
                uItemOfFactory.text = LocaleController.formatPluralStringSpaced("StarsCount", (int) j);
                uItemOfFactory.subtext = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
                uItemOfFactory.object = tL_starsTopupOption;
                return uItemOfFactory;
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                StarTierView starTierView = (StarTierView) view;
                int i = uItem.intValue;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                TextView textView = starTierView.textView;
                boolean zEquals = TextUtils.equals(textView.getText(), charSequence);
                starTierView.starsCount = i;
                if (!zEquals) {
                    starTierView.animatedStarsCount.set(i, true);
                }
                textView.setText(charSequence);
                AnimatedTextView animatedTextView = starTierView.textView2;
                if (charSequence2 == null) {
                    if (starTierView.loading == null) {
                        SpannableString spannableString = new SpannableString("x");
                        starTierView.loading = spannableString;
                        spannableString.setSpan(new LoadingSpan(AndroidUtilities.dp(55.0f), animatedTextView), 0, starTierView.loading.length(), 33);
                    }
                    charSequence2 = starTierView.loading;
                }
                animatedTextView.setText(charSequence2);
                float f = LocaleController.isRTL ? -1.0f : 1.0f;
                if (zEquals) {
                    textView.animate().translationX(f * (i - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                } else {
                    textView.setTranslationX(f * (i - 1) * AndroidUtilities.dp(2.66f));
                }
                starTierView.needDivider = z;
                starTierView.invalidate();
            }

            @Override
            public final boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.id == uItem2.id && TextUtils.equals(uItem.subtext, uItem2.subtext);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new StarTierView(context, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }
        }

        public StarTierView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.animatedStarsCount = new AnimatedFloat(this, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.resourcesProvider = resourcesProvider;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
            this.starDrawableOutline = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.starDrawable = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.textView = textView;
            zzkh.m(15.0f, textView);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
            this.textView2 = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = this.animatedStarsCount.set(this.starsCount, false);
            float f2 = LocaleController.isRTL ? -1.0f : 1.0f;
            float fDp = AndroidUtilities.dp(24.0f);
            float fDp2 = AndroidUtilities.dp(24.0f);
            float fDp3 = AndroidUtilities.dp(2.5f);
            float width = LocaleController.isRTL ? (getWidth() - AndroidUtilities.dp(19.0f)) - fDp : AndroidUtilities.dp(19.0f);
            for (int iCeil = ((int) Math.ceil(f)) - 1; iCeil >= 0; iCeil--) {
                float fClamp = Utilities.clamp(f - iCeil, 1.0f, 0.0f);
                float f3 = (((iCeil - 1) - (1.0f - fClamp)) * fDp3 * f2) + width;
                float measuredHeight = (getMeasuredHeight() - fDp2) / 2.0f;
                int i = (int) f3;
                int i2 = (int) measuredHeight;
                int i3 = (int) (f3 + fDp);
                int i4 = (int) (measuredHeight + fDp2);
                Drawable drawable = this.starDrawableOutline;
                drawable.setBounds(i, i2, i3, i4);
                int i5 = (int) (fClamp * 255.0f);
                drawable.setAlpha(i5);
                drawable.draw(canvas);
                Drawable drawable2 = this.starDrawable;
                drawable2.setBounds(i, i2, i3, i4);
                drawable2.setAlpha(i5);
                drawable2.draw(canvas);
            }
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
                if (paint == null) {
                    paint = Theme.dividerPaint;
                }
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), paint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }

    public final class StarsBalanceView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        public final AnonymousClass1 amountTextView;
        public ValueAnimator bounceAnimator;
        public final int currentAccount;
        public long dialogId;
        public long lastBalance;
        public SpannableString loadingString;
        public final ColoredImageSpan[] ref;
        public final ColoredImageSpan[] refTon;
        public boolean withTon;

        public StarsBalanceView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.lastBalance = -1L;
            this.ref = new ColoredImageSpan[1];
            this.refTon = new ColoredImageSpan[1];
            this.currentAccount = i;
            this.dialogId = UserConfig.getInstance(i).getClientUserId();
            setOrientation(1);
            setGravity(21);
            TextView textView = new TextView(context);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            OKLCH.m(i2, resourcesProvider, textView, 13.0f);
            textView.setText(LocaleController.getString(R.string.StarsBalance));
            textView.setGravity(5);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createLinear(-2, -2, 5));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
            this.amountTextView = anonymousClass1;
            anonymousClass1.adaptWidth = true;
            anonymousClass1.getDrawable().setHacks(false, true);
            anonymousClass1.setTypeface(AndroidUtilities.bold());
            anonymousClass1.setTextColor(Theme.getColor(i2, resourcesProvider));
            anonymousClass1.setTextSize(AndroidUtilities.dp(13.0f));
            anonymousClass1.setGravity(5);
            anonymousClass1.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
            addView(anonymousClass1, LayoutHelper.createLinear(-2, 20, 5, 0, -2, 0, 0));
            updateBalance$1(false);
            setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starBalanceUpdated) {
                updateBalance$1(true);
            } else if (i == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.dialogId) {
                updateBalance$1(true);
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateBalance$1(false);
            int i = this.currentAccount;
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starBalanceUpdated);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.botStarsUpdated);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            int i = this.currentAccount;
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starBalanceUpdated);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.botStarsUpdated);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
        }

        public void setDialogId(long j) {
            if (this.dialogId != j) {
                this.dialogId = j;
                updateBalance$1(true);
            }
        }

        public final void updateBalance$1(boolean z) {
            boolean z2;
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
            int i = this.currentAccount;
            StarsController starsController = StarsController.getInstance(i, false);
            StarsController starsController2 = this.withTon ? StarsController.getInstance(i, true) : null;
            long j = 0;
            AmountUtils$Amount amountUtils$AmountFromNano = AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.TON);
            AnonymousClass1 anonymousClass1 = this.amountTextView;
            anonymousClass1.drawable.cancelAnimation();
            if (this.dialogId == UserConfig.getInstance(i).getClientUserId()) {
                z2 = !starsController.balanceLoaded;
                j = starsController.getBalance().amount;
                if (starsController2 != null) {
                    z2 |= !starsController2.balanceLoaded;
                    amountUtils$AmountFromNano = starsController2.getBalanceAmount();
                }
            } else {
                TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(i).getStarsRevenueStats(this.dialogId, false);
                boolean z3 = starsRevenueStats == null || starsRevenueStats.status == null;
                if (starsRevenueStats != null && (tL_starsRevenueStatus = starsRevenueStats.status) != null) {
                    j = tL_starsRevenueStatus.current_balance.amount;
                }
                z2 = z3;
            }
            long j2 = this.lastBalance;
            if (j > j2 && j2 != -1) {
                ValueAnimator valueAnimator = this.bounceAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
                this.bounceAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 16));
                this.bounceAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 15));
                this.bounceAnimator.setDuration(320L);
                this.bounceAnimator.setInterpolator(new OvershootInterpolator());
                this.bounceAnimator.start();
            }
            if (z2) {
                if (this.loadingString == null) {
                    SpannableString spannableString = new SpannableString("x");
                    this.loadingString = spannableString;
                    spannableString.setSpan(new LoadingSpan(AndroidUtilities.dp(48.0f), anonymousClass1), 0, this.loadingString.length(), 33);
                }
                anonymousClass1.setText(this.loadingString, z, true);
                this.lastBalance = -1L;
                return;
            }
            if (this.withTon) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!amountUtils$AmountFromNano.isZero()) {
                    String str = "⭐️" + amountUtils$AmountFromNano.asFormatString();
                    ColoredImageSpan[] coloredImageSpanArr = this.refTon;
                    spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStarsWithPlain(true, str, 0.62f, coloredImageSpanArr));
                    ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                    if (coloredImageSpan != null) {
                        coloredImageSpan.setColorKey(Theme.key_telegram_color_text);
                    }
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(j, ' ', new StringBuilder("⭐️")), 0.62f, this.ref));
                anonymousClass1.setText(spannableStringBuilder);
            } else {
                anonymousClass1.setText(LocaleController.formatNumber(j, ' '));
            }
            this.lastBalance = j;
        }

        public final class AnonymousClass1 extends AnimatedTextView {
            public final int $r8$classId = 1;
            public final ViewGroup this$0;
            public final Object val$starDrawable;

            public AnonymousClass1(FilterCreateActivity.HeaderCellColorPreview headerCellColorPreview, Context context) {
                super(context, false, true, true);
                this.this$0 = headerCellColorPreview;
                this.val$starDrawable = new Paint(1);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        if (!((StarsBalanceView) this.this$0).withTon) {
                            int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().getCurrentWidth()) - AndroidUtilities.dp(20.0f));
                            int iM$2 = OKLCH.m$2(17.0f, getMeasuredHeight(), 2);
                            int iDp = AndroidUtilities.dp(17.0f) + measuredWidth;
                            int iDp2 = (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2;
                            Drawable drawable = (Drawable) this.val$starDrawable;
                            drawable.setBounds(measuredWidth, iM$2, iDp, iDp2);
                            drawable.draw(canvas);
                        }
                        super.dispatchDraw(canvas);
                        break;
                    default:
                        FilterCreateActivity.HeaderCellColorPreview headerCellColorPreview = (FilterCreateActivity.HeaderCellColorPreview) this.this$0;
                        int i = headerCellColorPreview.animatedColor.set(headerCellColorPreview.currentColor, false);
                        setTextColor(i);
                        Paint paint = (Paint) this.val$starDrawable;
                        paint.setColor(Theme.multAlpha(Theme.currentTheme.isDark() ? 0.2f : 0.1f, i));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((getWidth() - getDrawable().getCurrentWidth()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            public AnonymousClass1(StarsBalanceView starsBalanceView, Context context, Drawable drawable) {
                super(context, false, false, false);
                this.this$0 = starsBalanceView;
                this.val$starDrawable = drawable;
            }
        }
    }

    public final class StarsNeededSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public final boolean canBuy;
        public boolean expanded;
        public final FireworksOverlay fireworksOverlay;
        public final FrameLayout footerView;
        public final GradientHeaderActivity.AnonymousClass5 headerView;
        public final TLRPC.InputPeer purposePeer;
        public final long starsNeeded;
        public Runnable whenPurchased;

        public StarsNeededSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, int i, String str, Runnable runnable, long j2) {
            String str2;
            String str3;
            boolean zIsEmpty;
            TextView textView;
            LinkSpanDrawable.LinksTextView linksTextView;
            UniversalAdapter universalAdapter;
            super(context, null, false, false, false, resourcesProvider);
            int i2 = 3;
            int i3 = 10;
            this.topPadding = 0.2f;
            this.whenPurchased = runnable;
            TLRPC.InputPeer inputPeer = j2 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
            this.purposePeer = inputPeer;
            boolean zIsReady = (inputPeer == null || !AppGlobalConfig.getInstance(StarsController.getInstance(this.currentAccount, false).currentAccount).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
            this.canBuy = zIsReady;
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i4 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i4, 0, i4, 0);
            this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, i3));
            this.recyclerListView.setSections();
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider));
            this.starsNeeded = j;
            GradientHeaderActivity.AnonymousClass5 anonymousClass5 = new GradientHeaderActivity.AnonymousClass5(context, this.currentAccount, resourcesProvider);
            this.headerView = anonymousClass5;
            ((TextView) anonymousClass5.titleView).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j - StarsController.getInstance(this.currentAccount, false).getBalance().amount), new Object[0]));
            if (i != 1) {
                if (i == 2) {
                    str2 = "StarsNeededTextKeepSubscription";
                } else if (i == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i == 3) {
                    str2 = "StarsNeededTextKeepSubscription";
                } else if (i == 4) {
                    str2 = "StarsNeededTextLink";
                    if (str == null) {
                        str3 = "StarsNeededTextLink";
                    } else {
                        str3 = "StarsNeededTextLink_" + str.toLowerCase();
                    }
                    if (LocaleController.nullable(LocaleController.getString(str3)) == null) {
                    }
                } else if (i == 5) {
                    str2 = "StarsNeededTextReactions";
                } else if (i == 6) {
                    str2 = "StarsNeededTextGift";
                } else if (i == 12) {
                    str2 = "StarsNeededTextGiftChannel";
                } else if (i == 13) {
                    str2 = "StarsNeededTextPrivateMessage";
                } else if (i == 10) {
                    str2 = "StarsNeededTextGiftUpgrade";
                } else if (i == 11) {
                    str2 = "StarsNeededTextGiftTransfer";
                } else if (i == 9) {
                    str2 = "StarsNeededBizText";
                } else if (i == 14) {
                    str2 = "StarsNeededTextGiftBuyResale";
                } else if (i == 15) {
                    str2 = "StarsNeededTextSearch";
                } else if (i == 16) {
                    str2 = "StarsNeededRemoveGiftDescription";
                } else {
                    str2 = i == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                }
                zIsEmpty = TextUtils.isEmpty(str3);
                textView = (TextView) anonymousClass5.belowSubTitleLayout;
                if (zIsEmpty) {
                    textView.setText("");
                } else {
                    String strNullable = LocaleController.nullable(LocaleController.formatString(str3, LocaleController.getStringResId(str3), str));
                    textView.setText(AndroidUtilities.replaceTags(strNullable == null ? LocaleController.getString(str3) : strNullable));
                    textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
                }
                this.actionBar.setTitle(getTitle());
                FrameLayout frameLayout = new FrameLayout(context);
                this.footerView = frameLayout;
                linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
                linksTextView.setTextSize(1, 12.0f);
                linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
                linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                if (zIsReady) {
                    linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new LivePlayer$1$$ExternalSyntheticLambda0(this, i2)));
                } else {
                    zzln.m(R.string.StarsPurchaseUnavailable, linksTextView);
                }
                linksTextView.setGravity(17);
                linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
                frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -1, 17));
                frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
                this.fireworksOverlay = fireworksOverlay;
                this.containerView.addView(fireworksOverlay, LayoutHelper.createFrame(-1.0f, -1));
                universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(false);
                }
            }
            str2 = "StarsNeededTextBuySubscription";
            str3 = str2;
            zIsEmpty = TextUtils.isEmpty(str3);
            textView = (TextView) anonymousClass5.belowSubTitleLayout;
            if (zIsEmpty) {
                textView.setText("");
            } else {
                String strNullable2 = LocaleController.nullable(LocaleController.formatString(str3, LocaleController.getStringResId(str3), str));
                textView.setText(AndroidUtilities.replaceTags(strNullable2 == null ? LocaleController.getString(str3) : strNullable2));
                textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
            }
            this.actionBar.setTitle(getTitle());
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.footerView = frameLayout2;
            linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout2.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            if (zIsReady) {
                linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new LivePlayer$1$$ExternalSyntheticLambda0(this, i2)));
            } else {
                zzln.m(R.string.StarsPurchaseUnavailable, linksTextView);
            }
            linksTextView.setGravity(17);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            FireworksOverlay fireworksOverlay2 = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay2;
            this.containerView.addView(fireworksOverlay2, LayoutHelper.createFrame(-1.0f, -1));
            universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 22), this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            Runnable runnable;
            if (i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) {
                UniversalAdapter universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                long j = StarsController.getInstance(this.currentAccount, false).getBalance().amount;
                TextView textView = (TextView) this.headerView.titleView;
                long j2 = this.starsNeeded;
                textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j2 - j)));
                BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
                if (anonymousClass4 != null) {
                    anonymousClass4.setTitle(getTitle());
                }
                if (j < j2 || (runnable = this.whenPurchased) == null) {
                    return;
                }
                runnable.run();
                this.whenPurchased = null;
                lambda$showGiftOfferSheet$15();
            }
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            GradientHeaderActivity.AnonymousClass5 anonymousClass5 = this.headerView;
            if (anonymousClass5 != null) {
                ((GLIconTextureView) anonymousClass5.subtitleView).setPaused(true);
            }
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
            long j;
            GradientHeaderActivity.AnonymousClass5 anonymousClass5 = this.headerView;
            arrayList.add(UItem.asCustomShadow(anonymousClass5));
            int i = 0;
            boolean z = this.canBuy;
            if (z) {
                String string = LocaleController.getString(R.string.TelegramStarsChoose);
                UItem uItem = new UItem(0);
                uItem.text = string;
                arrayList.add(uItem);
            }
            ArrayList options = StarsController.getInstance(this.currentAccount, false).getOptions();
            if (z) {
                if (options == null || options.isEmpty()) {
                    UItem uItem2 = new UItem(34);
                    uItem2.intValue = 31;
                    UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem2, 34);
                    uItemM.intValue = 31;
                    UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
                    uItemM2.intValue = 31;
                    arrayList.add(uItemM2);
                } else {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    boolean z2 = false;
                    int i5 = 1;
                    while (true) {
                        int size = options.size();
                        j = this.starsNeeded;
                        if (i2 >= size) {
                            break;
                        }
                        TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) options.get(i2);
                        if (tL_starsTopupOption.stars >= j) {
                            if (tL_starsTopupOption.extended && !this.expanded && z2) {
                                i4++;
                            } else {
                                arrayList.add(StarTierView.Factory.asStarTier(i2, i5, tL_starsTopupOption));
                                i3++;
                                i5++;
                                z2 = true;
                            }
                        }
                        i2++;
                    }
                    if (i3 < 3) {
                        arrayList.clear();
                        arrayList.add(UItem.asCustom(anonymousClass5));
                        String string2 = LocaleController.getString(R.string.TelegramStarsChoose);
                        UItem uItem3 = new UItem(0);
                        uItem3.text = string2;
                        arrayList.add(uItem3);
                        int i6 = 0;
                        for (int i7 = 0; i7 < options.size(); i7++) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) options.get(i7);
                            if (tL_starsTopupOption2.stars >= j) {
                                arrayList.add(StarTierView.Factory.asStarTier(i7, i5, tL_starsTopupOption2));
                                i6++;
                                i5++;
                            }
                        }
                        if (i6 == 0) {
                            while (i < options.size()) {
                                arrayList.add(StarTierView.Factory.asStarTier(i, i5, (TL_stars.TL_starsTopupOption) options.get(i)));
                                i++;
                                i5++;
                            }
                            boolean z3 = this.expanded;
                            if (!z3 && i4 > 0) {
                                String string3 = LocaleController.getString(z3 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                                boolean z4 = !this.expanded;
                                int i8 = ExpandView.Factory.$r8$clinit;
                                UItem uItemOfFactory = UItem.ofFactory(ExpandView.Factory.class);
                                uItemOfFactory.id = -1;
                                uItemOfFactory.text = string3;
                                uItemOfFactory.collapsed = z4;
                                uItemOfFactory.accent = true;
                                arrayList.add(uItemOfFactory);
                            }
                        } else {
                            this.expanded = true;
                        }
                    } else if (i3 > 0) {
                        boolean z5 = this.expanded;
                        if (!z5 && i4 > 0) {
                            String string4 = LocaleController.getString(z5 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z6 = !this.expanded;
                            int i9 = ExpandView.Factory.$r8$clinit;
                            UItem uItemOfFactory2 = UItem.ofFactory(ExpandView.Factory.class);
                            uItemOfFactory2.id = -1;
                            uItemOfFactory2.text = string4;
                            uItemOfFactory2.collapsed = z6;
                            uItemOfFactory2.accent = true;
                            arrayList.add(uItemOfFactory2);
                        }
                    } else {
                        while (i < options.size()) {
                            arrayList.add(StarTierView.Factory.asStarTier(i, i5, (TL_stars.TL_starsTopupOption) options.get(i)));
                            i++;
                            i5++;
                        }
                    }
                }
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        @Override
        public final CharSequence getTitle() {
            GradientHeaderActivity.AnonymousClass5 anonymousClass5 = this.headerView;
            if (anonymousClass5 == null) {
                return null;
            }
            return ((TextView) anonymousClass5.titleView).getText();
        }

        public final void lambda$new$0$6(int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            UniversalAdapter universalAdapter2 = this.adapter;
            if (item.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter2.update(true);
            } else if (item.instanceOf(StarTierView.Factory.class) && (item.object instanceof TL_stars.TL_starsTopupOption)) {
                Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                if (activityFindActivity == null) {
                    activityFindActivity = LaunchActivity.instance;
                }
                if (activityFindActivity == null) {
                    return;
                }
                StarsController.getInstance(this.currentAccount, false).buy(activityFindActivity, (TL_stars.TL_starsTopupOption) item.object, new OAuthSheet$$ExternalSyntheticLambda18(22, this, item), this.purposePeer);
            }
        }

        public final void lambda$onItemClick$2(UItem uItem, Boolean bool, String str) {
            if (getContext() == null) {
                return;
            }
            if (bool.booleanValue()) {
                new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0])), R.raw.stars_topup).show();
                this.fireworksOverlay.start(true);
                StarsController.getInstance(this.currentAccount, false).invalidateTransactions(true);
            } else if (str != null) {
                zzks.m(R.string.UnknownErrorCode, new Object[]{str}, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), R.raw.error);
            }
        }

        @Override
        public final void show() {
            ChatActivity.AnonymousClass39 anonymousClass39;
            if (!this.canBuy) {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.PaymentInvoiceDisabledStarsText, new BulletinFactory(new Bulletin.BulletinWindow(getContext(), null).container, this.resourcesProvider), R.raw.stars_topup, 36);
                return;
            }
            if (StarsController.getInstance(this.currentAccount, false).getBalance().amount >= this.starsNeeded) {
                Runnable runnable = this.whenPurchased;
                if (runnable != null) {
                    runnable.run();
                    this.whenPurchased = null;
                    return;
                }
                return;
            }
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass39.messageEditText);
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    public final class StarsOptionsSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public boolean expanded;
        public final FrameLayout footerView;

        public StarsOptionsSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, null, false, false, false, resourcesProvider);
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 11));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            int i2 = Theme.key_windowBackgroundWhite;
            setBackgroundColor(Theme.getColor(i2, resourcesProvider));
            fixNavigationBar(Theme.getColor(i2, resourcesProvider));
            this.actionBar.setTitle(LocaleController.getString(R.string.StarsBuy));
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new LivePlayer$1$$ExternalSyntheticLambda0(this, 4)));
            linksTextView.setGravity(17);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            this.containerView.addView(new FireworksOverlay(getContext()), LayoutHelper.createFrame(-1.0f, -1));
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 23), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.applyBackground = false;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if ((i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
            }
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
            String string = LocaleController.getString(R.string.TelegramStarsChoose);
            UItem uItem = new UItem(0);
            uItem.text = string;
            arrayList.add(uItem);
            ArrayList options = StarsController.getInstance(this.currentAccount, false).getOptions();
            if (options == null || options.isEmpty()) {
                UItem uItem2 = new UItem(34);
                uItem2.intValue = 31;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem2, 34);
                uItemM.intValue = 31;
                UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
                uItemM2.intValue = 31;
                UItem uItemM3 = ArticleViewer.IBlock.CC.m(arrayList, uItemM2, 34);
                uItemM3.intValue = 31;
                UItem uItemM4 = ArticleViewer.IBlock.CC.m(arrayList, uItemM3, 34);
                uItemM4.intValue = 31;
                arrayList.add(uItemM4);
            } else {
                int i = 0;
                int i2 = 1;
                for (int i3 = 0; i3 < options.size(); i3++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) options.get(i3);
                    if (!tL_starsTopupOption.extended || this.expanded) {
                        arrayList.add(StarTierView.Factory.asStarTier(i3, i2, tL_starsTopupOption));
                        i2++;
                    } else {
                        i++;
                    }
                }
                boolean z = this.expanded;
                if (!z && i > 0) {
                    String string2 = LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                    boolean z2 = !this.expanded;
                    int i4 = ExpandView.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(ExpandView.Factory.class);
                    uItemOfFactory.id = -1;
                    uItemOfFactory.text = string2;
                    uItemOfFactory.collapsed = z2;
                    uItemOfFactory.accent = true;
                    arrayList.add(uItemOfFactory);
                }
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        @Override
        public final CharSequence getTitle() {
            return LocaleController.getString(R.string.StarsBuy);
        }

        public final void lambda$new$0$7(int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            UniversalAdapter universalAdapter2 = this.adapter;
            if (item.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter2.update(true);
                this.recyclerListView.smoothScrollBy(0, AndroidUtilities.dp(300.0f), null);
            } else if (item.instanceOf(StarTierView.Factory.class) && (item.object instanceof TL_stars.TL_starsTopupOption)) {
                Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                if (activityFindActivity == null) {
                    activityFindActivity = LaunchActivity.instance;
                }
                if (activityFindActivity == null) {
                    return;
                }
                StarsController.getInstance(this.currentAccount, false).buy(activityFindActivity, (TL_stars.TL_starsTopupOption) item.object, new OAuthSheet$$ExternalSyntheticLambda18(23, this, item), null);
            }
        }

        public final void lambda$onItemClick$2$1(UItem uItem, Boolean bool, String str) {
            if (getContext() == null) {
                return;
            }
            lambda$showGiftOfferSheet$15();
            StarsController.getInstance(this.currentAccount, false).invalidateTransactions(true);
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            if (bool.booleanValue()) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0])), R.raw.stars_topup).show();
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    launchActivity.fireworksOverlay.start(true);
                    return;
                }
                return;
            }
            if (str != null) {
                zzks.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(safeLastFragment), R.raw.error);
            }
        }

        @Override
        public final void show() {
            ChatActivity.AnonymousClass39 anonymousClass39;
            long j = StarsController.getInstance(this.currentAccount, false).getBalance().amount;
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass39.messageEditText);
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    public final class StarsSubscriptionView extends LinearLayout {
        public final int currentAccount;
        public final BackupImageView imageView;
        public boolean needDivider;
        public final TextView priceSubtitleView;
        public final TextView priceTitleView;
        public final TextView productView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public boolean threeLines;
        public final SimpleTextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                boolean z2;
                String str;
                int i;
                StarsSubscriptionView starsSubscriptionView = (StarsSubscriptionView) view;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) uItem.object;
                starsSubscriptionView.getClass();
                long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                starsSubscriptionView.threeLines = !TextUtils.isEmpty(starsSubscription.title);
                BackupImageView backupImageView = starsSubscriptionView.imageView;
                int i2 = starsSubscriptionView.currentAccount;
                if (peerDialogId < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerDialogId));
                    AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                    avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                    backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                    backupImageView.onNewImageSet();
                    str = chat != null ? chat.title : null;
                    z2 = false;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerDialogId));
                    AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                    avatarDrawable2.setInfo(UserConfig.selectedAccount, user);
                    backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable2);
                    backupImageView.onNewImageSet();
                    String userName = UserObject.getUserName(user);
                    z2 = !UserObject.isBot(user);
                    str = userName;
                }
                long currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
                SimpleTextView simpleTextView = starsSubscriptionView.titleView;
                simpleTextView.setText(Emoji.replaceEmoji(str, simpleTextView.getPaint().getFontMetricsInt(), false), false);
                boolean zIsEmpty = TextUtils.isEmpty(starsSubscription.title);
                TextView textView = starsSubscriptionView.productView;
                if (zIsEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (starsSubscription.photo != null) {
                        ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(textView, 14.0f, i2);
                        ImageReceiver imageReceiver = imageReceiverSpan.imageReceiver;
                        float fDp = AndroidUtilities.dp(4.0f);
                        imageReceiverSpan.radius = fDp;
                        imageReceiver.setRoundRadius((int) fDp);
                        imageReceiverSpan.shadowEnabled = false;
                        SpannableString spannableString = new SpannableString("x");
                        spannableString.setSpan(imageReceiverSpan, 0, 1, 33);
                        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                    }
                    spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, simpleTextView.getPaint().getFontMetricsInt(), false));
                    textView.setText(spannableStringBuilder);
                }
                TextView textView2 = starsSubscriptionView.subtitleView;
                textView2.setTextSize(1, starsSubscriptionView.threeLines ? 13.0f : 14.0f);
                boolean z3 = starsSubscription.canceled;
                TextView textView3 = starsSubscriptionView.priceTitleView;
                TextView textView4 = starsSubscriptionView.priceSubtitleView;
                Theme.ResourcesProvider resourcesProvider = starsSubscriptionView.resourcesProvider;
                if (z3 || starsSubscription.bot_canceled) {
                    long j = starsSubscription.until_date;
                    textView2.setText(LocaleController.formatString(j < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j)));
                    textView3.setVisibility(8);
                    textView4.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                    if (starsSubscription.bot_canceled) {
                        i = z2 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled;
                    } else {
                        i = R.string.StarsSubscriptionStatusCancelled;
                    }
                    textView4.setText(LocaleController.getString(i));
                } else {
                    long j2 = starsSubscription.until_date;
                    if (j2 < currentTime) {
                        textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j2)));
                        textView3.setVisibility(8);
                        textView4.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                        textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
                    } else {
                        textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j2)));
                        textView3.setVisibility(0);
                        textView3.setText(StarsIntroActivity.replaceStarsWithPlain(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                        textView4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                        int i3 = starsSubscription.pricing.period;
                        if (i3 == 2592000) {
                            textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                        } else if (i3 == 60) {
                            textView4.setText("per minute");
                        } else if (i3 == 300) {
                            textView4.setText("per 5 minutes");
                        }
                    }
                }
                starsSubscriptionView.needDivider = z;
                starsSubscriptionView.setWillNotDraw(!z);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsSubscriptionView starsSubscriptionView = (StarsSubscriptionView) getCached();
                return starsSubscriptionView != null ? starsSubscriptionView : new StarsSubscriptionView(context, i, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                if (uItem2 == null) {
                    return false;
                }
                Object obj = uItem.object;
                if (!(obj instanceof TL_stars.StarsSubscription)) {
                    return false;
                }
                Object obj2 = uItem2.object;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
                }
                return false;
            }
        }

        public StarsSubscriptionView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            addView(backupImageView, LayoutHelper.createLinear(46, 46, 0.0f, 19, 13, 0, 13, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 16, 0, 0, 0, 0));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            simpleTextView.setTextSize(16);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            NotificationCenter.listenEmojiLoading(simpleTextView);
            linearLayout.addView(simpleTextView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
            TextView textView = new TextView(context);
            this.productView = textView;
            OKLCH.m(i2, resourcesProvider, textView, 13.0f);
            textView.setVisibility(8);
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
            this.subtitleView = textViewM;
            int i3 = Theme.key_windowBackgroundWhiteGrayText2;
            OKLCH.m(i3, resourcesProvider, textViewM, 14.0f);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 0, 18, 0));
            TextView textView2 = new TextView(context);
            this.priceTitleView = textView2;
            zzlj.m(i2, resourcesProvider, textView2, 16.0f);
            textView2.setGravity(5);
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2, 5, 0, 0, 0, 1));
            TextView textView3 = new TextView(context);
            this.priceSubtitleView = textView3;
            OKLCH.m(i3, resourcesProvider, textView3, 13.0f);
            textView3.setGravity(5);
            linearLayout2.addView(textView3, LayoutHelper.createLinear(-1, -2, 5, 0, 0, 0, 0));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 68.0f : 58.0f), 1073741824));
        }
    }

    public final class StarsTransactionView extends LinearLayout {
        public static HashMap cachedPlatformDrawables;
        public final TextView amountTextView;
        public final AvatarDrawable avatarDrawable;
        public final int currentAccount;
        public final TextView dateTextView;
        public final BackupImageView imageView;
        public final BackupImageView imageView2;
        public int imageViewCount;
        public boolean needDivider;
        public final SpannableString star;
        public final LinkSpanDrawable.LinksTextView subtitleTextView;
        public boolean threeLines;
        public final TextView titleTextView;
        public final LinearLayout.LayoutParams titleTextViewParams;
        public final SpannableString ton;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                int i;
                boolean z2;
                CharSequence userName;
                int i2;
                ImageLocation imageLocation;
                ImageLocation forDocument;
                int i3;
                int i4;
                long j;
                TextView textView;
                SpannableString spannableString;
                SpannableString spannableString2;
                StarsTransactionView starsTransactionView = (StarsTransactionView) view;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) uItem.object;
                boolean z3 = uItem.accent;
                starsTransactionView.getClass();
                long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
                boolean z4 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
                int i5 = starsTransaction.flags;
                Integer num = 0;
                boolean z5 = (131072 & i5) == 0 && (i5 & 65536) != 0;
                boolean z6 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
                starsTransactionView.threeLines = z6;
                starsTransactionView.titleTextViewParams.bottomMargin = z6 ? 0 : AndroidUtilities.dp(4.33f);
                LinkSpanDrawable.LinksTextView linksTextView = starsTransactionView.subtitleTextView;
                linksTextView.setVisibility(starsTransactionView.threeLines ? 0 : 8);
                TextView textView2 = starsTransactionView.dateTextView;
                textView2.setTextSize(1, starsTransactionView.threeLines ? 13.0f : 14.0f);
                textView2.setText(LocaleController.formatShortDateTime(starsTransaction.date));
                if (starsTransaction.refund) {
                    textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
                } else if (starsTransaction.failed) {
                    textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
                } else if (starsTransaction.pending) {
                    textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
                }
                BackupImageView backupImageView = starsTransactionView.imageView;
                backupImageView.setTranslationX(0.0f);
                backupImageView.setTranslationY(0.0f);
                BackupImageView backupImageView2 = starsTransactionView.imageView2;
                backupImageView2.setVisibility(8);
                backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
                boolean z7 = starsTransaction.stargift_upgrade;
                TextView textView3 = starsTransactionView.titleTextView;
                if (z7 && starsTransaction.stargift != null) {
                    backupImageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(backupImageView, starsTransaction.stargift, 46, 0.25f));
                    textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
                    linksTextView.setVisibility(8);
                } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
                    backupImageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(backupImageView, starsTransaction.stargift, 46, 0.25f));
                    textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
                    linksTextView.setVisibility(8);
                } else {
                    if (!starsTransaction.posts_search) {
                        if (peerDialogId != 0) {
                            boolean zIsService = UserObject.isService(peerDialogId);
                            int i6 = starsTransactionView.currentAccount;
                            if (zIsService) {
                                userName = LocaleController.getString(R.string.StarsTransactionUnknown);
                                backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "fragment"));
                                z2 = false;
                            } else {
                                AvatarDrawable avatarDrawable = starsTransactionView.avatarDrawable;
                                if (peerDialogId >= 0) {
                                    TLRPC.User user = MessagesController.getInstance(i6).getUser(Long.valueOf(peerDialogId));
                                    z2 = user == null;
                                    avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                                    backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                                    backupImageView.onNewImageSet();
                                    userName = UserObject.getUserName(user);
                                } else {
                                    TLRPC.Chat chat = MessagesController.getInstance(i6).getChat(Long.valueOf(-peerDialogId));
                                    z2 = chat == null;
                                    avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                                    backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                                    backupImageView.onNewImageSet();
                                    userName = chat == null ? "" : chat.title;
                                }
                            }
                            if (starsTransaction.stargift != null) {
                                ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(linksTextView, 16.0f, i6);
                                ImageReceiver imageReceiver = imageReceiverSpan.imageReceiver;
                                float fDp = AndroidUtilities.dp(4.0f);
                                imageReceiverSpan.radius = fDp;
                                imageReceiver.setRoundRadius((int) fDp);
                                imageReceiverSpan.shadowEnabled = false;
                                SpannableString spannableString3 = new SpannableString("x");
                                spannableString3.setSpan(imageReceiverSpan, 0, 1, 33);
                                TL_stars.StarGift starGift = starsTransaction.stargift;
                                StarsIntroActivity.setGiftImage(imageReceiver, starGift == null ? null : starGift.getDocument(), 16);
                                textView3.setText(userName);
                                if (starsTransaction.offer) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    TLRPC.Document document = starsTransaction.stargift.getDocument();
                                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, linksTextView.getPaint().getFontMetricsInt());
                                    animatedEmojiSpan.document = document;
                                    spannableStringBuilder.setSpan(animatedEmojiSpan, 0, 1, 33);
                                    if (starsTransaction.amount.negative()) {
                                        spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                                    } else {
                                        spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                                    }
                                    linksTextView.setText(spannableStringBuilder);
                                } else if (starsTransaction.stargift_resale) {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    TLRPC.Document document2 = starsTransaction.stargift.getDocument();
                                    AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document2.id, 1.2f, linksTextView.getPaint().getFontMetricsInt());
                                    animatedEmojiSpan2.document = document2;
                                    spannableStringBuilder2.setSpan(animatedEmojiSpan2, 0, 1, 33);
                                    if (starsTransaction.amount.negative()) {
                                        spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                                    } else {
                                        spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                                    }
                                    linksTextView.setText(spannableStringBuilder2);
                                } else if (starsTransaction.stargift_prepaid_upgrade) {
                                    linksTextView.setText(TextUtils.concat(spannableString3, " ", LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade)));
                                } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                                    linksTextView.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                                } else if (starsTransaction.refund) {
                                    if (starsTransaction.stargift_auction_bid) {
                                        i4 = R.string.Gift2TransactionRefundedAuctionBid;
                                    } else if (starsTransaction.amount.amount > 0) {
                                        i4 = starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent;
                                    } else {
                                        i4 = R.string.Gift2TransactionRefundedConverted;
                                    }
                                    linksTextView.setText(TextUtils.concat(spannableString3, " ", LocaleController.getString(i4)));
                                } else {
                                    if (starsTransaction.stargift_auction_bid) {
                                        i3 = R.string.Gift2TransactionAuctionBid;
                                    } else if (starsTransaction.amount.amount > 0) {
                                        i3 = R.string.Gift2TransactionConverted;
                                    } else {
                                        i3 = starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent;
                                    }
                                    linksTextView.setText(TextUtils.concat(spannableString3, " ", LocaleController.getString(i3)));
                                }
                            } else if (starsTransaction.subscription) {
                                textView3.setText(userName);
                                int i7 = starsTransaction.subscription_period;
                                if (i7 == 2592000) {
                                    linksTextView.setVisibility(0);
                                    linksTextView.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                                } else {
                                    String str = i7 == 300 ? "5 minutes" : "Minute";
                                    linksTextView.setVisibility(0);
                                    Locale locale = Locale.US;
                                    linksTextView.setText(str.concat(" subscription fee"));
                                }
                            } else if (starsTransaction.phonegroup_message) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                            } else if (starsTransaction.paid_message) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                            } else if (starsTransaction.premium_gift) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                            } else if (z5) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.formatString(R.string.StarTransactionCommission, AffiliateProgramFragment.percents(starsTransaction.starref_commission_permille)));
                            } else if (starsTransaction.gift) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.getString(R.string.StarsGiftReceived));
                            } else if ((starsTransaction.flags & 8192) != 0) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                            } else if (starsTransaction.reaction) {
                                textView3.setText(userName);
                                linksTextView.setVisibility(z2 ? 8 : 0);
                                linksTextView.setText(LocaleController.getString(R.string.StarsReactionsSent));
                            } else if (starsTransaction.extended_media.isEmpty()) {
                                i = 8;
                                if (starsTransaction.photo != null) {
                                    ImageReceiverSpan imageReceiverSpan2 = new ImageReceiverSpan(linksTextView, 14.0f, i6);
                                    ImageReceiver imageReceiver2 = imageReceiverSpan2.imageReceiver;
                                    float fDp2 = AndroidUtilities.dp(4.0f);
                                    imageReceiverSpan2.radius = fDp2;
                                    imageReceiver2.setRoundRadius((int) fDp2);
                                    imageReceiverSpan2.shadowEnabled = false;
                                    SpannableString spannableString4 = new SpannableString("x");
                                    spannableString4.setSpan(imageReceiverSpan2, 0, 1, 33);
                                    imageReceiver2.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                                    textView3.setText(userName);
                                    linksTextView.setVisibility(z2 ? 8 : 0);
                                    String str2 = starsTransaction.title;
                                    linksTextView.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString4, " ", str2 != null ? str2 : ""), linksTextView.getPaint().getFontMetricsInt(), false));
                                } else {
                                    textView3.setText(userName);
                                    linksTextView.setVisibility(z2 ? 8 : 0);
                                    String str3 = starsTransaction.title;
                                    linksTextView.setText(Emoji.replaceEmoji(str3 != null ? str3 : "", linksTextView.getPaint().getFontMetricsInt(), false));
                                }
                            } else {
                                if (z3) {
                                    textView3.setText(userName);
                                    linksTextView.setVisibility(0);
                                    linksTextView.setText(LocaleController.getString(R.string.StarMediaPurchase));
                                } else {
                                    textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                                    linksTextView.setVisibility(z2 ? 8 : 0);
                                    linksTextView.setText(userName);
                                }
                                starsTransactionView.imageViewCount = 0;
                                int i8 = 0;
                                while (i8 < Math.min(2, starsTransaction.extended_media.size())) {
                                    TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i8);
                                    BackupImageView backupImageView3 = i8 == 0 ? backupImageView : backupImageView2;
                                    backupImageView3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo);
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                            forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document);
                                        } else {
                                            i2 = 0;
                                            imageLocation = null;
                                        }
                                        backupImageView3.setVisibility(i2);
                                        Integer num2 = num;
                                        backupImageView3.setImage(imageLocation, "46_46", null, null, null, num2);
                                        starsTransactionView.imageViewCount++;
                                        i8++;
                                        num = num2;
                                    }
                                    imageLocation = forDocument;
                                    i2 = 0;
                                    backupImageView3.setVisibility(i2);
                                    Integer num3 = num;
                                    backupImageView3.setImage(imageLocation, "46_46", null, null, null, num3);
                                    starsTransactionView.imageViewCount++;
                                    i8++;
                                    num = num3;
                                }
                                i = 8;
                                int i9 = 0;
                                while (i9 < starsTransactionView.imageViewCount) {
                                    BackupImageView backupImageView4 = i9 == 0 ? backupImageView : backupImageView2;
                                    float f = i9;
                                    backupImageView4.setTranslationX(((f - (starsTransactionView.imageViewCount / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                                    backupImageView4.setTranslationY((f - (starsTransactionView.imageViewCount / 2.0f)) * AndroidUtilities.dp(4.33f));
                                    i9++;
                                }
                            }
                        } else {
                            i = 8;
                            if (starsTransaction.floodskip) {
                                textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                                linksTextView.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                                backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "api"));
                            } else {
                                TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                    textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "ios"));
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                    textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "android"));
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                                    if (starsTransaction.gift) {
                                        textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                        linksTextView.setText(LocaleController.getString(z4 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                        linksTextView.setVisibility(0);
                                    } else {
                                        textView3.setText(LocaleController.getString((z3 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                                    }
                                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "fragment"));
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                    textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "premiumbot"));
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                                    textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "?"));
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                                    textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "ads"));
                                } else {
                                    textView3.setText("");
                                    backupImageView.setImageDrawable(null);
                                }
                            }
                        }
                        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                        j = starsAmount.amount;
                        textView = starsTransactionView.amountTextView;
                        spannableString = starsTransactionView.star;
                        spannableString2 = starsTransactionView.ton;
                        if (j <= 0 || (j == 0 && starsAmount.nanos > 0)) {
                            textView.setVisibility(0);
                            textView.setTextColor(Theme.getColor(null, Theme.key_color_green, false));
                            SpannableStringBuilder starsAmount2 = StarsIntroActivity.formatStarsAmount(starsTransaction.amount, 0.777f, ',');
                            if (z4) {
                                spannableString = spannableString2;
                            }
                            textView.setText(TextUtils.concat("+", starsAmount2, " ", spannableString));
                        } else if (j < 0 || (j == 0 && starsAmount.nanos < 0)) {
                            textView.setVisibility(0);
                            textView.setTextColor(Theme.getColor(null, Theme.key_color_red, false));
                            SpannableStringBuilder starsAmount3 = StarsIntroActivity.formatStarsAmount(starsTransaction.amount, 0.777f, ',');
                            if (z4) {
                                spannableString = spannableString2;
                            }
                            textView.setText(TextUtils.concat(starsAmount3, " ", spannableString));
                        } else {
                            textView.setVisibility(i);
                        }
                        starsTransactionView.needDivider = z;
                        starsTransactionView.setWillNotDraw(!z);
                    }
                    backupImageView.setImageDrawable(StarsTransactionView.getPlatformDrawable(44, "search"));
                    textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
                    linksTextView.setVisibility(8);
                }
                i = 8;
                TL_stars.StarsAmount starsAmount4 = starsTransaction.amount;
                j = starsAmount4.amount;
                textView = starsTransactionView.amountTextView;
                spannableString = starsTransactionView.star;
                spannableString2 = starsTransactionView.ton;
                if (j <= 0) {
                    textView.setVisibility(0);
                    textView.setTextColor(Theme.getColor(null, Theme.key_color_green, false));
                    SpannableStringBuilder starsAmount5 = StarsIntroActivity.formatStarsAmount(starsTransaction.amount, 0.777f, ',');
                    if (z4) {
                        spannableString = spannableString2;
                    }
                    textView.setText(TextUtils.concat("+", starsAmount5, " ", spannableString));
                } else {
                    textView.setVisibility(0);
                    textView.setTextColor(Theme.getColor(null, Theme.key_color_green, false));
                    SpannableStringBuilder starsAmount6 = StarsIntroActivity.formatStarsAmount(starsTransaction.amount, 0.777f, ',');
                    if (z4) {
                        spannableString = spannableString2;
                    }
                    textView.setText(TextUtils.concat("+", starsAmount6, " ", spannableString));
                }
                starsTransactionView.needDivider = z;
                starsTransactionView.setWillNotDraw(!z);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsTransactionView starsTransactionView = (StarsTransactionView) getCached();
                return starsTransactionView != null ? starsTransactionView : new StarsTransactionView(context, i, resourcesProvider);
            }
        }

        public StarsTransactionView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.imageViewCount = 1;
            this.currentAccount = i;
            setOrientation(0);
            GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, context, resourcesProvider);
            addView(anonymousClass7, LayoutHelper.createLinear(72, -1, 0.0f, 115));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView2 = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            anonymousClass7.addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.imageView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(46.0f));
            anonymousClass7.addView(backupImageView2, LayoutHelper.createFrame(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(19);
            addView(linearLayout, LayoutHelper.createLinear(-2, -1, 1.0f, 119));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            OKLCH.m(i2, resourcesProvider, textView, 16.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
            this.titleTextViewParams = layoutParamsCreateLinear;
            linearLayout.addView(textView, layoutParamsCreateLinear);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.subtitleTextView = linksTextView;
            linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setEllipsize(truncateAt);
            linksTextView.setSingleLine(true);
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
            TextView textView2 = new TextView(context);
            this.dateTextView = textView2;
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView2, 14.0f);
            textView2.setEllipsize(truncateAt);
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2));
            TextView textView3 = new TextView(context);
            this.amountTextView = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 15.3f);
            textView3.setGravity(5);
            addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 21, 8, 0, 20, 0));
            SpannableString spannableString = new SpannableString("⭐️");
            this.star = spannableString;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            drawableMutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
            spannableString.setSpan(new ImageSpan(drawableMutate), 0, spannableString.length(), 33);
            SpannableString spannableString2 = new SpannableString("TON");
            this.ton = spannableString2;
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
            coloredImageSpan.setSize(AndroidUtilities.dp(18.0f));
            coloredImageSpan.setTranslateY(AndroidUtilities.dp(0.5f));
            spannableString2.setSpan(coloredImageSpan, 0, spannableString2.length(), 33);
        }

        public static CombinedDrawable getPlatformDrawable(int i, String str) {
            if (i != 44) {
                int i2 = SessionCell.$r8$clinit;
                TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
                tL_authorization.device_model = str;
                tL_authorization.platform = str;
                tL_authorization.app_name = str;
                return SessionCell.createDrawable(i, tL_authorization);
            }
            if (cachedPlatformDrawables == null) {
                cachedPlatformDrawables = new HashMap();
            }
            CombinedDrawable combinedDrawable = (CombinedDrawable) cachedPlatformDrawables.get(str);
            if (combinedDrawable != null) {
                return combinedDrawable;
            }
            HashMap map = cachedPlatformDrawables;
            int i3 = SessionCell.$r8$clinit;
            TLRPC.TL_authorization tL_authorization2 = new TLRPC.TL_authorization();
            tL_authorization2.device_model = str;
            tL_authorization2.platform = str;
            tL_authorization2.app_name = str;
            CombinedDrawable combinedDrawableCreateDrawable = SessionCell.createDrawable(44, tL_authorization2);
            map.put(str, combinedDrawableCreateDrawable);
            return combinedDrawableCreateDrawable;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 71.0f : 58.0f), 1073741824));
        }
    }

    public StarsIntroActivity() {
        this.whiteBackground = true;
    }

    public static void addAvailabilityRow(TableView tableView, int i, TL_stars.StarGift starGift, Theme.ResourcesProvider resourcesProvider) {
        CharSequence pluralStringComma;
        TL_stars.StarGift starGift2 = null;
        TextView textView = (TextView) ((TableView.TableRowContent) tableView.addRow(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        LoadingSpan loadingSpan = new LoadingSpan(AndroidUtilities.dp(90.0f), 0, textView, resourcesProvider);
        loadingSpan.setColors(Theme.multAlpha(0.21f, textView.getPaint().getColor()), Theme.multAlpha(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i2 = starGift.availability_remains;
                textView.setText(i2 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i2, LocaleController.formatNumber(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                pluralStringComma = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                pluralStringComma = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(pluralStringComma);
            return;
        }
        final StarsController starsController = StarsController.getInstance(i, false);
        final long j = starGift.id;
        final VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = new VoIPFragment$$ExternalSyntheticLambda7(textView, 4);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i3, int i4, Object[] objArr) {
                int i5;
                TL_stars.StarGift starGift3;
                StarsController starsController2 = starsController;
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && i3 == (i5 = NotificationCenter.starGiftsLoaded)) {
                    starsController2.loadStarGifts();
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList = starsController2.gifts;
                        if (i6 >= arrayList.size()) {
                            starGift3 = null;
                            break;
                        }
                        starGift3 = (TL_stars.StarGift) arrayList.get(i6);
                        if (starGift3.id == j) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (starGift3 != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(starsController2.currentAccount).removeObserver(notificationCenterDelegateArr[0], i5);
                        voIPFragment$$ExternalSyntheticLambda7.run(starGift3);
                    }
                }
            }
        };
        int i3 = starsController.currentAccount;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i3);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i4 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i4);
        starsController.loadStarGifts();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = starsController.gifts;
            if (i5 >= arrayList.size()) {
                break;
            }
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList.get(i5);
            if (starGift3.id == j) {
                starGift2 = starGift3;
                break;
            }
            i5++;
        }
        if (starGift2 != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i3).removeObserver(notificationCenterDelegateArr[0], i4);
            voIPFragment$$ExternalSyntheticLambda7.run(starGift2);
        }
    }

    public static void appendStatus(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ReplacementSpan(textView.getCurrentTextColor(), str) {
            public final Paint backgroundPaint;
            public final Text layout;
            public final int val$color;

            {
                this.val$color = i;
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                paint.setColor(Theme.multAlpha(0.1f, i));
                this.layout = new Text(str, 13.0f, AndroidUtilities.bold());
            }

            @Override
            public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                RectF rectF = AndroidUtilities.rectTmp;
                int i6 = i3 + i5;
                rectF.set(f, (i6 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f + this.layout.width, (AndroidUtilities.dp(20.0f) + i6) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.backgroundPaint);
                this.layout.draw(f + AndroidUtilities.dp(6.0f), i6 / 2.0f, 1.0f, this.val$color, canvas);
            }

            @Override
            public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return (int) (AndroidUtilities.dp(12.0f) + this.layout.width);
            }
        }, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static android.text.SpannableStringBuilder formatStarsAmount(org.telegram.tgnet.tl.TL_stars.StarsAmount r20, float r21, char r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsIntroActivity.formatStarsAmount(org.telegram.tgnet.tl.TL_stars$StarsAmount, float, char):android.text.SpannableStringBuilder");
    }

    public static android.text.SpannableStringBuilder formatStarsAmountShort(org.telegram.tgnet.tl.TL_stars.StarsAmount r20, float r21, char r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsIntroActivity.formatStarsAmountShort(org.telegram.tgnet.tl.TL_stars$StarsAmount, float, char):android.text.SpannableStringBuilder");
    }

    public static android.text.SpannableStringBuilder formatStarsAmountString(org.telegram.tgnet.tl.TL_stars.StarsAmount r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsIntroActivity.formatStarsAmountString(org.telegram.tgnet.tl.TL_stars$StarsAmount):android.text.SpannableStringBuilder");
    }

    public static String formatTON(long j) {
        if (floatFormat2 == null) {
            floatFormat2 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j % 1000000000 != 0) {
            return floatFormat2.format(j / 1.0E9d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j < 0 ? "-" : "");
        sb.append(LocaleController.formatNumber(Math.abs(j / 1000000000), ','));
        return sb.toString();
    }

    public static java.lang.String getTransactionTitle(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsIntroActivity.getTransactionTitle(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder replaceDiamond(CharSequence charSequence, float f, float f2, float f3) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.diamond);
        coloredImageSpan.recolorDrawable = false;
        coloredImageSpan.translate(0.0f, f2);
        coloredImageSpan.spaceScaleX = f3;
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStars(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return replaceStars(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(TL_stars.StarsAmount starsAmount, String str, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStarsWithPlain(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, coloredImageSpanArr);
    }

    public static void setGiftImage(BackupImageView backupImageView, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 1000) {
            str = "2⃣";
        } else {
            str = j < 2500 ? "3⃣" : "4⃣";
        }
        setGiftImage(backupImageView, imageReceiver, str, false);
    }

    public static void setTonGiftImage(BackupImageView backupImageView, ImageReceiver imageReceiver, long j) {
        String str;
        if (j <= 10000000000L) {
            str = "2⃣";
        } else {
            str = j <= 50000000000L ? "1⃣" : "3⃣";
        }
        setGiftImage(backupImageView, imageReceiver, str, true);
    }

    public static void showBoostsSheet(Context context, int i, long j, TL_stories.Boost boost, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        linearLayoutM.setClipChildren(false);
        linearLayoutM.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 150, 7, 0, 0, 0, 10));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, 70, 0);
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        gLIconTextureView.setStarParticlesView(anonymousClass4);
        frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        gLIconTextureView.setPaused(false);
        TextView textView = new TextView(context);
        zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
        textView.setGravity(17);
        BottomSheet[] bottomSheetArr = new BottomSheet[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4), context);
        textViewM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), -6915073));
        textViewM.setTextColor(-1);
        textViewM.setTextSize(1, 11.33f);
        textViewM.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        textViewM.setGravity(17);
        textViewM.setTypeface(AndroidUtilities.bold());
        StringBuilder sb = new StringBuilder("x");
        int i2 = boost.multiplier;
        if (i2 == 0) {
            i2 = 1;
        }
        sb.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i2));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(2, ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_boost_badge).mutate());
        coloredImageSpan.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
        textViewM.setText(spannableStringBuilder);
        linearLayoutM.addView(textViewM, LayoutHelper.createLinear(-2, 20, 17, 20, 4, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        tableView.addRowUser(LocaleController.getString(R.string.BoostFrom), i, j, new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr, j, 3), null, null);
        tableView.addRow(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            PollItemMenu$$ExternalSyntheticLambda12 pollItemMenu$$ExternalSyntheticLambda12 = new PollItemMenu$$ExternalSyntheticLambda12(bottomSheetArr, j, boost, 24);
            bottomSheetArr = bottomSheetArr;
            tableView.addRowLink(string, string2, pollItemMenu$$ExternalSyntheticLambda12);
        }
        String string3 = LocaleController.getString(R.string.BoostDate);
        int i3 = R.string.formatDateAtTime;
        tableView.addRow(string3, LocaleController.formatString(i3, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) boost.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) boost.date) * 1000))), null, null);
        tableView.addRow(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(i3, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) boost.expires) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) boost.expires) * 1000))), null, null);
        linearLayoutM.addView(tableView, LayoutHelper.createLinear(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new OAuthSheet$$ExternalSyntheticLambda0(context, 15)));
        linksTextView.setGravity(17);
        linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false, true);
        buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 6));
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        bottomSheetM.customView = linearLayoutM;
        bottomSheetArr[0] = bottomSheetM;
        bottomSheetM.useBackgroundTopPadding = false;
        bottomSheetM.fixNavigationBar();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            bottomSheetArr[0].makeAttached(safeLastFragment);
        }
        gLIconTextureView.setPaused(false);
        bottomSheetArr[0].show();
        bottomSheetArr[0].setOnDismissListener(new ProfileActivity$9$$ExternalSyntheticLambda1(gLIconTextureView, 29));
    }

    public static void showGiftResellPriceSheet(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        AmountUtils$Amount resellAmount;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        if (tL_starGiftUnique == null) {
            resellAmount = AmountUtils$Amount.fromDecimal(MessagesController.getInstance(i).config.starsStarGiftResaleAmountMin.get(), amountUtils$Currency);
        } else {
            resellAmount = tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(AmountUtils$Currency.TON) : tL_starGiftUnique.getResellAmount(amountUtils$Currency);
        }
        SellGiftEnterPriceSheet sellGiftEnterPriceSheet = new SellGiftEnterPriceSheet(context, resourcesProvider, i, resellAmount, new OAuthSheet$$ExternalSyntheticLambda13(29, callback2, sellGiftEnterPriceSheetArr));
        SellGiftEnterPriceSheet[] sellGiftEnterPriceSheetArr = {sellGiftEnterPriceSheet};
        sellGiftEnterPriceSheet.show();
    }

    public static void showMediaPriceSheet(Context context, final long j, final boolean z, final Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        zzkq.m(20.0f, R.string.PaidContentTitle, textView);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, resourcesProvider);
        outlineTextContainerView.setForceForceUseCenter(true);
        outlineTextContainerView.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ButtonWithCounterView buttonWithCounterViewM = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int iDp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), iDp, iDp, iDp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        editTextBoldCursor.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new StakedDiceSheet$$ExternalSyntheticLambda5(outlineTextContainerView, editTextBoldCursor, i));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
        outlineTextContainerView.attachedEditText = editTextBoldCursor;
        outlineTextContainerView.invalidate();
        outlineTextContainerView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 48));
        linearLayout.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
        outlineTextContainerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new OAuthSheet$$ExternalSyntheticLambda0(context, 16)), true));
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ButtonWithCounterView buttonWithCounterViewM2 = zzlp.m(context, resourcesProvider, true);
        buttonWithCounterViewM2.setText(LocaleController.getString(j > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(buttonWithCounterViewM2, LayoutHelper.createLinear(-1, 48));
        if (j > 0 && z) {
            buttonWithCounterViewM = zzlp.m(context, resourcesProvider, false);
            buttonWithCounterViewM.setText(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        bottomSheetM.customView = linearLayout;
        final BottomSheet[] bottomSheetArr = {bottomSheetM};
        editTextBoldCursor.setText(j <= 0 ? "" : Long.toString(j));
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            public boolean ignore;
            public int shakeDp = 2;

            @Override
            public final void afterTextChanged(Editable editable) {
                long j2;
                OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (this.ignore) {
                    return;
                }
                try {
                    j2 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                    try {
                        if (j2 > MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax) {
                            this.ignore = true;
                            j2 = MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax;
                            editTextBoldCursor2.setText(Long.toString(j2));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i3 = -this.shakeDp;
                            this.shakeDp = i3;
                            AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i3);
                        }
                    } catch (Exception unused) {
                        this.ignore = true;
                        long j3 = j;
                        editTextBoldCursor2.setText(j3 <= 0 ? "" : Long.toString(j3));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                    }
                } catch (Exception unused2) {
                    j2 = 0;
                }
                this.ignore = false;
                if (!z) {
                    buttonWithCounterViewM2.setEnabled(j2 > 0);
                }
                outlineTextContainerView2.animateSelection(editTextBoldCursor2.isFocused(), !TextUtils.isEmpty(editTextBoldCursor2.getText()));
                TextView textView3 = textView2;
                if (j2 == 0) {
                    textView3.animate().alpha(0.0f).start();
                    textView3.setText("");
                } else {
                    textView3.animate().alpha(1.0f).start();
                    textView3.setText("≈" + BillingController.getInstance().formatCurrency((long) ((j2 / 1000.0d) * ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000)), "USD"));
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                if (i3 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                Utilities.Callback2 callback3 = callback2;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                BottomSheet[] bottomSheetArr2 = bottomSheetArr;
                zArr2[0] = true;
                buttonWithCounterViewM2.setLoading(true);
                callback3.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new StarsIntroActivity$$ExternalSyntheticLambda74(editTextBoldCursor2, bottomSheetArr2, 2));
                return true;
            }
        });
        buttonWithCounterViewM2.setOnClickListener(new StarsIntroActivity$$ExternalSyntheticLambda71(zArr, callback2, editTextBoldCursor, buttonWithCounterViewM2, bottomSheetArr));
        if (buttonWithCounterViewM != null) {
            ButtonWithCounterView buttonWithCounterView = buttonWithCounterViewM;
            buttonWithCounterView.setOnClickListener(new StarsIntroActivity$$ExternalSyntheticLambda71(zArr, callback2, buttonWithCounterView, editTextBoldCursor, bottomSheetArr));
        }
        r16[0].fixNavigationBar();
        r16[0].setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(4, editTextBoldCursor));
        r16[0].show();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        AndroidUtilities.runOnUIThread(new StarsIntroActivity$$ExternalSyntheticLambda74(bottomSheetArr, editTextBoldCursor), lastFragment instanceof ChatActivity ? ((ChatActivity) lastFragment).needEnterText() : false ? 200L : 80L);
    }

    public static void showTransactionSheet(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i2;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        showTransactionSheet(activity, false, 0L, i, starsTransaction, resourcesProvider);
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        ?? r0 = new UniversalAdapter(this.listView, getParentActivity(), this.currentAccount, this.classGuid, new LinkManager$$ExternalSyntheticLambda1(this, 20), getResourceProvider()) {
            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                StarsIntroActivity starsIntroActivity = StarsIntroActivity.this;
                HeaderCell headerCell = new HeaderCell(starsIntroActivity.getParentActivity(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BaseFragment) starsIntroActivity).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = r0;
        r0.applyBackground = false;
        return r0;
    }

    @Override
    public final GradientHeaderActivity.ContentView createContentView() {
        return new TONIntroActivity.NestedFrameLayout(this, getParentActivity());
    }

    @Override
    public final StarParticlesView createParticlesView() {
        return new AnonymousClass4(getParentActivity(), 75, 1);
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        this.transactionsLayout = new StarsTransactionsLayout(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.emptyLayout = new RichDetailsCell.AnonymousClass2(this, context, 1);
        super.createView(context);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.aboveTitleView = frameLayout;
        frameLayout.setClickable(true);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        this.iconTextureView = gLIconTextureView;
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new OAuthSheet$$ExternalSyntheticLambda0(context, 13)), true), this.aboveTitleView, null);
        this.listView.setOverScrollMode(2);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 8));
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getParentActivity());
        this.fireworksOverlay = fireworksOverlay;
        this.contentView.addView(fireworksOverlay, LayoutHelper.createFrame(-1.0f, -1));
        StarsController starsController = StarsController.getInstance(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.balanceLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getParentActivity(), false, true, false);
        this.starBalanceTextView = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        this.starBalanceTextView.setTextSize(AndroidUtilities.dp(32.0f));
        this.starBalanceTextView.setGravity(17);
        this.starBalanceTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
        this.starBalanceIcon = new SpannableStringBuilder("S");
        ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(this.starBalanceTextView, 42.0f, this.currentAccount);
        ImageReceiver imageReceiver = imageReceiverSpan.imageReceiver;
        int i = R.raw.star_reaction;
        imageReceiver.setImageBitmap(new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, "s"), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null));
        imageReceiverSpan.imageReceiver.setAutoRepeat(2);
        imageReceiverSpan.shadowEnabled = false;
        imageReceiverSpan.translateX = -AndroidUtilities.dp(3.0f);
        this.starBalanceIcon.setSpan(imageReceiverSpan, 0, 1, 33);
        this.balanceLayout.addView(this.starBalanceTextView, LayoutHelper.createFrame(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.starBalanceTitleView = textView;
        textView.setTextSize(1, 14.0f);
        this.starBalanceTitleView.setGravity(17);
        this.starBalanceTitleView.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.starBalanceTitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourceProvider));
        this.balanceLayout.addView(this.starBalanceTitleView, LayoutHelper.createFrame(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, getParentActivity(), 20);
        this.oneButtonsLayout = anonymousClass4;
        frameLayout2.addView(anonymousClass4);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, true);
        this.buyButton = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        this.buyButton.setText("", false, true);
        final int i2 = 0;
        this.buyButton.setOnClickListener(new View.OnClickListener(this) {
            public final StarsIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$2(context);
                        break;
                    default:
                        this.f$0.lambda$createView$3(context);
                        break;
                }
            }
        });
        this.oneButtonsLayout.addView(this.buyButton, LayoutHelper.createFrame(-1, 48, 119));
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, getParentActivity(), 13);
        this.twoButtonsLayout = anonymousClass35;
        frameLayout2.addView(anonymousClass35);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, true);
        this.topupButton = buttonWithCounterView2;
        buttonWithCounterView2.setRoundRadius(24);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(2, ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_topup).mutate()), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.topupButton.setText(spannableStringBuilder, false, true);
        final int i3 = 1;
        this.topupButton.setOnClickListener(new View.OnClickListener(this) {
            public final StarsIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$createView$2(context);
                        break;
                    default:
                        this.f$0.lambda$createView$3(context);
                        break;
                }
            }
        });
        this.twoButtonsLayout.addView(this.topupButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, true);
        this.withdrawButton = buttonWithCounterView3;
        buttonWithCounterView3.setRoundRadius(24);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new ColoredImageSpan(2, ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_stats).mutate()), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.withdrawButton.setText(spannableStringBuilder2, false, true);
        final int i4 = 0;
        this.withdrawButton.setOnClickListener(new View.OnClickListener(this) {
            public final StarsIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        StarsIntroActivity starsIntroActivity = this.f$0;
                        starsIntroActivity.presentFragment(new BotStarsActivity(0, starsIntroActivity.getUserConfig().getClientUserId()));
                        break;
                    default:
                        this.f$0.lambda$createView$5$8$1();
                        break;
                }
            }
        });
        this.twoButtonsLayout.addView(this.withdrawButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.balanceLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView4 = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, false);
        this.giftButton = buttonWithCounterView4;
        buttonWithCounterView4.setRoundRadius(24);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new ColoredImageSpan(R.drawable.menu_stars_gift), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.giftButton.setText(spannableStringBuilder3, false, true);
        final int i5 = 1;
        this.giftButton.setOnClickListener(new View.OnClickListener(this) {
            public final StarsIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        StarsIntroActivity starsIntroActivity = this.f$0;
                        starsIntroActivity.presentFragment(new BotStarsActivity(0, starsIntroActivity.getUserConfig().getClientUserId()));
                        break;
                    default:
                        this.f$0.lambda$createView$5$8$1();
                        break;
                }
            }
        });
        this.balanceLayout.addView(this.giftButton, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        updateBalance$1();
        AnonymousClass5 anonymousClass5 = this.adapter;
        if (anonymousClass5 != null) {
            anonymousClass5.update(false);
        }
        BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
        long clientUserId = getUserConfig().getClientUserId();
        Long l = (Long) botStarsController.lastLoadedBotStarsStats.get(Long.valueOf(clientUserId));
        botStarsController.getStarsRevenueStats(clientUserId, l == null || System.currentTimeMillis() - l.longValue() > 30000);
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(getUserConfig().getClientUserId(), false);
        updateButtonsLayouts(starsController.getBalance().amount > 0 && starsRevenueStats != null && (tL_starsRevenueStatus = starsRevenueStats.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starOptionsLoaded) {
            saveScrollPosition$2();
            AnonymousClass5 anonymousClass5 = this.adapter;
            if (anonymousClass5 != null) {
                anonymousClass5.update(true);
            }
            if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                this.savedScrollOffset = 0;
            }
            applyScrolledPosition();
            return;
        }
        if (i == NotificationCenter.starTransactionsLoaded) {
            StarsController starsController = StarsController.getInstance(this.currentAccount, false);
            if (this.hadTransactions != starsController.hasTransactions(0)) {
                this.hadTransactions = starsController.hasTransactions(0);
                saveScrollPosition$2();
                AnonymousClass5 anonymousClass6 = this.adapter;
                if (anonymousClass6 != null) {
                    anonymousClass6.update(true);
                }
                if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                    this.savedScrollOffset = 0;
                }
                applyScrolledPosition();
                return;
            }
            return;
        }
        if (i == NotificationCenter.starSubscriptionsLoaded) {
            AnonymousClass5 anonymousClass7 = this.adapter;
            if (anonymousClass7 != null) {
                anonymousClass7.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance$1();
        } else if (i == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            updateBalance$1();
        }
    }

    @Override
    public final boolean drawActionBarShadow() {
        boolean z;
        StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        if (starsTransactionsLayout == null || !(starsTransactionsLayout.getParent() instanceof View)) {
            z = false;
        } else {
            if ((this.listView.getHeight() - this.listView.getPaddingBottom()) - ((View) this.transactionsLayout.getParent()).getBottom() >= 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return !z;
    }

    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (getParentActivity() == null) {
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount, false);
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, getParentActivity(), 21);
        anonymousClass2.setTag(-33024);
        UItem uItem = new UItem(-2);
        uItem.view = anonymousClass2;
        arrayList.add(uItem);
        arrayList.add(UItem.asCustom(this.balanceLayout));
        ButtonWithCounterView buttonWithCounterView = this.giftButton;
        if (buttonWithCounterView != null) {
            buttonWithCounterView.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        UItem uItem2 = new UItem(7);
        uItem2.text = null;
        arrayList.add(uItem2);
        if (getMessagesController().starrefConnectAllowed) {
            int themedColor = getThemedColor(Theme.key_color_green);
            int i = R.drawable.filled_earn_stars;
            SpannableStringBuilder spannableStringBuilderApplyNewSpan = ChatEditActivity.applyNewSpan(LocaleController.getString(R.string.UserAffiliateProgramRowTitle));
            String string = LocaleController.getString(R.string.UserAffiliateProgramRowText);
            int i2 = AffiliateProgramFragment.ColorfulTextCell.Factory.$r8$clinit;
            UItem uItemOfFactory = UItem.ofFactory(AffiliateProgramFragment.ColorfulTextCell.Factory.class);
            uItemOfFactory.id = -4;
            uItemOfFactory.intValue = themedColor;
            uItemOfFactory.iconResId = i;
            uItemOfFactory.text = spannableStringBuilderApplyNewSpan;
            uItemOfFactory.subtext = string;
            UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItemOfFactory, 7);
            uItemM.text = null;
            arrayList.add(uItemM);
        }
        if (starsController.balanceLoaded) {
            ArrayList arrayList2 = starsController.subscriptions;
            if (!arrayList2.isEmpty()) {
                String string2 = LocaleController.getString(R.string.StarMySubscriptions);
                UItem uItem3 = new UItem(0);
                uItem3.text = string2;
                arrayList.add(uItem3);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i3);
                    int i4 = StarsSubscriptionView.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(StarsSubscriptionView.Factory.class);
                    uItemOfFactory2.object = starsSubscription;
                    arrayList.add(uItemOfFactory2);
                }
                if (starsController.subscriptionsLoading) {
                    arrayList.add(UItem.asFlicker(arrayList.size(), 33));
                } else if (!starsController.subscriptionsEndReached) {
                    UItem uItemAsButton = UItem.asButton(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                    uItemAsButton.accent = true;
                    arrayList.add(uItemAsButton);
                }
                UItem uItem4 = new UItem(7);
                uItem4.text = null;
                arrayList.add(uItem4);
            }
        }
        boolean zHasTransactions = starsController.hasTransactions(0);
        this.hadTransactions = zHasTransactions;
        if (!zHasTransactions) {
            arrayList.add(UItem.asCustomShadow(this.emptyLayout));
            return;
        }
        StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        int iDp = AndroidUtilities.dp(24.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
        UItem uItem5 = new UItem(-3);
        uItem5.view = starsTransactionsLayout;
        uItem5.intValue = iDp;
        uItem5.flags = 0;
        arrayList.add(uItem5);
    }

    public final void lambda$createView$1$6(int i) {
        UItem item;
        String str;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate;
        boolean z;
        final boolean zIsBot;
        TLObject tLObject;
        Drawable drawable;
        Drawable drawable2;
        TextView textView;
        TextView textView2;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        int i2;
        String str2;
        TableView tableView;
        LinkSpanDrawable.LinksTextView linksTextView;
        int i3;
        AvatarSpan avatarSpan;
        AvatarSpan avatarSpan2;
        TLRPC.Chat chat;
        boolean z2;
        String str3;
        boolean z3;
        String str4;
        long currentTime;
        int i4;
        int i5;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate2;
        ?? r4;
        AnonymousClass12 anonymousClass12;
        BaseFragment safeLastFragment;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate3;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        TLRPC.User user;
        boolean z4;
        AnonymousClass5 anonymousClass5 = this.adapter;
        if (anonymousClass5 == null || (item = anonymousClass5.getItem(i)) == null) {
            return;
        }
        int i11 = item.id;
        if (i11 == -1) {
            update(true);
            return;
        }
        if (i11 == -2) {
            StarsController.getInstance(this.currentAccount, false).getGiftOptions();
            UserSelectorBottomSheet.open(1, BirthdayController.getInstance(this.currentAccount).getState());
            return;
        }
        if (i11 == -3) {
            StarsController.getInstance(this.currentAccount, false).loadSubscriptions();
            update(true);
            return;
        }
        if (i11 == -4) {
            if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                AccountFrozenAlert.show(this.currentAccount);
                return;
            } else {
                presentFragment(new ChannelAffiliateProgramsFragment(getUserConfig().getClientUserId()));
                return;
            }
        }
        if (item.instanceOf(StarTierView.Factory.class)) {
            if (item.object instanceof TL_stars.TL_starsTopupOption) {
                StarsController.getInstance(this.currentAccount, false).buy(getParentActivity(), (TL_stars.TL_starsTopupOption) item.object, new OAuthSheet$$ExternalSyntheticLambda18(21, this, item), null);
                return;
            }
            return;
        }
        if (item.instanceOf(StarsSubscriptionView.Factory.class) && (item.object instanceof TL_stars.StarsSubscription)) {
            Activity parentActivity = getParentActivity();
            final int i12 = this.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) item.object;
            Theme.ResourcesProvider resourceProvider = getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            BottomSheet bottomSheet = new BottomSheet(parentActivity, resourceProvider, false, false);
            bottomSheet.fixNavigationBar();
            final BottomSheet[] bottomSheetArr = new BottomSheet[1];
            LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
            linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            linearLayoutM.setClipChildren(false);
            linearLayoutM.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 10));
            final boolean[] zArr = new boolean[1];
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate5 = new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i13, int i14, Object... objArr) {
                    BottomSheet bottomSheet2;
                    if (i13 == NotificationCenter.starSubscriptionsLoaded && zArr[0] && (bottomSheet2 = bottomSheetArr[0]) != null) {
                        bottomSheet2.lambda$showGiftOfferSheet$15();
                    }
                }
            };
            NotificationCenter.getInstance(i12).addObserver(notificationCenterDelegate5, NotificationCenter.starSubscriptionsLoaded);
            final long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            BackupImageView backupImageView = new BackupImageView(parentActivity);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                String userName = UserObject.getUserName(user2);
                zIsBot = UserObject.isBot(user2);
                z = !zIsBot;
                notificationCenterDelegate = notificationCenterDelegate5;
                str = userName;
                tLObject = user2;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                str = chat2 == null ? "" : chat2.title;
                notificationCenterDelegate = notificationCenterDelegate5;
                z = false;
                zIsBot = false;
                tLObject = chat2;
            }
            final TLObject tLObject2 = tLObject;
            if (starsSubscription.photo == null) {
                backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                if (peerDialogId >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                    avatarDrawable.setInfo(UserConfig.selectedAccount, user3);
                    backupImageView.imageReceiver.setForUserOrChat(user3, avatarDrawable);
                    backupImageView.onNewImageSet();
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                    avatarDrawable.setInfo(UserConfig.selectedAccount, chat3);
                    backupImageView.imageReceiver.setForUserOrChat(chat3, avatarDrawable);
                    backupImageView.onNewImageSet();
                }
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(100, 100, 17));
                drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourceProvider), PorterDuff.Mode.SRC_IN));
                drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                if (starsSubscription.photo == null) {
                    ImageView imageView = new ImageView(parentActivity);
                    imageView.setImageDrawable(drawable);
                    frameLayout.addView(imageView, LayoutHelper.createFrame(28, 28, 17));
                    imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                    imageView.setScaleX(1.1f);
                    imageView.setScaleY(1.1f);
                    ImageView imageView2 = new ImageView(parentActivity);
                    imageView2.setImageDrawable(drawable2);
                    frameLayout.addView(imageView2, LayoutHelper.createFrame(28, 28, 17));
                    imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                }
                textView = new TextView(parentActivity);
                zzlj.m(Theme.key_dialogTextBlack, resourceProvider, textView, 20.0f);
                textView.setGravity(17);
                if (TextUtils.isEmpty(starsSubscription.title)) {
                    textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                } else {
                    textView.setText(starsSubscription.title);
                }
                linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourceProvider));
                tL_starsSubscriptionPricing = starsSubscription.pricing;
                i2 = tL_starsSubscriptionPricing.period;
                if (i2 == 2592000) {
                    textView2.setText(replaceStarsWithPlain(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                } else {
                    if (i2 == 300) {
                        str2 = "5min";
                    } else {
                        str2 = "min";
                    }
                    textView2.setText(replaceStarsWithPlain(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), str2), 0.8f, null));
                }
                linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                tableView = new TableView(parentActivity, resourceProvider);
                linksTextView = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                i3 = Theme.key_chat_messageLinkIn;
                linksTextView.setTextColor(Theme.getColor(i3, resourceProvider));
                linksTextView.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                linksTextView.setTextSize(1, 14.0f);
                linksTextView.setSingleLine(true);
                linksTextView.setDisablePaddingsOffsetY(true);
                avatarSpan = new AvatarSpan(linksTextView, 24.0f, i12);
                if (peerDialogId >= 0) {
                    user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                    if (user != null || UserObject.isDeleted(user)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String userName2 = UserObject.getUserName(user);
                    avatarSpan.setUser(user);
                    boolean z5 = z4;
                    avatarSpan2 = avatarSpan;
                    z2 = z5;
                    str3 = userName2;
                } else {
                    avatarSpan2 = avatarSpan;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                    if (chat == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (chat != null) {
                        str3 = chat.title;
                    } else {
                        str3 = "";
                    }
                    avatarSpan2.setChat(chat);
                }
                z3 = z2;
                str4 = str;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
                spannableStringBuilder.setSpan(avatarSpan2, 0, 1, 33);
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public final void onClick(View view) {
                        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null) {
                            safeLastFragment2.presentFragment(ChatActivity.of(peerDialogId));
                        }
                    }

                    @Override
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                    }
                }, 3, spannableStringBuilder.length(), 33);
                linksTextView.setText(spannableStringBuilder);
                if (!z3) {
                    if (peerDialogId < 0) {
                        i10 = R.string.StarsSubscriptionChannel;
                    } else if (z) {
                        i10 = R.string.StarsSubscriptionBusiness;
                    } else {
                        i10 = R.string.StarsSubscriptionBot;
                    }
                    tableView.addRowUnpadded(linksTextView, LocaleController.getString(i10));
                }
                if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                    if (z) {
                        i9 = R.string.StarsSubscriptionBusinessProduct;
                    } else {
                        i9 = R.string.StarsSubscriptionBotProduct;
                    }
                    tableView.addRow(LocaleController.getString(i9), starsSubscription.title, null, null);
                }
                String string = LocaleController.getString(R.string.StarsSubscriptionSince);
                int i13 = R.string.formatDateAtTime;
                tableView.addRow(string, LocaleController.formatString(i13, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000))), null, null);
                currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
                if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                    i4 = R.string.StarsSubscriptionUntilExpires;
                } else {
                    i4 = currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews;
                }
                tableView.addRow(LocaleController.getString(i4), LocaleController.formatString(i13, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsSubscription.until_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsSubscription.until_date) * 1000))), null, null);
                linearLayoutM.addView(tableView, LayoutHelper.createLinear(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                i5 = Theme.key_windowBackgroundWhiteGrayText2;
                linksTextView2.setTextColor(Theme.getColor(i5, resourceProvider));
                linksTextView2.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                linksTextView2.setTextSize(1, 14.0f);
                linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ActivityCompat$$ExternalSyntheticLambda0(parentActivity, 7)));
                linksTextView2.setGravity(17);
                linearLayoutM.addView(linksTextView2, LayoutHelper.createLinear(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                if (currentTime < starsSubscription.until_date) {
                    notificationCenterDelegate2 = notificationCenterDelegate;
                    LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                    linksTextView3.setTextColor(Theme.getColor(i5, resourceProvider));
                    linksTextView3.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                    linksTextView3.setTextSize(1, 14.0f);
                    linksTextView3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    linksTextView3.setSingleLine(false);
                    linksTextView3.setMaxLines(4);
                    linksTextView3.setGravity(17);
                    linearLayoutM.addView(linksTextView3, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    if (starsSubscription.chat_invite_hash == null || starsSubscription.invoice_slug != null) {
                        notificationCenterDelegate3 = notificationCenterDelegate2;
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                        buttonWithCounterView.setRoundRadius(24);
                        r4 = 0;
                        buttonWithCounterView.setText(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
                        buttonWithCounterView.setOnClickListener(new DataAutoDownloadActivity$$ExternalSyntheticLambda2(buttonWithCounterView, starsSubscription, i12, bottomSheetArr, resourceProvider, zArr, parentActivity));
                        anonymousClass12 = notificationCenterDelegate2;
                    }
                    r40.customView = linearLayoutM;
                    bottomSheetArr[r4] = r40;
                    r40.useBackgroundTopPadding = r4;
                    bottomSheet.setOnDismissListener(new StarsIntroActivity$$ExternalSyntheticLambda67(i12, anonymousClass12));
                    bottomSheetArr[r4].fixNavigationBar();
                    safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
                        bottomSheetArr[r4].makeAttached(safeLastFragment);
                    }
                    bottomSheetArr[r4].show();
                }
                if (starsSubscription.can_refulfill) {
                    LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                    linksTextView4.setTextColor(Theme.getColor(i5, resourceProvider));
                    linksTextView4.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                    linksTextView4.setTextSize(1, 14.0f);
                    if (zIsBot) {
                        i7 = R.string.StarsSubscriptionBotRefulfillInfo;
                    } else {
                        i7 = R.string.StarsSubscriptionRefulfillInfo;
                    }
                    linksTextView4.setText(LocaleController.formatString(i7, LocaleController.formatDateChat(starsSubscription.until_date)));
                    linksTextView4.setSingleLine(false);
                    linksTextView4.setMaxLines(4);
                    linksTextView4.setGravity(17);
                    linearLayoutM.addView(linksTextView4, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                    if (zIsBot) {
                        i8 = R.string.StarsSubscriptionBotRefulfill;
                    } else {
                        i8 = R.string.StarsSubscriptionRefulfill;
                    }
                    buttonWithCounterView2.setText(LocaleController.getString(i8), false, true);
                    linearLayoutM.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48));
                    notificationCenterDelegate3 = notificationCenterDelegate;
                    StarsIntroActivity$$ExternalSyntheticLambda63 starsIntroActivity$$ExternalSyntheticLambda63 = new StarsIntroActivity$$ExternalSyntheticLambda63(buttonWithCounterView2, i12, starsSubscription, bottomSheetArr, peerDialogId, parentActivity, resourceProvider, z, str4);
                    i12 = i12;
                    buttonWithCounterView2.setOnClickListener(starsIntroActivity$$ExternalSyntheticLambda63);
                } else {
                    notificationCenterDelegate4 = notificationCenterDelegate;
                    if (starsSubscription.bot_canceled) {
                        LinkSpanDrawable.LinksTextView linksTextView5 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                        linksTextView5.setTextColor(Theme.getColor(Theme.key_color_red, resourceProvider));
                        linksTextView5.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                        linksTextView5.setTextSize(1, 14.0f);
                        if (z) {
                            i6 = R.string.StarsSubscriptionBusinessCancelledText;
                        } else {
                            i6 = R.string.StarsSubscriptionBotCancelledText;
                        }
                        linksTextView5.setText(LocaleController.getString(i6));
                        linksTextView5.setSingleLine(false);
                        linksTextView5.setMaxLines(4);
                        linksTextView5.setGravity(17);
                        linearLayoutM.addView(linksTextView5, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        notificationCenterDelegate3 = notificationCenterDelegate4;
                    } else if (starsSubscription.canceled) {
                        LinkSpanDrawable.LinksTextView linksTextView6 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                        linksTextView6.setTextColor(Theme.getColor(Theme.key_color_red, resourceProvider));
                        linksTextView6.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                        linksTextView6.setTextSize(1, 14.0f);
                        linksTextView6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                        linksTextView6.setSingleLine(false);
                        linksTextView6.setMaxLines(4);
                        linksTextView6.setGravity(17);
                        linearLayoutM.addView(linksTextView6, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash == null || starsSubscription.invoice_slug != null) {
                            notificationCenterDelegate3 = notificationCenterDelegate4;
                            ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                            buttonWithCounterView3.setText(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                            linearLayoutM.addView(buttonWithCounterView3, LayoutHelper.createLinear(-1, 48));
                            buttonWithCounterView3.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda7(buttonWithCounterView3, starsSubscription, i12, bottomSheetArr, tLObject2, str4));
                            notificationCenterDelegate3 = notificationCenterDelegate4;
                        }
                    } else {
                        LinkSpanDrawable.LinksTextView linksTextView7 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                        linksTextView7.setTextColor(Theme.getColor(i5, resourceProvider));
                        linksTextView7.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                        linksTextView7.setTextSize(1, 14.0f);
                        linksTextView7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        linksTextView7.setSingleLine(false);
                        linksTextView7.setMaxLines(4);
                        linksTextView7.setGravity(17);
                        linearLayoutM.addView(linksTextView7, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        final ButtonWithCounterView buttonWithCounterView4 = new ButtonWithCounterView(parentActivity, resourceProvider, false);
                        buttonWithCounterView4.setText(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                        buttonWithCounterView4.setTextColor(Theme.getColor(Theme.key_color_red, resourceProvider));
                        linearLayoutM.addView(buttonWithCounterView4, LayoutHelper.createLinear(-1, 48));
                        final boolean z6 = z;
                        buttonWithCounterView4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                final ButtonWithCounterView buttonWithCounterView5 = buttonWithCounterView4;
                                if (buttonWithCounterView5.loading) {
                                    return;
                                }
                                buttonWithCounterView5.setLoading(true);
                                TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                final int i14 = i12;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                                final BottomSheet[] bottomSheetArr2 = bottomSheetArr;
                                final boolean z7 = zIsBot;
                                final TLObject tLObject3 = tLObject2;
                                final boolean z8 = z6;
                                connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject4, TLRPC.TL_error tL_error) {
                                        ButtonWithCounterView buttonWithCounterView6 = buttonWithCounterView5;
                                        BottomSheet[] bottomSheetArr3 = bottomSheetArr2;
                                        boolean z9 = z7;
                                        TLObject tLObject5 = tLObject3;
                                        AndroidUtilities.runOnUIThread(new StarsIntroActivity$$ExternalSyntheticLambda92(i14, tLObject5, starsSubscription2, buttonWithCounterView6, z8, z9, bottomSheetArr3));
                                    }
                                });
                            }
                        });
                        notificationCenterDelegate3 = notificationCenterDelegate4;
                    }
                }
                notificationCenterDelegate3 = notificationCenterDelegate2;
                notificationCenterDelegate3 = notificationCenterDelegate4;
                r4 = 0;
                anonymousClass12 = notificationCenterDelegate3;
                r40.customView = linearLayoutM;
                bottomSheetArr[r4] = r40;
                r40.useBackgroundTopPadding = r4;
                bottomSheet.setOnDismissListener(new StarsIntroActivity$$ExternalSyntheticLambda67(i12, anonymousClass12));
                bottomSheetArr[r4].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet()) {
                    bottomSheetArr[r4].makeAttached(safeLastFragment);
                }
                bottomSheetArr[r4].show();
            }
            backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
            backupImageView.setImage$1(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(100, 100, 17));
            drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourceProvider), PorterDuff.Mode.SRC_IN));
            drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
                ImageView imageView3 = new ImageView(parentActivity);
                imageView3.setImageDrawable(drawable);
                frameLayout.addView(imageView3, LayoutHelper.createFrame(28, 28, 17));
                imageView3.setTranslationX(AndroidUtilities.dp(34.0f));
                imageView3.setTranslationY(AndroidUtilities.dp(35.0f));
                imageView3.setScaleX(1.1f);
                imageView3.setScaleY(1.1f);
                ImageView imageView4 = new ImageView(parentActivity);
                imageView4.setImageDrawable(drawable2);
                frameLayout.addView(imageView4, LayoutHelper.createFrame(28, 28, 17));
                imageView4.setTranslationX(AndroidUtilities.dp(34.0f));
                imageView4.setTranslationY(AndroidUtilities.dp(35.0f));
            }
            textView = new TextView(parentActivity);
            zzlj.m(Theme.key_dialogTextBlack, resourceProvider, textView, 20.0f);
            textView.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
                textView.setText(starsSubscription.title);
            } else {
                textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
            }
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
            textView2 = new TextView(parentActivity);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourceProvider));
            tL_starsSubscriptionPricing = starsSubscription.pricing;
            i2 = tL_starsSubscriptionPricing.period;
            if (i2 == 2592000) {
                textView2.setText(replaceStarsWithPlain(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
            } else {
                if (i2 == 300) {
                    str2 = "5min";
                } else {
                    str2 = "min";
                }
                textView2.setText(replaceStarsWithPlain(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), str2), 0.8f, null));
            }
            linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
            tableView = new TableView(parentActivity, resourceProvider);
            linksTextView = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
            linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            linksTextView.setEllipsize(TextUtils.TruncateAt.END);
            i3 = Theme.key_chat_messageLinkIn;
            linksTextView.setTextColor(Theme.getColor(i3, resourceProvider));
            linksTextView.setLinkTextColor(Theme.getColor(i3, resourceProvider));
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setSingleLine(true);
            linksTextView.setDisablePaddingsOffsetY(true);
            avatarSpan = new AvatarSpan(linksTextView, 24.0f, i12);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                String userName3 = UserObject.getUserName(user);
                avatarSpan.setUser(user);
                boolean z7 = z4;
                avatarSpan2 = avatarSpan;
                z2 = z7;
                str3 = userName3;
            } else {
                avatarSpan2 = avatarSpan;
                chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                if (chat == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (chat != null) {
                    str3 = chat.title;
                } else {
                    str3 = "";
                }
                avatarSpan2.setChat(chat);
            }
            z3 = z2;
            str4 = str;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str3));
            spannableStringBuilder2.setSpan(avatarSpan2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new ClickableSpan() {
                @Override
                public final void onClick(View view) {
                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                    BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment2 != null) {
                        safeLastFragment2.presentFragment(ChatActivity.of(peerDialogId));
                    }
                }

                @Override
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, 3, spannableStringBuilder2.length(), 33);
            linksTextView.setText(spannableStringBuilder2);
            if (!z3) {
                if (peerDialogId < 0) {
                    i10 = R.string.StarsSubscriptionChannel;
                } else if (z) {
                    i10 = R.string.StarsSubscriptionBusiness;
                } else {
                    i10 = R.string.StarsSubscriptionBot;
                }
                tableView.addRowUnpadded(linksTextView, LocaleController.getString(i10));
            }
            if (peerDialogId >= 0) {
                if (z) {
                    i9 = R.string.StarsSubscriptionBusinessProduct;
                } else {
                    i9 = R.string.StarsSubscriptionBotProduct;
                }
                tableView.addRow(LocaleController.getString(i9), starsSubscription.title, null, null);
            }
            String string2 = LocaleController.getString(R.string.StarsSubscriptionSince);
            int i14 = R.string.formatDateAtTime;
            tableView.addRow(string2, LocaleController.formatString(i14, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) (starsSubscription.until_date - starsSubscription.pricing.period)) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            if (starsSubscription.canceled) {
                i4 = R.string.StarsSubscriptionUntilExpires;
            } else {
                i4 = R.string.StarsSubscriptionUntilExpires;
            }
            tableView.addRow(LocaleController.getString(i4), LocaleController.formatString(i14, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsSubscription.until_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsSubscription.until_date) * 1000))), null, null);
            linearLayoutM.addView(tableView, LayoutHelper.createLinear(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            LinkSpanDrawable.LinksTextView linksTextView8 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
            i5 = Theme.key_windowBackgroundWhiteGrayText2;
            linksTextView8.setTextColor(Theme.getColor(i5, resourceProvider));
            linksTextView8.setLinkTextColor(Theme.getColor(i3, resourceProvider));
            linksTextView8.setTextSize(1, 14.0f);
            linksTextView8.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ActivityCompat$$ExternalSyntheticLambda0(parentActivity, 7)));
            linksTextView8.setGravity(17);
            linearLayoutM.addView(linksTextView8, LayoutHelper.createLinear(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
                notificationCenterDelegate2 = notificationCenterDelegate;
                LinkSpanDrawable.LinksTextView linksTextView9 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                linksTextView9.setTextColor(Theme.getColor(i5, resourceProvider));
                linksTextView9.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                linksTextView9.setTextSize(1, 14.0f);
                linksTextView9.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                linksTextView9.setSingleLine(false);
                linksTextView9.setMaxLines(4);
                linksTextView9.setGravity(17);
                linearLayoutM.addView(linksTextView9, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                if (starsSubscription.chat_invite_hash == null) {
                }
                notificationCenterDelegate3 = notificationCenterDelegate2;
                ButtonWithCounterView buttonWithCounterView5 = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                buttonWithCounterView5.setRoundRadius(24);
                r4 = 0;
                buttonWithCounterView5.setText(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                linearLayoutM.addView(buttonWithCounterView5, LayoutHelper.createLinear(-1, 48));
                buttonWithCounterView5.setOnClickListener(new DataAutoDownloadActivity$$ExternalSyntheticLambda2(buttonWithCounterView5, starsSubscription, i12, bottomSheetArr, resourceProvider, zArr, parentActivity));
                anonymousClass12 = notificationCenterDelegate2;
                r40.customView = linearLayoutM;
                bottomSheetArr[r4] = r40;
                r40.useBackgroundTopPadding = r4;
                bottomSheet.setOnDismissListener(new StarsIntroActivity$$ExternalSyntheticLambda67(i12, anonymousClass12));
                bottomSheetArr[r4].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet()) {
                    bottomSheetArr[r4].makeAttached(safeLastFragment);
                }
                bottomSheetArr[r4].show();
            }
            if (starsSubscription.can_refulfill) {
                LinkSpanDrawable.LinksTextView linksTextView10 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                linksTextView10.setTextColor(Theme.getColor(i5, resourceProvider));
                linksTextView10.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                linksTextView10.setTextSize(1, 14.0f);
                if (zIsBot) {
                    i7 = R.string.StarsSubscriptionBotRefulfillInfo;
                } else {
                    i7 = R.string.StarsSubscriptionRefulfillInfo;
                }
                linksTextView10.setText(LocaleController.formatString(i7, LocaleController.formatDateChat(starsSubscription.until_date)));
                linksTextView10.setSingleLine(false);
                linksTextView10.setMaxLines(4);
                linksTextView10.setGravity(17);
                linearLayoutM.addView(linksTextView10, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                ButtonWithCounterView buttonWithCounterView6 = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                if (zIsBot) {
                    i8 = R.string.StarsSubscriptionBotRefulfill;
                } else {
                    i8 = R.string.StarsSubscriptionRefulfill;
                }
                buttonWithCounterView6.setText(LocaleController.getString(i8), false, true);
                linearLayoutM.addView(buttonWithCounterView6, LayoutHelper.createLinear(-1, 48));
                notificationCenterDelegate3 = notificationCenterDelegate;
                StarsIntroActivity$$ExternalSyntheticLambda63 starsIntroActivity$$ExternalSyntheticLambda64 = new StarsIntroActivity$$ExternalSyntheticLambda63(buttonWithCounterView6, i12, starsSubscription, bottomSheetArr, peerDialogId, parentActivity, resourceProvider, z, str4);
                i12 = i12;
                buttonWithCounterView6.setOnClickListener(starsIntroActivity$$ExternalSyntheticLambda64);
            } else {
                notificationCenterDelegate4 = notificationCenterDelegate;
                if (starsSubscription.bot_canceled) {
                    LinkSpanDrawable.LinksTextView linksTextView11 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                    linksTextView11.setTextColor(Theme.getColor(Theme.key_color_red, resourceProvider));
                    linksTextView11.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                    linksTextView11.setTextSize(1, 14.0f);
                    if (z) {
                        i6 = R.string.StarsSubscriptionBusinessCancelledText;
                    } else {
                        i6 = R.string.StarsSubscriptionBotCancelledText;
                    }
                    linksTextView11.setText(LocaleController.getString(i6));
                    linksTextView11.setSingleLine(false);
                    linksTextView11.setMaxLines(4);
                    linksTextView11.setGravity(17);
                    linearLayoutM.addView(linksTextView11, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    notificationCenterDelegate3 = notificationCenterDelegate4;
                } else if (starsSubscription.canceled) {
                    LinkSpanDrawable.LinksTextView linksTextView12 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                    linksTextView12.setTextColor(Theme.getColor(Theme.key_color_red, resourceProvider));
                    linksTextView12.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                    linksTextView12.setTextSize(1, 14.0f);
                    linksTextView12.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                    linksTextView12.setSingleLine(false);
                    linksTextView12.setMaxLines(4);
                    linksTextView12.setGravity(17);
                    linearLayoutM.addView(linksTextView12, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    if (starsSubscription.chat_invite_hash == null) {
                        notificationCenterDelegate3 = notificationCenterDelegate4;
                        ButtonWithCounterView buttonWithCounterView7 = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                        buttonWithCounterView7.setText(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                        linearLayoutM.addView(buttonWithCounterView7, LayoutHelper.createLinear(-1, 48));
                        buttonWithCounterView7.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda7(buttonWithCounterView7, starsSubscription, i12, bottomSheetArr, tLObject2, str4));
                        notificationCenterDelegate3 = notificationCenterDelegate4;
                    } else {
                        notificationCenterDelegate3 = notificationCenterDelegate4;
                        ButtonWithCounterView buttonWithCounterView8 = new ButtonWithCounterView(parentActivity, resourceProvider, true);
                        buttonWithCounterView8.setText(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                        linearLayoutM.addView(buttonWithCounterView8, LayoutHelper.createLinear(-1, 48));
                        buttonWithCounterView8.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda7(buttonWithCounterView8, starsSubscription, i12, bottomSheetArr, tLObject2, str4));
                        notificationCenterDelegate3 = notificationCenterDelegate4;
                    }
                } else {
                    LinkSpanDrawable.LinksTextView linksTextView13 = new LinkSpanDrawable.LinksTextView(parentActivity, resourceProvider);
                    linksTextView13.setTextColor(Theme.getColor(i5, resourceProvider));
                    linksTextView13.setLinkTextColor(Theme.getColor(i3, resourceProvider));
                    linksTextView13.setTextSize(1, 14.0f);
                    linksTextView13.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    linksTextView13.setSingleLine(false);
                    linksTextView13.setMaxLines(4);
                    linksTextView13.setGravity(17);
                    linearLayoutM.addView(linksTextView13, LayoutHelper.createLinear(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                    final ButtonWithCounterView buttonWithCounterView9 = new ButtonWithCounterView(parentActivity, resourceProvider, false);
                    buttonWithCounterView9.setText(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                    buttonWithCounterView9.setTextColor(Theme.getColor(Theme.key_color_red, resourceProvider));
                    linearLayoutM.addView(buttonWithCounterView9, LayoutHelper.createLinear(-1, 48));
                    final boolean z8 = z;
                    buttonWithCounterView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            final ButtonWithCounterView buttonWithCounterView10 = buttonWithCounterView9;
                            if (buttonWithCounterView10.loading) {
                                return;
                            }
                            buttonWithCounterView10.setLoading(true);
                            TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                            tL_changeStarsSubscription.canceled = Boolean.TRUE;
                            tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                            final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                            tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                            final int i15 = i12;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i15);
                            final BottomSheet[] bottomSheetArr2 = bottomSheetArr;
                            final boolean z9 = zIsBot;
                            final TLObject tLObject3 = tLObject2;
                            final boolean z10 = z8;
                            connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject4, TLRPC.TL_error tL_error) {
                                    ButtonWithCounterView buttonWithCounterView11 = buttonWithCounterView10;
                                    BottomSheet[] bottomSheetArr3 = bottomSheetArr2;
                                    boolean z11 = z9;
                                    TLObject tLObject5 = tLObject3;
                                    AndroidUtilities.runOnUIThread(new StarsIntroActivity$$ExternalSyntheticLambda92(i15, tLObject5, starsSubscription2, buttonWithCounterView11, z10, z11, bottomSheetArr3));
                                }
                            });
                        }
                    });
                    notificationCenterDelegate3 = notificationCenterDelegate4;
                }
            }
            notificationCenterDelegate3 = notificationCenterDelegate2;
            notificationCenterDelegate3 = notificationCenterDelegate4;
            r4 = 0;
            anonymousClass12 = notificationCenterDelegate3;
            r40.customView = linearLayoutM;
            bottomSheetArr[r4] = r40;
            r40.useBackgroundTopPadding = r4;
            bottomSheet.setOnDismissListener(new StarsIntroActivity$$ExternalSyntheticLambda67(i12, anonymousClass12));
            bottomSheetArr[r4].fixNavigationBar();
            safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (!AndroidUtilities.isTablet()) {
                bottomSheetArr[r4].makeAttached(safeLastFragment);
            }
            bottomSheetArr[r4].show();
        }
    }

    public final void lambda$createView$2(Context context) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
        } else {
            new StarsOptionsSheet(context, this.resourceProvider).show();
        }
    }

    public final void lambda$createView$3(Context context) {
        new StarsOptionsSheet(context, this.resourceProvider).show();
    }

    public final void lambda$createView$5$8$1() {
        StarsController.getInstance(this.currentAccount, false).getGiftOptions();
        UserSelectorBottomSheet.open(1, BirthdayController.getInstance(this.currentAccount).getState());
    }

    public final void lambda$onItemClick$8(UItem uItem, Boolean bool, String str) {
        if (getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            BulletinFactory.of(this).createSimpleBulletin(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0])), R.raw.stars_topup).show();
            this.fireworksOverlay.start(true);
            StarsController.getInstance(this.currentAccount, false).invalidateTransactions(true);
        } else if (str != null) {
            zzks.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(this), R.raw.error);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        StarsController.getInstance(this.currentAccount, false).invalidateTransactions(true);
        StarsController.getInstance(this.currentAccount, false).invalidateSubscriptions();
        StarsController.getInstance(this.currentAccount, false).getOptions();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    public final void updateBalance$1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        StarsController starsController = StarsController.getInstance(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.starBalanceIcon);
        spannableStringBuilder.append((CharSequence) formatStarsAmount(starsController.getBalance(), 0.66f, ' '));
        this.starBalanceTextView.setText(spannableStringBuilder);
        this.buyButton.setText(LocaleController.getString(starsController.getBalance().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(getUserConfig().getClientUserId(), false);
        if (starsRevenueStats != null && (tL_starsRevenueStatus = starsRevenueStats.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        updateButtonsLayouts(z, true);
    }

    public final void updateButtonsLayouts(final boolean z, boolean z2) {
        this.twoButtons = z;
        if (z2) {
            this.oneButtonsLayout.setVisibility(0);
            this.twoButtonsLayout.setVisibility(0);
            final int i = 0;
            this.oneButtonsLayout.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable(this) {
                public final StarsIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            StarsIntroActivity starsIntroActivity = this.f$0;
                            if (!z) {
                                starsIntroActivity.getClass();
                            } else {
                                starsIntroActivity.oneButtonsLayout.setVisibility(8);
                            }
                            break;
                        default:
                            StarsIntroActivity starsIntroActivity2 = this.f$0;
                            if (!z) {
                                starsIntroActivity2.twoButtonsLayout.setVisibility(8);
                            } else {
                                starsIntroActivity2.getClass();
                            }
                            break;
                    }
                }
            }).start();
            final int i2 = 1;
            this.twoButtonsLayout.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) {
                public final StarsIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            StarsIntroActivity starsIntroActivity = this.f$0;
                            if (!z) {
                                starsIntroActivity.getClass();
                            } else {
                                starsIntroActivity.oneButtonsLayout.setVisibility(8);
                            }
                            break;
                        default:
                            StarsIntroActivity starsIntroActivity2 = this.f$0;
                            if (!z) {
                                starsIntroActivity2.twoButtonsLayout.setVisibility(8);
                            } else {
                                starsIntroActivity2.getClass();
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.oneButtonsLayout.animate().cancel();
        this.twoButtonsLayout.animate().cancel();
        this.twoButtonsLayout.setAlpha(z ? 1.0f : 0.0f);
        this.oneButtonsLayout.setAlpha(z ? 0.0f : 1.0f);
        this.twoButtonsLayout.setVisibility(z ? 0 : 8);
        this.oneButtonsLayout.setVisibility(z ? 8 : 0);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(boolean z, CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z ? "TON" : "⭐";
        int i = z ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            if (coloredImageSpanArr == null || coloredImageSpanArr.length <= 0) {
                coloredImageSpan = new ColoredImageSpan(i);
            } else {
                coloredImageSpan = new ColoredImageSpan(i);
                coloredImageSpanArr[0] = coloredImageSpan;
            }
        }
        if (z) {
            f *= 0.33f;
        } else {
            coloredImageSpan.recolorDrawable = false;
        }
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence) {
        return replaceStars(charSequence, 1.13f, (ColoredImageSpan[]) null);
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence, float f) {
        return replaceStars(z, charSequence, f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStars(false, charSequence, f, coloredImageSpanArr, 0.0f, 1.0f);
    }

    public static StickersActivity$$ExternalSyntheticLambda18 setGiftImage(BackupImageView backupImageView, ImageReceiver imageReceiver, String str, boolean z) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final Painting$$ExternalSyntheticLambda7 painting$$ExternalSyntheticLambda7 = new Painting$$ExternalSyntheticLambda7(z, currentAccount, str, imageReceiver, new boolean[1]);
        painting$$ExternalSyntheticLambda7.run();
        final int i = 0;
        final int i2 = 1;
        return new StickersActivity$$ExternalSyntheticLambda18(13, NotificationCenter.getInstance(currentAccount).listen(backupImageView, z ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i) {
                    case 0:
                        painting$$ExternalSyntheticLambda7.run();
                        break;
                    default:
                        painting$$ExternalSyntheticLambda7.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(backupImageView, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i2) {
                    case 0:
                        painting$$ExternalSyntheticLambda7.run();
                        break;
                    default:
                        painting$$ExternalSyntheticLambda7.run();
                        break;
                }
            }
        }));
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr, float f2, float f3) {
        SpannableStringBuilder spannableStringBuilder;
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString((z ? "TON" : "⭐").concat(" "));
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar);
            if (coloredImageSpanArr != null) {
                coloredImageSpanArr[0] = coloredImageSpan;
            }
        }
        coloredImageSpan.translate(0.0f, f2);
        coloredImageSpan.spaceScaleX = f3;
        if (z) {
            float f4 = f * 0.2f;
            coloredImageSpan.setScale(f4, f4);
        } else {
            coloredImageSpan.setScale(f, f);
        }
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static void setGiftImage(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i);
        imageReceiver.setImage(ImageLocation.getForDocument(document), DiffUtil.m(i, i, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), DiffUtil.m(i, i, "_"), DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundGray, 0.35f), 0L, null, null, 0);
    }

    public static void showTransactionSheet(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
    }

    public static void showTransactionSheet(final Context context, final boolean z, final long j, final int i, final TL_stars.StarsTransaction starsTransaction, final Theme.ResourcesProvider resourcesProvider) {
        BottomSheet bottomSheet;
        boolean z2;
        String str;
        final BottomSheet[] bottomSheetArr;
        final BackupImageView backupImageView;
        TL_stars.StarGift starGift;
        boolean z3;
        Context context2;
        int i2;
        TL_stars.StarsTransaction starsTransaction2;
        long j2;
        Theme.ResourcesProvider resourcesProvider2;
        String str2;
        TLRPC.Peer peer;
        long peerDialogId;
        AvatarDrawable avatarDrawable;
        int i3;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        ?? r15;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        int i4;
        TextView textViewM;
        int i5;
        SpannableStringBuilder spannableStringBuilder;
        int i6;
        String str3;
        ?? r16;
        BottomSheet[] bottomSheetArr2;
        Theme.ResourcesProvider resourcesProvider3;
        TableView tableView;
        final Context context3;
        final boolean z4;
        TableView tableView2;
        TableView tableView3;
        TableView tableView4;
        ?? r0;
        ?? r18;
        Context context4;
        ?? r19;
        ?? r110;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        int i7;
        ?? r111;
        TableView tableView5;
        TableView tableView6;
        final BottomSheet[] bottomSheetArr3;
        TableView tableView7;
        long j3;
        TL_stars.StarsAmount starsAmount;
        if (starsTransaction == null || context == null) {
            return;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z5 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i8 = starsTransaction.flags;
        boolean z6 = (i8 & 8192) != 0;
        boolean z7 = ((131072 & i8) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z8 = (z7 || (i8 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean zPositive = starsAmount2.positive();
        boolean zNegative = starsTransaction.amount.negative();
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        BottomSheet[] bottomSheetArr4 = new BottomSheet[1];
        final ?? M = zzkf.m(context, 1);
        M.setPadding(0, AndroidUtilities.dp((z6 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        M.setClipChildren(false);
        M.setClipToPadding(false);
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                final ?? swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(AndroidUtilities.dp(20.0f));
                final RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                final Paint paint = new Paint(1);
                final Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                z2 = z5;
                bottomSheet = bottomSheetM;
                str = "";
                bottomSheetArr = bottomSheetArr4;
                ?? r1 = new LinearLayout(context) {
                    public final Path clipPath = new Path();

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        float fDp = AndroidUtilities.dp(10.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + fDp);
                        Path path = this.clipPath;
                        path.rewind();
                        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(path);
                        Matrix matrix2 = matrix;
                        matrix2.reset();
                        matrix2.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
                        radialGradient.setLocalMatrix(matrix2);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                        canvas.save();
                        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
                        StarGiftPatterns.drawPattern(canvas, 0, swapAnimatedEmojiDrawable, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
                        canvas.restore();
                        super.dispatchDraw(canvas);
                        canvas.restore();
                    }

                    @Override
                    public final void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        swapAnimatedEmojiDrawable.attach();
                    }

                    @Override
                    public final void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        swapAnimatedEmojiDrawable.detach();
                    }
                };
                swapAnimatedEmojiDrawable.setParentView(r1);
                swapAnimatedEmojiDrawable.set(stargiftattributepattern.document);
                r1.setOrientation(1);
                BackupImageView backupImageView2 = new BackupImageView(context);
                ImageReceiver imageReceiver = backupImageView2.getImageReceiver();
                TL_stars.StarGift starGift4 = starsTransaction.stargift;
                setGiftImage(imageReceiver, starGift4 == null ? null : starGift4.getDocument(), 160);
                r1.addView(backupImageView2, LayoutHelper.createLinear(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    ScaleStateListAnimator.apply(backupImageView2);
                    backupImageView2.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(context, i, tL_starGiftUnique, 20));
                }
                TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, 0, true, null);
                textViewMakeTextView.setTextColor(-1);
                textViewMakeTextView.setText(tL_starGiftUnique.title);
                r1.addView(textViewMakeTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 1, 0, 0));
                TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 13.0f, 0, false, null);
                textViewMakeTextView2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                textViewMakeTextView2.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                r1.addView(textViewMakeTextView2, LayoutHelper.createLinear(-2, -2, 17, 0, 5, 0, 0));
                TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 18.0f, 0, true, null);
                textViewMakeTextView3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                textViewMakeTextView3.setText(replaceStars(starsAmount3, TextUtils.concat(zPositive ? "+" : str, formatStarsAmount(starsAmount3, 0.777f, ','), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(textViewMakeTextView3.getText());
                if (starsTransaction.refund) {
                    appendStatus(spannableStringBuilder2, textViewMakeTextView3, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    appendStatus(spannableStringBuilder2, textViewMakeTextView3, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    appendStatus(spannableStringBuilder2, textViewMakeTextView3, LocaleController.getString(R.string.StarsPending));
                }
                textViewMakeTextView3.setText(spannableStringBuilder2);
                r1.addView(textViewMakeTextView3, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 17));
                M.addView(r1, LayoutHelper.createLinear(-1, -2));
                context2 = context;
                starsTransaction2 = starsTransaction;
                r16 = M;
                j2 = j;
                resourcesProvider2 = resourcesProvider;
            } else {
                bottomSheet = bottomSheetM;
                z2 = z5;
                str = "";
                bottomSheetArr = bottomSheetArr4;
                backupImageView = new BackupImageView(context);
                if (starsTransaction.premium_gift) {
                    ImageReceiver imageReceiver2 = backupImageView.getImageReceiver();
                    i6 = starsTransaction.premium_gift_months;
                    if (i6 != 3) {
                        str3 = "2⃣";
                    } else if (i6 != 6) {
                        str3 = "3⃣";
                    } else if (i6 != 12) {
                        str3 = "4⃣";
                    } else if (i6 != 24) {
                        str3 = "1⃣";
                    } else {
                        str3 = "5⃣";
                    }
                    setGiftImage(backupImageView, imageReceiver2, str3, false);
                    M.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.posts_search) {
                    int i9 = SessionCell.$r8$clinit;
                    TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
                    tL_authorization.device_model = "search";
                    tL_authorization.platform = "search";
                    tL_authorization.app_name = "search";
                    CombinedDrawable combinedDrawableCreateDrawable = SessionCell.createDrawable(100, tL_authorization);
                    int iDp = AndroidUtilities.dp(40.0f);
                    int iDp2 = AndroidUtilities.dp(40.0f);
                    combinedDrawableCreateDrawable.iconWidth = iDp;
                    combinedDrawableCreateDrawable.iconHeight = iDp2;
                    backupImageView.setImageDrawable(combinedDrawableCreateDrawable);
                } else {
                    starGift = starsTransaction.stargift;
                    if (starGift != null) {
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            backupImageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(backupImageView, starsTransaction.stargift, 94, 0.44f));
                            M.addView(backupImageView, LayoutHelper.createLinear(94, 94, 17, 0, 2, 0, 10));
                        } else {
                            ImageReceiver imageReceiver3 = backupImageView.getImageReceiver();
                            starGift2 = starsTransaction.stargift;
                            if (starGift2 == null) {
                                document = null;
                            } else {
                                document = starGift2.getDocument();
                            }
                            setGiftImage(imageReceiver3, document, 160);
                            M.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                        }
                    } else if (z6 && !starsTransaction.gift) {
                        if (!starsTransaction.extended_media.isEmpty()) {
                            backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(0);
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia.photo);
                            } else {
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia.document);
                                } else {
                                    i3 = 0;
                                    imageLocation = null;
                                }
                                backupImageView.setImage(imageLocation, "100_100", null, null, null, Integer.valueOf(i3));
                                M.addView(backupImageView, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                                context2 = context;
                                z3 = z;
                                r15 = M;
                                j2 = j;
                                i2 = i;
                                resourcesProvider2 = resourcesProvider;
                                starsTransaction2 = starsTransaction;
                                backupImageView.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) throws Throwable {
                                        boolean z9 = z;
                                        TL_stars.StarsTransaction starsTransaction3 = starsTransaction;
                                        final long peerDialogId2 = z9 ? j : DialogObject.getPeerDialogId(starsTransaction3.peer.peer);
                                        ArrayList arrayList = new ArrayList();
                                        for (int i10 = 0; i10 < starsTransaction3.extended_media.size(); i10++) {
                                            TLRPC.MessageMedia messageMedia2 = starsTransaction3.extended_media.get(i10);
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            tL_message.id = starsTransaction3.msg_id;
                                            tL_message.dialog_id = peerDialogId2;
                                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                            tL_message.from_id = tL_peerChannel;
                                            long j4 = -peerDialogId2;
                                            tL_peerChannel.channel_id = j4;
                                            TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                            tL_message.peer_id = tL_peerChannel2;
                                            tL_peerChannel2.channel_id = j4;
                                            tL_message.date = starsTransaction3.date;
                                            tL_message.flags |= 512;
                                            tL_message.media = messageMedia2;
                                            tL_message.noforwards = true;
                                            arrayList.add(new MessageObject(i, tL_message, false, false));
                                        }
                                        if (arrayList.isEmpty()) {
                                            return;
                                        }
                                        PhotoViewer.getInstance().setParentActivity(null, LaunchActivity.getLastFragment(), resourcesProvider);
                                        PhotoViewer photoViewer = PhotoViewer.getInstance();
                                        final BackupImageView backupImageView3 = backupImageView;
                                        final LinearLayout linearLayout = M;
                                        photoViewer.openPhoto(arrayList, 0, peerDialogId2, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() {
                                            @Override
                                            public final boolean forceAllInGroup() {
                                                return true;
                                            }

                                            @Override
                                            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i11, boolean z10, boolean z11) {
                                                BackupImageView backupImageView4 = backupImageView3;
                                                ImageReceiver imageReceiver4 = backupImageView4.getImageReceiver();
                                                int[] iArr = new int[2];
                                                backupImageView4.getLocationInWindow(iArr);
                                                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                                placeProviderObject.viewX = iArr[0];
                                                placeProviderObject.viewY = iArr[1];
                                                placeProviderObject.parentView = linearLayout;
                                                placeProviderObject.animatingImageView = null;
                                                placeProviderObject.imageReceiver = imageReceiver4;
                                                if (z10) {
                                                    placeProviderObject.thumb = imageReceiver4.getBitmapSafe();
                                                }
                                                placeProviderObject.radius = imageReceiver4.getRoundRadius(true);
                                                placeProviderObject.dialogId = peerDialogId2;
                                                placeProviderObject.clipTopAddition = 0;
                                                placeProviderObject.clipBottomAddition = 0;
                                                return placeProviderObject;
                                            }
                                        });
                                    }
                                });
                            }
                            imageLocation = forDocument;
                            i3 = 0;
                            backupImageView.setImage(imageLocation, "100_100", null, null, null, Integer.valueOf(i3));
                            M.addView(backupImageView, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                            context2 = context;
                            z3 = z;
                            r15 = M;
                            j2 = j;
                            i2 = i;
                            resourcesProvider2 = resourcesProvider;
                            starsTransaction2 = starsTransaction;
                            backupImageView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) throws Throwable {
                                    boolean z9 = z;
                                    TL_stars.StarsTransaction starsTransaction3 = starsTransaction;
                                    final long peerDialogId2 = z9 ? j : DialogObject.getPeerDialogId(starsTransaction3.peer.peer);
                                    ArrayList arrayList = new ArrayList();
                                    for (int i10 = 0; i10 < starsTransaction3.extended_media.size(); i10++) {
                                        TLRPC.MessageMedia messageMedia2 = starsTransaction3.extended_media.get(i10);
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        tL_message.id = starsTransaction3.msg_id;
                                        tL_message.dialog_id = peerDialogId2;
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_message.from_id = tL_peerChannel;
                                        long j4 = -peerDialogId2;
                                        tL_peerChannel.channel_id = j4;
                                        TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                        tL_message.peer_id = tL_peerChannel2;
                                        tL_peerChannel2.channel_id = j4;
                                        tL_message.date = starsTransaction3.date;
                                        tL_message.flags |= 512;
                                        tL_message.media = messageMedia2;
                                        tL_message.noforwards = true;
                                        arrayList.add(new MessageObject(i, tL_message, false, false));
                                    }
                                    if (arrayList.isEmpty()) {
                                        return;
                                    }
                                    PhotoViewer.getInstance().setParentActivity(null, LaunchActivity.getLastFragment(), resourcesProvider);
                                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                                    final BackupImageView backupImageView3 = backupImageView;
                                    final LinearLayout linearLayout = M;
                                    photoViewer.openPhoto(arrayList, 0, peerDialogId2, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() {
                                        @Override
                                        public final boolean forceAllInGroup() {
                                            return true;
                                        }

                                        @Override
                                        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i11, boolean z10, boolean z11) {
                                            BackupImageView backupImageView4 = backupImageView3;
                                            ImageReceiver imageReceiver4 = backupImageView4.getImageReceiver();
                                            int[] iArr = new int[2];
                                            backupImageView4.getLocationInWindow(iArr);
                                            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                            placeProviderObject.viewX = iArr[0];
                                            placeProviderObject.viewY = iArr[1];
                                            placeProviderObject.parentView = linearLayout;
                                            placeProviderObject.animatingImageView = null;
                                            placeProviderObject.imageReceiver = imageReceiver4;
                                            if (z10) {
                                                placeProviderObject.thumb = imageReceiver4.getBitmapSafe();
                                            }
                                            placeProviderObject.radius = imageReceiver4.getRoundRadius(true);
                                            placeProviderObject.dialogId = peerDialogId2;
                                            placeProviderObject.clipTopAddition = 0;
                                            placeProviderObject.clipBottomAddition = 0;
                                            return placeProviderObject;
                                        }
                                    });
                                }
                            });
                        } else {
                            z3 = z;
                            context2 = context;
                            i2 = i;
                            starsTransaction2 = starsTransaction;
                            ?? r17 = M;
                            j2 = j;
                            resourcesProvider2 = resourcesProvider;
                            TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction2.peer;
                            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                                if (starsTransaction2.photo != null) {
                                    backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                                    backupImageView.setImage$1(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                                } else {
                                    backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                                    if (z8) {
                                        peer = starsTransaction2.starref_peer;
                                    } else {
                                        if (starsTransaction2.subscription && z3) {
                                            peerDialogId = j2;
                                        } else {
                                            peer = starsTransaction2.peer.peer;
                                        }
                                        avatarDrawable = new AvatarDrawable();
                                        if (peerDialogId >= 0) {
                                            TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerDialogId));
                                            avatarDrawable.setInfo(user);
                                            backupImageView.setForUserOrChat(user, avatarDrawable);
                                        } else {
                                            TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerDialogId));
                                            avatarDrawable.setInfo(chat);
                                            backupImageView.setForUserOrChat(chat, avatarDrawable);
                                        }
                                    }
                                    peerDialogId = DialogObject.getPeerDialogId(peer);
                                    avatarDrawable = new AvatarDrawable();
                                    if (peerDialogId >= 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(i2).getUser(Long.valueOf(peerDialogId));
                                        avatarDrawable.setInfo(user2);
                                        backupImageView.setForUserOrChat(user2, avatarDrawable);
                                    } else {
                                        TLRPC.Chat chat2 = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerDialogId));
                                        avatarDrawable.setInfo(chat2);
                                        backupImageView.setForUserOrChat(chat2, avatarDrawable);
                                    }
                                }
                                r17.addView(backupImageView, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                                r15 = r17;
                            } else {
                                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                    str2 = "ios";
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                    str2 = "android";
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                    str2 = "premiumbot";
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                                    str2 = "fragment";
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                                    str2 = "ads";
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAPI) {
                                    str2 = "api";
                                } else {
                                    str2 = "?";
                                }
                                int i10 = SessionCell.$r8$clinit;
                                TLRPC.TL_authorization tL_authorization2 = new TLRPC.TL_authorization();
                                tL_authorization2.device_model = str2;
                                tL_authorization2.platform = str2;
                                tL_authorization2.app_name = str2;
                                CombinedDrawable combinedDrawableCreateDrawable2 = SessionCell.createDrawable(100, tL_authorization2);
                                int iDp3 = AndroidUtilities.dp(40.0f);
                                int iDp4 = AndroidUtilities.dp(40.0f);
                                combinedDrawableCreateDrawable2.iconWidth = iDp3;
                                combinedDrawableCreateDrawable2.iconHeight = iDp4;
                                backupImageView.setImageDrawable(combinedDrawableCreateDrawable2);
                                r15 = r17;
                            }
                        }
                    } else {
                        z3 = z;
                        context2 = context;
                        i2 = i;
                        starsTransaction2 = starsTransaction;
                        ?? r112 = M;
                        j2 = j;
                        resourcesProvider2 = resourcesProvider;
                        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                            setTonGiftImage(backupImageView, backupImageView.getImageReceiver(), starsTransaction2.amount.amount);
                        } else {
                            setGiftImage(backupImageView, backupImageView.getImageReceiver(), starsTransaction2.amount.amount);
                        }
                        r112.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                        r15 = r112;
                    }
                    TextView textView = new TextView(context2);
                    i4 = Theme.key_dialogTextBlack;
                    zzlj.m(i4, resourcesProvider2, textView, 20.0f);
                    textView.setGravity(17);
                    textView.setText(getTransactionTitle(i2, z3, starsTransaction2));
                    textViewM = ArticleViewer.IBlock.CC.m((LinearLayout) r15, textView, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4), context2);
                    textViewM.setTextSize(1, 18.0f);
                    textViewM.setTypeface(AndroidUtilities.bold());
                    textViewM.setGravity(17);
                    if (zPositive) {
                        i5 = Theme.key_color_green;
                    } else {
                        i5 = Theme.key_color_red;
                    }
                    textViewM.setTextColor(Theme.getColor(i5, resourcesProvider2));
                    TL_stars.StarsAmount starsAmount4 = starsTransaction2.amount;
                    textViewM.setText(replaceStarsWithPlain(starsAmount4 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(zPositive ? "+" : str, formatStarsAmount(starsAmount4, 0.777f, ','), " ⭐️"), 0.8f, null));
                    spannableStringBuilder = new SpannableStringBuilder(textViewM.getText());
                    if (starsTransaction2.refund) {
                        appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsRefunded));
                    } else if (starsTransaction2.failed) {
                        textViewM.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider2));
                        appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsFailed));
                    } else if (starsTransaction2.pending) {
                        textViewM.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider2));
                        appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsPending));
                    }
                    textViewM.setText(spannableStringBuilder);
                    r15.addView(textViewM, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && zPositive) {
                        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2);
                        linksTextView.setTextColor(Theme.getColor(i4, resourcesProvider2));
                        linksTextView.setTextSize(1, 14.0f);
                        linksTextView.setGravity(17);
                        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                        linksTextView.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, AffiliateProgramFragment.percents(1000 - starsTransaction2.starref_commission_permille))));
                        if (j2 == UserConfig.getInstance(i2).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i2).getChat(Long.valueOf(-j2)), 2)) {
                            spannableStringBuilder3.append((CharSequence) " ");
                            spannableStringBuilder3.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new BookmarksFragment$$ExternalSyntheticLambda1(j2, i2, 1)), true));
                        }
                        linksTextView.setText(spannableStringBuilder3);
                        r15.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    } else if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z6 || starsTransaction2.gift)) {
                        TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i2).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                        TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i2).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                        boolean zIsUserSelf = UserObject.isUserSelf(user3);
                        if (zIsUserSelf) {
                            textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
                            TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                            textViewM.setText(replaceStarsWithPlain(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(formatStarsAmount(starsAmount5, 0.777f, ','), " ⭐️"), 0.8f, null));
                        }
                        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context2);
                        linksTextView2.setTextColor(Theme.getColor(i4, resourcesProvider2));
                        linksTextView2.setTextSize(1, 16.0f);
                        linksTextView2.setGravity(17);
                        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                        linksTextView2.setDisablePaddingsOffsetY(true);
                        linksTextView2.setText(TextUtils.concat(AndroidUtilities.replaceTags(zIsUserSelf ? LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user4)) : LocaleController.getString(R.string.ActionGiftStarsSubtitleYou)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new StarsIntroActivity$$ExternalSyntheticLambda26(context2, bottomSheetArr)), true)));
                        r15.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    } else {
                        r16 = r15;
                        if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                            r16 = r15;
                            TextView textView2 = new TextView(context2);
                            OKLCH.m(i4, resourcesProvider2, textView2, 16.0f);
                            textView2.setGravity(17);
                            textView2.setText(starsTransaction2.description);
                            r15.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            r16 = r15;
                        }
                    }
                }
                z3 = z;
                context2 = context;
                i2 = i;
                starsTransaction2 = starsTransaction;
                r15 = M;
                j2 = j;
                resourcesProvider2 = resourcesProvider;
                TextView textView3 = new TextView(context2);
                i4 = Theme.key_dialogTextBlack;
                zzlj.m(i4, resourcesProvider2, textView3, 20.0f);
                textView3.setGravity(17);
                textView3.setText(getTransactionTitle(i2, z3, starsTransaction2));
                textViewM = ArticleViewer.IBlock.CC.m((LinearLayout) r15, textView3, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4), context2);
                textViewM.setTextSize(1, 18.0f);
                textViewM.setTypeface(AndroidUtilities.bold());
                textViewM.setGravity(17);
                if (zPositive) {
                    i5 = Theme.key_color_green;
                } else {
                    i5 = Theme.key_color_red;
                }
                textViewM.setTextColor(Theme.getColor(i5, resourcesProvider2));
                TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                textViewM.setText(replaceStarsWithPlain(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(zPositive ? "+" : str, formatStarsAmount(starsAmount6, 0.777f, ','), " ⭐️"), 0.8f, null));
                spannableStringBuilder = new SpannableStringBuilder(textViewM.getText());
                if (starsTransaction2.refund) {
                    appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    textViewM.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider2));
                    appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    textViewM.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider2));
                    appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsPending));
                }
                textViewM.setText(spannableStringBuilder);
                r15.addView(textViewM, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message) {
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        r16 = r15;
                        if (starsTransaction2.description != null) {
                            r16 = r15;
                            TextView textView4 = new TextView(context2);
                            OKLCH.m(i4, resourcesProvider2, textView4, 16.0f);
                            textView4.setGravity(17);
                            textView4.setText(starsTransaction2.description);
                            r15.addView(textView4, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            r16 = r15;
                        }
                    } else {
                        r16 = r15;
                        if (starsTransaction2.description != null) {
                            r16 = r15;
                            TextView textView5 = new TextView(context2);
                            OKLCH.m(i4, resourcesProvider2, textView5, 16.0f);
                            textView5.setGravity(17);
                            textView5.setText(starsTransaction2.description);
                            r15.addView(textView5, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            r16 = r15;
                        }
                    }
                } else if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                    r16 = r15;
                    if (starsTransaction2.description != null) {
                        r16 = r15;
                        TextView textView6 = new TextView(context2);
                        OKLCH.m(i4, resourcesProvider2, textView6, 16.0f);
                        textView6.setGravity(17);
                        textView6.setText(starsTransaction2.description);
                        r15.addView(textView6, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    }
                } else {
                    r16 = r15;
                    if (starsTransaction2.description != null) {
                        r16 = r15;
                        TextView textView7 = new TextView(context2);
                        OKLCH.m(i4, resourcesProvider2, textView7, 16.0f);
                        textView7.setGravity(17);
                        textView7.setText(starsTransaction2.description);
                        r15.addView(textView7, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    }
                }
            }
        } else {
            bottomSheet = bottomSheetM;
            z2 = z5;
            str = "";
            bottomSheetArr = bottomSheetArr4;
            backupImageView = new BackupImageView(context);
            if (starsTransaction.premium_gift) {
                ImageReceiver imageReceiver4 = backupImageView.getImageReceiver();
                i6 = starsTransaction.premium_gift_months;
                if (i6 != 3) {
                    str3 = "2⃣";
                } else if (i6 != 6) {
                    str3 = "3⃣";
                } else if (i6 != 12) {
                    str3 = "4⃣";
                } else if (i6 != 24) {
                    str3 = "1⃣";
                } else {
                    str3 = "5⃣";
                }
                setGiftImage(backupImageView, imageReceiver4, str3, false);
                M.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
            } else if (starsTransaction.posts_search) {
                int i11 = SessionCell.$r8$clinit;
                TLRPC.TL_authorization tL_authorization3 = new TLRPC.TL_authorization();
                tL_authorization3.device_model = "search";
                tL_authorization3.platform = "search";
                tL_authorization3.app_name = "search";
                CombinedDrawable combinedDrawableCreateDrawable3 = SessionCell.createDrawable(100, tL_authorization3);
                int iDp5 = AndroidUtilities.dp(40.0f);
                int iDp6 = AndroidUtilities.dp(40.0f);
                combinedDrawableCreateDrawable3.iconWidth = iDp5;
                combinedDrawableCreateDrawable3.iconHeight = iDp6;
                backupImageView.setImageDrawable(combinedDrawableCreateDrawable3);
            } else {
                starGift = starsTransaction.stargift;
                if (starGift != null) {
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        backupImageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(backupImageView, starsTransaction.stargift, 94, 0.44f));
                        M.addView(backupImageView, LayoutHelper.createLinear(94, 94, 17, 0, 2, 0, 10));
                    } else {
                        ImageReceiver imageReceiver5 = backupImageView.getImageReceiver();
                        starGift2 = starsTransaction.stargift;
                        if (starGift2 == null) {
                            document = null;
                        } else {
                            document = starGift2.getDocument();
                        }
                        setGiftImage(imageReceiver5, document, 160);
                        M.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                    }
                } else if (z6) {
                    z3 = z;
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    ?? r113 = M;
                    j2 = j;
                    resourcesProvider2 = resourcesProvider;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        setTonGiftImage(backupImageView, backupImageView.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        setGiftImage(backupImageView, backupImageView.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    r113.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                    r15 = r113;
                } else {
                    z3 = z;
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    ?? r114 = M;
                    j2 = j;
                    resourcesProvider2 = resourcesProvider;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        setTonGiftImage(backupImageView, backupImageView.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        setGiftImage(backupImageView, backupImageView.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    r114.addView(backupImageView, LayoutHelper.createLinear(160, 160, 17, 0, -8, 0, 10));
                    r15 = r114;
                }
                TextView textView8 = new TextView(context2);
                i4 = Theme.key_dialogTextBlack;
                zzlj.m(i4, resourcesProvider2, textView8, 20.0f);
                textView8.setGravity(17);
                textView8.setText(getTransactionTitle(i2, z3, starsTransaction2));
                textViewM = ArticleViewer.IBlock.CC.m((LinearLayout) r15, textView8, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4), context2);
                textViewM.setTextSize(1, 18.0f);
                textViewM.setTypeface(AndroidUtilities.bold());
                textViewM.setGravity(17);
                if (zPositive) {
                    i5 = Theme.key_color_green;
                } else {
                    i5 = Theme.key_color_red;
                }
                textViewM.setTextColor(Theme.getColor(i5, resourcesProvider2));
                TL_stars.StarsAmount starsAmount7 = starsTransaction2.amount;
                textViewM.setText(replaceStarsWithPlain(starsAmount7 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(zPositive ? "+" : str, formatStarsAmount(starsAmount7, 0.777f, ','), " ⭐️"), 0.8f, null));
                spannableStringBuilder = new SpannableStringBuilder(textViewM.getText());
                if (starsTransaction2.refund) {
                    appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    textViewM.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider2));
                    appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    textViewM.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider2));
                    appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsPending));
                }
                textViewM.setText(spannableStringBuilder);
                r15.addView(textViewM, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message) {
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        r16 = r15;
                        if (starsTransaction2.description != null) {
                            r16 = r15;
                            TextView textView9 = new TextView(context2);
                            OKLCH.m(i4, resourcesProvider2, textView9, 16.0f);
                            textView9.setGravity(17);
                            textView9.setText(starsTransaction2.description);
                            r15.addView(textView9, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            r16 = r15;
                        }
                    } else {
                        r16 = r15;
                        if (starsTransaction2.description != null) {
                            r16 = r15;
                            TextView textView10 = new TextView(context2);
                            OKLCH.m(i4, resourcesProvider2, textView10, 16.0f);
                            textView10.setGravity(17);
                            textView10.setText(starsTransaction2.description);
                            r15.addView(textView10, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            r16 = r15;
                        }
                    }
                } else if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                    r16 = r15;
                    if (starsTransaction2.description != null) {
                        r16 = r15;
                        TextView textView11 = new TextView(context2);
                        OKLCH.m(i4, resourcesProvider2, textView11, 16.0f);
                        textView11.setGravity(17);
                        textView11.setText(starsTransaction2.description);
                        r15.addView(textView11, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    }
                } else {
                    r16 = r15;
                    if (starsTransaction2.description != null) {
                        r16 = r15;
                        TextView textView12 = new TextView(context2);
                        OKLCH.m(i4, resourcesProvider2, textView12, 16.0f);
                        textView12.setGravity(17);
                        textView12.setText(starsTransaction2.description);
                        r15.addView(textView12, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    }
                }
            }
            z3 = z;
            context2 = context;
            i2 = i;
            starsTransaction2 = starsTransaction;
            r15 = M;
            j2 = j;
            resourcesProvider2 = resourcesProvider;
            TextView textView13 = new TextView(context2);
            i4 = Theme.key_dialogTextBlack;
            zzlj.m(i4, resourcesProvider2, textView13, 20.0f);
            textView13.setGravity(17);
            textView13.setText(getTransactionTitle(i2, z3, starsTransaction2));
            textViewM = ArticleViewer.IBlock.CC.m((LinearLayout) r15, textView13, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4), context2);
            textViewM.setTextSize(1, 18.0f);
            textViewM.setTypeface(AndroidUtilities.bold());
            textViewM.setGravity(17);
            if (zPositive) {
                i5 = Theme.key_color_green;
            } else {
                i5 = Theme.key_color_red;
            }
            textViewM.setTextColor(Theme.getColor(i5, resourcesProvider2));
            TL_stars.StarsAmount starsAmount8 = starsTransaction2.amount;
            textViewM.setText(replaceStarsWithPlain(starsAmount8 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(zPositive ? "+" : str, formatStarsAmount(starsAmount8, 0.777f, ','), " ⭐️"), 0.8f, null));
            spannableStringBuilder = new SpannableStringBuilder(textViewM.getText());
            if (starsTransaction2.refund) {
                appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsRefunded));
            } else if (starsTransaction2.failed) {
                textViewM.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider2));
                appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsFailed));
            } else if (starsTransaction2.pending) {
                textViewM.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider2));
                appendStatus(spannableStringBuilder, textViewM, LocaleController.getString(R.string.StarsPending));
            }
            textViewM.setText(spannableStringBuilder);
            r15.addView(textViewM, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
            if (!starsTransaction2.paid_message) {
                if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                    r16 = r15;
                    if (starsTransaction2.description != null) {
                        r16 = r15;
                        TextView textView14 = new TextView(context2);
                        OKLCH.m(i4, resourcesProvider2, textView14, 16.0f);
                        textView14.setGravity(17);
                        textView14.setText(starsTransaction2.description);
                        r15.addView(textView14, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    }
                } else {
                    r16 = r15;
                    if (starsTransaction2.description != null) {
                        r16 = r15;
                        TextView textView15 = new TextView(context2);
                        OKLCH.m(i4, resourcesProvider2, textView15, 16.0f);
                        textView15.setGravity(17);
                        textView15.setText(starsTransaction2.description);
                        r15.addView(textView15, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                        r16 = r15;
                    }
                }
            } else if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                r16 = r15;
                if (starsTransaction2.description != null) {
                    r16 = r15;
                    TextView textView16 = new TextView(context2);
                    OKLCH.m(i4, resourcesProvider2, textView16, 16.0f);
                    textView16.setGravity(17);
                    textView16.setText(starsTransaction2.description);
                    r15.addView(textView16, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    r16 = r15;
                }
            } else {
                r16 = r15;
                if (starsTransaction2.description != null) {
                    r16 = r15;
                    TextView textView17 = new TextView(context2);
                    OKLCH.m(i4, resourcesProvider2, textView17, 16.0f);
                    textView17.setGravity(17);
                    textView17.setText(starsTransaction2.description);
                    r15.addView(textView17, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    r16 = r15;
                }
            }
        }
        r16 = r15;
        TableView tableView8 = new TableView(context2, resourcesProvider2);
        TL_stars.StarGift starGift5 = starsTransaction2.stargift;
        if (starGift5 != null) {
            if (starsTransaction2.stargift_upgrade) {
                if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                    resourcesProvider3 = resourcesProvider2;
                } else {
                    ButtonSpan.TextViewButtons textViewButtons = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableView8.addRow(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                    TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                    tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                    resourcesProvider3 = resourcesProvider;
                    StarsController.getInstance(i).getUserStarGift(tL_inputSavedStarGiftUser, new PhotoViewer$$ExternalSyntheticLambda68(textViewButtons, i, context2, resourcesProvider, 2));
                }
                TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction2.peer;
                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                    long peerDialogId2 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                    i = i;
                    TableView tableView9 = tableView8;
                    tableView9.addRowUser(LocaleController.getString(R.string.StarGiftUpgradeGiftFrom), i, peerDialogId2, new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr, peerDialogId2, 2));
                    context3 = context;
                    tableView5 = tableView9;
                } else {
                    context3 = context;
                    tableView5 = tableView8;
                }
            } else {
                resourcesProvider3 = resourcesProvider2;
                final Context context5 = context2;
                if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
                    String str4 = starGift5.slug;
                    if (!TextUtils.isEmpty(str4)) {
                        tableView8.addRowLink(LocaleController.getString(R.string.Gift2Gift), starsTransaction2.stargift.title + " #" + starsTransaction2.stargift.num, new TodoItemMenu$$ExternalSyntheticLambda2(context5, i, str4, 6));
                    }
                    final long clientUserId = UserConfig.getInstance(i).getClientUserId();
                    long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction2.peer).peer);
                    if (!starsTransaction2.offer) {
                        if (starsTransaction2.stargift_resale) {
                            if (!zNegative) {
                                tableView8.addRow(LocaleController.getString(starsTransaction2.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j3 = clientUserId;
                            } else {
                                tableView8.addRow(LocaleController.getString(starsTransaction2.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                            }
                        } else if (starsTransaction2.stargift_drop_original_details) {
                            tableView8.addRow(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                            peerDialogId3 = clientUserId;
                            j3 = peerDialogId3;
                        } else {
                            tableView8.addRow(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                        }
                        j3 = peerDialogId3;
                        peerDialogId3 = clientUserId;
                    } else if (!zNegative) {
                        tableView8.addRow(LocaleController.getString(starsTransaction2.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                        j3 = clientUserId;
                    } else {
                        tableView8.addRow(LocaleController.getString(starsTransaction2.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                        j3 = peerDialogId3;
                        peerDialogId3 = clientUserId;
                    }
                    if (peerDialogId3 != clientUserId) {
                        final int i12 = 0;
                        final long j4 = peerDialogId3;
                        bottomSheetArr = bottomSheetArr;
                        tableView8.addRowUser(LocaleController.getString(R.string.Gift2From), i, peerDialogId3, new Runnable() {
                            @Override
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                        if (safeLastFragment != null) {
                                            long j5 = j4;
                                            Bundle bundleM = FBool.m(j5, "user_id");
                                            if (j5 == clientUserId) {
                                                bundleM.putBoolean("my_profile", true);
                                            }
                                            bundleM.putBoolean("open_gifts", true);
                                            safeLastFragment.presentFragment(new ProfileActivity(bundleM, null));
                                        }
                                        break;
                                    default:
                                        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                        if (safeLastFragment2 != null) {
                                            long j6 = j4;
                                            Bundle bundleM2 = FBool.m(j6, "user_id");
                                            if (j6 == clientUserId) {
                                                bundleM2.putBoolean("my_profile", true);
                                            }
                                            bundleM2.putBoolean("open_gifts", true);
                                            safeLastFragment2.presentFragment(new ProfileActivity(bundleM2, null));
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        bottomSheetArr = bottomSheetArr;
                    }
                    if (j3 != clientUserId) {
                        final int i13 = 1;
                        final long j5 = j3;
                        tableView8.addRowUser(LocaleController.getString(R.string.Gift2To), i, j5, new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                        if (safeLastFragment != null) {
                                            long j6 = j5;
                                            Bundle bundleM = FBool.m(j6, "user_id");
                                            if (j6 == clientUserId) {
                                                bundleM.putBoolean("my_profile", true);
                                            }
                                            bundleM.putBoolean("open_gifts", true);
                                            safeLastFragment.presentFragment(new ProfileActivity(bundleM, null));
                                        }
                                        break;
                                    default:
                                        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                        if (safeLastFragment2 != null) {
                                            long j7 = j5;
                                            Bundle bundleM2 = FBool.m(j7, "user_id");
                                            if (j7 == clientUserId) {
                                                bundleM2.putBoolean("my_profile", true);
                                            }
                                            bundleM2.putBoolean("open_gifts", true);
                                            safeLastFragment2.presentFragment(new ProfileActivity(bundleM2, null));
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    tableView8 = tableView8;
                    if ((peerDialogId3 == clientUserId || starsTransaction2.stargift_resale) && (starsAmount = starsTransaction2.starref_amount) != null && starsTransaction2.starref_commission_permille > 0) {
                        TL_stars.StarsAmount starsAmount9 = starsTransaction2.amount;
                        if ((starsAmount9 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                            tL_starsTonAmount.amount = starsTransaction2.amount.amount + starsTransaction2.starref_amount.amount;
                            ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
                            tableView8.addRow(replaceStarsWithPlain(starsTransaction2.amount, "⭐️ " + ((Object) formatStarsAmount(tL_starsTonAmount, 0.777f, ',')), coloredImageSpanArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                            if (coloredImageSpan != null) {
                                coloredImageSpan.setOverrideColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider3));
                            }
                        } else {
                            tableView8.addRow(replaceStarsWithPlain(starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount, BillingController$$ExternalSyntheticOutline0.m(Math.abs(Math.round(starsTransaction2.starref_amount.toDouble() + starsAmount9.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                        }
                    }
                    context3 = context5;
                    tableView5 = tableView8;
                } else {
                    if (starsTransaction2.refund) {
                        bottomSheetArr2 = bottomSheetArr;
                        tableView6 = tableView8;
                        i = i;
                    } else {
                        long clientUserId2 = j == 0 ? UserConfig.getInstance(i).getClientUserId() : j;
                        final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction2.peer.peer);
                        TLRPC.User user5 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId4));
                        if (zPositive) {
                            if (peerDialogId4 != clientUserId2) {
                                String string = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                final BottomSheet[] bottomSheetArr5 = bottomSheetArr;
                                StarsIntroActivity$$ExternalSyntheticLambda4 starsIntroActivity$$ExternalSyntheticLambda4 = new StarsIntroActivity$$ExternalSyntheticLambda4(bottomSheetArr5, starsTransaction2, peerDialogId4, 4);
                                final int i14 = 0;
                                i = i;
                                TableView tableView10 = tableView8;
                                bottomSheetArr3 = bottomSheetArr5;
                                tableView10.addRowUser(string, i, peerDialogId4, starsIntroActivity$$ExternalSyntheticLambda4, (user5 == null || UserObject.isDeleted(user5) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                BottomSheet bottomSheet2 = bottomSheetArr5[0];
                                                Objects.requireNonNull(bottomSheet2);
                                                VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = new VoIPFragment$$ExternalSyntheticLambda7(bottomSheet2, 3);
                                                new GiftSheet(context5, i, peerDialogId4, null, voIPFragment$$ExternalSyntheticLambda7).show();
                                                break;
                                            default:
                                                BottomSheet bottomSheet3 = bottomSheetArr5[0];
                                                Objects.requireNonNull(bottomSheet3);
                                                VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda8 = new VoIPFragment$$ExternalSyntheticLambda7(bottomSheet3, 3);
                                                new GiftSheet(context5, i, peerDialogId4, null, voIPFragment$$ExternalSyntheticLambda8).show();
                                                break;
                                        }
                                    }
                                });
                                tableView7 = tableView10;
                            } else {
                                i = i;
                                bottomSheetArr3 = bottomSheetArr;
                                tableView7 = tableView8;
                            }
                            final int i15 = 0;
                            tableView7.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, clientUserId2, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            bottomSheetArr3[0].lambda$showGiftOfferSheet$15();
                                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                            if (safeLastFragment != null) {
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                bundle.putBoolean("my_profile", true);
                                                bundle.putBoolean("open_gifts", true);
                                                safeLastFragment.presentFragment(new ProfileActivity(bundle, null));
                                            }
                                            break;
                                        case 1:
                                            bottomSheetArr3[0].lambda$showGiftOfferSheet$15();
                                            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                            if (safeLastFragment2 != null) {
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                bundle2.putBoolean("my_profile", true);
                                                safeLastFragment2.presentFragment(new ProfileActivity(bundle2, null));
                                            }
                                            break;
                                        default:
                                            bottomSheetArr3[0].lambda$showGiftOfferSheet$15();
                                            BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                            if (safeLastFragment3 != null) {
                                                Bundle bundle3 = new Bundle();
                                                bundle3.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                bundle3.putBoolean("my_profile", true);
                                                bundle3.putBoolean("open_gifts", true);
                                                safeLastFragment3.presentFragment(new ProfileActivity(bundle3, null));
                                            }
                                            break;
                                    }
                                }
                            });
                            context3 = context;
                            starsTransaction2 = starsTransaction;
                            bottomSheetArr = bottomSheetArr3;
                            tableView5 = tableView7;
                        } else {
                            final BottomSheet[] bottomSheetArr6 = bottomSheetArr;
                            long j6 = clientUserId2;
                            if (peerDialogId4 != j6) {
                                final int i16 = 2;
                                tableView8.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, j6, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                bottomSheetArr6[0].lambda$showGiftOfferSheet$15();
                                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                                if (safeLastFragment != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    safeLastFragment.presentFragment(new ProfileActivity(bundle, null));
                                                }
                                                break;
                                            case 1:
                                                bottomSheetArr6[0].lambda$showGiftOfferSheet$15();
                                                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                                if (safeLastFragment2 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                    bundle2.putBoolean("my_profile", true);
                                                    safeLastFragment2.presentFragment(new ProfileActivity(bundle2, null));
                                                }
                                                break;
                                            default:
                                                bottomSheetArr6[0].lambda$showGiftOfferSheet$15();
                                                BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                                if (safeLastFragment3 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                    bundle3.putBoolean("my_profile", true);
                                                    bundle3.putBoolean("open_gifts", true);
                                                    safeLastFragment3.presentFragment(new ProfileActivity(bundle3, null));
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            final int i17 = 1;
                            i = i;
                            TableView tableView11 = tableView8;
                            bottomSheetArr2 = bottomSheetArr6;
                            tableView11.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, peerDialogId4, new StarsIntroActivity$$ExternalSyntheticLambda4(bottomSheetArr6, starsTransaction, peerDialogId4, 0), (user5 == null || UserObject.isDeleted(user5) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            BottomSheet bottomSheet2 = bottomSheetArr6[0];
                                            Objects.requireNonNull(bottomSheet2);
                                            VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = new VoIPFragment$$ExternalSyntheticLambda7(bottomSheet2, 3);
                                            new GiftSheet(context, i, peerDialogId4, null, voIPFragment$$ExternalSyntheticLambda7).show();
                                            break;
                                        default:
                                            BottomSheet bottomSheet3 = bottomSheetArr6[0];
                                            Objects.requireNonNull(bottomSheet3);
                                            VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda8 = new VoIPFragment$$ExternalSyntheticLambda7(bottomSheet3, 3);
                                            new GiftSheet(context, i, peerDialogId4, null, voIPFragment$$ExternalSyntheticLambda8).show();
                                            break;
                                    }
                                }
                            });
                            tableView6 = tableView11;
                        }
                    }
                    starsTransaction2 = starsTransaction;
                    tableView4 = tableView6;
                    bottomSheetArr = bottomSheetArr2;
                    tableView3 = tableView4;
                    z4 = z2;
                    context3 = context;
                    r0 = tableView3;
                }
            }
            z4 = z2;
            r0 = tableView5;
        } else {
            bottomSheetArr2 = bottomSheetArr;
            long j7 = j2;
            resourcesProvider3 = resourcesProvider2;
            tableView = tableView8;
            TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction2.peer;
            if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                if (starsTransaction2.paid_message) {
                    tableView.addRowUser(LocaleController.getString(zPositive ? R.string.Gift2From : R.string.Gift2To), i, peerDialogId5, new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr2, peerDialogId5, 0));
                    if (starsTransaction2.starref_amount != null && starsTransaction2.starref_commission_permille > 0) {
                        tableView.addRow(replaceStarsWithPlain(starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount, BillingController$$ExternalSyntheticOutline0.m(Math.abs(Math.round(starsTransaction2.starref_amount.toDouble() + starsTransaction2.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                    }
                    i = i;
                    tableView4 = tableView;
                    bottomSheetArr = bottomSheetArr2;
                    tableView3 = tableView4;
                } else if (z7) {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction2.starref_peer);
                    tableView.addRowLink(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr2, j7, 4));
                    i = i;
                    tableView.addRowUser(LocaleController.getString(R.string.StarAffiliate), i, peerDialogId6, new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr2, peerDialogId6, 5));
                    tableView.addRowUser(LocaleController.getString(R.string.StarAffiliateReferredUser), i, peerDialogId5, new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr2, peerDialogId5, 6));
                    tableView.addRow(AffiliateProgramFragment.percents(starsTransaction2.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                    resourcesProvider3 = resourcesProvider;
                    bottomSheetArr = bottomSheetArr2;
                    tableView3 = tableView;
                } else {
                    if (z8) {
                        resourcesProvider3 = resourcesProvider;
                        bottomSheetArr = bottomSheetArr2;
                        tableView.addRowLink(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new StarsIntroActivity$$ExternalSyntheticLambda10(i, context, j7, peerDialogId5, bottomSheetArr2, resourcesProvider3));
                        i = i;
                        TableView tableView12 = tableView;
                        tableView12.addRowUser(LocaleController.getString(R.string.StarAffiliateMiniApp), i, peerDialogId5, new StarsIntroActivity$$ExternalSyntheticLambda6(bottomSheetArr, peerDialogId5, 1));
                        context3 = context;
                        starsTransaction2 = starsTransaction;
                        tableView5 = tableView12;
                    } else {
                        resourcesProvider3 = resourcesProvider;
                        bottomSheetArr = bottomSheetArr2;
                        if (z6) {
                            tableView.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, peerDialogId5, new StarsIntroActivity$$ExternalSyntheticLambda4(bottomSheetArr, starsTransaction, peerDialogId5, 1));
                            final int i18 = 1;
                            tableView.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, UserConfig.getInstance(i).getClientUserId(), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                            if (safeLastFragment != null) {
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                bundle.putBoolean("my_profile", true);
                                                bundle.putBoolean("open_gifts", true);
                                                safeLastFragment.presentFragment(new ProfileActivity(bundle, null));
                                            }
                                            break;
                                        case 1:
                                            bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                            if (safeLastFragment2 != null) {
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                bundle2.putBoolean("my_profile", true);
                                                safeLastFragment2.presentFragment(new ProfileActivity(bundle2, null));
                                            }
                                            break;
                                        default:
                                            bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                            BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                            if (safeLastFragment3 != null) {
                                                Bundle bundle3 = new Bundle();
                                                bundle3.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
                                                bundle3.putBoolean("my_profile", true);
                                                bundle3.putBoolean("open_gifts", true);
                                                safeLastFragment3.presentFragment(new ProfileActivity(bundle3, null));
                                            }
                                            break;
                                    }
                                }
                            });
                            starsTransaction2 = starsTransaction;
                            tableView.addRowLink(LocaleController.getString(R.string.StarGiveawayReason), LocaleController.getString(R.string.StarGiveawayReasonLink), new StarsIntroActivity$$ExternalSyntheticLambda4(bottomSheetArr, starsTransaction, peerDialogId5, 2));
                            tableView.addRow(formatStarsAmountString(starsTransaction2.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        } else {
                            starsTransaction2 = starsTransaction;
                            if (starsTransaction2.subscription && !z) {
                                String string2 = LocaleController.getString(R.string.StarSubscriptionTo);
                                final int i19 = 0;
                                Runnable runnable = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                long j8 = peerDialogId5;
                                                if (!UserObject.isService(j8)) {
                                                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                                    if (safeLastFragment != null) {
                                                        safeLastFragment.presentFragment(ChatActivity.of(j8));
                                                    }
                                                } else {
                                                    Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                }
                                                break;
                                            case 1:
                                                bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                long j9 = peerDialogId5;
                                                if (!UserObject.isService(j9)) {
                                                    BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                                    if (safeLastFragment2 != null) {
                                                        safeLastFragment2.presentFragment(ChatActivity.of(j9));
                                                    }
                                                } else {
                                                    Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                }
                                                break;
                                            default:
                                                bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                long j10 = peerDialogId5;
                                                if (!UserObject.isService(j10)) {
                                                    BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                                    if (safeLastFragment3 != null) {
                                                        safeLastFragment3.presentFragment(ChatActivity.of(j10));
                                                    }
                                                } else {
                                                    Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                }
                                                break;
                                        }
                                    }
                                };
                                bottomSheetArr = bottomSheetArr;
                                TableView tableView13 = tableView;
                                i = i;
                                tableView13.addRowUser(string2, i, peerDialogId5, runnable);
                                tableView2 = tableView13;
                            } else {
                                bottomSheetArr = bottomSheetArr;
                                if (starsTransaction2.premium_gift) {
                                    final int i20 = 1;
                                    tableView.addRowUser(LocaleController.getString(R.string.Gift2To), i, peerDialogId5, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                    long j8 = peerDialogId5;
                                                    if (!UserObject.isService(j8)) {
                                                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                                        if (safeLastFragment != null) {
                                                            safeLastFragment.presentFragment(ChatActivity.of(j8));
                                                        }
                                                    } else {
                                                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    }
                                                    break;
                                                case 1:
                                                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                    long j9 = peerDialogId5;
                                                    if (!UserObject.isService(j9)) {
                                                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                                        if (safeLastFragment2 != null) {
                                                            safeLastFragment2.presentFragment(ChatActivity.of(j9));
                                                        }
                                                    } else {
                                                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    }
                                                    break;
                                                default:
                                                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                    long j10 = peerDialogId5;
                                                    if (!UserObject.isService(j10)) {
                                                        BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                                        if (safeLastFragment3 != null) {
                                                            safeLastFragment3.presentFragment(ChatActivity.of(j10));
                                                        }
                                                    } else {
                                                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    tableView.addRow(LocaleController.formatPluralStringComma("Months", starsTransaction2.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                                } else if (starsTransaction2.posts_search) {
                                    i = i;
                                    tableView2 = tableView;
                                } else {
                                    final int i21 = 2;
                                    TableView tableView14 = tableView;
                                    context3 = context;
                                    i = i;
                                    tableView14.addRowUser(LocaleController.getString(R.string.StarsTransactionRecipient), i, peerDialogId5, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                    long j8 = peerDialogId5;
                                                    if (!UserObject.isService(j8)) {
                                                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                                        if (safeLastFragment != null) {
                                                            safeLastFragment.presentFragment(ChatActivity.of(j8));
                                                        }
                                                    } else {
                                                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    }
                                                    break;
                                                case 1:
                                                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                    long j9 = peerDialogId5;
                                                    if (!UserObject.isService(j9)) {
                                                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                                        if (safeLastFragment2 != null) {
                                                            safeLastFragment2.presentFragment(ChatActivity.of(j9));
                                                        }
                                                    } else {
                                                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    }
                                                    break;
                                                default:
                                                    bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                                    long j10 = peerDialogId5;
                                                    if (!UserObject.isService(j10)) {
                                                        BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                                        if (safeLastFragment3 != null) {
                                                            safeLastFragment3.presentFragment(ChatActivity.of(j10));
                                                        }
                                                    } else {
                                                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    tableView5 = tableView14;
                                }
                            }
                            context3 = context;
                            tableView5 = tableView2;
                        }
                        i = i;
                        tableView3 = tableView;
                    }
                    z4 = z2;
                    r0 = tableView5;
                }
                z4 = z2;
                context3 = context;
                r0 = tableView3;
            } else {
                i = i;
                bottomSheetArr = bottomSheetArr2;
                context3 = context;
                if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                    if (starsTransaction2.gift) {
                        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context3, resourcesProvider3);
                        linksTextView3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        linksTextView3.setEllipsize(TextUtils.TruncateAt.END);
                        int i22 = Theme.key_chat_messageLinkIn;
                        linksTextView3.setTextColor(Theme.getColor(i22, resourcesProvider3));
                        linksTextView3.setLinkTextColor(Theme.getColor(i22, resourcesProvider3));
                        linksTextView3.setTextSize(1, 14.0f);
                        linksTextView3.setSingleLine(true);
                        linksTextView3.setDisablePaddingsOffsetY(true);
                        AvatarSpan avatarSpan = new AvatarSpan(linksTextView3, 24.0f, i);
                        String string3 = LocaleController.getString(z2 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                        CombinedDrawable platformDrawable = StarsTransactionView.getPlatformDrawable(24, "fragment");
                        int iDp7 = AndroidUtilities.dp(16.0f);
                        int iDp8 = AndroidUtilities.dp(16.0f);
                        platformDrawable.iconWidth = iDp7;
                        platformDrawable.iconHeight = iDp8;
                        avatarSpan.setImageDrawable(platformDrawable);
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x  " + ((Object) string3));
                        spannableStringBuilder4.setSpan(avatarSpan, 0, 1, 33);
                        z4 = z2;
                        spannableStringBuilder4.setSpan(new ClickableSpan() {
                            @Override
                            public final void onClick(View view) {
                                bottomSheetArr[0].lambda$showGiftOfferSheet$15();
                                Browser.openUrl(context3, LocaleController.getString(z4 ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
                            }

                            @Override
                            public final void updateDrawState(TextPaint textPaint) {
                                textPaint.setUnderlineText(false);
                            }
                        }, 3, spannableStringBuilder4.length(), 33);
                        linksTextView3.setText(spannableStringBuilder4);
                        tableView.addRowUnpadded(linksTextView3, LocaleController.getString(R.string.StarsTransactionRecipient));
                        r0 = tableView;
                    } else {
                        z4 = z2;
                        tableView.addRow(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                        r0 = tableView;
                    }
                } else {
                    z4 = z2;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        tableView.addRow(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        r0 = tableView;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        tableView.addRow(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        r0 = tableView;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                        r0 = tableView;
                        tableView.addRow(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                        r0 = tableView;
                    }
                }
            }
        }
        r0 = tableView;
        TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
        if (!(starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) || (starsTransaction2.flags & 256) == 0) {
            r18 = r16;
        } else {
            long peerDialogId7 = DialogObject.getPeerDialogId(starsTransactionPeer4.peer);
            if (z) {
                peerDialogId7 = j;
            }
            TLRPC.Chat chat3 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId7));
            if (chat3 != null) {
                ?? linksTextView4 = new LinkSpanDrawable.LinksTextView(context3, resourcesProvider3);
                linksTextView4.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                linksTextView4.setEllipsize(TextUtils.TruncateAt.END);
                int i23 = Theme.key_chat_messageLinkIn;
                linksTextView4.setTextColor(Theme.getColor(i23, resourcesProvider3));
                linksTextView4.setLinkTextColor(Theme.getColor(i23, resourcesProvider3));
                linksTextView4.setTextSize(1, 14.0f);
                linksTextView4.setDisablePaddingsOffsetY(true);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(str);
                if (!starsTransaction2.extended_media.isEmpty()) {
                    ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction2.extended_media;
                    int size = arrayList.size();
                    int i24 = 0;
                    int i25 = 0;
                    r16 = r16;
                    while (true) {
                        if (i24 >= size) {
                            r19 = r16;
                            break;
                        }
                        TLRPC.MessageMedia messageMedia2 = arrayList.get(i24);
                        int i26 = i24 + 1;
                        ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                        TLRPC.MessageMedia messageMedia3 = messageMedia2;
                        int i27 = size;
                        ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(linksTextView4, 24.0f, i);
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                            r111 = r16;
                            forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia3.photo);
                        } else {
                            r110 = r16;
                            if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                                forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia3.document);
                                r111 = r110;
                            } else {
                                imageLocation2 = null;
                            }
                            if (imageLocation2 != null) {
                                r19 = r110;
                                ImageReceiver imageReceiver6 = imageReceiverSpan.imageReceiver;
                                float fDp = AndroidUtilities.dp(6.0f);
                                imageReceiverSpan.radius = fDp;
                                imageReceiver6.setRoundRadius((int) fDp);
                                imageReceiver6.setImage(imageLocation2, "24_24", null, null, null, 0);
                                SpannableString spannableString = new SpannableString("x");
                                spannableString.setSpan(imageReceiverSpan, 0, spannableString.length(), 33);
                                spannableStringBuilder5.append((CharSequence) spannableString);
                                spannableStringBuilder5.append((CharSequence) " ");
                                i25++;
                            }
                            r19 = r110;
                            i7 = i25;
                            if (i7 >= 3) {
                                break;
                            }
                            size = i27;
                            i24 = i26;
                            i25 = i7;
                            r16 = r19;
                            arrayList = arrayList2;
                        }
                        imageLocation2 = forDocument2;
                        r19 = r111;
                        if (imageLocation2 != null) {
                            r19 = r110;
                            ImageReceiver imageReceiver7 = imageReceiverSpan.imageReceiver;
                            float fDp2 = AndroidUtilities.dp(6.0f);
                            imageReceiverSpan.radius = fDp2;
                            imageReceiver7.setRoundRadius((int) fDp2);
                            imageReceiver7.setImage(imageLocation2, "24_24", null, null, null, 0);
                            SpannableString spannableString2 = new SpannableString("x");
                            spannableString2.setSpan(imageReceiverSpan, 0, spannableString2.length(), 33);
                            spannableStringBuilder5.append((CharSequence) spannableString2);
                            spannableStringBuilder5.append((CharSequence) " ");
                            i25++;
                        }
                        r19 = r110;
                        i7 = i25;
                        if (i7 >= 3) {
                            break;
                            break;
                        }
                        size = i27;
                        i24 = i26;
                        i25 = i7;
                        r16 = r19;
                        arrayList = arrayList2;
                    }
                } else {
                    r19 = r16;
                    break;
                }
                spannableStringBuilder5.append((CharSequence) " ");
                int length = spannableStringBuilder5.length();
                String publicUsername = ChatObject.getPublicUsername(chat3);
                if (TextUtils.isEmpty(publicUsername)) {
                    spannableStringBuilder5.append((CharSequence) chat3.title);
                } else {
                    StringBuilder sb = new StringBuilder();
                    SurfaceContainer$$ExternalSyntheticOutline0.m(sb, MessagesController.getInstance(i).linkPrefix, "/", publicUsername, "/");
                    sb.append(starsTransaction2.msg_id);
                    spannableStringBuilder5.append((CharSequence) sb.toString());
                }
                final StarsIntroActivity$$ExternalSyntheticLambda4 starsIntroActivity$$ExternalSyntheticLambda5 = new StarsIntroActivity$$ExternalSyntheticLambda4(bottomSheetArr, peerDialogId7, starsTransaction2);
                spannableStringBuilder5.setSpan(new ClickableSpan() {
                    @Override
                    public final void onClick(View view) {
                        starsIntroActivity$$ExternalSyntheticLambda5.run();
                    }

                    @Override
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                    }
                }, length, spannableStringBuilder5.length(), 33);
                linksTextView4.setSingleLine(true);
                linksTextView4.setEllipsize(TextUtils.TruncateAt.END);
                linksTextView4.setText(spannableStringBuilder5);
                linksTextView4.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(starsIntroActivity$$ExternalSyntheticLambda5, 14));
                r0.addRowUnpadded(linksTextView4, LocaleController.getString(starsTransaction2.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                r18 = r19;
            } else {
                r18 = r16;
            }
        }
        if (!TextUtils.isEmpty(starsTransaction2.id) && !z6) {
            String string4 = LocaleController.getString(R.string.StarsTransactionID);
            String str5 = starsTransaction2.id;
            r0.addRowMonospaced(str5.length() > 25 ? 9 : 10, str5, new StickersActivity$$ExternalSyntheticLambda18(12, bottomSheetArr, resourcesProvider3), string4);
        }
        if (starsTransaction2.floodskip && starsTransaction2.floodskip_number > 0) {
            r0.addRow(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction2.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
        }
        String string5 = LocaleController.getString(R.string.StarsTransactionDate);
        int i28 = R.string.formatDateAtTime;
        r0.addRow(LocaleController.formatString(i28, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsTransaction2.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsTransaction2.date) * 1000))), string5);
        TL_stars.StarGift starGift6 = starsTransaction2.stargift;
        if (starGift6 != null) {
            if (starGift6.limited) {
                addAvailabilityRow(r0, i, starGift6, resourcesProvider3);
            }
            if (!TextUtils.isEmpty(starsTransaction2.description)) {
                r0.addFullRow(new SpannableStringBuilder(starsTransaction2.description));
            }
        }
        ?? r115 = r18;
        r115.addView(r0, LayoutHelper.createLinear(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction2.flags & 32) != 0) {
            r0.addRow(LocaleController.formatString(i28, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) starsTransaction2.transaction_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) starsTransaction2.transaction_date) * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
        }
        if (z4) {
            context4 = context;
        } else {
            context4 = context;
            LinkSpanDrawable.LinksTextView linksTextView5 = new LinkSpanDrawable.LinksTextView(context4, resourcesProvider3);
            linksTextView5.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
            linksTextView5.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
            linksTextView5.setTextSize(1, 14.0f);
            linksTextView5.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new OAuthSheet$$ExternalSyntheticLambda0(context4, 12)));
            linksTextView5.setGravity(17);
            r115.addView(linksTextView5, LayoutHelper.createLinear(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context4, resourcesProvider3);
        buttonWithCounterView.setRoundRadius(24);
        if ((starsTransaction2.flags & 32) != 0) {
            buttonWithCounterView.setText$1(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
        } else {
            buttonWithCounterView.setText$1(LocaleController.getString(R.string.OK));
        }
        r115.addView(buttonWithCounterView, LayoutHelper.createLinear(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        BottomSheet bottomSheet2 = bottomSheet;
        bottomSheet2.customView = r115;
        bottomSheetArr[0] = bottomSheet2;
        bottomSheet2.useBackgroundTopPadding = false;
        if ((starsTransaction2.flags & 32) != 0) {
            buttonWithCounterView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(20, context4, starsTransaction2));
        } else {
            buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 5));
        }
        bottomSheetArr[0].fixNavigationBar();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            bottomSheetArr[0].makeAttached(safeLastFragment);
        }
        bottomSheetArr[0].show();
    }

    public static SpannableStringBuilder replaceStars(boolean z, String str, ColoredImageSpan[] coloredImageSpanArr) {
        ColoredImageSpan coloredImageSpan;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar);
            coloredImageSpan.setScale(z ? 0.222f : 1.13f, z ? 0.222f : 1.13f);
        }
        if (coloredImageSpanArr != null) {
            coloredImageSpanArr[0] = coloredImageSpan;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public final class StarsTransactionsLayout extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        public final PageAdapter adapter;
        public final int currentAccount;
        public final ViewPagerFixed viewPager;

        public final class Page extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
            public final long bot_id;
            public final int currentAccount;
            public final UniversalRecyclerView listView;
            public final StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda0 loadTransactionsRunnable;
            public final Theme.ResourcesProvider resourcesProvider;
            public final boolean ton;
            public final int type;

            public Page(Context context, boolean z, long j, int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.type = i;
                this.ton = z;
                this.currentAccount = i2;
                this.bot_id = j;
                this.resourcesProvider = resourcesProvider;
                this.loadTransactionsRunnable = new StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda0(j, i2, i, z);
                UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i2, i3, true, new LinkManager$$ExternalSyntheticLambda1(this, 24), new StoriesViewPager$$ExternalSyntheticLambda0(this, 13), null, resourcesProvider, -1, 1);
                this.listView = universalRecyclerView;
                addView(universalRecyclerView, LayoutHelper.createFrame(-1.0f, -1));
                universalRecyclerView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 11));
            }

            @Override
            public final void didReceivedNotification(int i, int i2, Object... objArr) {
                int i3 = NotificationCenter.starTransactionsLoaded;
                UniversalRecyclerView universalRecyclerView = this.listView;
                if (i != i3) {
                    if (i == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.bot_id) {
                        universalRecyclerView.adapter.update(true);
                        return;
                    }
                    return;
                }
                universalRecyclerView.adapter.update(true);
                if (universalRecyclerView.canScrollVertically(1)) {
                    for (int i4 = 0; i4 < universalRecyclerView.getChildCount(); i4++) {
                        if (!(universalRecyclerView.getChildAt(i4) instanceof FlickerLoadingView)) {
                        }
                    }
                    return;
                }
                this.loadTransactionsRunnable.run();
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                long j = this.bot_id;
                int i = this.currentAccount;
                if (j != 0) {
                    NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                } else {
                    NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starTransactionsLoaded);
                }
                this.listView.adapter.update(false);
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                long j = this.bot_id;
                int i = this.currentAccount;
                if (j != 0) {
                    NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                } else {
                    NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starTransactionsLoaded);
                }
            }
        }

        public StarsTransactionsLayout(Context context, int i, boolean z, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            setOrientation(1);
            ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context, null);
            this.viewPager = viewPagerFixed;
            PageAdapter pageAdapter = new PageAdapter(context, i, z, j, i2, resourcesProvider);
            this.adapter = pageAdapter;
            viewPagerFixed.setAdapter(pageAdapter);
            View viewCreateTabsView = viewPagerFixed.createTabsView(3, true);
            View view = new View(context);
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            addView(viewCreateTabsView, LayoutHelper.createLinear(-1, 48));
            addView(view, new LinearLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density)));
            addView(viewPagerFixed, LayoutHelper.createLinear(-1, -1));
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starTransactionsLoaded) {
                this.adapter.fill();
                this.viewPager.fillTabs$1(true);
            }
        }

        public RecyclerListView getCurrentListView() {
            View currentView = this.viewPager.getCurrentView();
            if (currentView instanceof Page) {
                return ((Page) currentView).listView;
            }
            return null;
        }

        @Override
        public final void onAttachedToWindow() {
            this.adapter.fill();
            this.viewPager.fillTabs$1(false);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
            super.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
            super.onDetachedFromWindow();
        }

        public final class PageAdapter extends ViewPagerFixed.Adapter {
            public final long bot_id;
            public final int classGuid;
            public final Context context;
            public final int currentAccount;
            public final ArrayList items = new ArrayList();
            public final Theme.ResourcesProvider resourcesProvider;
            public final boolean ton;

            public PageAdapter(Context context, int i, boolean z, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
                this.context = context;
                this.currentAccount = i;
                this.ton = z;
                this.classGuid = i2;
                this.resourcesProvider = resourcesProvider;
                this.bot_id = j;
                fill();
            }

            @Override
            public final View createView(int i) {
                return new Page(this.context, this.ton, this.bot_id, i, this.currentAccount, this.classGuid, this.resourcesProvider);
            }

            public final void fill() {
                ArrayList arrayList = this.items;
                arrayList.clear();
                int i = this.currentAccount;
                long j = this.bot_id;
                if (j == 0) {
                    StarsController starsController = StarsController.getInstance(i, this.ton);
                    UItem uItem = new UItem(28);
                    uItem.intValue = 0;
                    arrayList.add(uItem);
                    if (starsController.hasTransactions(1)) {
                        UItem uItem2 = new UItem(28);
                        uItem2.intValue = 1;
                        arrayList.add(uItem2);
                    }
                    if (starsController.hasTransactions(2)) {
                        UItem uItem3 = new UItem(28);
                        uItem3.intValue = 2;
                        arrayList.add(uItem3);
                        return;
                    }
                    return;
                }
                BotStarsController botStarsController = BotStarsController.getInstance(i);
                UItem uItem4 = new UItem(28);
                uItem4.intValue = 0;
                arrayList.add(uItem4);
                if (!botStarsController.getTransactionsState(j).transactions[1].isEmpty()) {
                    UItem uItem5 = new UItem(28);
                    uItem5.intValue = 1;
                    arrayList.add(uItem5);
                }
                if (botStarsController.getTransactionsState(j).transactions[2].isEmpty()) {
                    return;
                }
                UItem uItem6 = new UItem(28);
                uItem6.intValue = 2;
                arrayList.add(uItem6);
            }

            @Override
            public final int getItemCount() {
                return this.items.size();
            }

            @Override
            public final CharSequence getItemTitle(int i) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    return LocaleController.getString(R.string.StarsTransactionsAll);
                }
                if (itemViewType != 1) {
                    return itemViewType != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing);
                }
                return LocaleController.getString(R.string.StarsTransactionsIncoming);
            }

            @Override
            public final int getItemViewType(int i) {
                if (i < 0) {
                    return 0;
                }
                ArrayList arrayList = this.items;
                if (i >= arrayList.size()) {
                    return 0;
                }
                return ((UItem) arrayList.get(i)).intValue;
            }

            @Override
            public final void bindView(View view, int i, int i2) {
            }
        }
    }
}
