package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Map;
import j$.util.Map$Entry$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetLayouted;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotWebViewSheet;

public class StarGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private final ActionView actionView;
    private Adapter adapter;
    private final LinkSpanDrawable.LinksTextView afterTableTextView;
    private final LinkSpanDrawable.LinksTextView beforeTableTextView;
    private final FrameLayout bottomBulletinContainer;
    private final View bottomView;
    private Utilities.Callback2 boughtGift;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private final View buttonShadow;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private final View checkboxSeparator;
    private final TextView checkboxTextView;
    private Runnable closeParentSheet;
    private ContainerView container;
    private final AffiliateProgramFragment.FeatureCell[] craftFeatureCells;
    private final LinearLayout craftLayout;
    private HintView2 currentHintView;
    private View currentHintViewTextView;
    private PageTransition currentPage;
    private final long dialogId;
    private FireworksOverlay fireworksOverlay;
    private boolean firstSet;
    private StarsController.IGiftsList giftsList;
    private ResaleGiftsFragment.SelectGiftSheet.State giftsToCraft;
    private final int[] heights;
    private final LinearLayout infoLayout;
    private boolean isLearnMore;
    private Float lastTop;
    private StarGiftSheet left;
    private ColoredImageSpan lockSpan;
    private MessageObject messageObject;
    private boolean messageObjectRepolled;
    private boolean messageObjectRepolling;
    private boolean myProfile;
    private boolean nextButtonCrafting;
    private ArrayList next_prices;
    private Runnable onGiftUpdatedListener;
    private boolean onlyWearInfo;
    private int overrideNextIndex;
    private View ownerTextView;
    private ArrayList prices;
    private boolean requesting_upgrade_form;
    private boolean resale;
    private StarGiftSheet right;
    private Roller roller;
    private boolean rolling;
    private ArrayList sample_attributes;
    private TL_stars.SavedStarGift savedStarGift;
    private ShareAlert shareAlert;
    private boolean shownWearInfo;
    private String slug;
    private TL_stars.TL_starGiftUnique slugStarGift;
    private final ColoredImageSpan[] starCached;
    private ValueAnimator switchingPagesAnimator;
    private final TableView tableView;
    private final Runnable tickUpgradePriceRunnable;
    private String title;
    private final TopView topView;
    private final FrameLayout underButtonContainer;
    private final LinkSpanDrawable.LinksTextView underButtonLinkTextView;
    private Boolean unsavedFromSavedStarGift;
    private final AffiliateProgramFragment.FeatureCell[] upgradeFeatureCells;
    private ColoredImageSpan upgradeIconSpan;
    private final LinearLayout upgradeLayout;
    private UpgradePricesSheet upgradeSheet;
    private TLRPC.PaymentForm upgrade_form;
    private boolean upgradedOnce;
    private boolean userStarGiftRepolled;
    private boolean userStarGiftRepolling;
    private ViewPagerFixed viewPager;
    private final AffiliateProgramFragment.FeatureCell[] wearFeatureCells;
    private final LinearLayout wearLayout;
    private final TextView wearSubtitle;
    private final TextView wearTitle;

    public static void lambda$onResellPressed$35(AlertDialog alertDialog, int i) {
    }

    @Override
    protected boolean shouldDrawBackground() {
        return false;
    }

    public StarGiftSheet setOnBoughtGift(Utilities.Callback2 callback2) {
        this.boughtGift = callback2;
        return this;
    }

    public StarGiftSheet(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, j, resourcesProvider, null);
    }

    public StarGiftSheet(final Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, View view) {
        super(context, null, false, false, false, resourcesProvider);
        this.upgradedOnce = false;
        this.heights = new int[2];
        this.overrideNextIndex = -1;
        this.title = "";
        this.currentPage = new PageTransition(0, 0, 1.0f);
        this.firstSet = true;
        this.starCached = new ColoredImageSpan[1];
        this.tickUpgradePriceRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.tickUpgradePrice();
            }
        };
        this.currentAccount = i;
        this.dialogId = j;
        this.topPadding = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new FrameLayout(context) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (StarGiftSheet.this.actionView == null || StarGiftSheet.this.actionView.getVisibility() != 0) {
                    return;
                }
                StarGiftSheet.this.actionView.invalidate();
            }
        };
        this.container = new ContainerView(context);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.viewPager = anonymousClass2;
        anonymousClass2.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return (StarGiftSheet.this.hasNeighbour(false) ? 1 : 0) + 1 + (StarGiftSheet.this.hasNeighbour(true) ? 1 : 0);
            }

            @Override
            public View createView(int i2) {
                ContainerView containerView;
                if (i2 == 0) {
                    StarGiftSheet.this.setupNeighbour(false, false);
                    if (StarGiftSheet.this.left == null) {
                        return null;
                    }
                    containerView = StarGiftSheet.this.left.container;
                } else if (i2 == 1) {
                    containerView = StarGiftSheet.this.container;
                } else {
                    if (i2 != 2) {
                        return null;
                    }
                    StarGiftSheet.this.setupNeighbour(true, false);
                    if (StarGiftSheet.this.right == null) {
                        return null;
                    }
                    containerView = StarGiftSheet.this.right.container;
                }
                AndroidUtilities.removeFromParent(containerView);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(containerView, LayoutHelper.createFrame(-1, -1, 119));
                return frameLayout;
            }

            @Override
            public void bindView(View view2, int i2, int i3) {
                ContainerView containerView;
                if (i3 == 0) {
                    StarGiftSheet.this.setupNeighbour(false, true);
                    if (StarGiftSheet.this.left == null) {
                        return;
                    } else {
                        containerView = StarGiftSheet.this.left.container;
                    }
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    StarGiftSheet.this.setupNeighbour(true, true);
                    if (StarGiftSheet.this.right == null) {
                        return;
                    } else {
                        containerView = StarGiftSheet.this.right.container;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view2;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(containerView);
                frameLayout.addView(containerView);
            }

            @Override
            public int getItemViewType(int i2) {
                return (i2 - (StarGiftSheet.this.hasNeighbour(false) ? 1 : 0)) + 1;
            }
        });
        updateViewPager();
        View view2 = new View(context);
        this.bottomView = view2;
        int i2 = Theme.key_dialogBackground;
        view2.setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(view2, LayoutHelper.createFrame(-1, 50, 80));
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        fixNavigationBar(getThemedColor(i2));
        AndroidUtilities.removeFromParent(this.recyclerListView);
        this.container.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (StarGiftSheet.this.currentPage.is(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.infoLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(68.0f));
        this.container.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 55));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.beforeTableTextView = linksTextView;
        int i3 = Theme.key_dialogTextGray2;
        linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setGravity(17);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setDisablePaddingsOffsetY(true);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 4, -2, 4, 16));
        linksTextView.setVisibility(8);
        TableView tableView = new TableView(context, resourcesProvider);
        this.tableView = tableView;
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 12.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.afterTableTextView = linksTextView2;
        linksTextView2.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView2.setTextSize(1, 12.0f);
        linksTextView2.setGravity(17);
        linksTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i4 = Theme.key_featuredStickers_addButton;
        linksTextView2.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setDisablePaddingsOffsetY(true);
        linksTextView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-2, -2, 1, 4, 2, 4, 8));
        linksTextView2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (StarGiftSheet.this.currentPage.is(1)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.upgradeLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        this.container.addView(linearLayout2, LayoutHelper.createFrame(-1, -1, 55));
        AffiliateProgramFragment.FeatureCell[] featureCellArr = {featureCell, featureCell, featureCell};
        this.upgradeFeatureCells = featureCellArr;
        AffiliateProgramFragment.FeatureCell featureCell = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        int i5 = R.drawable.menu_feature_unique;
        featureCell.set(i5, LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text));
        linearLayout2.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell2 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell2.set(R.drawable.menu_feature_tradable, LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text));
        linearLayout2.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell3 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell3.set(R.drawable.menu_wear, LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text));
        linearLayout2.addView(featureCellArr[2], LayoutHelper.createLinear(-1, -2));
        View view3 = new View(context);
        this.checkboxSeparator = view3;
        int i6 = Theme.key_divider;
        view3.setBackgroundColor(Theme.getColor(i6, resourcesProvider));
        linearLayout2.addView(view3, LayoutHelper.createLinear(-2, 1.0f / AndroidUtilities.density, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.checkboxLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkbox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.checkboxTextView = textView;
        int i7 = Theme.key_dialogTextBlack;
        textView.setTextColor(getThemedColor(i7));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout3.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 4));
        ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
        LinearLayout linearLayout4 = new LinearLayout(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (StarGiftSheet.this.currentPage.is(2)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.wearLayout = linearLayout4;
        linearLayout4.setOrientation(1);
        linearLayout4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        this.container.addView(linearLayout4, LayoutHelper.createFrame(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.wearTitle = textView2;
        textView2.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        this.wearSubtitle = textView3;
        textView3.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        linearLayout4.addView(textView3, LayoutHelper.createLinear(-1, -2, 7, 20, 6, 20, 24));
        AffiliateProgramFragment.FeatureCell[] featureCellArr2 = {featureCell, featureCell, featureCell};
        this.wearFeatureCells = featureCellArr2;
        AffiliateProgramFragment.FeatureCell featureCell4 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell4.set(i5, LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text));
        linearLayout4.addView(featureCellArr2[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell5 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell5.set(R.drawable.menu_feature_cover, LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text));
        linearLayout4.addView(featureCellArr2[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell6 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell6.set(R.drawable.menu_verification, LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text));
        linearLayout4.addView(featureCellArr2[2], LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (StarGiftSheet.this.currentPage.is(3)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.craftLayout = linearLayout5;
        linearLayout5.setOrientation(1);
        linearLayout5.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        this.container.addView(linearLayout5, LayoutHelper.createFrame(-1, -1, 55));
        AffiliateProgramFragment.FeatureCell[] featureCellArr3 = {featureCell, featureCell, featureCell};
        this.craftFeatureCells = featureCellArr3;
        AffiliateProgramFragment.FeatureCell featureCell7 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell7.set(i5, LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text));
        linearLayout5.addView(featureCellArr3[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell8 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell8.set(R.drawable.menu_random, LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text));
        linearLayout5.addView(featureCellArr3[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell9 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell9.set(R.drawable.menu_feature_affect, LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text));
        linearLayout5.addView(featureCellArr3[2], LayoutHelper.createLinear(-1, -2));
        linearLayout.setAlpha(1.0f);
        linearLayout2.setAlpha(0.0f);
        linearLayout4.setAlpha(0.0f);
        linearLayout5.setAlpha(0.0f);
        TopView topView = new TopView(context, resourcesProvider, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openCrafting$8();
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.onMenuPressed(view4);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$new$0(view4);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.onTransferClick(view4);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.onWearPressed(view4);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.onSharePressed(view4);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.onResellPressed(view4);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.onUpdatePriceClick(view4);
            }
        });
        this.topView = topView;
        topView.craftTopView.helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$new$1(view4);
            }
        });
        int i8 = this.backgroundPaddingLeft;
        topView.setPadding(i8, 0, i8, 0);
        this.container.addView(topView, LayoutHelper.createFrame(-1, -2, 55));
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        this.reverseLayout = true;
        linearLayoutManager.setReverseLayout(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i2));
        View view4 = new View(context);
        this.buttonShadow = view4;
        view4.setBackgroundColor(getThemedColor(i6));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.OK), false);
        round.setSubText(null, false);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        layoutParamsCreateFrame.leftMargin = this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f);
        layoutParamsCreateFrame.rightMargin = this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f);
        frameLayout.addView(round, layoutParamsCreateFrame);
        this.container.addView(frameLayout, LayoutHelper.createFrame(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.underButtonContainer = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i2));
        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context);
        this.underButtonLinkTextView = linksTextView3;
        linksTextView3.setTextSize(1, 12.0f);
        linksTextView3.setTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView3.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView3.setGravity(17);
        frameLayout2.addView(linksTextView3, LayoutHelper.createFrame(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        this.container.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                StarGiftSheet.this.container.updateTranslations();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view5) {
                this.f$0.lambda$new$2(view5);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(context);
        this.fireworksOverlay = fireworksOverlay;
        this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomBulletinContainer = frameLayout3;
        frameLayout3.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
        this.container.addView(frameLayout3, LayoutHelper.createFrame(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.actionBar);
        this.container.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        ActionView actionView = new ActionView(context);
        this.actionView = actionView;
        this.container.addView(actionView, LayoutHelper.createFrame(-1, -2, 55));
        actionView.prepareBlur(view);
    }

    class AnonymousClass2 extends ViewPagerFixed {
        AnonymousClass2(Context context) {
            super(context);
        }

        @Override
        protected void swapViews() {
            super.swapViews();
            if (this.currentPosition != StarGiftSheet.this.hasNeighbour(false)) {
                final boolean z = this.currentPosition > StarGiftSheet.this.hasNeighbour(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$swapViews$0(z);
                    }
                });
            }
        }

        public void lambda$swapViews$0(boolean z) {
            TL_stars.SavedStarGift neighbourSavedGift = StarGiftSheet.this.getNeighbourSavedGift(z);
            if (neighbourSavedGift != null) {
                StarGiftSheet.this.firstSet = true;
                StarGiftSheet starGiftSheet = StarGiftSheet.this;
                starGiftSheet.set(neighbourSavedGift, starGiftSheet.giftsList);
            } else {
                TL_stars.TL_starGiftUnique neighbourSlugGift = StarGiftSheet.this.getNeighbourSlugGift(z);
                if (neighbourSlugGift != null) {
                    StarGiftSheet.this.firstSet = true;
                    StarGiftSheet starGiftSheet2 = StarGiftSheet.this;
                    starGiftSheet2.set(neighbourSlugGift.slug, neighbourSlugGift, starGiftSheet2.giftsList);
                }
            }
            StarGiftSheet.this.overrideNextIndex = -1;
            if (Bulletin.getVisibleBulletin() != null) {
                Bulletin.getVisibleBulletin().hide(false, 0L);
            }
        }

        @Override
        protected void setTranslationX(android.view.View r5, float r6) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.AnonymousClass2.setTranslationX(android.view.View, float):void");
        }

        @Override
        protected boolean canScroll(MotionEvent motionEvent) {
            return StarGiftSheet.this.currentPage == null || StarGiftSheet.this.currentPage.is(0);
        }
    }

    public void lambda$new$0(View view) {
        openCrafting(true);
    }

    public void lambda$new$1(View view) {
        if (view.getAlpha() < 1.0f) {
            return;
        }
        openCraftInfo();
    }

    public void lambda$new$2(View view) {
        if (this.button.isLoading()) {
            return;
        }
        this.checkbox.setChecked(!r3.isChecked(), true);
    }

    private class Adapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new BottomSheetLayouted.SpaceView(StarGiftSheet.this.getContext()));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int length = (StarGiftSheet.this.heights.length - 1) - i;
            ((BottomSheetLayouted.SpaceView) viewHolder.itemView).setHeight(StarGiftSheet.this.heights[length], length);
        }

        @Override
        public int getItemCount() {
            return StarGiftSheet.this.heights.length;
        }

        public void setHeights(int i, int i2) {
            if (StarGiftSheet.this.heights[0] == i && StarGiftSheet.this.heights[1] == i2) {
                return;
            }
            StarGiftSheet.this.heights[0] = i;
            StarGiftSheet.this.heights[1] = i2;
            notifyDataSetChanged();
        }
    }

    private int getListPosition() {
        int iIndexOf;
        StarsController.IGiftsList iGiftsList = this.giftsList;
        if (iGiftsList == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            iIndexOf = iGiftsList.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                iIndexOf = iGiftsList.indexOf(tL_starGiftUnique);
            }
            return -1;
        }
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        TL_stars.StarGift gift = getGift();
        for (int i = 0; i < this.giftsList.getLoadedCount(); i++) {
            Object obj = this.giftsList.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                if ((savedStarGift2 != null && eq(savedStarGift2, (TL_stars.SavedStarGift) obj)) || (gift != null && eq(gift, (TL_stars.SavedStarGift) obj))) {
                    return i;
                }
            } else if ((obj instanceof TL_stars.TL_starGiftUnique) && eq(this.slugStarGift, (TL_stars.TL_starGiftUnique) obj)) {
                return i;
            }
        }
        return -1;
    }

    public TL_stars.SavedStarGift getNeighbourSavedGift(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return null;
        }
        int i = (z ? 1 : -1) + listPosition;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition : i2 > listPosition)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public TL_stars.TL_starGiftUnique getNeighbourSlugGift(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return null;
        }
        int i = (z ? 1 : -1) + listPosition;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition : i2 > listPosition)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    public boolean hasNeighbour(boolean z) {
        return (getNeighbourSavedGift(z) == null && getNeighbourSlugGift(z) == null) ? false : true;
    }

    public void setupNeighbour(boolean z, boolean z2) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return;
        }
        int i = (z ? 1 : -1) + listPosition;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition : i2 > listPosition)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        TL_stars.SavedStarGift savedStarGift = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? 0 : this.giftsList.get(i);
        if (savedStarGift == 0) {
            return;
        }
        if ((z ? this.right : this.left) != null) {
            if (savedStarGift instanceof TL_stars.SavedStarGift) {
                if (eq((z ? this.right : this.left).savedStarGift, savedStarGift)) {
                    return;
                }
            }
            if (savedStarGift instanceof TL_stars.TL_starGiftUnique) {
                if (eq((z ? this.right : this.left).slugStarGift, (TL_stars.TL_starGiftUnique) savedStarGift)) {
                    return;
                }
            }
        }
        StarGiftSheet starGiftSheet = new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider, this.container.getRootView()) {
            @Override
            public int getBottomInset() {
                return StarGiftSheet.this.getBottomInset();
            }
        };
        if (savedStarGift instanceof TL_stars.SavedStarGift) {
            starGiftSheet.set((TL_stars.SavedStarGift) savedStarGift, this.giftsList);
        } else if (savedStarGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) savedStarGift;
            starGiftSheet.set(tL_starGiftUnique.slug, tL_starGiftUnique, this.giftsList);
        }
        AndroidUtilities.removeFromParent(starGiftSheet.containerView);
        if (z) {
            this.right = starGiftSheet;
        } else {
            this.left = starGiftSheet;
        }
    }

    private void updateViewPager() {
        this.viewPager.setPosition(hasNeighbour(false) ? 1 : 0);
        this.viewPager.rebuild(false);
        if (this.giftsList == null || hasNeighbour(true) || this.giftsList.getLoadedCount() >= this.giftsList.getTotalCount()) {
            return;
        }
        this.giftsList.load();
    }

    public boolean eq(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique == null || tL_starGiftUnique2 == null) {
            return false;
        }
        return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
    }

    public boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift != null && savedStarGift2 != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            TL_stars.StarGift starGift2 = savedStarGift2.gift;
            if (starGift == starGift2) {
                return true;
            }
            return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
        }
        return false;
    }

    public boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.InputSavedStarGift inputSavedStarGift) {
        TL_stars.StarGift starGift;
        if (savedStarGift == null) {
            return false;
        }
        return inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser ? savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id : inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat ? savedStarGift.saved_id == ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id : (inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) && (starGift = savedStarGift.gift) != null && TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug);
    }

    public boolean eq(TL_stars.StarGift starGift, TL_stars.SavedStarGift savedStarGift) {
        if (starGift == null || savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift2 = savedStarGift.gift;
        if (starGift == starGift2) {
            return true;
        }
        return (starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique) && starGift.id == starGift2.id;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        return adapter;
    }

    @Override
    protected CharSequence getTitle() {
        return this.title;
    }

    public static boolean isMine(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 5);
    }

    public static boolean isMineWithActions(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        return chat != null && chat.creator;
    }

    private void openCrafting(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.openCrafting(boolean):void");
    }

    public void lambda$openCrafting$5(final ArrayList arrayList, final Utilities.Callback2 callback2, final Runnable runnable) {
        ResaleGiftsFragment.SelectGiftSheet.State state = this.giftsToCraft;
        if (state != null) {
            state.detach();
            this.giftsToCraft = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) it.next();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(craftstargift, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$openCrafting$4(callback2, arrayList, runnable, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$openCrafting$4(Utilities.Callback2 callback2, final ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (updates == null) {
            if (tL_error != null) {
                if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                    new AlertDialog.Builder(getContext(), new DarkThemeResourceProvider()).setTitle(LocaleController.getString(R.string.GiftCraftUnavailableTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                } else {
                    String str = tL_error.text;
                    if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                        new AlertDialog.Builder(getContext(), new DarkThemeResourceProvider()).setTitle(LocaleController.getString(R.string.GiftCraftUnavailableTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + Long.parseLong(tL_error.text.substring(25)), true)))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    } else {
                        getBulletinFactory().showForError(tL_error);
                    }
                }
                runnable.run();
                return;
            }
            return;
        }
        Iterator it = MessagesController.findUpdates(updates, TLRPC.TL_updateNewMessage.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                messageObject = null;
                break;
            }
            TLRPC.TL_updateNewMessage tL_updateNewMessage = (TLRPC.TL_updateNewMessage) it.next();
            TLRPC.Message message = tL_updateNewMessage.message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                messageObject = new MessageObject(this.currentAccount, tL_updateNewMessage.message, false, false);
                break;
            }
        }
        MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        if (messageObject != null) {
            final TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
            callback2.run(starGift, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openCrafting$3(messageObject, arrayList, starGift);
                }
            });
            return;
        }
        callback2.run(null, null);
        StarsController.getInstance(this.currentAccount).invalidateBalance();
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(UserConfig.getInstance(this.currentAccount).getClientUserId(), false);
        if (profileGiftsList != null) {
            profileGiftsList.processCrafting(arrayList, null);
        }
    }

    public void lambda$openCrafting$3(MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        this.nextButtonCrafting = true;
        set(messageObject);
        switchPage(0, true);
        FireworksOverlay fireworksOverlay = this.fireworksOverlay;
        if (fireworksOverlay != null) {
            fireworksOverlay.start(true);
        }
        StarsController.getInstance(this.currentAccount).invalidateBalance();
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(UserConfig.getInstance(this.currentAccount).getClientUserId(), false);
        if (profileGiftsList != null) {
            profileGiftsList.processCrafting(arrayList, starGift);
        }
    }

    public void lambda$openCrafting$7(TL_stars.TL_starGiftUnique tL_starGiftUnique, final Utilities.Callback callback) {
        if (this.giftsToCraft == null) {
            ResaleGiftsFragment.SelectGiftSheet.State state = new ResaleGiftsFragment.SelectGiftSheet.State(this.currentAccount, tL_starGiftUnique.gift_id);
            this.giftsToCraft = state;
            state.attach();
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.topView.craftTopView.gifts.length; i++) {
            CraftTopView.SelectGiftView selectGiftView = this.topView.craftTopView.gifts[i];
            if (selectGiftView.getGift() != null) {
                hashSet.add(Long.valueOf(selectGiftView.getGift().id));
            }
        }
        new ResaleGiftsFragment.SelectGiftSheet(getContext(), tL_starGiftUnique.title, this.giftsToCraft).without(hashSet).setActionText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0]))).setOnSelect(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                callback.run((TL_stars.StarGift) obj);
            }
        }).show();
    }

    private void openCraftInfo() {
        this.button.setText(LocaleController.getString(R.string.GiftCraftInfoButton), true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$openCraftInfo$9(view);
            }
        });
        this.topView.setText(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null, null);
        switchPage(3, true);
    }

    public void lambda$openCraftInfo$9(View view) {
        openCrafting(false);
    }

    public void onMenuPressed(View view) {
        final String link = getLink();
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        boolean z = (getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || !(this.giftsList instanceof StarsController.GiftsList) || this.savedStarGift == null || getInputStarGift() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        itemOptionsMakeOptions.addIf(z, (savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onMenuPressed$10();
            }
        }).addIf(canCraft(), R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onMenuPressed$11();
            }
        }).addIf((getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || getUniqueGift().resell_amount == null) ? false : true, R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onMenuPressed$12();
            }
        }).addIf(link != null, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onMenuPressed$13(link);
            }
        }).addIf(link != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onMenuPressed$14();
            }
        }).addIf(uniqueGift != null && uniqueGift.offer_min_stars > 0, R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new Runnable() {
            @Override
            public final void run() {
                this.f$0.showGiftOfferSheet();
            }
        }).addIf(canSetAsTheme(), R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new Runnable() {
            @Override
            public final void run() {
                this.f$0.openSetAsTheme();
            }
        }).addIf(canTransfer(), R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
            @Override
            public final void run() {
                this.f$0.openTransfer();
            }
        }).addIf(this.savedStarGift == null && getDialogId() != 0, R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new Runnable() {
            @Override
            public final void run() {
                this.f$0.openInProfile();
            }
        }).setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).translate(0.0f, -AndroidUtilities.dp(2.0f)).show();
    }

    public void lambda$onMenuPressed$10() {
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false);
            if (profileGiftCollectionsList != null) {
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                profileGiftCollectionsList.updateGiftsUnsaved(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = getInputStarGift();
            savestargift.unsave = this.savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = this.savedStarGift;
        boolean z = savedStarGift3.pinned_to_top;
        if (((StarsController.GiftsList) this.giftsList).togglePinned(savedStarGift3, !z, false)) {
            new ProfileGiftsContainer.UnpinSheet(getContext(), this.dialogId, this.savedStarGift, this.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return this.f$0.getBulletinFactory();
                }
            }).show();
        } else if (!z) {
            getBulletinFactory().createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)).show();
        } else {
            getBulletinFactory().createSimpleBulletin(R.raw.ic_unpin, LocaleController.getString(R.string.Gift2Unpinned)).show();
        }
    }

    public void lambda$onMenuPressed$11() {
        openCrafting(true);
    }

    public void lambda$onMenuPressed$12() {
        onUpdatePriceClick(null);
    }

    public void lambda$onMenuPressed$13(String str) {
        AndroidUtilities.addToClipboard(str);
        getBulletinFactory().createCopyLinkBulletin(false).ignoreDetach().show();
    }

    public void lambda$onMenuPressed$14() {
        onSharePressed(null);
    }

    public void showGiftOfferSheet() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        new GiftOfferSheet(getContext(), this.currentAccount, DialogObject.getPeerDialogId(uniqueGift.owner_id), uniqueGift, this.resourcesProvider, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showGiftOfferSheet$15();
            }
        }).show();
    }

    public void lambda$showGiftOfferSheet$15() {
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    private boolean canSetAsTheme() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null || !uniqueGift.theme_available) {
            return false;
        }
        long peerDialogId = DialogObject.getPeerDialogId(uniqueGift.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(uniqueGift.host_id);
        return (peerDialogId > 0 && isMineWithActions(this.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && isMineWithActions(this.currentAccount, peerDialogId2));
    }

    public void openSetAsTheme() {
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (safeLastFragment == null || uniqueGift == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putInt("dialogsType", 4);
        final DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
            @Override
            public boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
            }

            @Override
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
                return this.f$0.lambda$openSetAsTheme$17(uniqueGift, dialogsActivity, dialogsActivity2, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            }

            @Override
            public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        safeLastFragment.presentFragment(dialogsActivity);
    }

    public boolean lambda$openSetAsTheme$17(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(this.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j) {
            AlertsCreator.showGiftThemeApplyConfirm(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openSetAsTheme$16(j, tL_starGiftUnique, dialogsActivity);
                }
            });
            return true;
        }
        ChatThemeController.getInstance(this.currentAccount).setDialogTheme(j, ThemeKey.ofGiftSlug(tL_starGiftUnique.slug));
        dialogsActivity.presentFragment(ChatActivity.of(j), true);
        return true;
    }

    public void lambda$openSetAsTheme$16(long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, DialogsActivity dialogsActivity) {
        ChatThemeController.getInstance(this.currentAccount).setDialogTheme(j, ThemeKey.ofGiftSlug(tL_starGiftUnique.slug));
        dialogsActivity.presentFragment(ChatActivity.of(j), true);
    }

    public void onWearPressed(View view) {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (isWorn(this.currentAccount, getUniqueGift()) || this.shownWearInfo)) {
            toggleWear();
            return;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        TLRPC.Peer peer = uniqueGift.owner_id;
        if (peer == null) {
            peer = uniqueGift.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, uniqueGift.title + " #" + LocaleController.formatNumber(uniqueGift.num, ',')));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.button.setText(spannableStringBuilder, true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onWearPressed$18(view2);
            }
        });
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, true);
    }

    public void lambda$onWearPressed$18(View view) {
        this.shownWearInfo = true;
        toggleWear();
    }

    public StarGiftSheet setupWearPage() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return this;
        }
        TLRPC.Peer peer = uniqueGift.owner_id;
        if (peer == null) {
            peer = uniqueGift.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, uniqueGift.title + " #" + LocaleController.formatNumber(uniqueGift.num, ',')));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.button.setText(spannableStringBuilder, true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$setupWearPage$19(view);
            }
        });
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, false);
        this.onlyWearInfo = true;
        return this;
    }

    public void lambda$setupWearPage$19(View view) {
        this.shownWearInfo = true;
        toggleWear();
    }

    public static boolean isWorn(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
            if (user == null) {
                return false;
            }
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
        if (chat == null) {
            return false;
        }
        TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
        return (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id;
    }

    public void toggleWear() {
        toggleWear(false);
    }

    public void toggleWear(boolean z) {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean zIsWorn = isWorn(this.currentAccount, getUniqueGift());
        final boolean z2 = !zIsWorn;
        if (isWorn(this.currentAccount, getUniqueGift())) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long dialogId = getDialogId();
            if (dialogId >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    getBulletinFactory().createSimpleBulletinDetail(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$toggleWear$20();
                        }
                    })).ignoreDetach().show();
                    return;
                }
            } else if (!z) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                this.button.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(dialogId, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        this.f$0.lambda$toggleWear$23(messagesController, dialogId, (TL_stories.TL_premium_boostsStatus) obj);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = uniqueGift.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId(), tL_inputEmojiStatusCollectible, uniqueGift);
        }
        this.topView.buttons[1].set(!zIsWorn ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!zIsWorn ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.onlyWearInfo) {
            lambda$new$0();
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleWear$24(z2);
            }
        };
        if (this.currentPage.is(0)) {
            runnable.run();
        } else {
            switchPage(0, true, runnable);
        }
        this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
        this.button.setSubText(null, !this.firstSet);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$toggleWear$25(view);
            }
        });
    }

    public void lambda$toggleWear$20() {
        new PremiumFeatureBottomSheet(getDummyFragment(), 12, false).show();
    }

    public void lambda$toggleWear$23(final MessagesController messagesController, final long j, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus == null || tL_premium_boostsStatus.level >= messagesController.channelEmojiStatusLevelMin) {
            this.button.setLoading(false);
            toggleWear(true);
        } else {
            messagesController.getBoostsController().userCanBoostChannel(j, tL_premium_boostsStatus, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$toggleWear$22(tL_premium_boostsStatus, j, messagesController, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
        }
    }

    public void lambda$toggleWear$22(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.button.setLoading(false);
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(getDummyFragment(), getContext(), 26, this.currentAccount, this.resourcesProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        final TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleWear$21(chat);
                }
            });
        }
        limitReachedBottomSheet.show();
    }

    public void lambda$toggleWear$21(TLRPC.Chat chat) {
        presentFragment(StatisticActivity.create(chat));
    }

    public void lambda$toggleWear$24(boolean z) {
        showHint(AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, getGiftName())), this.ownerTextView, true);
    }

    public void lambda$toggleWear$25(View view) {
        lambda$openCrafting$8();
    }

    private BaseFragment getDummyFragment() {
        return new BaseFragment() {
            @Override
            public int getCurrentAccount() {
                return this.currentAccount;
            }

            @Override
            public Context getContext() {
                return StarGiftSheet.this.getContext();
            }

            @Override
            public Activity getParentActivity() {
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            }

            @Override
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }
        };
    }

    public void onSharePressed(View view) {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null && shareAlert.isShown()) {
            this.shareAlert.lambda$new$0();
        }
        String link = getLink();
        ChatActivity chatActivity = null;
        ArrayList arrayList = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        ShareAlert shareAlert2 = new ShareAlert(getContext(), chatActivity, arrayList, link, str, z, link, str2, z2, z3, true, null, this.resourcesProvider) {
            {
                this.includeStoryFromMessage = true;
            }

            @Override
            protected void onShareStory(View view2) {
                StarGiftSheet.this.repostStory(view2);
            }

            @Override
            protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
                if (z4) {
                    super.onSend(longSparseArray, i, tL_forumTopic, z4);
                    BulletinFactory bulletinFactory = getBulletinFactory();
                    if (bulletinFactory != null) {
                        if (longSparseArray.size() == 1) {
                            long jKeyAt = longSparseArray.keyAt(0);
                            if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                bulletinFactory.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])), 5000).hideAfterBottomSheet(false).ignoreDetach().show();
                            } else if (jKeyAt < 0) {
                                bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)), 5000).hideAfterBottomSheet(false).ignoreDetach().show();
                            } else {
                                bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)), 5000).hideAfterBottomSheet(false).ignoreDetach().show();
                            }
                        } else {
                            bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size())))).hideAfterBottomSheet(false).ignoreDetach().show();
                        }
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        };
        this.shareAlert = shareAlert2;
        shareAlert2.setDelegate(new ShareAlert.ShareAlertDelegate() {
            @Override
            public void didShare() {
                ShareAlert.ShareAlertDelegate.CC.$default$didShare(this);
            }

            @Override
            public boolean didCopy() {
                StarGiftSheet.this.getBulletinFactory().createCopyLinkBulletin(false).ignoreDetach().show();
                return true;
            }
        });
        this.shareAlert.show();
    }

    public void onUpdatePriceClick(View view) {
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, uniqueGift, null, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$onUpdatePriceClick$29(uniqueGift, (AmountUtils$Amount) obj, (Runnable) obj2);
            }
        }, this.resourcesProvider);
    }

    public void lambda$onUpdatePriceClick$29(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$onUpdatePriceClick$28(tL_starGiftUnique, amountUtils$Amount, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$onUpdatePriceClick$28(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onUpdatePriceClick$26(tL_starGiftUnique, amountUtils$Amount, runnable);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onUpdatePriceClick$27(tL_error, runnable);
                }
            });
        }
    }

    public void lambda$onUpdatePriceClick$26(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        tL_starGiftUnique.flags |= 16;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        tL_starGiftUnique.resale_ton_only = amountUtils$Currency == amountUtils$Currency2;
        ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
        tL_starGiftUnique.resell_amount = arrayList;
        arrayList.add(amountUtils$Amount.convertTo(AmountUtils$Currency.STARS).toTl());
        tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
        this.topView.setResellPrice(amountUtils$Amount);
        Runnable runnable2 = this.onGiftUpdatedListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$onUpdatePriceClick$27(TLRPC.TL_error tL_error, Runnable runnable) {
        getBulletinFactory().showForError(tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onResellPressed(View view) {
        if (view.getAlpha() < 0.99f) {
            cantWithBlockchainGiftAlert(1);
            return;
        }
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (uniqueGift.resell_amount != null) {
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.formatString(R.string.Gift2UnlistTitle, getGiftName())).setMessage(LocaleController.getString(R.string.Gift2UnlistText)).setPositiveButton(LocaleController.getString(R.string.Gift2ActionUnlist), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$onResellPressed$34(uniqueGift, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    StarGiftSheet.lambda$onResellPressed$35(alertDialog, i);
                }
            }).show();
        } else if (canResellAt() > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            showTimeoutAlertAt(getContext(), true, canResellAt());
        } else {
            StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$onResellPressed$40(uniqueGift, (AmountUtils$Amount) obj, (Runnable) obj2);
                }
            }, this.resourcesProvider);
        }
    }

    public void lambda$onResellPressed$34(final TL_stars.TL_starGiftUnique tL_starGiftUnique, AlertDialog alertDialog, int i) {
        final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1);
        progressMakeButtonLoading.init();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws NumberFormatException {
                this.f$0.lambda$onResellPressed$33(progressMakeButtonLoading, tL_starGiftUnique, tLObject, tL_error);
            }
        });
    }

    public void lambda$onResellPressed$33(final Browser.Progress progress, final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, final TLRPC.TL_error tL_error) throws NumberFormatException {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResellPressed$30(progress, tL_starGiftUnique);
                }
            });
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            final long j = Long.parseLong(tL_error.text.substring(26));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResellPressed$31(progress, j);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResellPressed$32(progress, tL_error);
                }
            });
        }
    }

    public void lambda$onResellPressed$30(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        progress.end();
        tL_starGiftUnique.flags &= -17;
        tL_starGiftUnique.resale_ton_only = false;
        tL_starGiftUnique.resell_amount = null;
        this.topView.setResellPrice(AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.STARS));
        Runnable runnable = this.onGiftUpdatedListener;
        if (runnable != null) {
            runnable.run();
        }
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.Gift2ResaleDisable, getGiftName())).show();
    }

    public void lambda$onResellPressed$31(Browser.Progress progress, long j) {
        progress.end();
        showTimeoutAlert(getContext(), true, (int) j);
    }

    public void lambda$onResellPressed$32(Browser.Progress progress, TLRPC.TL_error tL_error) {
        progress.end();
        getBulletinFactory().showForError(tL_error);
    }

    public void lambda$onResellPressed$40(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws NumberFormatException {
                this.f$0.lambda$onResellPressed$39(tL_starGiftUnique, amountUtils$Amount, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$onResellPressed$39(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) throws NumberFormatException {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResellPressed$36(tL_starGiftUnique, amountUtils$Amount, runnable);
                }
            });
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            final long j = Long.parseLong(tL_error.text.substring(26));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResellPressed$37(j, runnable);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onResellPressed$38(tL_error, runnable);
                }
            });
        }
    }

    public void lambda$onResellPressed$36(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        tL_starGiftUnique.flags |= 16;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        tL_starGiftUnique.resale_ton_only = amountUtils$Currency == amountUtils$Currency2;
        ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
        tL_starGiftUnique.resell_amount = arrayList;
        arrayList.add(amountUtils$Amount.convertTo(AmountUtils$Currency.STARS).toTl());
        tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
        this.topView.setResellPrice(amountUtils$Amount);
        Runnable runnable2 = this.onGiftUpdatedListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (runnable != null) {
            runnable.run();
        }
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.Gift2ResaleEnable, getGiftName())).show();
    }

    public void lambda$onResellPressed$37(long j, Runnable runnable) {
        showTimeoutAlert(getContext(), true, (int) j);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$onResellPressed$38(TLRPC.TL_error tL_error, Runnable runnable) {
        getBulletinFactory().showForError(tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void repostStory(final View view) {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null) {
            return;
        }
        StoryRecorder.SourceView sourceViewFromShareCell = view instanceof ShareDialogCell ? StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(getGift() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) getGift();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final StoryRecorder storyRecorder = StoryRecorder.getInstance(launchActivity, this.currentAccount);
        storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f$0.lambda$repostStory$42(storyRecorder, view, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
            }
        });
        storyRecorder.openRepost(sourceViewFromShareCell, StoryEntry.repostMessage(arrayList));
    }

    public void lambda$repostStory$42(StoryRecorder storyRecorder, View view, Long l, Runnable runnable, Boolean bool, final Long l2) {
        boolean zBooleanValue = bool.booleanValue();
        StoryRecorder.SourceView sourceViewFromShareCell = null;
        if (zBooleanValue) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$repostStory$41(l2);
                }
            });
            storyRecorder.replaceSourceView(null);
            ShareAlert shareAlert = this.shareAlert;
            if (shareAlert != null) {
                shareAlert.lambda$new$0();
                this.shareAlert = null;
            }
        } else {
            if ((view instanceof ShareDialogCell) && view.isAttachedToWindow()) {
                sourceViewFromShareCell = StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view);
            }
            storyRecorder.replaceSourceView(sourceViewFromShareCell);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$repostStory$41(Long l) {
        String str;
        String string;
        TLRPC.Chat chat;
        if (l.longValue() < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-l.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        BulletinFactory bulletinFactory = getBulletinFactory();
        int i = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            string = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            string = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        bulletinFactory.createSimpleBulletin(i, AndroidUtilities.replaceTags(string)).ignoreDetach().show();
    }

    private void showTimeoutAlertAt(Context context, boolean z, int i) {
        showTimeoutAlert(context, z, i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
    }

    private void showTimeoutAlert(Context context, boolean z, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(64.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(64, 64, 49, 0, 6, 0, 0));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.timer_3, 42, 42);
        frameLayout.addView(rLottieImageView, LayoutHelper.createLinear(64, 64, 17));
        rLottieImageView.playAnimation();
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(z ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 48, 24, 14, 24, 0));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText8, false);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.formatString(z ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i))));
        linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 48, 24, 6, 24, 6));
        new AlertDialog.Builder(context, this.resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    @Override
    protected int getActionBarProgressHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    private class ContainerView extends FrameLayout {
        private final Paint backgroundPaint;
        private float dimAlpha;
        private final Path path;
        private final RectF rect;

        public ContainerView(Context context) {
            super(context);
            this.rect = new RectF();
            this.backgroundPaint = new Paint(1);
            this.path = new Path();
            this.dimAlpha = 0.0f;
            setWillNotDraw(false);
            setClipChildren(false);
            setClipToPadding(false);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < top() && ((BottomSheet) StarGiftSheet.this).containerView.isAttachedToWindow()) {
                StarGiftSheet.this.lambda$new$0();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            StarGiftSheet.this.preDrawInternal(canvas, this);
            canvas.save();
            float pVar = top();
            float fDp = AndroidUtilities.dp(12.0f);
            this.rect.set(((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft, pVar, getWidth() - ((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft, getHeight() + fDp);
            this.backgroundPaint.setColor(StarGiftSheet.this.getThemedColor(Theme.key_dialogBackground));
            this.path.rewind();
            this.path.addRoundRect(this.rect, fDp, fDp, Path.Direction.CW);
            canvas.drawPath(this.path, this.backgroundPaint);
            super.dispatchDraw(canvas);
            float f = this.dimAlpha;
            if (f != 0.0f) {
                canvas.drawColor(Theme.multAlpha(-16777216, f));
            }
            updateTranslations();
            canvas.restore();
            drawView(canvas, ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar);
            StarGiftSheet.this.postDrawInternal(canvas, this);
        }

        private void drawView(Canvas canvas, View view) {
            if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
                return;
            }
            if (view.getAlpha() < 1.0f) {
                canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight(), (int) (((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar.getAlpha() * 255.0f), 31);
            } else {
                canvas.save();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar.getMeasuredHeight());
            }
            canvas.translate(view.getX(), view.getY());
            view.draw(canvas);
            canvas.restore();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar) {
                return false;
            }
            if (view != StarGiftSheet.this.actionView) {
                canvas.save();
                canvas.clipPath(this.path);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (StarGiftSheet.this.adapter != null) {
                StarGiftSheet.this.adapter.setHeights(StarGiftSheet.this.topView.getFinalHeight(), StarGiftSheet.this.getBottomHeight() + ((StarGiftSheet.this.currentPage.to(1) && StarGiftSheet.this.underButtonContainer.getVisibility() == 0) ? StarGiftSheet.this.underButtonContainer.getMeasuredHeight() : 0));
            }
            StarGiftSheet.this.onSwitchedPage();
        }

        public void updateTranslations() {
            float pVar = top();
            StarGiftSheet.this.actionView.setTranslationY(pVar - StarGiftSheet.this.actionView.getHeight());
            float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(pVar - StarGiftSheet.this.actionView.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
            StarGiftSheet.this.actionView.setAlpha(StarGiftSheet.this.currentPage.at(0) * fClamp01);
            StarGiftSheet.this.actionView.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, fClamp01));
            StarGiftSheet.this.actionView.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, fClamp01));
            StarGiftSheet.this.topView.setTranslationY(pVar);
            StarGiftSheet.this.infoLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.upgradeLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.wearLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.craftLayout.setTranslationY(pVar + StarGiftSheet.this.topView.getRealHeight());
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
            AndroidUtilities.updateViewVisibilityAnimated(StarGiftSheet.this.buttonShadow, ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.canScrollVertically(1));
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
        }

        public float height() {
            return StarGiftSheet.this.topView.getRealHeight() + 0.0f + (StarGiftSheet.this.currentPage.at(0) * StarGiftSheet.this.infoLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(1) * StarGiftSheet.this.upgradeLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(2) * StarGiftSheet.this.wearLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(3) * StarGiftSheet.this.craftLayout.getMeasuredHeight());
        }

        public float top() {
            float fMax = Math.max(0.0f, getHeight() - height());
            int childCount = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildAt(childCount);
                int childAdapterPosition = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    if (childAdapterPosition == 2) {
                        fMax = childAt.getTop() + childAt.getTranslationY() + childAt.getHeight();
                        break;
                    }
                    if (childAdapterPosition == 1) {
                        fMax = childAt.getY();
                        break;
                    }
                    if (childAdapterPosition == 0) {
                        fMax = childAt.getY() - StarGiftSheet.this.topView.getRealHeight();
                        break;
                    }
                }
                childCount--;
            }
            float bottomInset = fMax + (StarGiftSheet.this.getBottomInset() * StarGiftSheet.this.currentPage.at(4));
            return (StarGiftSheet.this.lastTop == null || StarGiftSheet.this.currentPage == null || StarGiftSheet.this.currentPage.progress >= 1.0f) ? bottomInset : AndroidUtilities.lerp(StarGiftSheet.this.lastTop.floatValue(), bottomInset, StarGiftSheet.this.currentPage.progress);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int bottomInset = StarGiftSheet.this.getBottomInset();
            int measuredHeight = 0;
            setPadding(0, 0, 0, bottomInset);
            StarGiftSheet.this.topView.craftTopView.setPadding(0, 0, 0, bottomInset);
            int size = View.MeasureSpec.getSize(i2);
            ((BottomSheetWithRecyclerListView) StarGiftSheet.this).contentHeight = size;
            int size2 = View.MeasureSpec.getSize(i);
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt instanceof HintView2)) {
                    if (childAt == ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView) {
                        childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size - bottomInset, 1073741824));
                    } else {
                        childAt.measure(i, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
                    }
                } else {
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                }
            }
            setMeasuredDimension(size2, size);
            if (StarGiftSheet.this.adapter != null) {
                Adapter adapter = StarGiftSheet.this.adapter;
                int finalHeight = StarGiftSheet.this.topView.getFinalHeight();
                int bottomHeight = StarGiftSheet.this.getBottomHeight();
                if (StarGiftSheet.this.currentPage.to(1) && StarGiftSheet.this.underButtonContainer.getVisibility() == 0) {
                    measuredHeight = StarGiftSheet.this.underButtonContainer.getMeasuredHeight();
                }
                adapter.setHeights(finalHeight, bottomHeight + measuredHeight);
            }
        }
    }

    private static class StickersRollView extends View {
        private Roller.Sticker a;
        private boolean aIsFinish;
        private float aT;
        private Roller.Sticker b;
        private boolean bIsFinish;
        private float bT;
        private Roller.Background bgA;
        private boolean bgAIsFinish;
        private float bgAT;
        private Roller.Background bgB;
        private boolean bgBIsFinish;
        private float bgBT;
        private Roller.Background bgC;
        private boolean bgCIsFinish;
        private float bgCT;
        private Roller.Sticker c;
        private boolean cIsFinish;
        private float cT;
        private final Camera camera;
        private final GradientClip clip;
        private int lastBlurRx;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;

        public StickersRollView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.lastBlurRx = 0;
            this.camera = new Camera();
            this.clip = new GradientClip();
            this.rect = new RectF();
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            drawSticker(canvas, this.a, this.aT, this.aIsFinish);
            drawSticker(canvas, this.b, this.bT, this.bIsFinish);
            drawSticker(canvas, this.c, this.cT, this.cIsFinish);
        }

        public void resetDrawing() {
            boolean z = (this.a == null && this.b == null && this.c == null && this.bgA == null && this.bgB == null && this.bgC == null) ? false : true;
            this.c = null;
            this.b = null;
            this.a = null;
            this.cT = 0.0f;
            this.bT = 0.0f;
            this.aT = 0.0f;
            this.cIsFinish = false;
            this.bIsFinish = false;
            this.aIsFinish = false;
            this.bgC = null;
            this.bgB = null;
            this.bgA = null;
            this.bgCT = 0.0f;
            this.bgBT = 0.0f;
            this.bgAT = 0.0f;
            this.bgCIsFinish = false;
            this.bgBIsFinish = false;
            this.bgAIsFinish = false;
            if (z) {
                invalidate();
            }
        }

        public void setDrawing(Roller.Sticker sticker, float f, boolean z, Roller.Sticker sticker2, float f2, boolean z2, Roller.Sticker sticker3, float f3, boolean z3, Roller.Background background, float f4, boolean z4, Roller.Background background2, float f5, boolean z5, Roller.Background background3, float f6, boolean z6) {
            this.a = sticker;
            this.b = sticker2;
            this.c = sticker3;
            this.aT = f;
            this.bT = f2;
            this.cT = f3;
            this.aIsFinish = z;
            this.bIsFinish = z2;
            this.cIsFinish = z3;
            this.bgA = background;
            this.bgB = background2;
            this.bgC = background3;
            this.bgAT = f4;
            this.bgBT = f5;
            this.bgCT = f6;
            this.bgAIsFinish = z4;
            this.bgBIsFinish = z5;
            this.bgCIsFinish = z6;
            invalidate();
        }

        public boolean hasBackgrounds() {
            return (this.bgA == null && this.bgB == null && this.bgC == null) ? false : true;
        }

        private void drawSticker(Canvas canvas, Roller.Sticker sticker, float f, boolean z) {
            if (sticker == null) {
                return;
            }
            float fMax = z ? Math.max(0.5f, f) : f;
            float imageX = sticker.imageReceiver.getImageX();
            float imageY = sticker.imageReceiver.getImageY();
            float imageWidth = sticker.imageReceiver.getImageWidth();
            float imageHeight = sticker.imageReceiver.getImageHeight();
            float alpha = sticker.imageReceiver.getAlpha();
            float f2 = (fMax - 0.5f) / 1.5f;
            float fClamp01 = Utilities.clamp01(1.0f - Math.abs(f2));
            float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f2);
            float fDp = AndroidUtilities.dp(80.0f);
            float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, fClamp01);
            float fDp2 = AndroidUtilities.dp(160.0f);
            canvas.save();
            float f3 = ((fDp2 / 2.0f) * f2) + width;
            canvas.translate(f3, fDp);
            this.camera.save();
            this.camera.rotateY(f2 * (-30.0f));
            this.camera.applyToCanvas(canvas);
            this.camera.restore();
            canvas.translate(-f3, -fDp);
            float f4 = fDp2 * fLerp;
            float f5 = f4 / 2.0f;
            sticker.imageReceiver.setImageCoords(width - f5, fDp - f5, f4, f4);
            sticker.imageReceiver.setAlpha(fClamp01);
            sticker.imageReceiver.draw(canvas);
            sticker.imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
            sticker.imageReceiver.setAlpha(alpha);
            canvas.restore();
        }

        private void drawBackground(Canvas canvas, Roller.Background background, float f, float f2, float f3, int[] iArr, int[] iArr2, int[] iArr3) {
            if (background == null || background.backgroundPaint == null) {
                return;
            }
            float f4 = (f - 0.5f) / 1.5f;
            float fClamp01 = Utilities.clamp01(1.0f - Math.abs(f4));
            float fMax = Math.max(0.8f * f2, AndroidUtilities.dp(180.0f));
            float f5 = (f2 / 2.0f) - ((f4 * fMax) * 1.8f);
            float fMin = Math.min(AndroidUtilities.dp(176.0f), f3) / 2.0f;
            float f6 = f5 - fMax;
            float f7 = f5 + fMax;
            canvas.saveLayerAlpha(f6, 0.0f, f7, f3, 255, 31);
            background.backgroundMatrix.reset();
            background.backgroundMatrix.postTranslate(f5, fMin);
            background.backgroundGradient.setLocalMatrix(background.backgroundMatrix);
            background.backgroundPaint.setAlpha((int) (255.0f * fClamp01));
            canvas.drawRect(f6, 0.0f, f7, f3, background.backgroundPaint);
            canvas.save();
            float fDp = AndroidUtilities.dp(90.0f);
            this.rect.set(f6, 0.0f, f6 + fDp, f3);
            this.clip.draw(canvas, this.rect, 0, 1.0f);
            this.rect.set(f7 - fDp, 0.0f, f7, f3);
            this.clip.draw(canvas, this.rect, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i = 0; i < iArr.length; i++) {
                float width = i * (getWidth() / (iArr.length - 1));
                iArr[i] = Theme.blendOver(iArr[i], Theme.multAlpha(background.textColor, ((width < f6 || width > f7) ? 0.0f : Math.min(Utilities.clamp01((width - f6) / fMax), Utilities.clamp01(1.0f - ((width - (f7 - fMax)) / fMax)))) * fClamp01));
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                float width2 = i2 * (getWidth() / (iArr2.length - 1));
                iArr2[i2] = Theme.blendOver(iArr2[i2], Theme.multAlpha(background.backgroundColor, ((width2 < f6 || width2 > f7) ? 0.0f : Math.min(Utilities.clamp01((width2 - f6) / fMax), Utilities.clamp01(1.0f - ((width2 - (f7 - fMax)) / fMax)))) * fClamp01));
            }
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                float width3 = i3 * (getWidth() / (iArr2.length - 1));
                iArr3[i3] = Theme.blendOver(iArr3[i3], Theme.multAlpha(background.patternColor, ((width3 < f6 || width3 > f7) ? 0.0f : Math.min(Utilities.clamp01((width3 - f6) / fMax), Utilities.clamp01(1.0f - ((width3 - (f7 - fMax)) / fMax)))) * fClamp01));
            }
        }

        public void drawBackgrounds(Canvas canvas, float f, float f2, int[] iArr, int[] iArr2, int[] iArr3) {
            drawBackground(canvas, this.bgA, this.bgAT, f, f2, iArr, iArr2, iArr3);
            drawBackground(canvas, this.bgB, this.bgBT, f, f2, iArr, iArr2, iArr3);
            drawBackground(canvas, this.bgC, this.bgCT, f, f2, iArr, iArr2, iArr3);
        }
    }

    public static class TopView extends FrameLayout {
        private boolean attached;
        private BackupImageView avatarView;
        protected final TL_stars.starGiftAttributeBackdrop[] backdrop;
        private BagRandomizer backdrops;
        protected final int[] backgroundColors;
        private final RadialGradient[] backgroundGradient;
        private final Matrix[] backgroundMatrix;
        private final Paint[] backgroundPaint;
        public final Button[] buttons;
        private final LinearLayout buttonsLayout;
        private final Runnable checkToRotateRunnable;
        private final ImageView closeView;
        private final TextView collectionReleasedView;
        private int collectionReleasedViewColor;
        private CraftTopView craftTopView;
        private final ImageView craftView;
        private int currentImageIndex;
        private PageTransition currentPage;
        private boolean hasLink;
        private boolean hasResellPrice;
        private boolean hasRibbon;
        public final FrameLayout imageLayout;
        private final BackupImageView[] imageView;
        private final TL_stars.starGiftAttributeModel[] imageViewAttributes;
        private final StickersRollView imagesRollView;
        private final LinearLayout[] layout;
        private final FrameLayout.LayoutParams[] layoutLayoutParams;
        private BagRandomizer models;
        private View.OnClickListener onResellClick;
        private View.OnClickListener onShareClick;
        private View.OnClickListener onUpdatePriceClick;
        public final ImageView optionsView;
        private StarsReactionsSheet.Particles particles;
        private final RectF particlesBounds;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] pattern;
        private final TL_stars.starGiftAttributePattern[] patternAttribute;
        private final int[] patternColors;
        private BagRandomizer patterns;
        private RadialGradient profileBackgroundGradient;
        private final Matrix profileBackgroundMatrix;
        private Paint profileBackgroundPaint;
        private final LinkSpanDrawable.LinksTextView releasedView;
        private final TextView resellPriceView;
        private boolean resellPriceViewInProgress;
        private final Theme.ResourcesProvider resourcesProvider;
        private final GiftSheet.Ribbon ribbon;
        private ValueAnimator rotationAnimator;
        private ArrayList sampleAttributes;
        private final FrameLayout subtitleContainer;
        private final LinkSpanDrawable.LinksTextView[] subtitleView;
        private final LinearLayout.LayoutParams[] subtitleViewLayoutParams;
        private ValueAnimator switchAnimator;
        private float switchScale;
        private final int[] textColors;
        private final LinkSpanDrawable.LinksTextView[] titleView;
        private float toggleBackdrop;
        private int toggled;
        private FrameLayout userLayout;
        private float wearImageScale;
        private float wearImageTx;
        private float wearImageTy;
        private TLObject wearPreviewObject;

        protected void updateButtonsBackgrounds(int i) {
        }

        public static class Button extends FrameLayout {
            public ImageView imageView;
            public TextView textView;

            public Button(Context context) {
                super(context);
                ImageView imageView = new ImageView(context);
                this.imageView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTypeface(AndroidUtilities.bold());
                this.textView.setTextSize(1, 12.0f);
                this.textView.setTextColor(-1);
                this.textView.setGravity(17);
                addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            }

            public void set(int i, CharSequence charSequence, boolean z) {
                if (z) {
                    AndroidUtilities.updateImageViewImageAnimated(this.imageView, i);
                } else {
                    this.imageView.setImageResource(i);
                }
                this.textView.setText(charSequence);
            }
        }

        public TopView(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6, View.OnClickListener onClickListener7) {
            super(context);
            this.imageView = new BackupImageView[5];
            this.imageViewAttributes = new TL_stars.starGiftAttributeModel[3];
            this.currentImageIndex = 0;
            this.layout = new LinearLayout[5];
            this.layoutLayoutParams = new FrameLayout.LayoutParams[5];
            this.titleView = new LinkSpanDrawable.LinksTextView[5];
            this.subtitleView = new LinkSpanDrawable.LinksTextView[5];
            this.subtitleViewLayoutParams = new LinearLayout.LayoutParams[5];
            this.currentPage = new PageTransition(0, 0, 1.0f);
            this.backdrop = new TL_stars.starGiftAttributeBackdrop[3];
            this.checkToRotateRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$3();
                }
            };
            this.backgroundPaint = new Paint[3];
            this.backgroundGradient = new RadialGradient[3];
            this.backgroundMatrix = new Matrix[3];
            this.profileBackgroundMatrix = new Matrix();
            this.profileBackgroundPaint = new Paint(1);
            this.patternAttribute = new TL_stars.starGiftAttributePattern[2];
            this.pattern = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[2];
            int i = 0;
            while (true) {
                Paint[] paintArr = this.backgroundPaint;
                if (i >= paintArr.length) {
                    break;
                }
                paintArr[i] = new Paint(1);
                i++;
            }
            int i2 = 0;
            while (true) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
                if (i2 >= swapAnimatedEmojiDrawableArr.length) {
                    break;
                }
                swapAnimatedEmojiDrawableArr[i2] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(28.0f));
                i2++;
            }
            this.switchScale = 1.0f;
            this.particlesBounds = new RectF();
            this.backgroundColors = new int[12];
            this.textColors = new int[12];
            this.patternColors = new int[12];
            this.resourcesProvider = resourcesProvider;
            this.onShareClick = onClickListener5;
            this.onResellClick = onClickListener6;
            this.onUpdatePriceClick = onClickListener7;
            setWillNotDraw(false);
            this.imageLayout = new FrameLayout(context);
            int i3 = 0;
            while (true) {
                BackupImageView[] backupImageViewArr = this.imageView;
                float f = 0.0f;
                if (i3 >= backupImageViewArr.length) {
                    break;
                }
                backupImageViewArr[i3] = new BackupImageView(context);
                this.imageView[i3].setLayerNum(6660);
                if (i3 > 0) {
                    this.imageView[i3].getImageReceiver().setCrossfadeDuration(1);
                }
                this.imageLayout.addView(this.imageView[i3], LayoutHelper.createFrame(-1, -1, 119));
                BackupImageView backupImageView = this.imageView[i3];
                if (i3 == this.currentImageIndex) {
                    f = 1.0f;
                }
                backupImageView.setAlpha(f);
                i3++;
            }
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.releasedView = linksTextView;
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            TextView textView = new TextView(context);
            this.collectionReleasedView = textView;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            ScaleStateListAnimator.apply(textView, 0.05f, 1.25f);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(17);
            textView.setLinkTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
            TextView textView2 = new TextView(context);
            this.resellPriceView = textView2;
            textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.4f);
            textView2.setScaleY(0.4f);
            textView2.setVisibility(8);
            textView2.setGravity(17);
            ScaleStateListAnimator.apply(textView2);
            LinearLayout linearLayout = new LinearLayout(context) {
                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (TopView.this.currentPage.is(0)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                }
            };
            this.buttonsLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.buttons = new Button[3];
            int i4 = 0;
            while (true) {
                Button[] buttonArr = this.buttons;
                if (i4 >= buttonArr.length) {
                    break;
                }
                buttonArr[i4] = new Button(context);
                if (i4 == 0) {
                    this.buttons[i4].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                    this.buttons[i4].setOnClickListener(onClickListener3);
                } else if (i4 == 1) {
                    this.buttons[i4].set(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                    this.buttons[i4].setOnClickListener(onClickListener4);
                } else if (i4 == 2) {
                    this.buttons[i4].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                    this.buttons[i4].setOnClickListener(onClickListener5);
                }
                this.buttons[i4].setBackground(Theme.createRadSelectorDrawable(0, 285212671, 16, 16));
                ScaleStateListAnimator.apply(this.buttons[i4], 0.075f, 1.5f);
                LinearLayout linearLayout2 = this.buttonsLayout;
                Button[] buttonArr2 = this.buttons;
                linearLayout2.addView(buttonArr2[i4], LayoutHelper.createLinear(0, 56, 1.0f, 119, 0, 0, i4 != buttonArr2.length - 1 ? 11 : 0, 0));
                i4++;
            }
            this.subtitleContainer = new FrameLayout(context);
            int i5 = 0;
            while (true) {
                LinearLayout[] linearLayoutArr = this.layout;
                if (i5 >= linearLayoutArr.length) {
                    break;
                }
                linearLayoutArr[i5] = new LinearLayout(context);
                this.layout[i5].setOrientation(1);
                if (i5 == 2) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.userLayout = frameLayout;
                    this.layout[i5].addView(frameLayout, LayoutHelper.createLinear(-1, 144, 119));
                    BackupImageView backupImageView2 = new BackupImageView(context);
                    this.avatarView = backupImageView2;
                    backupImageView2.setRoundRadius(AndroidUtilities.dp(41.0f));
                    this.userLayout.addView(this.avatarView, LayoutHelper.createFrame(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                    this.titleView[i5] = new LinkSpanDrawable.LinksTextView(context);
                    this.titleView[i5].setTextColor(-1);
                    this.titleView[i5].setTextSize(1, 20.0f);
                    this.titleView[i5].setTypeface(AndroidUtilities.bold());
                    this.titleView[i5].setSingleLine();
                    LinkSpanDrawable.LinksTextView linksTextView2 = this.titleView[i5];
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    linksTextView2.setEllipsize(truncateAt);
                    this.titleView[i5].setGravity(17);
                    this.userLayout.addView(this.titleView[i5], LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                    this.subtitleView[i5] = new LinkSpanDrawable.LinksTextView(context);
                    this.subtitleView[i5].setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                    this.subtitleView[i5].setTextSize(1, 14.0f);
                    this.subtitleView[i5].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                    this.subtitleView[i5].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.subtitleView[i5].setDisablePaddingsOffsetY(true);
                    this.subtitleView[i5].setSingleLine();
                    this.subtitleView[i5].setGravity(17);
                    this.subtitleView[i5].setEllipsize(truncateAt);
                    this.userLayout.addView(this.subtitleView[i5], LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
                } else if (i5 == 4) {
                    CraftTopView craftTopView = new CraftTopView(context, resourcesProvider);
                    this.craftTopView = craftTopView;
                    this.layout[i5].addView(craftTopView, LayoutHelper.createLinear(-1, -2));
                    View view = this.layout[i5];
                    FrameLayout.LayoutParams[] layoutParamsArr = this.layoutLayoutParams;
                    ViewGroup.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                    layoutParamsArr[i5] = layoutParamsCreateFrame;
                    addView(view, layoutParamsCreateFrame);
                    i5++;
                } else {
                    this.titleView[i5] = new LinkSpanDrawable.LinksTextView(context);
                    this.titleView[i5].setTextColor(i5 == 3 ? -1 : Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                    this.titleView[i5].setTextSize(1, 20.0f);
                    this.titleView[i5].setTypeface(AndroidUtilities.bold());
                    this.titleView[i5].setGravity(17);
                    this.layout[i5].addView(this.titleView[i5], LayoutHelper.createLinear(-1, -2, 17, 24, i5 == 3 ? 10 : 0, 24, 0));
                    if (i5 == 0) {
                        this.layout[i5].addView(this.releasedView, LayoutHelper.createLinear(-2, -2, 17, 0, 4, 0, 4));
                        this.layout[i5].addView(this.collectionReleasedView, LayoutHelper.createLinear(-2, 19.33f, 17, 0, 6, 0, 2));
                    }
                    if (i5 == 0) {
                        this.subtitleView[i5] = new LinkSpanDrawable.LinksTextView(context);
                        this.subtitleView[i5].setTextColor(i5 == 3 ? Theme.multAlpha(-1, 0.75f) : Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                        this.subtitleView[i5].setTextSize(1, 14.0f);
                        this.subtitleView[i5].setGravity(17);
                        this.subtitleView[i5].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                        this.subtitleView[i5].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.subtitleView[i5].setDisablePaddingsOffsetY(true);
                        this.subtitleContainer.addView(this.subtitleView[i5], LayoutHelper.createFrame(-2, -2, 17));
                        this.subtitleContainer.addView(this.resellPriceView, LayoutHelper.createFrame(-2.0f, 20.33f, 17));
                        LinearLayout linearLayout3 = this.layout[i5];
                        FrameLayout frameLayout2 = this.subtitleContainer;
                        LinearLayout.LayoutParams[] layoutParamsArr2 = this.subtitleViewLayoutParams;
                        LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, i5 == 3 ? 6 : 0);
                        layoutParamsArr2[i5] = layoutParamsCreateLinear;
                        linearLayout3.addView(frameLayout2, layoutParamsCreateLinear);
                    } else {
                        this.subtitleView[i5] = new LinkSpanDrawable.LinksTextView(context);
                        this.subtitleView[i5].setTextColor(i5 == 3 ? Theme.multAlpha(-1, 0.75f) : Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                        this.subtitleView[i5].setTextSize(1, 14.0f);
                        this.subtitleView[i5].setGravity(17);
                        this.subtitleView[i5].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                        this.subtitleView[i5].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.subtitleView[i5].setDisablePaddingsOffsetY(true);
                        LinearLayout linearLayout4 = this.layout[i5];
                        LinkSpanDrawable.LinksTextView linksTextView3 = this.subtitleView[i5];
                        LinearLayout.LayoutParams[] layoutParamsArr3 = this.subtitleViewLayoutParams;
                        LinearLayout.LayoutParams layoutParamsCreateLinear2 = LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, i5 == 3 ? 6 : 0);
                        layoutParamsArr3[i5] = layoutParamsCreateLinear2;
                        linearLayout4.addView(linksTextView3, layoutParamsCreateLinear2);
                    }
                    this.subtitleViewLayoutParams[i5].topMargin = AndroidUtilities.dp(i5 == 3 ? 6.0f : i5 == 1 ? 7.33f : this.backdrop[0] == null ? 9.0f : 5.66f);
                }
                if (i5 == 0) {
                    this.layout[i5].addView(this.buttonsLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 15, 0, 0));
                }
                View view2 = this.layout[i5];
                FrameLayout.LayoutParams[] layoutParamsArr4 = this.layoutLayoutParams;
                ViewGroup.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, i5 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
                layoutParamsArr4[i5] = layoutParamsCreateFrame2;
                addView(view2, layoutParamsCreateFrame2);
                i5++;
            }
            addView(this.imageLayout, LayoutHelper.createFrame(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            StickersRollView stickersRollView = new StickersRollView(context, resourcesProvider);
            this.imagesRollView = stickersRollView;
            addView(stickersRollView, LayoutHelper.createFrame(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.closeView = imageView;
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(28.0f), 620756991));
            imageView.setImageResource(R.drawable.msg_close);
            ScaleStateListAnimator.apply(imageView);
            addView(imageView, LayoutHelper.createFrame(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    runnable.run();
                }
            });
            imageView.setVisibility(8);
            ImageView imageView2 = new ImageView(context);
            this.craftView = imageView2;
            imageView2.setImageResource(R.drawable.filled_forge);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(Theme.createSelectorDrawable(553648127, 1));
            ScaleStateListAnimator.apply(imageView2);
            if (onClickListener2 != null) {
                addView(imageView2, LayoutHelper.createFrame(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
                imageView2.setOnClickListener(onClickListener2);
            }
            imageView2.setVisibility(8);
            ImageView imageView3 = new ImageView(context);
            this.optionsView = imageView3;
            imageView3.setImageResource(R.drawable.media_more);
            imageView3.setScaleType(scaleType);
            imageView3.setBackground(Theme.createSelectorDrawable(553648127, 1));
            ScaleStateListAnimator.apply(imageView3);
            addView(imageView3, LayoutHelper.createFrame(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            imageView3.setOnClickListener(onClickListener);
            imageView3.setVisibility(8);
            GiftSheet.Ribbon ribbon = new GiftSheet.Ribbon(context);
            this.ribbon = ribbon;
            ribbon.setText(LocaleController.getString(R.string.GiftCrafted), true);
            ribbon.drawable.setParticles(true);
            ribbon.drawable.setLeft(true);
            ribbon.setScaleX(1.2f);
            ribbon.setScaleY(1.2f);
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            ribbon.setVisibility(8);
        }

        public void lambda$new$0(View view) {
            CharSequence text = this.collectionReleasedView.getText();
            if (text instanceof Spanned) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr.length > 0) {
                    clickableSpanArr[0].onClick(view);
                }
            }
        }

        public void setText(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            this.titleView[i].setText(charSequence);
            if (i == 0 && !TextUtils.isEmpty(charSequence3)) {
                this.collectionReleasedView.setText(charSequence3);
                this.collectionReleasedView.setVisibility(0);
                this.releasedView.setVisibility(8);
                if (i == 0) {
                    this.subtitleContainer.setVisibility(8);
                    return;
                } else {
                    this.subtitleView[i].setVisibility(8);
                    return;
                }
            }
            if (i == 0 && !TextUtils.isEmpty(charSequence4)) {
                this.releasedView.setText(charSequence4);
                this.releasedView.setVisibility(0);
                this.collectionReleasedView.setVisibility(8);
                if (i == 0) {
                    this.subtitleContainer.setVisibility(8);
                    return;
                } else {
                    this.subtitleView[i].setVisibility(8);
                    return;
                }
            }
            this.subtitleView[i].setText(charSequence2);
            if (i == 0) {
                this.subtitleContainer.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                this.subtitleView[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            this.releasedView.setVisibility(8);
            this.collectionReleasedView.setVisibility(8);
        }

        public void onSwitchPage(PageTransition pageTransition) {
            float fAt;
            int iBlendARGB;
            boolean z;
            this.currentPage = pageTransition;
            int i = 0;
            while (true) {
                LinearLayout[] linearLayoutArr = this.layout;
                if (i >= linearLayoutArr.length) {
                    break;
                }
                linearLayoutArr[i].setAlpha(pageTransition.at(i));
                i++;
            }
            this.closeView.setAlpha(Math.max(this.backdrop[0] != null ? pageTransition.at(2) : 0.0f, this.backdrop[1] != null ? pageTransition.at(1) : 0.0f));
            ImageView imageView = this.closeView;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            imageView.setVisibility(((stargiftattributebackdropArr[0] == null || pageTransition.to != 2) && (stargiftattributebackdropArr[1] == null || pageTransition.to != 1)) ? 8 : 0);
            this.optionsView.setAlpha(AndroidUtilities.lerp(false, this.backdrop[0] != null, pageTransition.at(0)));
            this.optionsView.setVisibility((this.backdrop[0] == null || pageTransition.to != 0) ? 8 : 0);
            if (!this.resellPriceViewInProgress) {
                this.resellPriceView.setAlpha(AndroidUtilities.lerp(false, this.hasResellPrice, pageTransition.at(0)));
                this.resellPriceView.setScaleX(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                this.resellPriceView.setScaleY(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                this.resellPriceView.setVisibility((this.hasResellPrice && pageTransition.to == 0) ? 0 : 4);
            }
            int color = Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider);
            int i2 = 0;
            while (i2 < 2) {
                this.titleView[i2].setTextColor(this.backdrop[Math.min(1, i2)] == null ? color : -1);
                LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView[i2];
                if (i2 == 0 || i2 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[i2];
                    iBlendARGB = stargiftattributebackdrop == null ? color : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.backdrop;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr2[1];
                    int i3 = stargiftattributebackdrop2 == null ? color : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr2[2];
                    iBlendARGB = ColorUtils.blendARGB(i3, stargiftattributebackdrop3 == null ? color : (-16777216) | stargiftattributebackdrop3.text_color, this.toggleBackdrop);
                }
                linksTextView.setTextColor(iBlendARGB);
                if (this.backdrop[i2] != null) {
                    z = (AndroidUtilities.dp(184.0f) == this.layoutLayoutParams[i2].topMargin && this.layout[i2].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                    if (z) {
                        this.layout[i2].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                        this.layoutLayoutParams[i2].topMargin = AndroidUtilities.dp(184.0f);
                    }
                } else {
                    z = (AndroidUtilities.dp(170.0f) == this.layoutLayoutParams[i2].topMargin && this.layout[i2].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                    if (z) {
                        this.layout[i2].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                        this.layoutLayoutParams[i2].topMargin = AndroidUtilities.dp(170.0f);
                    }
                }
                this.subtitleViewLayoutParams[i2].topMargin = AndroidUtilities.dp(i2 == 1 ? 7.33f : this.backdrop[0] == null ? 9.0f : 5.66f);
                if (z) {
                    this.layout[i2].setLayoutParams(this.layoutLayoutParams[i2]);
                    if (i2 == 0) {
                        this.subtitleContainer.setLayoutParams(this.subtitleViewLayoutParams[i2]);
                    } else {
                        this.subtitleView[i2].setLayoutParams(this.subtitleViewLayoutParams[i2]);
                    }
                }
                i2++;
            }
            TextView textView = this.collectionReleasedView;
            int iDp = AndroidUtilities.dp(24.0f);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = this.backdrop[0];
            textView.setBackground(Theme.createRoundRectDrawable(iDp, stargiftattributebackdrop4 == null ? 553648127 : ColorUtils.blendARGB(stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216), 0.25f)));
            LinkSpanDrawable.LinksTextView linksTextView2 = this.subtitleView[2];
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = this.backdrop[0];
            if (stargiftattributebackdrop5 != null) {
                color = stargiftattributebackdrop5.text_color | (-16777216);
            }
            linksTextView2.setTextColor(color);
            this.imageView[0].setAlpha(Math.max(this.currentPage.at(0, 2), this.currentPage.at(3)));
            this.imageView[1].setAlpha(pageTransition.at(1) * (1.0f - this.toggleBackdrop));
            this.imageView[2].setAlpha(pageTransition.at(1) * this.toggleBackdrop);
            this.imageLayout.setScaleX(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            this.imageLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            this.imageLayout.setTranslationX(this.wearImageTx * pageTransition.at(2));
            this.imageLayout.setTranslationY((AndroidUtilities.dp(16.0f) * pageTransition.at(1)) + (this.wearImageTy * pageTransition.at(2)));
            LinearLayout linearLayout = this.layout[2];
            int i4 = pageTransition.from;
            if (i4 == 2 && pageTransition.to == 2) {
                fAt = 0.0f;
            } else {
                if (i4 == 2) {
                    i4 = pageTransition.to;
                }
                fAt = (-(r1[i4].getMeasuredHeight() - this.layout[2].getMeasuredHeight())) * (1.0f - pageTransition.at(2));
            }
            linearLayout.setTranslationY(fAt);
            this.ribbon.setVisibility((this.hasRibbon && this.currentPage.contains(0)) ? 0 : 8);
            this.ribbon.setAlpha(this.currentPage.at(0));
            this.craftTopView.setVisibility(pageTransition.at(4) <= 0.0f ? 8 : 0);
            this.craftTopView.setAlpha(pageTransition.at(4));
            invalidate();
        }

        public void hideCloseButton() {
            removeView(this.closeView);
        }

        public void prepareSwitchPage(PageTransition pageTransition) {
            int i = pageTransition.from;
            if (i != pageTransition.to) {
                RLottieDrawable lottieAnimation = this.imageView[i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[pageTransition.to].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 == null || lottieAnimation == null) {
                    return;
                }
                lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
            }
        }

        public void setGift(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.hasResellPrice = false;
            boolean z6 = z || z2;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                this.backdrop[0] = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                setPattern(0, (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
                this.subtitleView[0].setTextSize(1, 13.0f);
                this.buttonsLayout.setVisibility(z6 ? 0 : 8);
                if (z6) {
                    this.buttons[1].set(z3 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z3 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
                }
                float f = 1.0f;
                if (starGift.resell_amount != null) {
                    this.hasResellPrice = true;
                    AmountUtils$Amount resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS);
                    this.resellPriceView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, StarsIntroActivity.replaceStars(resellAmount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(resellAmount.toTl(), 1.0f, ','))), Float.valueOf(0.9f)));
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                    this.resellPriceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f)));
                    if (StarGiftSheet.isMine(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                        this.resellPriceView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$setGift$2(view);
                            }
                        });
                        ScaleStateListAnimator.apply(this.resellPriceView);
                    } else {
                        this.resellPriceView.setOnClickListener(null);
                        ScaleStateListAnimator.reset(this.resellPriceView);
                    }
                }
                if (z) {
                    this.buttons[0].setAlpha(1.0f);
                    this.buttons[0].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                } else {
                    this.buttons[0].setAlpha(0.5f);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                    this.buttons[0].set(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
                }
                Button button = this.buttons[1];
                if (!z && !z2) {
                    f = 0.5f;
                }
                button.setAlpha(f);
                if (z) {
                    if (starGift.resell_amount != null) {
                        this.buttons[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                        this.buttons[2].setOnClickListener(this.onResellClick);
                    } else {
                        this.buttons[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                        this.buttons[2].setOnClickListener(this.onResellClick);
                    }
                } else {
                    this.buttons[2].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                    this.buttons[2].setOnClickListener(this.onShareClick);
                }
                this.hasRibbon = starGift.crafted;
                this.ribbon.drawable.setBackdrop(this.backdrop[0], false, true);
            } else {
                this.backdrop[0] = null;
                setPattern(0, null, false);
                this.subtitleView[0].setTextSize(1, 14.0f);
                this.hasRibbon = false;
                this.buttonsLayout.setVisibility(8);
            }
            this.hasLink = z4;
            setBackdropPaint(0, this.backdrop[0]);
            StarsIntroActivity.setGiftImage(this.imageView[0].getImageReceiver(), starGift, 160);
            this.imageViewAttributes[0] = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            onSwitchPage(this.currentPage);
        }

        public void lambda$setGift$2(View view) {
            View.OnClickListener onClickListener;
            if (this.resellPriceView.getVisibility() == 0 && (onClickListener = this.onUpdatePriceClick) != null) {
                onClickListener.onClick(view);
            }
        }

        public BackupImageView getUpgradeImageView() {
            return this.toggleBackdrop > 0.5f ? this.imageView[2] : this.imageView[1];
        }

        public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
            return this.toggleBackdrop > 0.5f ? this.imageViewAttributes[2] : this.imageViewAttributes[1];
        }

        public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
            return this.toggleBackdrop > 0.5f ? this.backdrop[2] : this.backdrop[1];
        }

        public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
            return this.patternAttribute[1];
        }

        public void setResellPrice(AmountUtils$Amount amountUtils$Amount) {
            boolean zIsZero = amountUtils$Amount.isZero();
            this.hasResellPrice = !zIsZero;
            if (!zIsZero) {
                this.resellPriceView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, StarsIntroActivity.replaceStars(amountUtils$Amount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(amountUtils$Amount.toTl(), 1.0f, ',')), 0.9f)));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                this.resellPriceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f)));
                this.resellPriceView.setVisibility(0);
                this.resellPriceViewInProgress = true;
                ViewPropertyAnimator duration = this.resellPriceView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration.setInterpolator(cubicBezierInterpolator).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceViewInProgress = false;
                    }
                }).start();
                this.subtitleView[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(cubicBezierInterpolator).start();
            } else {
                ViewPropertyAnimator duration2 = this.resellPriceView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration2.setInterpolator(cubicBezierInterpolator2).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceView.setVisibility(4);
                    }
                }).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceViewInProgress = false;
                    }
                }).start();
                this.subtitleView[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(cubicBezierInterpolator2).start();
            }
            if (this.hasResellPrice) {
                this.buttons[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
            } else {
                this.buttons[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
            }
            this.buttons[2].setOnClickListener(this.onResellClick);
        }

        public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
            this.sampleAttributes = arrayList;
            this.models = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class));
            this.patterns = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class));
            this.backdrops = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class));
            this.subtitleView[1].setTextSize(1, 14.0f);
            this.buttonsLayout.setVisibility(8);
            this.toggleBackdrop = 0.0f;
            this.toggled = 0;
            setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
            this.imageViewAttributes[1] = (TL_stars.starGiftAttributeModel) this.models.next();
            StarsIntroActivity.setGiftImage(this.imageView[1].getImageReceiver(), this.imageViewAttributes[1].document, 160);
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
            stargiftattributebackdropArr[1] = stargiftattributebackdrop;
            setBackdropPaint(1, stargiftattributebackdrop);
            this.imageViewAttributes[2] = (TL_stars.starGiftAttributeModel) this.models.getNext();
            StarsIntroActivity.setGiftImage(this.imageView[2].getImageReceiver(), this.imageViewAttributes[2].document, 160);
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
            AndroidUtilities.runOnUIThread(this.checkToRotateRunnable, 2500L);
            invalidate();
        }

        public void setWearPreview(TLObject tLObject) {
            String lowerCase;
            String string;
            String userName;
            this.wearPreviewObject = tLObject;
            if (tLObject instanceof TLRPC.User) {
                userName = UserObject.getUserName((TLRPC.User) tLObject);
                string = LocaleController.getString(R.string.Online);
            } else {
                if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String str = chat == null ? "" : chat.title;
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    int i = chat.participants_count;
                    if (i > 1) {
                        lowerCase = LocaleController.formatPluralStringComma("Subscribers", i);
                    } else {
                        lowerCase = LocaleController.getString(R.string.DiscussChannel);
                    }
                } else {
                    int i2 = chat.participants_count;
                    if (i2 > 1) {
                        lowerCase = LocaleController.formatPluralStringComma("Members", i2);
                    } else {
                        lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
                    }
                }
                String str2 = str;
                string = lowerCase;
                userName = str2;
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            this.avatarView.setForUserOrChat(tLObject, avatarDrawable);
            this.titleView[2].setText(userName);
            this.subtitleView[2].setText(string);
            updateWearImageTranslation();
            onSwitchPage(this.currentPage);
        }

        private void updateWearImageTranslation() {
            this.wearImageScale = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
            this.wearImageTx = ((((-this.imageLayout.getLeft()) + this.titleView[2].getX()) + ((this.titleView[2].getWidth() + Math.min(this.titleView[2].getPaint().measureText(this.titleView[2].getText().toString()), this.titleView[2].getWidth())) / 2.0f)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
            this.wearImageTy = ((-this.imageLayout.getTop()) + AndroidUtilities.dp(124.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        }

        public void lambda$new$3() {
            if (this.imageView[2 - this.toggled].getImageReceiver().hasImageLoaded()) {
                rotateAttributes();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                AndroidUtilities.runOnUIThread(this.checkToRotateRunnable, 150L);
            }
        }

        public void setPreviewAttributes(StarGiftPreviewSheet.Attributes attributes) {
            PageTransition pageTransition = this.currentPage;
            if (pageTransition != null && pageTransition.to == 1 && isAttachedToWindow()) {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                ValueAnimator valueAnimator = this.rotationAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.rotationAnimator = null;
                }
                int i = 1 - this.toggled;
                this.toggled = i;
                RLottieDrawable lottieAnimation = this.imageView[2 - i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[this.toggled + 1].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                }
                int i2 = this.toggled + 1;
                TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = attributes.backdrop;
                stargiftattributebackdropArr[i2] = stargiftattributebackdrop;
                setBackdropPaint(i2, stargiftattributebackdrop);
                setPattern(1, attributes.pattern, true);
                TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.imageViewAttributes;
                int i3 = this.toggled + 1;
                stargiftattributemodelArr[i3] = attributes.model;
                StarsIntroActivity.setGiftImage(this.imageView[i3].getImageReceiver(), this.imageViewAttributes[this.toggled + 1].document, 160);
                animateSwitch();
                float f = this.toggled;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - f, f);
                this.rotationAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$setPreviewAttributes$4(valueAnimator2);
                    }
                });
                this.rotationAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.toggleBackdrop = r2.toggled;
                        TopView topView = TopView.this;
                        topView.onSwitchPage(topView.currentPage);
                    }
                });
                this.rotationAnimator.setDuration(320L);
                this.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.rotationAnimator.start();
            }
        }

        public void lambda$setPreviewAttributes$4(ValueAnimator valueAnimator) {
            this.toggleBackdrop = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            onSwitchPage(this.currentPage);
        }

        private void rotateAttributes() {
            PageTransition pageTransition = this.currentPage;
            if (pageTransition != null && pageTransition.to == 1 && isAttachedToWindow()) {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                ValueAnimator valueAnimator = this.rotationAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.rotationAnimator = null;
                }
                int i = 1 - this.toggled;
                this.toggled = i;
                RLottieDrawable lottieAnimation = this.imageView[2 - i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[this.toggled + 1].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                }
                this.models.next();
                int i2 = this.toggled + 1;
                TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
                stargiftattributebackdropArr[i2] = stargiftattributebackdrop;
                setBackdropPaint(i2, stargiftattributebackdrop);
                setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
                animateSwitch();
                float f = this.toggled;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - f, f);
                this.rotationAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$rotateAttributes$5(valueAnimator2);
                    }
                });
                this.rotationAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.toggleBackdrop = r3.toggled;
                        TopView topView = TopView.this;
                        topView.onSwitchPage(topView.currentPage);
                        TopView.this.imageViewAttributes[2 - TopView.this.toggled] = (TL_stars.starGiftAttributeModel) TopView.this.models.getNext();
                        StarsIntroActivity.setGiftImage(TopView.this.imageView[2 - TopView.this.toggled].getImageReceiver(), TopView.this.imageViewAttributes[2 - TopView.this.toggled].document, 160);
                        TopView topView2 = TopView.this;
                        topView2.preloadPattern((TL_stars.starGiftAttributePattern) topView2.patterns.getNext());
                        AndroidUtilities.cancelRunOnUIThread(TopView.this.checkToRotateRunnable);
                        AndroidUtilities.runOnUIThread(TopView.this.checkToRotateRunnable, 2500L);
                    }
                });
                this.rotationAnimator.setDuration(320L);
                this.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.rotationAnimator.start();
            }
        }

        public void lambda$rotateAttributes$5(ValueAnimator valueAnimator) {
            this.toggleBackdrop = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            onSwitchPage(this.currentPage);
        }

        private void setBackdropPaint(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (stargiftattributebackdrop == null) {
                return;
            }
            RadialGradient[] radialGradientArr = this.backgroundGradient;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            radialGradientArr[i] = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            if (i == 0) {
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
                this.profileBackgroundGradient = radialGradient;
                this.profileBackgroundPaint.setShader(radialGradient);
            }
            Matrix[] matrixArr = this.backgroundMatrix;
            if (matrixArr[i] == null) {
                matrixArr[i] = new Matrix();
            }
            this.backgroundPaint[i].setShader(this.backgroundGradient[i]);
        }

        public void setPattern(int i, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z) {
            if (stargiftattributepattern != null) {
                TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.patternAttribute;
                if (stargiftattributepatternArr[i] == stargiftattributepattern) {
                    return;
                }
                stargiftattributepatternArr[i] = stargiftattributepattern;
                this.pattern[i].set(stargiftattributepattern.document, z);
            }
        }

        public void preloadPattern(TL_stars.starGiftAttributePattern stargiftattributepattern) {
            if (stargiftattributepattern == null) {
                return;
            }
            AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 7, stargiftattributepattern.document).preload();
        }

        @Override
        protected void onAttachedToWindow() {
            this.attached = true;
            super.onAttachedToWindow();
            this.pattern[0].attach();
            this.pattern[1].attach();
        }

        @Override
        protected void onDetachedFromWindow() {
            this.attached = false;
            super.onDetachedFromWindow();
            this.pattern[0].detach();
            this.pattern[1].detach();
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
        }

        private void animateSwitch() {
            ValueAnimator valueAnimator = this.switchAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.switchAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$animateSwitch$6(valueAnimator2);
                }
            });
            this.switchAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    TopView.this.switchScale = 1.0f;
                    TopView topView = TopView.this;
                    topView.imageLayout.setScaleX(topView.switchScale);
                    TopView topView2 = TopView.this;
                    topView2.imageLayout.setScaleY(topView2.switchScale);
                    TopView.this.invalidate();
                }
            });
            this.switchAnimator.setDuration(320L);
            this.switchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.switchAnimator.start();
        }

        public void lambda$animateSwitch$6(ValueAnimator valueAnimator) {
            float fPow = (((float) Math.pow((r5 * 2.0f) - 2.0f, 2.0d)) * 0.075f * ((Float) valueAnimator.getAnimatedValue()).floatValue()) + 1.0f;
            this.switchScale = fPow;
            this.imageLayout.setScaleX(fPow);
            this.imageLayout.setScaleY(this.switchScale);
            invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            int i;
            int i2;
            float f3;
            float f4;
            float f5;
            int i3;
            char c;
            int i4;
            int i5;
            ?? r2;
            float realHeight = getRealHeight();
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
            float width = getWidth() / 2.0f;
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.currentPage.at(1)) + AndroidUtilities.dp(80.0f);
            float fAt = this.currentPage.at(0, 2, 3);
            if (fAt > 0.0f && this.backdrop[0] != null) {
                if (this.profileBackgroundGradient == null || this.currentPage.at(2) < 1.0f) {
                    this.backgroundPaint[0].setAlpha((int) (fAt * 255.0f));
                    this.backgroundMatrix[0].reset();
                    this.backgroundMatrix[0].postTranslate(width, fLerp);
                    this.backgroundGradient[0].setLocalMatrix(this.backgroundMatrix[0]);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[0]);
                }
                if (this.profileBackgroundGradient != null && this.currentPage.at(2) > 0.0f) {
                    this.profileBackgroundPaint.setAlpha((int) (this.currentPage.at(2) * 255.0f));
                    this.profileBackgroundMatrix.reset();
                    this.profileBackgroundMatrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                    this.profileBackgroundGradient.setLocalMatrix(this.profileBackgroundMatrix);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.profileBackgroundPaint);
                }
            }
            if (this.currentPage.at(1) > 0.0f) {
                updateButtonsBackgrounds(drawBackground(canvas, width, fLerp, getWidth(), realHeight));
            }
            if (this.backdrop[0] != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr = this.backgroundColors;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    int[] iArr2 = this.textColors;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                    iArr2[i6] = stargiftattributebackdrop.text_color | (-16777216);
                    iArr[i6] = ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f);
                    this.patternColors[i6] = this.backdrop[0].pattern_color | (-16777216);
                    i6++;
                }
            }
            if (this.imagesRollView.hasBackgrounds()) {
                i = 2;
                i2 = 0;
                f = fLerp;
                f2 = width;
                f3 = 0.0f;
                this.imagesRollView.drawBackgrounds(canvas, getWidth(), realHeight, this.textColors, this.backgroundColors, this.patternColors);
                invalidate();
            } else {
                f = fLerp;
                f2 = width;
                i = 2;
                i2 = 0;
                f3 = 0.0f;
            }
            if (fAt <= 0.0f || this.backdrop[i2] == null) {
                f4 = f;
                f5 = f2;
                i3 = 1;
            } else {
                int[] iArr3 = this.patternColors;
                int i7 = iArr3[iArr3.length / i];
                float fAt2 = this.currentPage.at(i2, 3);
                if (fAt2 > f3) {
                    canvas.save();
                    canvas.translate(f2, f);
                    this.pattern[i2].setColor(Integer.valueOf(i7));
                    i4 = 2;
                    f4 = f;
                    f5 = f2;
                    c = 0;
                    StarGiftPatterns.drawPattern(canvas, this.pattern[i2], getWidth(), realHeight, fAt2, 1.0f);
                    canvas.restore();
                } else {
                    f4 = f;
                    f5 = f2;
                    c = 0;
                    i4 = 2;
                }
                if (this.currentPage.at(i4) > f3) {
                    canvas.save();
                    this.pattern[c].setColor(Integer.valueOf(i7));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.layout[i4].getX() + this.userLayout.getX() + this.avatarView.getX(), this.layout[i4].getY() + this.userLayout.getY() + this.avatarView.getY(), this.layout[i4].getX() + this.userLayout.getX() + this.avatarView.getX() + this.avatarView.getWidth(), this.layout[i4].getY() + this.userLayout.getY() + this.avatarView.getY() + this.avatarView.getHeight());
                    r2 = 0;
                    i5 = 2;
                    StarGiftPatterns.drawProfileAnimatedPattern(canvas, this.pattern[c], getWidth(), realHeight * 0.7f, 1.0f, rectF, this.currentPage.at(i4));
                    canvas.restore();
                } else {
                    i5 = 2;
                    r2 = 0;
                }
                for (Button button : this.buttons) {
                    if (Theme.setSelectorDrawableColor(button.getBackground(), this.backgroundColors[Utilities.clamp(Math.round(((button.getX() + (button.getWidth() / 2.0f)) / getWidth()) * (this.backgroundColors.length - 1)), this.backgroundColors.length - 1, (int) r2)], r2)) {
                        button.invalidate();
                    }
                }
                i3 = 1;
                int[] iArr4 = this.textColors;
                int i8 = iArr4[iArr4.length / i5];
                int[] iArr5 = this.backgroundColors;
                int i9 = iArr5[iArr5.length / i5];
                TextView textView = this.collectionReleasedView;
                if (textView != null && this.collectionReleasedViewColor != i8) {
                    this.collectionReleasedViewColor = i8;
                    textView.setTextColor(i8);
                    Theme.setSelectorDrawableColor(this.collectionReleasedView.getBackground(), i9, r2);
                }
                if (this.imagesRollView.hasBackgrounds()) {
                    this.subtitleView[r2].setTextColor(i8);
                }
                if (this.currentPage.at(i5) > f3) {
                    if (this.particles == null) {
                        this.particles = new StarsReactionsSheet.Particles(1, 12);
                    }
                    float x = this.imageLayout.getX() + (this.imageLayout.getMeasuredWidth() / 2.0f);
                    float measuredWidth = (this.imageLayout.getMeasuredWidth() * this.imageLayout.getScaleX()) / 2.0f;
                    float y = this.imageLayout.getY() + (this.imageLayout.getMeasuredHeight() / 2.0f);
                    float measuredHeight = (this.imageLayout.getMeasuredHeight() * this.imageLayout.getScaleY()) / 2.0f;
                    this.particlesBounds.set(x - measuredWidth, y - measuredHeight, x + measuredWidth, y + measuredHeight);
                    this.particles.setBounds(this.particlesBounds);
                    this.particles.process();
                    this.particles.draw(canvas, Theme.multAlpha(-1, this.currentPage.at(i5)));
                    invalidate();
                }
            }
            if (this.currentPage.at(i3) > f3) {
                drawPattern(canvas, f5, f4, getWidth(), getRealHeight());
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public void drawPattern(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.save();
            canvas.translate(f, f2);
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
            int i = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            this.pattern[1].setColor(Integer.valueOf(ColorUtils.blendARGB(i, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0, this.toggleBackdrop)));
            StarGiftPatterns.drawPattern(canvas, this.pattern[1], f3, f4, this.currentPage.at(1), this.switchScale);
            canvas.restore();
        }

        public int drawBackground(Canvas canvas, float f, float f2, float f3, float f4) {
            int iCompositeColors = 0;
            if (this.toggled == 0) {
                if (this.toggleBackdrop > 0.0f && this.backdrop[2] != null) {
                    this.backgroundPaint[2].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                    this.backgroundMatrix[2].reset();
                    this.backgroundMatrix[2].postTranslate(f, f2);
                    this.backgroundGradient[2].setLocalMatrix(this.backgroundMatrix[2]);
                    canvas.drawRect(0.0f, 0.0f, f3, f4, this.backgroundPaint[2]);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[2];
                    iCompositeColors = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f), this.backgroundPaint[2].getAlpha()), 0);
                }
                if (this.toggleBackdrop >= 1.0f || this.backdrop[1] == null) {
                    return iCompositeColors;
                }
                this.backgroundPaint[1].setAlpha((int) (this.currentPage.at(1) * 255.0f * (1.0f - this.toggleBackdrop)));
                this.backgroundMatrix[1].reset();
                this.backgroundMatrix[1].postTranslate(f, f2);
                this.backgroundGradient[1].setLocalMatrix(this.backgroundMatrix[1]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, this.backgroundPaint[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.backdrop[1];
                return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216), 0.25f), this.backgroundPaint[1].getAlpha()), iCompositeColors);
            }
            if (this.toggleBackdrop < 1.0f && this.backdrop[1] != null) {
                this.backgroundPaint[1].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                this.backgroundMatrix[1].reset();
                this.backgroundMatrix[1].postTranslate(f, f2);
                this.backgroundGradient[1].setLocalMatrix(this.backgroundMatrix[1]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, this.backgroundPaint[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.backdrop[1];
                iCompositeColors = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216), 0.25f), this.backgroundPaint[1].getAlpha()), 0);
            }
            if (this.toggleBackdrop <= 0.0f || this.backdrop[2] == null) {
                return iCompositeColors;
            }
            this.backgroundPaint[2].setAlpha((int) (this.currentPage.at(1) * 255.0f * this.toggleBackdrop));
            this.backgroundMatrix[2].reset();
            this.backgroundMatrix[2].postTranslate(f, f2);
            this.backgroundGradient[2].setLocalMatrix(this.backgroundMatrix[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, this.backgroundPaint[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = this.backdrop[2];
            return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216), 0.25f), this.backgroundPaint[2].getAlpha()), iCompositeColors);
        }

        public float getRealHeight() {
            return ((AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[0].getMeasuredHeight()) * this.currentPage.at(0)) + 0.0f + ((AndroidUtilities.dp(this.backdrop[1] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[1].getMeasuredHeight()) * this.currentPage.at(1)) + ((AndroidUtilities.dp(64.0f) + this.layout[2].getMeasuredHeight()) * this.currentPage.at(2)) + ((AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[3].getMeasuredHeight()) * this.currentPage.at(3)) + ((this.craftTopView.getMeasuredHeight() > 0 ? this.craftTopView.getMeasuredHeight() : AndroidUtilities.dp(550.0f)) * this.currentPage.at(4));
        }

        public int getFinalHeight() {
            int iDp;
            int measuredHeight;
            if (this.currentPage.to(0)) {
                iDp = AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f);
                measuredHeight = this.layout[0].getMeasuredHeight();
            } else if (this.currentPage.to(1)) {
                iDp = AndroidUtilities.dp(this.backdrop[1] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f);
                measuredHeight = this.layout[1].getMeasuredHeight();
            } else if (this.currentPage.to(2)) {
                iDp = AndroidUtilities.dp(64.0f);
                measuredHeight = this.layout[2].getMeasuredHeight();
            } else if (this.currentPage.to(3)) {
                iDp = AndroidUtilities.dp(160.0f);
                measuredHeight = this.layout[3].getMeasuredHeight();
            } else {
                if (this.currentPage.to(4)) {
                    return this.craftTopView.getMeasuredHeight() > 0 ? this.craftTopView.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
                }
                return 0;
            }
            return iDp + measuredHeight;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.currentPage.contains(2)) {
                updateWearImageTranslation();
                onSwitchPage(this.currentPage);
            }
        }
    }

    public void switchPage(int i, boolean z) {
        switchPage(i, z, null);
    }

    public void switchPage(final int i, boolean z, final Runnable runnable) {
        Roller roller;
        ValueAnimator valueAnimator = this.switchingPagesAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.switchingPagesAnimator = null;
        }
        if (i != 1) {
            AndroidUtilities.cancelRunOnUIThread(this.topView.checkToRotateRunnable);
        }
        if (!this.firstSet) {
            this.lastTop = Float.valueOf(this.container.top());
        }
        PageTransition pageTransition = this.currentPage;
        this.currentPage = new PageTransition(pageTransition == null ? 0 : pageTransition.to, i, 0.0f);
        this.adapter.setHeights(this.topView.getFinalHeight(), getBottomHeight() + ((this.currentPage.to(1) && this.underButtonContainer.getVisibility() == 0) ? this.underButtonContainer.getMeasuredHeight() : 0));
        if (this.currentPage.to == 0 && (roller = this.roller) != null) {
            roller.stopPreload();
        }
        if (z) {
            this.infoLayout.setVisibility(this.currentPage.contains(0) ? 0 : 8);
            this.upgradeLayout.setVisibility(this.currentPage.contains(1) ? 0 : 8);
            this.wearLayout.setVisibility(this.currentPage.contains(2) ? 0 : 8);
            this.craftLayout.setVisibility(this.currentPage.contains(3) ? 0 : 8);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchingPagesAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$switchPage$43(valueAnimator2);
                }
            });
            this.switchingPagesAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StarGiftSheet.this.onSwitchedPage();
                    StarGiftSheet.this.infoLayout.setVisibility(i == 0 ? 0 : 8);
                    StarGiftSheet.this.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
                    StarGiftSheet.this.wearLayout.setVisibility(i == 2 ? 0 : 8);
                    StarGiftSheet.this.craftLayout.setVisibility(i == 3 ? 0 : 8);
                    StarGiftSheet.this.updateUnderButtonContainer();
                    StarGiftSheet.this.switchingPagesAnimator = null;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            this.switchingPagesAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.switchingPagesAnimator.setDuration(320L);
            this.switchingPagesAnimator.start();
            this.topView.prepareSwitchPage(this.currentPage);
        } else {
            this.currentPage.setProgress(1.0f);
            onSwitchedPage();
            this.infoLayout.setVisibility(i == 0 ? 0 : 8);
            this.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
            this.wearLayout.setVisibility(i == 2 ? 0 : 8);
            this.craftLayout.setVisibility(i != 3 ? 8 : 0);
            updateUnderButtonContainer();
            if (runnable != null) {
                runnable.run();
            }
        }
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
    }

    public void lambda$switchPage$43(ValueAnimator valueAnimator) {
        this.currentPage.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        onSwitchedPage();
    }

    public void updateUnderButtonContainer() {
        if (this.underButtonContainer.getVisibility() == 0) {
            this.buttonContainer.setTranslationY((-this.underButtonContainer.getMeasuredHeight()) * this.currentPage.at(1));
            this.underButtonContainer.setTranslationY(r0.getMeasuredHeight() * (1.0f - this.currentPage.at(1)));
            this.bottomBulletinContainer.setTranslationY((-this.underButtonContainer.getMeasuredHeight()) * this.currentPage.at(1));
            return;
        }
        this.buttonContainer.setTranslationY(0.0f);
        this.underButtonContainer.setTranslationY(0.0f);
        this.bottomBulletinContainer.setTranslationY(0.0f);
    }

    public int getBottomHeight() {
        if (this.currentPage.to(1)) {
            return this.upgradeLayout.getMeasuredHeight();
        }
        if (this.currentPage.to(2)) {
            return this.wearLayout.getMeasuredHeight();
        }
        if (this.currentPage.to(3)) {
            return this.craftLayout.getMeasuredHeight();
        }
        if (this.currentPage.to(4)) {
            return 0;
        }
        return this.infoLayout.getMeasuredHeight();
    }

    public void onSwitchedPage() {
        this.infoLayout.setAlpha(this.currentPage.at(0));
        this.upgradeLayout.setAlpha(this.currentPage.at(1));
        this.wearLayout.setAlpha(this.currentPage.at(2));
        this.craftLayout.setAlpha(this.currentPage.at(3));
        this.buttonContainer.setAlpha(1.0f - this.currentPage.at(4));
        this.topView.onSwitchPage(this.currentPage);
        this.topView.craftView.setVisibility((this.currentPage.is(0) && showCraft()) ? 0 : 8);
        this.actionView.setAlpha(this.currentPage.at(0) * Utilities.clamp01(AndroidUtilities.ilerp(this.container.top() - this.actionView.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        this.container.updateTranslations();
        this.container.invalidate();
        this.buttonContainer.setVisibility(this.currentPage.is(4) ? 8 : 0);
        updateUnderButtonContainer();
    }

    public int canTransferAt() {
        TLRPC.Message message;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            return savedStarGift.can_transfer_at;
        }
        return 0;
    }

    public int canResellAt() {
        TLRPC.Message message;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            return savedStarGift.can_resell_at;
        }
        return 0;
    }

    public boolean canTransfer() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.canTransfer():boolean");
    }

    public static void addAttributeRow(TableView tableView, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        tableView.addRow(str, starGiftAttribute.name, getRarityName(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static CharSequence getRarityName(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            if (numArr != null) {
                numArr[0] = -12539616;
            }
            return LocaleController.getString(R.string.GiftRarityUncommon);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            if (numArr != null) {
                numArr[0] = -15619394;
            }
            return LocaleController.getString(R.string.GiftRarityRare);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            if (numArr != null) {
                numArr[0] = -6988581;
            }
            return LocaleController.getString(R.string.GiftRarityEpic);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            if (numArr != null) {
                numArr[0] = -4229632;
            }
            return LocaleController.getString(R.string.GiftRarityLegendary);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i <= 0) {
                return "<0.1%";
            }
            return AffiliateProgramFragment.percents(i);
        }
        return "";
    }

    private void addAttributeRow(final TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c;
        Roller roller;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c = 0;
        }
        if (this.rolling || ((roller = this.roller) != null && roller.isRolling())) {
            TextViewRoll textViewRoll = new TextViewRoll(getContext(), this.resourcesProvider, new Utilities.Callback3() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3) {
                    this.f$0.showHint((CharSequence) obj, (View) obj2, ((Boolean) obj3).booleanValue());
                }
            });
            TableRow tableRow = new TableRow(getContext());
            tableRow.addView(new TableView.TableRowTitle(this.tableView, string), new TableRow.LayoutParams(-2, -1));
            tableRow.addView(new TableView.TableRowContent(this.tableView, textViewRoll, true), new TableRow.LayoutParams(0, -1, 1.0f));
            this.tableView.addView(tableRow);
            Roller roller2 = this.roller;
            if (roller2 != null) {
                if (c == 0) {
                    roller2.backdropText = textViewRoll;
                }
                if (c == 1) {
                    roller2.patternText = textViewRoll;
                }
                if (c == 2) {
                    roller2.modelText = textViewRoll;
                    return;
                }
                return;
            }
            return;
        }
        final boolean[] zArr = new boolean[1];
        final ButtonSpan.TextViewButtons[] textViewButtonsArr = new ButtonSpan.TextViewButtons[1];
        Integer[] numArr = new Integer[1];
        textViewButtonsArr[0] = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) this.tableView.addRow(string, starGiftAttribute.name, getRarityName(starGiftAttribute.rarity, numArr), starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity ? new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addAttributeRow$45(zArr, starGiftAttribute, textViewButtonsArr);
            }
        } : null, numArr[0]).getChildAt(1)).getChildAt(0);
    }

    public void lambda$addAttributeRow$45(final boolean[] zArr, final TL_stars.StarGiftAttribute starGiftAttribute, final ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        final TL_stars.StarGift gift = getGift();
        GiftAuctionController.getInstance(this.currentAccount).requestAuctionUpgrades(gift.gift_id, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$addAttributeRow$44(gift, starGiftAttribute, textViewButtonsArr, zArr, (ArrayList) obj);
            }
        });
    }

    public void lambda$addAttributeRow$44(TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, ButtonSpan.TextViewButtons[] textViewButtonsArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new StarGiftPreviewSheet(getContext(), this.resourcesProvider, this.currentAccount, starGift.title, arrayList, false).show();
        } else {
            showHint(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(starGiftAttribute.getRarityPermille())), textViewButtonsArr[0], false);
        }
        zArr[0] = false;
    }

    static class Roller {
        private AttrRoller backdropRoller;
        private AttrRoller backdropRoller2;
        TextViewRoll backdropText;
        private boolean drawing;
        private float durationT;
        private long lastFrameTime;
        private AttrRoller modelRoller;
        TextViewRoll modelText;
        TextViewRoll patternText;
        private boolean posted;
        private TL_stars.TL_starGiftUnique rollingGift;
        private AttrRoller symbolRoller;
        public final TopView topView;
        private Runnable whenDone;
        private Runnable whenDone2;
        private final ArrayList models = new ArrayList();
        private final ArrayList backgrounds = new ArrayList();
        private final ArrayList symbols = new ArrayList();
        private float realTime = 0.0f;
        private boolean rolling = false;
        private boolean sentDone = false;
        private boolean sentDone2 = false;

        public static class Attr {
            public String name;
            public int rarity_permille;

            public void detach() {
            }

            public boolean isLoaded() {
                return true;
            }
        }

        private static class AttrRoller {
            public final ArrayList attributes;
            public Attr current;
            public int currentT;
            private final AnimatedFloat fast;
            public final Attr finish;
            private final Runnable invalidate;
            private int lastNextIndex = -1;
            public Attr next;
            public Attr prev;
            private int slowing;
            private final float speedMult;
            public final Attr start;
            public float time;
            private final int totalSlowing;

            public AttrRoller(Runnable runnable, ArrayList arrayList, Attr attr, Attr attr2, float f, int i) {
                this.time = 0.0f;
                this.invalidate = runnable;
                this.attributes = arrayList;
                this.start = attr;
                this.finish = attr2;
                this.speedMult = f;
                this.totalSlowing = i;
                AnimatedFloat animatedFloat = new AnimatedFloat(runnable, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.fast = animatedFloat;
                animatedFloat.force(true);
                this.time = -0.5f;
                this.currentT = 1;
                this.slowing = i;
                this.prev = attr;
                this.current = next(false);
                this.next = next(false);
            }

            public void skip() {
                this.prev = this.current;
                this.current = this.finish;
                this.next = null;
                int i = this.currentT + 1;
                this.currentT = i;
                this.time = i + 0.5f;
            }

            public boolean isFinished() {
                return this.current == this.finish && this.time >= ((float) this.currentT) + 0.5f;
            }

            public boolean isAlmostFinished() {
                return isAlmostFinished(0.25f);
            }

            public boolean isAlmostFinished(float f) {
                return this.current == this.finish && this.time + f >= ((float) this.currentT) + 0.5f;
            }

            public float step(float f, boolean z) {
                long j;
                Attr attr;
                Attr attr2;
                AnimatedFloat animatedFloat = this.fast;
                int i = this.slowing;
                int i2 = this.totalSlowing;
                if (i >= i2) {
                    j = 450;
                } else {
                    j = i2 == 3 ? 4500 : 2500;
                }
                animatedFloat.setDuration(j);
                float fLerp = this.time + (f * AndroidUtilities.lerp(this.totalSlowing == 3 ? 0.75f : 2.0f, 7.5f, this.fast.set(this.slowing >= this.totalSlowing)) * this.speedMult);
                this.time = fLerp;
                if (fLerp >= 0.0f) {
                    double d = fLerp;
                    if (Math.floor(d) + 1.0d > this.currentT && (attr = this.current) != (attr2 = this.finish)) {
                        this.prev = attr;
                        Attr attr3 = this.next;
                        this.current = attr3;
                        this.next = attr3 == attr2 ? null : next(z);
                        this.currentT = ((int) Math.floor(d)) + 1;
                    }
                }
                return this.current == this.finish ? Math.min(fLerp, this.currentT + 0.5f) : fLerp;
            }

            public Attr next(boolean z) {
                if (z && this.finish.isLoaded()) {
                    int i = this.slowing;
                    if (i <= 0) {
                        return this.finish;
                    }
                    this.slowing = i - 1;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.attributes.size(); i2++) {
                    if (i2 != this.lastNextIndex && ((Attr) this.attributes.get(i2)).isLoaded()) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    for (int i3 = 0; i3 < this.attributes.size(); i3++) {
                        if (((Attr) this.attributes.get(i3)).isLoaded()) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return this.start;
                    }
                }
                int iIntValue = ((Integer) AndroidUtilities.randomOf(arrayList)).intValue();
                this.lastNextIndex = iIntValue;
                return (Attr) this.attributes.get(iIntValue);
            }

            public void detach() {
                Attr attr = this.start;
                if (attr != null) {
                    attr.detach();
                }
                Attr attr2 = this.finish;
                if (attr2 != null) {
                    attr2.detach();
                }
            }
        }

        public Roller(TopView topView) {
            this.topView = topView;
            topView.imagesRollView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                    Iterator it = Roller.this.models.iterator();
                    while (it.hasNext()) {
                        ((Sticker) it.next()).attach();
                    }
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    Iterator it = Roller.this.models.iterator();
                    while (it.hasNext()) {
                        ((Sticker) it.next()).detach();
                    }
                }
            });
        }

        public void preload(ArrayList arrayList) {
            Iterator it = this.models.iterator();
            while (it.hasNext()) {
                ((Sticker) it.next()).detach();
            }
            this.models.clear();
            this.backgrounds.clear();
            this.symbols.clear();
            Iterator it2 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class).iterator();
            while (it2.hasNext()) {
                Sticker sticker = new Sticker(this.topView.imagesRollView, (TL_stars.starGiftAttributeModel) it2.next());
                if (this.topView.isAttachedToWindow()) {
                    sticker.attach();
                }
                this.models.add(sticker);
            }
            Iterator it3 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class).iterator();
            while (it3.hasNext()) {
                this.backgrounds.add(new Background((TL_stars.starGiftAttributeBackdrop) it3.next()));
            }
            Iterator it4 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class).iterator();
            while (it4.hasNext()) {
                this.symbols.add(new Symbol((TL_stars.starGiftAttributePattern) it4.next()));
            }
        }

        public void stopPreload() {
            if (this.rolling) {
                return;
            }
            Iterator it = this.models.iterator();
            while (it.hasNext()) {
                ((Sticker) it.next()).detach();
            }
            this.models.clear();
            this.backgrounds.clear();
            this.symbols.clear();
        }

        public void detach() {
            this.rolling = false;
            this.topView.imagesRollView.resetDrawing();
            AttrRoller attrRoller = this.modelRoller;
            if (attrRoller != null) {
                attrRoller.detach();
            }
            AttrRoller attrRoller2 = this.symbolRoller;
            if (attrRoller2 != null) {
                attrRoller2.detach();
            }
            AttrRoller attrRoller3 = this.backdropRoller;
            if (attrRoller3 != null) {
                attrRoller3.detach();
            }
            AttrRoller attrRoller4 = this.backdropRoller2;
            if (attrRoller4 != null) {
                attrRoller4.detach();
            }
            stopPreload();
        }

        public boolean set(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, Runnable runnable, Runnable runnable2) {
            boolean z2 = tL_starGiftUnique == null ? false : z;
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.rollingGift;
            if (tL_starGiftUnique2 != null && tL_starGiftUnique2.id == tL_starGiftUnique.id) {
                return this.rolling;
            }
            if (!z2) {
                return false;
            }
            BackupImageView upgradeImageView = this.topView.getUpgradeImageView();
            TL_stars.starGiftAttributeModel upgradeImageViewAttribute = this.topView.getUpgradeImageViewAttribute();
            TL_stars.starGiftAttributePattern upgradePatternAttribute = this.topView.getUpgradePatternAttribute();
            TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = this.topView.getUpgradeBackdropAttribute();
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.rolling = true;
            this.rollingGift = tL_starGiftUnique;
            this.whenDone = runnable;
            this.whenDone2 = runnable2;
            this.durationT = (float) Math.random();
            this.lastFrameTime = System.currentTimeMillis();
            this.realTime = 0.0f;
            this.sentDone = false;
            this.sentDone2 = false;
            this.rolling = true;
            AttrRoller attrRoller = this.modelRoller;
            if (attrRoller != null) {
                attrRoller.detach();
            }
            Sticker sticker = new Sticker(this.topView.imagesRollView, stargiftattributemodel);
            if (this.topView.imagesRollView.isAttachedToWindow()) {
                sticker.attach();
            }
            this.modelRoller = new AttrRoller(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            }, this.models, new Sticker(upgradeImageView, upgradeImageViewAttribute), sticker, 0.9f, this.durationT > 0.5f ? 3 : 2);
            AttrRoller attrRoller2 = this.symbolRoller;
            if (attrRoller2 != null) {
                attrRoller2.detach();
            }
            this.symbolRoller = new AttrRoller(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            }, this.symbols, new Symbol(upgradePatternAttribute), new Symbol(stargiftattributepattern), 1.0f, this.durationT > 0.5f ? 2 : 1);
            AttrRoller attrRoller3 = this.backdropRoller;
            if (attrRoller3 != null) {
                attrRoller3.detach();
            }
            this.backdropRoller = new AttrRoller(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            }, this.backgrounds, new Background(upgradeBackdropAttribute), new Background(stargiftattributebackdrop), 0.5f, this.durationT > 0.5f ? 2 : 1);
            AttrRoller attrRoller4 = this.backdropRoller2;
            if (attrRoller4 != null) {
                attrRoller4.detach();
            }
            this.backdropRoller2 = new AttrRoller(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            }, this.backgrounds, new Background(upgradeBackdropAttribute), new Background(stargiftattributebackdrop), 1.25f, this.durationT > 0.5f ? 2 : 1);
            invalidate();
            return true;
        }

        public void skip() {
            this.modelRoller.skip();
            this.symbolRoller.skip();
            this.backdropRoller.skip();
            this.backdropRoller2.skip();
        }

        public boolean isRolling() {
            return this.rolling;
        }

        public void invalidate() {
            if (this.rolling && !this.posted) {
                this.posted = true;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.update();
                    }
                });
            }
        }

        public void update() {
            if (this.drawing) {
                return;
            }
            this.posted = false;
            if (this.rolling) {
                this.drawing = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fMin = Math.min((jCurrentTimeMillis - this.lastFrameTime) / 1000.0f, 0.25f);
                float f = this.realTime + fMin;
                this.realTime = f;
                float fStep = this.backdropRoller.step(fMin, f > AndroidUtilities.lerp(0.1f, 1.0f, this.durationT));
                float fStep2 = this.backdropRoller2.step(fMin, this.realTime > AndroidUtilities.lerp(0.1f, 1.0f, this.durationT));
                float fStep3 = this.symbolRoller.step(fMin, this.backdropRoller.isAlmostFinished(0.5f));
                float fStep4 = this.modelRoller.step(fMin, this.backdropRoller.isAlmostFinished(0.5f) && this.symbolRoller.isAlmostFinished(0.5f));
                this.lastFrameTime = jCurrentTimeMillis;
                if (this.backdropRoller.isFinished() && this.symbolRoller.isFinished() && this.modelRoller.isFinished() && !this.sentDone) {
                    this.sentDone = true;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$update$0();
                        }
                    });
                }
                if (this.backdropRoller.isFinished() && this.symbolRoller.isFinished() && this.modelRoller.isAlmostFinished() && !this.sentDone2) {
                    this.sentDone2 = true;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$update$1();
                        }
                    });
                }
                TextViewRoll textViewRoll = this.modelText;
                if (textViewRoll != null) {
                    AttrRoller attrRoller = this.modelRoller;
                    Attr attr = attrRoller.prev;
                    float f2 = attrRoller.currentT - fStep4;
                    float f3 = f2 - 1.0f;
                    Attr attr2 = attrRoller.finish;
                    boolean z = attr == attr2;
                    Attr attr3 = attrRoller.current;
                    boolean z2 = attr3 == attr2;
                    Attr attr4 = attrRoller.next;
                    textViewRoll.update(attr, f3, z, attr3, f2, z2, attr4, f2 + 1.0f, attr4 == attr2);
                }
                TextViewRoll textViewRoll2 = this.patternText;
                if (textViewRoll2 != null) {
                    AttrRoller attrRoller2 = this.symbolRoller;
                    Attr attr5 = attrRoller2.prev;
                    float f4 = attrRoller2.currentT - fStep3;
                    float f5 = f4 - 1.0f;
                    Attr attr6 = attrRoller2.finish;
                    boolean z3 = attr5 == attr6;
                    Attr attr7 = attrRoller2.current;
                    boolean z4 = attr7 == attr6;
                    Attr attr8 = attrRoller2.next;
                    textViewRoll2.update(attr5, f5, z3, attr7, f4, z4, attr8, f4 + 1.0f, attr8 == attr6);
                }
                TextViewRoll textViewRoll3 = this.backdropText;
                if (textViewRoll3 != null) {
                    AttrRoller attrRoller3 = this.backdropRoller2;
                    Attr attr9 = attrRoller3.prev;
                    float f6 = attrRoller3.currentT - fStep2;
                    float f7 = f6 - 1.0f;
                    Attr attr10 = attrRoller3.finish;
                    boolean z5 = attr9 == attr10;
                    Attr attr11 = attrRoller3.current;
                    boolean z6 = attr11 == attr10;
                    Attr attr12 = attrRoller3.next;
                    textViewRoll3.update(attr9, f7, z5, attr11, f6, z6, attr12, f6 + 1.0f, attr12 == attr10);
                }
                this.topView.setPattern(0, ((Symbol) this.symbolRoller.current).attr, true);
                StickersRollView stickersRollView = this.topView.imagesRollView;
                AttrRoller attrRoller4 = this.modelRoller;
                Attr attr13 = attrRoller4.prev;
                Sticker sticker = (Sticker) attr13;
                float f8 = attrRoller4.currentT - fStep4;
                float f9 = f8 - 1.0f;
                Attr attr14 = attrRoller4.finish;
                boolean z7 = attr13 == attr14;
                Attr attr15 = attrRoller4.current;
                Sticker sticker2 = (Sticker) attr15;
                boolean z8 = attr15 == attr14;
                Attr attr16 = attrRoller4.next;
                Sticker sticker3 = (Sticker) attr16;
                float f10 = f8 + 1.0f;
                boolean z9 = attr16 == attr14;
                AttrRoller attrRoller5 = this.backdropRoller;
                Attr attr17 = attrRoller5.prev;
                Background background = (Background) attr17;
                float f11 = attrRoller5.currentT - fStep;
                float f12 = f11 - 1.0f;
                Attr attr18 = attrRoller5.finish;
                boolean z10 = attr17 == attr18;
                Attr attr19 = attrRoller5.current;
                Background background2 = (Background) attr19;
                boolean z11 = attr19 == attr18;
                Attr attr20 = attrRoller5.next;
                stickersRollView.setDrawing(sticker, f9, z7, sticker2, f8, z8, sticker3, f10, z9, background, f12, z10, background2, f11, z11, (Background) attr20, f11 + 1.0f, attr20 == attr18);
                this.drawing = false;
                invalidate();
            }
        }

        public void lambda$update$0() {
            this.rolling = false;
            this.topView.imagesRollView.resetDrawing();
            Runnable runnable = this.whenDone;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void lambda$update$1() {
            Runnable runnable = this.whenDone2;
            if (runnable != null) {
                runnable.run();
            }
        }

        public static class Sticker extends Attr {
            public final ImageReceiver imageReceiver;
            public final boolean mine;

            public Sticker(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
                this.name = stargiftattributemodel.name;
                this.rarity_permille = stargiftattributemodel.getRarityPermille();
                this.mine = true;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                this.imageReceiver = imageReceiver;
                StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, 160);
            }

            public Sticker(BackupImageView backupImageView, TL_stars.starGiftAttributeModel stargiftattributemodel) {
                this.name = stargiftattributemodel.name;
                this.rarity_permille = stargiftattributemodel.getRarityPermille();
                this.mine = false;
                this.imageReceiver = backupImageView.getImageReceiver();
            }

            public void attach() {
                if (this.mine) {
                    this.imageReceiver.onAttachedToWindow();
                }
            }

            @Override
            public void detach() {
                if (this.mine) {
                    this.imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            public boolean isLoaded() {
                return this.imageReceiver.getLottieAnimation() != null;
            }
        }

        public static class Symbol extends Attr {
            public final TL_stars.starGiftAttributePattern attr;

            public Symbol(TL_stars.starGiftAttributePattern stargiftattributepattern) {
                this.name = stargiftattributepattern.name;
                this.rarity_permille = stargiftattributepattern.getRarityPermille();
                this.attr = stargiftattributepattern;
            }
        }

        public static class Background extends Attr {
            public final int backgroundColor;
            public final RadialGradient backgroundGradient;
            public final Matrix backgroundMatrix;
            public final Paint backgroundPaint;
            public final int patternColor;
            public final int textColor;

            public Background(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
                this.name = stargiftattributebackdrop.name;
                this.rarity_permille = stargiftattributebackdrop.getRarityPermille();
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.backgroundMatrix = new Matrix();
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.backgroundGradient = radialGradient;
                paint.setShader(radialGradient);
                this.textColor = stargiftattributebackdrop.text_color | (-16777216);
                int i = stargiftattributebackdrop.pattern_color | (-16777216);
                this.patternColor = i;
                this.backgroundColor = ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), i, 0.25f);
            }
        }
    }

    static class TextViewRoll extends FrameLayout {
        private boolean bounced;
        private final GradientClip clip;
        private final TextView current;
        private final TextView next;
        private final TextView prev;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Utilities.Callback3 showHint;

        public TextViewRoll(Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback3 callback3) {
            super(context);
            this.clip = new GradientClip();
            this.rect = new RectF();
            this.showHint = callback3;
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context, resourcesProvider);
            this.prev = textView;
            TextView textView2 = new TextView(context, resourcesProvider);
            this.current = textView2;
            TextView textView3 = new TextView(context, resourcesProvider);
            this.next = textView3;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        }

        private void bounce(final View view) {
            if (this.bounced || view == null) {
                return;
            }
            this.bounced = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StarGiftSheet.TextViewRoll.lambda$bounce$0(view, valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(180L);
            valueAnimatorOfFloat.start();
        }

        public static void lambda$bounce$0(View view, ValueAnimator valueAnimator) {
            float fSin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
            view.setScaleX(fSin);
            view.setScaleY(fSin);
        }

        static class TextView extends ButtonSpan.TextViewButtons {
            private String lastName;
            private int lastRarity;
            private final Theme.ResourcesProvider resourcesProvider;

            public TextView(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.resourcesProvider = resourcesProvider;
                setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                setTextSize(1, 14.0f);
                setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }

            public void set(String str, final int i, final Utilities.Callback3 callback3) {
                if (str == this.lastName && this.lastRarity == i) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
                spannableStringBuilder.append((CharSequence) " ").append(ButtonSpan.make(AffiliateProgramFragment.percents(i), callback3 != null ? new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$set$0(callback3, i);
                    }
                } : null, this.resourcesProvider));
                setText(spannableStringBuilder);
                this.lastName = str;
                this.lastRarity = i;
            }

            public void lambda$set$0(Utilities.Callback3 callback3, int i) {
                callback3.run(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(i)), this, Boolean.FALSE);
            }
        }

        public void update(Roller.Attr attr, float f, boolean z, Roller.Attr attr2, float f2, boolean z2, Roller.Attr attr3, float f3, boolean z3) {
            if (attr != null) {
                float fMax = z ? Math.max(0.5f, f) : f;
                this.prev.setVisibility(0);
                this.prev.set(attr.name, attr.rarity_permille, this.showHint);
                this.prev.setTranslationY(AndroidUtilities.dp(36.0f) * ((fMax - 0.5f) / 1.5f));
            } else {
                this.prev.setVisibility(4);
            }
            if (attr2 != null) {
                float fMax2 = f2;
                if (z2) {
                    fMax2 = Math.max(0.5f, fMax2);
                }
                float f4 = (fMax2 - 0.5f) / 1.5f;
                this.current.setVisibility(0);
                this.current.set(attr2.name, attr2.rarity_permille, this.showHint);
                this.current.setTranslationY(AndroidUtilities.dp(36.0f) * f4);
                if (z2 && f4 <= 0.0f) {
                    bounce(this.current);
                }
            } else {
                this.current.setVisibility(4);
            }
            if (attr3 != null) {
                float fMax3 = f3;
                if (z3) {
                    fMax3 = Math.max(0.5f, fMax3);
                }
                this.next.setVisibility(0);
                this.next.set(attr3.name, attr3.rarity_permille, this.showHint);
                this.next.setTranslationY(AndroidUtilities.dp(36.0f) * ((fMax3 - 0.5f) / 1.5f));
                return;
            }
            this.next.setVisibility(4);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.dispatchDraw(canvas);
            canvas.save();
            this.rect.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
            this.clip.draw(canvas, this.rect, 1, 1.0f);
            this.rect.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
            this.clip.draw(canvas, this.rect, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public StarGiftSheet set(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, StarsController.IGiftsList iGiftsList) {
        Roller roller;
        this.slug = str;
        this.slugStarGift = tL_starGiftUnique;
        this.giftsList = iGiftsList;
        this.resale = (tL_starGiftUnique.resell_amount == null || isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.rolling && (roller = this.roller) != null && roller.isRolling() && this.roller.rollingGift != null && this.roller.rollingGift.id != tL_starGiftUnique.id) {
            this.roller.detach();
            this.roller = null;
            this.topView.imageLayout.setAlpha(1.0f);
            this.topView.imagesRollView.setAlpha(0.0f);
        }
        this.actionView.set(this.currentAccount, this.savedStarGift);
        set(tL_starGiftUnique, false);
        String str2 = tL_starGiftUnique.owner_address;
        final String str3 = tL_starGiftUnique.gift_address;
        boolean z = tL_starGiftUnique.host_id != null;
        if (z && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            this.beforeTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$set$46(str3);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            this.beforeTableTextView.setVisibility(0);
            this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else {
            this.beforeTableTextView.setVisibility(8);
        }
        if (!z && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$set$47(str3);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            this.afterTableTextView.setVisibility(0);
        } else {
            this.afterTableTextView.setVisibility(8);
        }
        if (this.resale) {
            setButtonTextResale(tL_starGiftUnique);
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$set$48(view);
                }
            });
        }
        if (this.firstSet) {
            switchPage(0, false);
            this.layoutManager.scrollToPosition(1);
            this.firstSet = false;
        }
        updateViewPager();
        return this;
    }

    public void lambda$set$46(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public void lambda$set$47(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public void lambda$set$48(View view) {
        onBuyPressed();
    }

    private CharSequence releasedByText(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return releasedByText(starGift.released_by);
    }

    private CharSequence releasedByText(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        final String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, "@" + publicUsername), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$releasedByText$49(publicUsername);
            }
        });
    }

    public void lambda$releasedByText$49(String str) {
        lambda$new$0();
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str);
    }

    public static SpannableStringBuilder replaceSingleTagToLink(String str, final Runnable runnable) {
        int i;
        int i2;
        int iIndexOf = str.indexOf("**");
        int iIndexOf2 = str.indexOf("**", iIndexOf + 1);
        String strReplace = str.replace("**", "");
        if (iIndexOf < 0 || iIndexOf2 < 0 || (i2 = iIndexOf2 - iIndexOf) <= 2) {
            iIndexOf = -1;
            i = 0;
        } else {
            i = i2 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(-1);
                }

                @Override
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, iIndexOf, i + iIndexOf, 0);
        }
        return spannableStringBuilder;
    }

    public void set(final TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        CharSequence charSequence;
        Class cls;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        int i;
        SpannableString spannableString;
        Spannable spannableReplaceAnimatedEmoji;
        final CharSequence spannable;
        TLRPC.Message message;
        Roller roller;
        final long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        final long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        this.title = tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ',');
        if (!this.rolling && (roller = this.roller) != null && roller.isRolling() && this.roller.rollingGift != null && this.roller.rollingGift.id != tL_starGiftUnique.id) {
            this.roller.detach();
            this.roller = null;
            this.topView.imageLayout.setAlpha(1.0f);
            this.topView.imagesRollView.setAlpha(0.0f);
        } else if (this.rolling && this.roller == null) {
            this.roller = new Roller(this.topView);
        }
        this.topView.setGift(tL_starGiftUnique, isMineWithActions(this.currentAccount, peerDialogId), isMineWithActions(this.currentAccount, peerDialogId2), isWorn(this.currentAccount, getUniqueGift()), getLink() != null, this.rolling);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new EllipsizeSpanAnimator.TextAlphaSpan(190), length, spannableStringBuilder.length(), 33);
        TopView topView = this.topView;
        TLRPC.Peer peer = tL_starGiftUnique.released_by;
        topView.setText(0, spannableStringBuilder, peer == null ? stargiftattributemodel != null ? stargiftattributemodel.name : "" : null, releasedByText(peer), null);
        this.ownerTextView = null;
        this.tableView.clear();
        if (z) {
            charSequence = "";
            cls = TL_stars.starGiftAttributeModel.class;
        } else if (tL_starGiftUnique.host_id != null) {
            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                this.tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$set$51();
                    }
                });
            }
            if (peerDialogId2 != 0) {
                cls = TL_stars.starGiftAttributeModel.class;
                this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$set$52(peerDialogId2);
                    }
                }).getChildAt(1)).getChildAt(0);
                charSequence = "";
            } else {
                cls = TL_stars.starGiftAttributeModel.class;
                charSequence = "";
            }
        } else {
            charSequence = "";
            cls = TL_stars.starGiftAttributeModel.class;
            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                this.tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$set$53();
                    }
                });
            } else if (peerDialogId == 0 && tL_starGiftUnique.owner_name != null) {
                this.tableView.addRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name);
            } else if (peerDialogId != 0) {
                this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, peerDialogId, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$set$54(peerDialogId);
                    }
                }).getChildAt(1)).getChildAt(0);
            }
        }
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, cls));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z) {
            if (this.messageObject != null) {
                if (!this.messageObjectRepolled) {
                    TextView textView = (TextView) ((TableView.TableRowContent) this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), charSequence).getChildAt(1)).getChildAt(0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                    LoadingSpan loadingSpan = new LoadingSpan(textView, AndroidUtilities.dp(90.0f), 0, this.resourcesProvider);
                    int i2 = Theme.key_windowBackgroundWhiteBlackText;
                    loadingSpan.setColors(Theme.multAlpha(Theme.getColor(i2, this.resourcesProvider), 0.21f), Theme.multAlpha(Theme.getColor(i2, this.resourcesProvider), 0.08f));
                    spannableStringBuilder2.setSpan(loadingSpan, 0, 1, 33);
                    textView.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
                    repollMessage();
                } else {
                    this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total));
                }
            } else {
                this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total));
            }
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                String currency = BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true);
                final String currency2 = BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency);
                this.tableView.addRow(LocaleController.getString(R.string.GiftValue2), "~" + currency, LocaleController.getString(R.string.GiftValue2LearnMore), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$set$55(tL_starGiftUnique, currency2);
                    }
                });
            }
        }
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
            if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                final long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                i = 0;
                spannableString.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View view) {
                        StarGiftSheet.this.lambda$set$87(peerDialogId3);
                    }

                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setColor(textPaint.linkColor);
                    }
                }, 0, spannableString.length(), 33);
            } else {
                i = 0;
                spannableString = null;
            }
            final long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
            SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
            spannableString2.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    StarGiftSheet.this.lambda$set$87(peerDialogId4);
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(textPaint.linkColor);
                }
            }, i, spannableString2.length(), 33);
            if (stargiftattributeoriginaldetails.message != null) {
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                MessageObject.addEntitiesToText(spannableStringBuilder3, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder3, textPaint.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint.getFontMetricsInt());
            } else {
                spannableReplaceAnimatedEmoji = null;
            }
            String strReplaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
            if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                if (spannableReplaceAnimatedEmoji == null) {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString, strReplaceAll);
                } else {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString, strReplaceAll, spannableReplaceAnimatedEmoji);
                }
            } else if (spannableString != null) {
                if (spannableReplaceAnimatedEmoji == null) {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString, spannableString2, strReplaceAll);
                } else {
                    spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji);
                }
            } else if (spannableReplaceAnimatedEmoji == null) {
                spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString2, strReplaceAll);
            } else {
                spannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString2, strReplaceAll, spannableReplaceAnimatedEmoji);
            }
            if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                    MessageObject messageObject = this.messageObject;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) || ((TLRPC.TL_messageActionStarGiftUnique) messageAction).drop_original_details_stars < 0) {
                        }
                    }
                    TableView.TableRowFullContent tableRowFullContentAddFullRow = this.tableView.addFullRow(spannable);
                    tableRowFullContentAddFullRow.setFilled(true);
                    SpoilersTextView spoilersTextView = (SpoilersTextView) tableRowFullContentAddFullRow.getChildAt(0);
                    spoilersTextView.setTextSize(1, 12.0f);
                    spoilersTextView.setGravity(17);
                }
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                linearLayout.setOrientation(0);
                SpoilersTextView spoilersTextView2 = new SpoilersTextView(getContext());
                spoilersTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                spoilersTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
                spoilersTextView2.setTextSize(1, 12.0f);
                spoilersTextView2.setGravity(3);
                spoilersTextView2.setText(spannable);
                linearLayout.addView(spoilersTextView2, LayoutHelper.createLinear(-1, -2, 1.0f, 19));
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i3 = Theme.key_featuredStickers_addButton;
                imageView.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i3, this.resourcesProvider), 0.1f), 6, 6));
                imageView.setImageResource(R.drawable.menu_delete_old);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                ScaleStateListAnimator.apply(imageView);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$set$56(spannable, view);
                    }
                });
                linearLayout.addView(imageView, LayoutHelper.createLinear(32, 32, 0.0f, 21, 8, 0, 0, 0));
                TableRow tableRow = new TableRow(getContext());
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                layoutParams.span = 2;
                tableRow.addView(new TableView.TableRowFullContent(this.tableView, linearLayout, true), layoutParams);
                this.tableView.addView(tableRow);
            } else {
                TableView.TableRowFullContent tableRowFullContentAddFullRow2 = this.tableView.addFullRow(spannable);
                tableRowFullContentAddFullRow2.setFilled(true);
                SpoilersTextView spoilersTextView3 = (SpoilersTextView) tableRowFullContentAddFullRow2.getChildAt(0);
                spoilersTextView3.setTextSize(1, 12.0f);
                spoilersTextView3.setGravity(17);
            }
        }
        Roller roller2 = this.roller;
        if (roller2 == null || !roller2.isRolling()) {
            if (!isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                this.button.setFilled(true);
                setButtonTextResale(tL_starGiftUnique);
                this.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$set$57(view);
                    }
                });
            } else if (this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition()) >= 0) {
                this.button.setFilled(false);
                final int iFindGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition());
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.giftsList.get(iFindGiftToUpgrade);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                    spannableStringBuilder4.append((CharSequence) " e");
                    spannableStringBuilder4.setSpan(new AnimatedEmojiSpan(document, this.button.getTextPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                this.button.setText(spannableStringBuilder4, !this.firstSet);
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$set$58(iFindGiftToUpgrade, view);
                    }
                });
            } else {
                this.button.setFilled(true);
                this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$set$59(view);
                    }
                });
            }
        }
        this.actionBar.setTitle(getTitle());
        Roller roller3 = this.roller;
        if (roller3 == null || !roller3.set(tL_starGiftUnique, this.rolling, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$set$62();
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$set$63();
            }
        })) {
            return;
        }
        this.topView.imageLayout.setAlpha(0.0f);
        this.topView.imagesRollView.setAlpha(1.0f);
        this.button.setText(LocaleController.getString(R.string.GiftSkipAnimation), true);
        this.button.setFilled(true);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$set$64(view);
            }
        });
        this.recyclerListView.scrollToPosition(this.adapter.getItemCount() - 1);
        this.recyclerListView.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$set$65();
            }
        });
    }

    public void lambda$set$51() {
        getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
    }

    public void lambda$set$53() {
        getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
    }

    public void lambda$set$55(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str) {
        openValueStats(tL_starGiftUnique.gift_id, tL_starGiftUnique.title, getGiftName(), str, tL_starGiftUnique.getDocument(), tL_starGiftUnique.slug);
    }

    public void lambda$set$56(CharSequence charSequence, View view) {
        lambda$showDeleteDescriptionAlert$67(charSequence);
    }

    public void lambda$set$57(View view) {
        onBuyPressed();
    }

    public void lambda$set$58(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    public void lambda$set$59(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$62() {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        ImageReceiver imageReceiver = (this.roller.modelRoller == null || this.roller.modelRoller.current == null) ? null : ((Roller.Sticker) this.roller.modelRoller.current).imageReceiver;
        BackupImageView backupImageView = this.topView.imageView[0];
        if (imageReceiver != null && backupImageView != null && backupImageView.getImageReceiver() != null) {
            RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
            RLottieDrawable lottieAnimation2 = backupImageView.getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
            } else if (lottieAnimation2 == null && lottieAnimation != null) {
                imageReceiver.clearImage();
                backupImageView.setImageDrawable(lottieAnimation);
            }
        }
        this.topView.imageLayout.setAlpha(1.0f);
        this.topView.imagesRollView.setAlpha(0.0f);
        if (this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition()) >= 0) {
            this.button.setFilled(false);
            final int iFindGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
            Object obj = this.giftsList.get(iFindGiftToUpgrade);
            if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                spannableStringBuilder.append((CharSequence) " e");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(document, this.button.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            this.button.setText(spannableStringBuilder, true);
            this.button.setSubText(null, true);
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$set$60(iFindGiftToUpgrade, view);
                }
            });
            return;
        }
        this.button.setFilled(true);
        this.button.setText(LocaleController.getString(R.string.OK), true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$set$61(view);
            }
        });
    }

    public void lambda$set$60(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    public void lambda$set$61(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$63() {
        String str;
        if (getGift() == null) {
            str = "";
        } else {
            str = getGift().title + " #" + LocaleController.formatNumber(getGift().num, ',');
        }
        getBulletinFactory().createSimpleBulletin(R.raw.gift_upgrade, LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str))).setDuration(5000).ignoreDetach().show();
        FireworksOverlay fireworksOverlay = this.fireworksOverlay;
        if (fireworksOverlay != null) {
            fireworksOverlay.start(true);
        }
    }

    public void lambda$set$64(View view) {
        this.roller.skip();
    }

    public void lambda$set$65() {
        this.recyclerListView.scrollToPosition(this.adapter.getItemCount() - 1);
    }

    public void lambda$showDeleteDescriptionAlert$67(final CharSequence charSequence) {
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null || uniqueGift == null) {
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = inputStarGift;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$showDeleteDescriptionAlert$72(charSequence, uniqueGift, tL_inputInvoiceStarGiftDropOriginalDetails, tLObject, tL_error);
            }
        });
    }

    public void lambda$showDeleteDescriptionAlert$72(final CharSequence charSequence, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showDeleteDescriptionAlert$71(tLObject, charSequence, tL_starGiftUnique, tL_inputInvoiceStarGiftDropOriginalDetails, tL_error);
            }
        });
    }

    public void lambda$showDeleteDescriptionAlert$71(TLObject tLObject, final CharSequence charSequence, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                getBulletinFactory().showForError(tL_error);
                return;
            }
            return;
        }
        final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
        final long j = 0;
        while (it.hasNext()) {
            j += it.next().amount;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView textViewMakeTextView = TextHelper.makeTextView(getContext(), 16.0f, Theme.key_dialogTextBlack, false);
        textViewMakeTextView.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 16.0f));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        TableView.TableRowFullContent tableRowFullContentAddFullRow = tableView.addFullRow(charSequence);
        tableRowFullContentAddFullRow.setFilled(true);
        SpoilersTextView spoilersTextView = (SpoilersTextView) tableRowFullContentAddFullRow.getChildAt(0);
        spoilersTextView.setTextSize(1, 12.0f);
        spoilersTextView.setGravity(17);
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2RemoveDescriptionTitle)).setView(linearLayout).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j))), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$showDeleteDescriptionAlert$70(tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j, charSequence, alertDialog, i);
            }
        }).show();
    }

    public void lambda$showDeleteDescriptionAlert$70(final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, final long j, final CharSequence charSequence, final AlertDialog alertDialog, int i) {
        if (tL_starGiftUnique == null) {
            return;
        }
        final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1);
        progressMakeButtonLoading.init();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$showDeleteDescriptionAlert$69(progressMakeButtonLoading, alertDialog, tL_starGiftUnique, j, charSequence, tLObject, tL_error);
            }
        });
    }

    public void lambda$showDeleteDescriptionAlert$69(final Browser.Progress progress, final AlertDialog alertDialog, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, final CharSequence charSequence, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showDeleteDescriptionAlert$68(progress, alertDialog, tLObject, tL_starGiftUnique, tL_error, j, charSequence);
            }
        });
    }

    public void lambda$showDeleteDescriptionAlert$68(Browser.Progress progress, AlertDialog alertDialog, TLObject tLObject, final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, final CharSequence charSequence) {
        progress.end();
        alertDialog.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i = 0;
            while (i < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i);
                    i--;
                }
                i++;
            }
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            set(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showDeleteDescriptionAlert$66(tL_starGiftUnique);
                }
            });
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 16, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showDeleteDescriptionAlert$67(charSequence);
                }
            }, 0L).show();
        } else if (tL_error != null) {
            getBulletinFactory().showForError(tL_error);
        }
    }

    public void lambda$showDeleteDescriptionAlert$66(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        getBulletinFactory().createSimpleBulletin(R.raw.ic_delete, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).show();
    }

    private void setButtonTextResale(TL_stars.StarGift starGift) {
        AmountUtils$Amount resellAmount = starGift.getResellAmount(AmountUtils$Currency.STARS);
        if (starGift.resale_ton_only) {
            this.button.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.ResellGiftBuyTON, starGift.getResellAmount(AmountUtils$Currency.TON).asFormatString())), !this.firstSet);
            this.button.setSubText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.asDecimal())), !this.firstSet);
        } else {
            this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.asDecimal())), !this.firstSet);
            this.button.setSubText(null, !this.firstSet);
        }
    }

    public StarGiftSheet setOnGiftUpdatedListener(Runnable runnable) {
        this.onGiftUpdatedListener = runnable;
        return this;
    }

    public org.telegram.ui.Stars.StarGiftSheet set(org.telegram.tgnet.tl.TL_stars.SavedStarGift r34, org.telegram.ui.Stars.StarsController.IGiftsList r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.set(org.telegram.tgnet.tl.TL_stars$SavedStarGift, org.telegram.ui.Stars.StarsController$IGiftsList):org.telegram.ui.Stars.StarGiftSheet");
    }

    public void lambda$set$73() {
        new ExplainStarsSheet(getContext()).show();
    }

    public void lambda$set$75(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda75(this)).show();
    }

    public void lambda$set$76(View view) {
        openUpgrade();
    }

    public void lambda$set$77(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    public void lambda$set$78(View view) {
        openUpgrade();
    }

    public void lambda$set$79(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$80(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public void lambda$set$81(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public TL_stars.TL_starGiftUnique getUniqueGift() {
        TL_stars.StarGift gift = getGift();
        if (gift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) gift;
        }
        return null;
    }

    public String getGiftName() {
        TL_stars.StarGift gift = getGift();
        if (gift instanceof TL_stars.TL_starGiftUnique) {
            return ((TL_stars.TL_starGiftUnique) gift).title + " #" + LocaleController.formatNumber(r0.num, ',');
        }
        return "";
    }

    public static String getGiftName(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return ((TL_stars.TL_starGiftUnique) starGift).title + " #" + LocaleController.formatNumber(r3.num, ',');
        }
        if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        }
        return LocaleController.getString(R.string.Gift2Gift);
    }

    public TL_stars.StarGift getGift() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public boolean showCraft() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null || uniqueGift.crafted || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(uniqueGift.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            return (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at > 0;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        return savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) && savedStarGift.can_craft_at > 0;
    }

    public boolean canCraft() {
        int i;
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null || uniqueGift.crafted || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(uniqueGift.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                return false;
            }
            i = savedStarGift.can_craft_at;
        }
        return i > 0 && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() >= i;
    }

    public StarGiftSheet set(MessageObject messageObject) {
        return set(messageObject, (StarsController.IGiftsList) null);
    }

    public org.telegram.ui.Stars.StarGiftSheet set(org.telegram.messenger.MessageObject r46, org.telegram.ui.Stars.StarsController.IGiftsList r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.set(org.telegram.messenger.MessageObject, org.telegram.ui.Stars.StarsController$IGiftsList):org.telegram.ui.Stars.StarGiftSheet");
    }

    public void lambda$set$82() {
        new ExplainStarsSheet(getContext()).show();
    }

    public void lambda$set$84(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda75(this)).show();
    }

    public void lambda$set$86(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda75(this)).show();
    }

    public void lambda$set$88(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda75(this)).show();
    }

    public void lambda$set$89(View view) {
        openUpgrade();
    }

    public void lambda$set$90(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    public void lambda$set$91(View view) {
        openUpgrade();
    }

    public void lambda$set$92(View view) {
        lambda$openCrafting$8();
    }

    public void lambda$set$93(View view) {
        openCrafting(true);
    }

    public void lambda$set$94(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public void lambda$set$95(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    private void repollMessage() {
        MessageObject messageObject;
        if (this.messageObjectRepolling || this.messageObjectRepolled || (messageObject = this.messageObject) == null) {
            return;
        }
        this.messageObjectRepolling = true;
        final int id = messageObject.getId();
        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
        tL_messages_getMessages.id.add(Integer.valueOf(id));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$repollMessage$97(id, tLObject, tL_error);
            }
        });
    }

    public void lambda$repollMessage$97(int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                TLRPC.Message message = messages_messages.messages.get(i2);
                if (message != null && message.id == i) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(this.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
            messageObject = null;
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$repollMessage$96(tLObject, messageObject);
                }
            });
        }
    }

    public void lambda$repollMessage$96(TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
        this.messageObjectRepolled = true;
        this.messageObjectRepolling = false;
        Boolean bool = this.unsavedFromSavedStarGift;
        if (bool != null && messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        set(messageObject);
    }

    private void repollSavedStarGift() {
        TL_stars.InputSavedStarGift inputStarGift;
        if (this.userStarGiftRepolling || this.userStarGiftRepolled || this.messageObject == null || (inputStarGift = getInputStarGift()) == null) {
            return;
        }
        this.userStarGiftRepolling = true;
        StarsController.getInstance(this.currentAccount).getUserStarGift(inputStarGift, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$repollSavedStarGift$98((TL_stars.SavedStarGift) obj);
            }
        });
    }

    public void lambda$repollSavedStarGift$98(TL_stars.SavedStarGift savedStarGift) {
        TLRPC.Message message;
        this.userStarGiftRepolling = false;
        this.userStarGiftRepolled = true;
        if (savedStarGift != null) {
            this.unsavedFromSavedStarGift = Boolean.valueOf(savedStarGift.unsaved);
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                boolean z = tL_messageActionStarGiftUnique.saved;
                boolean z2 = !savedStarGift.unsaved;
                if (z == z2) {
                    return;
                } else {
                    tL_messageActionStarGiftUnique.saved = z2;
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                boolean z3 = tL_messageActionStarGift.saved;
                boolean z4 = !savedStarGift.unsaved;
                if (z3 == z4) {
                    return;
                } else {
                    tL_messageActionStarGift.saved = z4;
                }
            }
            set(messageObject);
        }
    }

    public void openAsLearnMore(long j, final String str) {
        this.isLearnMore = true;
        StarsController.getInstance(this.currentAccount).getStarGiftPreview(j, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openAsLearnMore$100(str, (TL_stars.starGiftUpgradePreview) obj);
            }
        });
    }

    public void lambda$openAsLearnMore$100(String str, TL_stars.starGiftUpgradePreview stargiftupgradepreview) {
        if (stargiftupgradepreview == null) {
            return;
        }
        this.topView.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
        switchPage(1, false);
        this.topView.setText(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str), null, null);
        this.upgradeFeatureCells[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
        this.upgradeFeatureCells[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
        this.upgradeFeatureCells[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
        this.checkboxLayout.setVisibility(8);
        this.checkboxSeparator.setVisibility(8);
        this.button.setFilled(true);
        this.button.setText(LocaleController.getString(R.string.OK), false);
        this.button.setSubText(null, false);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$openAsLearnMore$99(view);
            }
        });
        show();
    }

    public void lambda$openAsLearnMore$99(View view) {
        lambda$new$0();
    }

    private long getDialogId() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return 0L;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                if (peer2 != null) {
                    return DialogObject.getPeerDialogId(peer2);
                }
                return messageObject.isOutOwner() ? this.messageObject.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                    return DialogObject.getPeerDialogId(peer);
                }
                TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                if (peer3 != null) {
                    return DialogObject.getPeerDialogId(peer3);
                }
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
                }
                return this.dialogId;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
        }
        return 0L;
    }

    private String getLink() {
        TL_stars.StarGift gift = getGift();
        if (!(gift instanceof TL_stars.TL_starGiftUnique) || gift.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + gift.slug;
    }

    public void openInProfile() {
        long dialogId = getDialogId();
        if (dialogId == 0) {
            return;
        }
        lambda$set$87(dialogId);
    }

    public void lambda$set$87(long j) {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || UserObject.isService(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    private boolean canSomeoneConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return false;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z = tL_messageActionStarGift.peer != null;
            messageObject.isOutOwner();
            this.messageObject.getDialogId();
            UserConfig.getInstance(this.currentAccount).getClientUserId();
            return (!z || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null) {
            return false;
        }
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        if (!isMineWithActions(this.currentAccount, this.dialogId)) {
            return false;
        }
        int i = this.savedStarGift.flags;
        return ((((this.dialogId > 0L ? 1 : (this.dialogId == 0L ? 0 : -1)) < 0 ? 2048 : 8) & i) == 0 || (i & 16) == 0 || (i & 2) == 0 || currentTime <= 0) ? false : true;
    }

    private boolean canConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return false;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.messageObject.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.messageObject.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null) {
            return false;
        }
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        if (!isMineWithActions(this.currentAccount, this.dialogId)) {
            return false;
        }
        int i = this.savedStarGift.flags;
        return ((((this.dialogId > 0L ? 1 : (this.dialogId == 0L ? 0 : -1)) < 0 ? 2048 : 8) & i) == 0 || (i & 16) == 0 || (i & 2) == 0 || currentTime <= 0) ? false : true;
    }

    public void convert() {
        int i;
        long peerDialogId;
        long j;
        long dialogId;
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            i = messageObject.messageOwner.date;
            boolean zIsOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = this.messageObject;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            if (peer != null) {
                dialogId = DialogObject.getPeerDialogId(peer);
            } else {
                dialogId = zIsOutOwner ? messageObject2.getDialogId() : clientUserId;
            }
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            if (peer2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(peer2);
            } else {
                peerDialogId = zIsOutOwner ? clientUserId : this.messageObject.getDialogId();
            }
            j = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            i = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j = this.savedStarGift.convert_stars;
            dialogId = this.dialogId;
        }
        final long j2 = j;
        final long j3 = dialogId;
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ConvertTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", Math.max(1, (MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - i)) / 86400), (UserObject.isService(peerDialogId) || peerDialogId == 2666000) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j2)))).setPositiveButton(LocaleController.getString(R.string.Gift2ConvertButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$convert$105(inputStarGift, j3, clientUserId, j2, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    public void lambda$convert$105(TL_stars.InputSavedStarGift inputSavedStarGift, final long j, final long j2, final long j3, AlertDialog alertDialog, int i) {
        final AlertDialog alertDialog2 = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog2.showDelayed(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(convertstargift, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$convert$104(alertDialog2, j, j2, j3, tLObject, tL_error);
            }
        });
    }

    public void lambda$convert$104(final AlertDialog alertDialog, final long j, final long j2, final long j3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$convert$103(alertDialog, tLObject, j, j2, j3, tL_error);
            }
        });
    }

    public void lambda$convert$103(AlertDialog alertDialog, TLObject tLObject, long j, long j2, final long j3, TLRPC.TL_error tL_error) {
        alertDialog.dismissUnless(400L);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show(false);
                return;
            } else {
                getBulletinFactory().createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show(false);
                return;
            }
        }
        lambda$new$0();
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        if (j >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j2);
            if (userFull != null) {
                int iMax = Math.max(0, userFull.stargifts_count - 1);
                userFull.stargifts_count = iMax;
                if (iMax <= 0) {
                    userFull.flags2 &= -257;
                }
            }
            StarsController.getInstance(this.currentAccount).invalidateBalance();
            StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
            if (!(safeLastFragment instanceof StarsIntroActivity)) {
                final StarsIntroActivity starsIntroActivity = new StarsIntroActivity();
                starsIntroActivity.whenFullyVisible(new Runnable() {
                    @Override
                    public final void run() {
                        StarGiftSheet.lambda$convert$101(starsIntroActivity, j3);
                    }
                });
                safeLastFragment.presentFragment(starsIntroActivity);
                return;
            }
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j3)).show(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j);
        bundle.putBoolean("start_from_monetization", true);
        final StatisticActivity statisticActivity = new StatisticActivity(bundle);
        BotStarsController.getInstance(this.currentAccount).invalidateStarsBalance(j);
        BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j, true);
        statisticActivity.whenFullyVisible(new Runnable() {
            @Override
            public final void run() {
                StarGiftSheet.lambda$convert$102(statisticActivity, j3);
            }
        });
        safeLastFragment.presentFragment(statisticActivity);
    }

    public static void lambda$convert$101(StarsIntroActivity starsIntroActivity, long j) {
        BulletinFactory.of(starsIntroActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j)).show(true);
    }

    public static void lambda$convert$102(StatisticActivity statisticActivity, long j) {
        BulletinFactory.of(statisticActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j)).show(true);
    }

    public void toggleShow() {
        boolean z;
        TLRPC.Document document;
        final boolean z2;
        StarsController.GiftsCollections profileGiftCollectionsList;
        TLRPC.Message message;
        if (this.button.isLoading()) {
            return;
        }
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            z = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        }
        final TLRPC.Document document2 = document;
        final boolean z3 = z;
        this.button.setLoading(true);
        final TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z3;
        savestargift.stargift = inputStarGift;
        if (this.savedStarGift == null || (profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false)) == null) {
            z2 = false;
        } else {
            profileGiftCollectionsList.updateGiftsUnsaved(this.savedStarGift, savestargift.unsave);
            z2 = true;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleShow$108(z2, document2, z3, savestargift, tLObject, tL_error);
            }
        });
    }

    public void lambda$toggleShow$108(final boolean z, final TLRPC.Document document, final boolean z2, final TL_stars.saveStarGift savestargift, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleShow$107(tLObject, z, document, z2, tL_error, savestargift);
            }
        });
    }

    public void lambda$toggleShow$107(TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        StarsController.GiftsCollections profileGiftCollectionsList;
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z && this.savedStarGift != null && (profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false)) != null) {
                    profileGiftCollectionsList.updateGiftsUnsaved(this.savedStarGift, !savestargift.unsave);
                }
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show(false);
                return;
            }
            return;
        }
        lambda$new$0();
        final long dialogId = getDialogId();
        if (!z) {
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(dialogId);
        }
        if (dialogId >= 0) {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z2 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z2 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), safeLastFragment instanceof ProfileActivity ? null : new Runnable() {
                @Override
                public final void run() {
                    StarGiftSheet.lambda$toggleShow$106(dialogId, safeLastFragment);
                }
            })).show(true);
        } else {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z2 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z2 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).show();
        }
    }

    public static void lambda$toggleShow$106(long j, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("my_profile", true);
        bundle.putBoolean("open_gifts", true);
        baseFragment.presentFragment(new ProfileActivity(bundle));
    }

    @Override
    public void lambda$new$0() {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return;
        }
        ResaleGiftsFragment.SelectGiftSheet.State state = this.giftsToCraft;
        if (state != null) {
            state.detach();
            this.giftsToCraft = null;
        }
        Roller roller = this.roller;
        if (roller != null) {
            roller.detach();
        }
        super.lambda$new$0();
    }

    @Override
    public void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        if (this.slug != null && this.slugStarGift == null) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$show$111(alertDialog, tLObject, tL_error);
                }
            });
        } else if (this.savedStarGift == null && (messageObject = this.messageObject) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                final TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        final AlertDialog alertDialog2 = new AlertDialog(getContext(), 3);
                        alertDialog2.showDelayed(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                this.f$0.lambda$show$114(tL_messageActionStarGift, alertDialog2, tLObject, tL_error);
                            }
                        });
                        return;
                    }
                    if (getInputStarGift() != null) {
                        final AlertDialog alertDialog3 = new AlertDialog(getContext(), 3);
                        alertDialog3.showDelayed(500L);
                        StarsController.getInstance(this.currentAccount).getUserStarGift(getInputStarGift(), new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                this.f$0.lambda$show$115(alertDialog3, (TL_stars.SavedStarGift) obj);
                            }
                        });
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public void lambda$show$111(final AlertDialog alertDialog, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            final TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$show$109(tL_payments_uniqueStarGift);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarGiftSheet.lambda$show$110(alertDialog, tL_error);
            }
        });
    }

    public void lambda$show$109(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.slugStarGift = tL_starGiftUnique;
        set(tL_starGiftUnique, false);
        super.show();
    }

    public static void lambda$show$110(AlertDialog alertDialog, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.fire_on, LocaleController.getString(R.string.UniqueGiftNotFoundBurned)).show();
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UniqueGiftNotFound)).show();
            }
        }
    }

    public void lambda$show$114(TLRPC.TL_messageActionStarGift tL_messageActionStarGift, final AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            for (int i = 0; i < messages_messages.messages.size(); i++) {
                TLRPC.Message message = messages_messages.messages.get(i);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(this.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
            messageObject = null;
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$show$112(alertDialog, messageObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarGiftSheet.lambda$show$113(alertDialog);
                }
            });
        }
    }

    public void lambda$show$112(AlertDialog alertDialog, MessageObject messageObject) {
        alertDialog.dismiss();
        this.messageObjectRepolled = true;
        set(messageObject);
        super.show();
    }

    public static void lambda$show$113(AlertDialog alertDialog) {
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
        }
    }

    public void lambda$show$115(AlertDialog alertDialog, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            alertDialog.dismiss();
            this.userStarGiftRepolled = true;
            set(savedStarGift, (StarsController.IGiftsList) null);
            super.show();
            return;
        }
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
        }
    }

    private void openUpgrade() {
        TL_stars.InputSavedStarGift inputStarGift;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        if (this.switchingPagesAnimator == null && (inputStarGift = getInputStarGift()) != null) {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j = tL_messageActionStarGift.gift.id;
                j2 = tL_messageActionStarGift.upgrade_stars;
                z4 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z2 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (tL_messageActionStarGift.prepaid_upgrade) {
                    z3 = DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.messageObject.getFromChatId();
                } else {
                    z3 = tL_messageActionStarGift.upgrade_separate;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j3 = starGift.id;
                long j4 = savedStarGift.upgrade_stars;
                boolean z5 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z2 = this.dialogId < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                str = savedStarGift2.prepaid_upgrade_hash;
                z3 = savedStarGift2.upgrade_separate;
                z4 = z5;
                j = j3;
                j2 = j4;
            }
            if (z4) {
                this.checkboxTextView.setText(LocaleController.getString(z2 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z) {
                this.checkboxTextView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                this.checkboxTextView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            this.checkbox.setChecked((z4 || j2 <= 0 || z3) ? false : true, false);
            ArrayList arrayList = this.sample_attributes;
            if (arrayList == null || (j2 <= 0 && this.upgrade_form == null)) {
                if (arrayList == null) {
                    StarsController.getInstance(this.currentAccount).getStarGiftPreview(j, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$openUpgrade$116((TL_stars.starGiftUpgradePreview) obj);
                        }
                    });
                }
                if (j2 > 0 || this.upgrade_form != null) {
                    return;
                }
                this.requesting_upgrade_form = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.isChecked();
                    tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
                if (jSONObjectMakeThemeParams != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$openUpgrade$118(tLObject, tL_error);
                    }
                });
                return;
            }
            openUpgradeAfter();
        }
    }

    public void lambda$openUpgrade$116(TL_stars.starGiftUpgradePreview stargiftupgradepreview) {
        if (stargiftupgradepreview == null) {
            return;
        }
        this.sample_attributes = stargiftupgradepreview.sample_attributes;
        this.prices = stargiftupgradepreview.prices;
        this.next_prices = stargiftupgradepreview.next_prices;
        openUpgradeAfter();
    }

    public void lambda$openUpgrade$118(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openUpgrade$117(tLObject, tL_error);
            }
        });
    }

    public void lambda$openUpgrade$117(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.requesting_upgrade_form = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            this.upgrade_form = paymentForm;
            openUpgradeAfter();
            return;
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    private void openUpgradeAfter() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.openUpgradeAfter():void");
    }

    public void lambda$openUpgradeAfter$119(View view) {
        doUpgrade();
    }

    public void lambda$openUpgradeAfter$120(long j) {
        switchPage(1, true);
        if (j > 0) {
            AndroidUtilities.cancelRunOnUIThread(this.tickUpgradePriceRunnable);
            AndroidUtilities.runOnUIThread(this.tickUpgradePriceRunnable);
        }
    }

    public void openUpgradePrices() {
        if (this.upgrade_form == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < this.upgrade_form.invoice.prices.size(); i++) {
            j += this.upgrade_form.invoice.prices.get(i).amount;
        }
        UpgradePricesSheet upgradePricesSheet = new UpgradePricesSheet(getContext(), j, this.prices, this.resourcesProvider);
        this.upgradeSheet = upgradePricesSheet;
        upgradePricesSheet.show();
    }

    public void tickUpgradePrice() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.tickUpgradePrice():void");
    }

    public void lambda$tickUpgradePrice$122(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$tickUpgradePrice$121(tLObject, tL_error);
            }
        });
    }

    public void lambda$tickUpgradePrice$121(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.requesting_upgrade_form = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            this.upgrade_form = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(this.tickUpgradePriceRunnable);
            AndroidUtilities.runOnUIThread(this.tickUpgradePriceRunnable);
            return;
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    private int applyNewGiftFromUpdates(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        if (updates == null) {
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
            lambda$new$0();
            return 0;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TLRPC.TL_updateNewMessage) {
            message = ((TLRPC.TL_updateNewMessage) update).message;
        } else if (updates.updates != null) {
            for (int i = 0; i < updates.updates.size(); i++) {
                TLRPC.Update update2 = updates.updates.get(i);
                if (update2 instanceof TLRPC.TL_updateNewMessage) {
                    message = ((TLRPC.TL_updateNewMessage) update2).message;
                    break;
                }
            }
            message = null;
        } else {
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null && inputSavedStarGift != null && eq(savedStarGift, inputSavedStarGift)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.rolling = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    int i2 = savedStarGift2.flags | 8;
                    savedStarGift2.msg_id = message.id;
                    savedStarGift2.flags = i2 & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    set(savedStarGift2, this.giftsList);
                    this.sample_attributes = null;
                    this.rolling = false;
                    StarsController.IGiftsList iGiftsList = this.giftsList;
                    if (iGiftsList != null) {
                        iGiftsList.notifyUpdate();
                    } else {
                        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(this.dialogId);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return 1;
                }
            }
            if (this.giftsList == null) {
                StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
            }
            this.rolling = true;
            this.savedStarGift = null;
            this.myProfile = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            set(messageObject, this.giftsList);
            this.sample_attributes = null;
            this.rolling = false;
            AndroidUtilities.runOnUIThread(runnable);
            return 1;
        }
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
        lambda$new$0();
        return 0;
    }

    private void doUpgrade() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.doUpgrade():void");
    }

    public void lambda$doUpgrade$126(final TL_stars.InputSavedStarGift inputSavedStarGift, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doUpgrade$125(tL_error, tLObject, inputSavedStarGift);
            }
        });
    }

    public void lambda$doUpgrade$125(TLRPC.TL_error tL_error, final TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift) {
        if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
            getBulletinFactory().showForError(tL_error);
            return;
        }
        this.upgradedOnce = true;
        this.upgrade_form = null;
        applyNewGiftFromUpdates(inputSavedStarGift, (TLRPC.Updates) tLObject, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doUpgrade$123();
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doUpgrade$124(tLObject);
            }
        });
    }

    public void lambda$doUpgrade$123() {
        this.button.setLoading(false);
        switchPage(0, true);
    }

    public void lambda$doUpgrade$124(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$doUpgrade$127(StarsController starsController) {
        if (!starsController.balanceAvailable()) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
        } else {
            this.button.setLoading(false);
            doUpgrade();
        }
    }

    public void lambda$doUpgrade$136(final String str, final TL_stars.InputSavedStarGift inputSavedStarGift, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doUpgrade$135(tLObject, str, inputSavedStarGift, tL_error, j);
            }
        });
    }

    public void lambda$doUpgrade$135(TLObject tLObject, final String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, final long j) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            StarsController.getInstance(this.currentAccount).invalidateTransactions(false);
            StarsController.getInstance(this.currentAccount).invalidateBalance();
            if (!TextUtils.isEmpty(str) && (savedStarGift = this.savedStarGift) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            this.upgradedOnce = true;
            this.upgrade_form = null;
            applyNewGiftFromUpdates(inputSavedStarGift, tL_payments_paymentResult.updates, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doUpgrade$130(str);
                }
            });
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doUpgrade$131(tL_payments_paymentResult);
                }
            });
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                this.button.setLoading(false);
                StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                return;
            } else {
                StarsController.getInstance(this.currentAccount).invalidateBalance(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$doUpgrade$134(j);
                    }
                });
                return;
            }
        }
        getBulletinFactory().showForError(tL_error);
    }

    public void lambda$doUpgrade$130(String str) {
        this.button.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            lambda$new$0();
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null) {
                return;
            }
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.getDialogId() == this.dialogId) {
                    BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(this.dialogId)))).show(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
            int i = NotificationCenter.closeProfileActivity;
            Long lValueOf = Long.valueOf(this.dialogId);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i, lValueOf, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(this.dialogId), bool);
            final ChatActivity chatActivityOf = ChatActivity.of(this.dialogId);
            chatActivityOf.whenFullyVisible(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doUpgrade$129(chatActivityOf);
                }
            });
            lastFragment.presentFragment(chatActivityOf);
            return;
        }
        switchPage(0, true);
    }

    public void lambda$doUpgrade$129(ChatActivity chatActivity) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(this.dialogId))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doUpgrade$128();
            }
        }).show(true);
    }

    public void lambda$doUpgrade$128() {
        Bundle bundle = new Bundle();
        long j = this.dialogId;
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        presentFragment(new ProfileActivity(bundle));
    }

    public void lambda$doUpgrade$131(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public void lambda$doUpgrade$134(long j) {
        final boolean[] zArr = {false};
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 10, null, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doUpgrade$132(zArr);
            }
        }, 0L);
        starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$doUpgrade$133(dialogInterface);
            }
        });
        starsNeededSheet.show();
    }

    public void lambda$doUpgrade$132(boolean[] zArr) {
        zArr[0] = true;
        this.button.setLoading(false);
        doUpgrade();
    }

    public void lambda$doUpgrade$133(DialogInterface dialogInterface) {
        this.button.setLoading(false);
    }

    private void cantWithBlockchainGiftAlert(int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.Gift2CantDoTitle));
        builder.setMessage(LocaleController.getString(R.string.Gift2CantDoText));
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift != null && !TextUtils.isEmpty(uniqueGift.slug)) {
            builder.setPositiveButton(LocaleController.getString(R.string.OpenFragment), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    this.f$0.lambda$cantWithBlockchainGiftAlert$137(uniqueGift, alertDialog, i2);
                }
            });
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.show();
    }

    public void lambda$cantWithBlockchainGiftAlert$137(TL_stars.TL_starGiftUnique tL_starGiftUnique, AlertDialog alertDialog, int i) {
        Browser.openUrlInSystemBrowser(getContext(), "https://fragment.com/gift/" + tL_starGiftUnique.slug);
    }

    public void onTransferClick(View view) {
        if (view.getAlpha() < 0.99f) {
            cantWithBlockchainGiftAlert(0);
        } else {
            openTransfer();
        }
    }

    public void openTransfer() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.openTransfer():void");
    }

    public void lambda$openTransfer$149(int i, int i2, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Long l) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l.longValue() == -99) {
            if (i < i2) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle)).setMessage(LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i3), new Object[0])).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new GiftTransferTopView(getContext(), tL_starGiftUnique), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            int i4 = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
            textView2.setTextSize(1, 16.0f);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ExportTONFragmentText, getGiftName())));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i5) {
                    this.f$0.lambda$openTransfer$140(userSelectorBottomSheetArr, alertDialog, i5);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
            return;
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openTransfer$144(l, userSelectorBottomSheetArr);
            }
        };
        if (l.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-l.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-l.longValue());
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getFullChannel, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$openTransfer$146(runnable, tLObject, tL_error);
                    }
                });
                return;
            } else if (!chatFull.stargifts_available) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle)).setMessage(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
        } else if (l.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(l.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                BulletinFactory.of(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getFullUser, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$openTransfer$148(userSelectorBottomSheetArr, l, runnable, tLObject, tL_error);
                    }
                });
                return;
            }
        }
        runnable.run();
    }

    public void lambda$openTransfer$140(final UserSelectorBottomSheet[] userSelectorBottomSheetArr, AlertDialog alertDialog, int i) {
        final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(i);
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(2, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                this.f$0.lambda$openTransfer$138(twoStepVerificationActivity, inputCheckPasswordSRP);
            }
        });
        twoStepVerificationActivity.setDelegateString(getGiftName());
        progressMakeButtonLoading.init();
        twoStepVerificationActivity.preload(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openTransfer$139(userSelectorBottomSheetArr, progressMakeButtonLoading, twoStepVerificationActivity);
            }
        });
    }

    public void lambda$openTransfer$139(UserSelectorBottomSheet[] userSelectorBottomSheetArr, Browser.Progress progress, TwoStepVerificationActivity twoStepVerificationActivity) {
        userSelectorBottomSheetArr[0].lambda$new$0();
        progress.end();
        presentFragment(twoStepVerificationActivity);
    }

    public void lambda$openTransfer$144(final Long l, final UserSelectorBottomSheet[] userSelectorBottomSheetArr) {
        openTransferAlert(l.longValue(), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openTransfer$143(l, userSelectorBottomSheetArr, (Browser.Progress) obj);
            }
        });
    }

    public void lambda$openTransfer$143(Long l, final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Browser.Progress progress) {
        progress.init();
        doTransfer(l.longValue(), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openTransfer$142(progress, userSelectorBottomSheetArr, (TLRPC.TL_error) obj);
            }
        });
    }

    public void lambda$openTransfer$142(Browser.Progress progress, UserSelectorBottomSheet[] userSelectorBottomSheetArr, final TLRPC.TL_error tL_error) {
        progress.end();
        userSelectorBottomSheetArr[0].lambda$new$0();
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openTransfer$141(tL_error);
                }
            });
        } else {
            lambda$new$0();
        }
    }

    public void lambda$openTransfer$141(TLRPC.TL_error tL_error) {
        getBulletinFactory().showForError(tL_error);
    }

    public void lambda$openTransfer$146(final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openTransfer$145(tLObject, runnable, tL_error);
            }
        });
    }

    public void lambda$openTransfer$145(TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(this.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle)).setMessage(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            } else {
                runnable.run();
                return;
            }
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    public void lambda$openTransfer$148(final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Long l, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openTransfer$147(tLObject, userSelectorBottomSheetArr, l, runnable, tL_error);
            }
        });
    }

    public void lambda$openTransfer$147(TLObject tLObject, UserSelectorBottomSheet[] userSelectorBottomSheetArr, Long l, Runnable runnable, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                runnable.run();
                return;
            } else {
                BulletinFactory.of(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
                return;
            }
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    public void openTransferAlert(long j, Utilities.Callback callback) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j2 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        }
        openTransferAlert(j, j2, callback);
    }

    private void openTransferAlert(long j, long j2, final Utilities.Callback callback) {
        String forcedFirstName;
        TLRPC.Chat chat;
        String string;
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            forcedFirstName = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat2 == null) {
                forcedFirstName = "";
                chat = chat2;
            } else {
                forcedFirstName = chat2.title;
                chat = chat2;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new GiftTransferTopView(getContext(), uniqueGift, chat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 16.0f);
        if (j2 > 0) {
            string = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j2, getGiftName(), DialogObject.getShortName(j));
        } else {
            string = LocaleController.formatString(R.string.Gift2TransferText, getGiftName(), forcedFirstName);
        }
        textView.setText(AndroidUtilities.replaceTags(string));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributeModel.class));
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(uniqueGift.slug) && (uniqueGift.flags & 256) != 0) {
            String currency = BillingController.getInstance().formatCurrency(uniqueGift.value_amount, uniqueGift.value_currency, BillingController.getInstance().getCurrencyExp(uniqueGift.value_currency), true);
            tableView.addRow(LocaleController.getString(R.string.GiftValue2), "~" + currency);
        }
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(j2 > 0 ? StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j2))) : LocaleController.getString(R.string.Gift2TransferDo), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                StarGiftSheet.lambda$openTransferAlert$150(callback, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().setShowStarsBalance(true).show();
    }

    public static void lambda$openTransferAlert$150(Utilities.Callback callback, AlertDialog alertDialog, int i) {
        callback.run(alertDialog.makeButtonLoading(i));
    }

    public void lambda$openTransfer$138(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        getstargiftwithdrawalurl.stargift = inputStarGift;
        if (inputStarGift == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$initTONTransfer$155(twoStepVerificationActivity, tLObject, tL_error);
            }
        });
    }

    public void lambda$initTONTransfer$155(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initTONTransfer$154(tL_error, twoStepVerificationActivity, tLObject);
            }
        });
    }

    public void lambda$initTONTransfer$154(TLRPC.TL_error tL_error, final TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        int i;
        if (getContext() == null) {
            return;
        }
        if (tL_error != null) {
            if ("PASSWORD_MISSING".equals(tL_error.text) || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle(LocaleController.getString(R.string.Gift2TransferToTONAlertTitle));
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                TextView textView = new TextView(getContext());
                int i2 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i2));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(getContext());
                int i3 = R.drawable.list_circle;
                imageView.setImageResource(i3);
                imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                int color = Theme.getColor(i2);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                TextView textView2 = new TextView(getContext());
                textView2.setTextColor(Theme.getColor(i2));
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText1)));
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(i3);
                imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), mode));
                TextView textView3 = new TextView(getContext());
                textView3.setTextColor(Theme.getColor(i2));
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText2)));
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                    i = 5;
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    i = 5;
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    builder.setPositiveButton(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            this.f$0.lambda$initTONTransfer$151(alertDialog, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(getContext());
                    textView4.setTextColor(Theme.getColor(i2));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i = 3;
                    }
                    textView4.setGravity(i | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.showDialog(builder.create());
                    return;
                } else {
                    builder.show();
                    return;
                }
            }
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        this.f$0.lambda$initTONTransfer$153(twoStepVerificationActivity, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.finishFragment();
            }
            BulletinFactory.showError(tL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
            Browser.openUrlInSystemBrowser(getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
        }
    }

    public void lambda$initTONTransfer$151(AlertDialog alertDialog, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$initTONTransfer$153(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initTONTransfer$152(tL_error, tLObject, twoStepVerificationActivity);
            }
        });
    }

    public void lambda$initTONTransfer$152(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$openTransfer$138(twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }

    private void presentFragment(BaseFragment baseFragment) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(baseFragment, bottomSheetParams);
    }

    private TL_stars.InputSavedStarGift getInputStarGift() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        if (this.dialogId < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            MessageObject messageObject = this.messageObject;
            if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
                return tL_inputSavedStarGiftChat;
            }
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = this.slug;
            return tL_inputSavedStarGiftSlug;
        }
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.messageObject.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.messageObject.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.messageObject;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.slug;
        return tL_inputSavedStarGiftSlug2;
    }

    public void doTransfer(final long j, final Utilities.Callback callback) {
        TLRPC.Message message;
        final long peerDialogId;
        long j2;
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            peerDialogId = this.dialogId;
            j2 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j2 = tL_messageActionStarGiftUnique.transfer_stars;
        }
        if (j2 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = inputStarGift;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$doTransfer$158(callback, j, peerDialogId, tLObject, tL_error);
                }
            });
            return;
        }
        final StarsController starsController = StarsController.getInstance(this.currentAccount);
        if (!starsController.balanceAvailable()) {
            starsController.getBalance(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doTransfer$159(starsController, j, callback);
                }
            });
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = inputStarGift;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$doTransfer$168(tL_inputInvoiceStarGiftTransfer, j, peerDialogId, callback, tLObject, tL_error);
            }
        });
    }

    public void lambda$doTransfer$158(final Utilities.Callback callback, final long j, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doTransfer$157(callback, tL_error, tLObject, j, j2);
            }
        });
    }

    public void lambda$doTransfer$157(Utilities.Callback callback, TLRPC.TL_error tL_error, TLObject tLObject, final long j, long j2) {
        if (callback != null) {
            callback.run(tL_error);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (!(tLObject instanceof TLRPC.Updates)) {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            } else if (j >= 0 && j2 >= 0) {
                final ChatActivity chatActivityOf = ChatActivity.of(j);
                chatActivityOf.whenFullyVisible(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$doTransfer$156(chatActivityOf, j);
                    }
                });
                safeLastFragment.presentFragment(chatActivityOf);
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
            }
        }
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j2);
    }

    public void lambda$doTransfer$156(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
    }

    public void lambda$doTransfer$159(StarsController starsController, long j, Utilities.Callback callback) {
        if (!starsController.balanceAvailable()) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
        } else {
            doTransfer(j, callback);
        }
    }

    public void lambda$doTransfer$168(final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, final long j, final long j2, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doTransfer$167(tLObject, tL_inputInvoiceStarGiftTransfer, j, j2, callback, tL_error);
            }
        });
    }

    public void lambda$doTransfer$167(TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, final long j, final long j2, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
            Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
            final long j3 = 0;
            while (it.hasNext()) {
                j3 += it.next().amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    this.f$0.lambda$doTransfer$166(j, j2, callback, j3, tLObject2, tL_error2);
                }
            });
            return;
        }
        if (callback != null) {
            callback.run(tL_error);
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    public void lambda$doTransfer$166(final long j, final long j2, final Utilities.Callback callback, final long j3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doTransfer$165(tLObject, j, j2, callback, tL_error, j3);
            }
        });
    }

    public void lambda$doTransfer$165(TLObject tLObject, final long j, long j2, final Utilities.Callback callback, TLRPC.TL_error tL_error, final long j3) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            StarsController.getInstance(this.currentAccount).invalidateTransactions(false);
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j2);
            StarsController.getInstance(this.currentAccount).invalidateBalance();
            if (callback != null) {
                callback.run(null);
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                if (j >= 0 && j2 >= 0) {
                    final ChatActivity chatActivityOf = ChatActivity.of(j);
                    chatActivityOf.whenFullyVisible(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$doTransfer$160(chatActivityOf, j);
                        }
                    });
                    safeLastFragment.presentFragment(chatActivityOf);
                } else {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
                }
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doTransfer$161(tL_payments_paymentResult);
                }
            });
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                this.button.setLoading(false);
                StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                return;
            } else {
                StarsController.getInstance(this.currentAccount).invalidateBalance(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$doTransfer$164(j3, j, callback);
                    }
                });
                return;
            }
        }
        if (callback != null) {
            callback.run(tL_error);
        }
        getBulletinFactory().showForError(tL_error);
    }

    public void lambda$doTransfer$160(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
    }

    public void lambda$doTransfer$161(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public void lambda$doTransfer$164(long j, final long j2, final Utilities.Callback callback) {
        final boolean[] zArr = {false};
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 11, null, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$doTransfer$162(zArr, j2, callback);
            }
        }, 0L);
        starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$doTransfer$163(dialogInterface);
            }
        });
        starsNeededSheet.show();
    }

    public void lambda$doTransfer$162(boolean[] zArr, long j, Utilities.Callback callback) {
        zArr[0] = true;
        this.button.setLoading(false);
        doTransfer(j, callback);
    }

    public void lambda$doTransfer$163(DialogInterface dialogInterface) {
        this.button.setLoading(false);
    }

    @Override
    public BulletinFactory getBulletinFactory() {
        return BulletinFactory.of(this.bottomBulletinContainer, this.resourcesProvider);
    }

    public void onBuyPressed() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.onBuyPressed():void");
    }

    public void lambda$onBuyPressed$171(AmountUtils$Currency amountUtils$Currency, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        this.button.setLoading(false);
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new ResaleBuyTransferAlert(getContext(), this.resourcesProvider, tL_starGiftUnique, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift), this.currentAccount, j, getGiftName(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$onBuyPressed$170(tL_starGiftUnique, j, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
            }
        }).show();
    }

    public void lambda$onBuyPressed$170(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, PaymentFormState paymentFormState, final Browser.Progress progress) {
        progress.init();
        StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$onBuyPressed$169(progress, tL_starGiftUnique, j, (Boolean) obj, (String) obj2);
            }
        });
    }

    public void lambda$onBuyPressed$169(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Boolean bool, String str) {
        progress.end();
        if (bool.booleanValue()) {
            Utilities.Callback2 callback2 = this.boughtGift;
            if (callback2 != null) {
                callback2.run(tL_starGiftUnique, Long.valueOf(j));
            }
            lambda$new$0();
        }
    }

    @Override
    public void lambda$openCrafting$8() {
        TopView topView;
        if (this.currentPage.is(4) && (topView = this.topView) != null && topView.craftTopView != null) {
            if (this.topView.craftTopView.crafting) {
                return;
            }
            if (this.topView.craftTopView.crafted) {
                super.lambda$openCrafting$8();
                return;
            }
        }
        if (!this.onlyWearInfo && this.currentPage.to > 0 && !this.button.isLoading() && !this.isLearnMore) {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                set(messageObject);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    set(savedStarGift, this.giftsList);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
                    if (tL_starGiftUnique != null) {
                        set(this.slug, tL_starGiftUnique, this.giftsList);
                    }
                }
            }
            switchPage(0, true);
            return;
        }
        super.lambda$openCrafting$8();
    }

    @Override
    protected boolean canDismissWithSwipe() {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    protected boolean canDismissWithTouchOutside() {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.currentPage.is(4) && this.topView.craftTopView.crafting) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    protected void onSwipeStarts() {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
    }

    public void showHint(CharSequence charSequence, View view, boolean z) {
        Layout layout;
        float paddingLeft;
        HintView2 hintView2 = this.currentHintView;
        if ((hintView2 != null && hintView2.shown() && this.currentHintViewTextView == view) || view == null) {
            return;
        }
        if (z) {
            if (!(view instanceof SimpleTextView)) {
                return;
            }
            SimpleTextView simpleTextView = (SimpleTextView) view;
            paddingLeft = simpleTextView.getRightDrawableX() + (simpleTextView.getRightDrawableWidth() / 2.0f);
        } else {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof SimpleTextView)) {
                return;
            } else {
                layout = ((SimpleTextView) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, spanned.length(), ButtonSpan.class);
            if (buttonSpanArr == null || buttonSpanArr.length <= 0) {
                return;
            }
            paddingLeft = view.getPaddingLeft() + layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpanArr[buttonSpanArr.length - 1])) + (r5.getSize() / 2.0f);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        this.container.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        HintView2 hintView22 = this.currentHintView;
        if (hintView22 != null) {
            hintView22.hide();
            this.currentHintView = null;
        }
        final HintView2 hintView23 = new HintView2(getContext(), 3);
        hintView23.setMultilineText(!z);
        hintView23.setText(charSequence);
        hintView23.setJointPx(0.0f, (iArr[0] + paddingLeft) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        hintView23.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z ? 18 : 0) + 4.33f));
        hintView23.setDuration(3000L);
        hintView23.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        hintView23.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.removeFromParent(hintView23);
            }
        });
        hintView23.show();
        this.container.addView(hintView23, LayoutHelper.createFrame(-1, 100.0f));
        this.currentHintView = hintView23;
        this.currentHintViewTextView = view;
    }

    public static class GiftTransferTopView extends View {
        private final Paint arrowPaint;
        private final Path arrowPath;
        private final StarGiftDrawableIcon giftDrawable;
        private final ImageReceiver userImageReceiver;

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setImageBitmap(SessionCell.createDrawable(60, "fragment"));
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            this.giftDrawable.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
            this.giftDrawable.draw(canvas);
            canvas.save();
            canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            canvas.restore();
            this.userImageReceiver.setImageCoords(width + AndroidUtilities.dp(96.0f), height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.userImageReceiver.draw(canvas);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }
    }

    public static class UserToUserTransferTopView extends View {
        private final Paint arrowPaint;
        private final Path arrowPath;
        private final ImageReceiver fromUserImageReceiver;
        private final ImageReceiver toUserImageReceiver;

        public UserToUserTransferTopView(Context context, TLObject tLObject, TLObject tLObject2) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.fromUserImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(tLObject2);
            ImageReceiver imageReceiver2 = new ImageReceiver(this);
            this.toUserImageReceiver = imageReceiver2;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver2.setForUserOrChat(tLObject2, avatarDrawable2);
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            float height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            this.fromUserImageReceiver.setImageCoords(width, height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.fromUserImageReceiver.draw(canvas);
            canvas.save();
            canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            canvas.restore();
            this.toUserImageReceiver.setImageCoords(width + AndroidUtilities.dp(96.0f), height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.toUserImageReceiver.draw(canvas);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.fromUserImageReceiver.onAttachedToWindow();
            this.toUserImageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.fromUserImageReceiver.onDetachedFromWindow();
            this.toUserImageReceiver.onDetachedFromWindow();
        }
    }

    public static class GiftThemeReuseTopView extends View {
        private final Drawable drawable;
        private final StarGiftDrawableIcon giftDrawable;
        private final ImageReceiver userImageReceiver;

        public GiftThemeReuseTopView(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
            super(context);
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            Drawable drawableMutate = context.getDrawable(R.drawable.chats_undo).mutate();
            this.drawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), PorterDuff.Mode.MULTIPLY));
            drawableMutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            this.giftDrawable.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
            this.giftDrawable.draw(canvas);
            canvas.save();
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.drawable.draw(canvas);
            canvas.restore();
            this.userImageReceiver.setImageCoords(width + AndroidUtilities.dp(96.0f), height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.userImageReceiver.draw(canvas);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }
    }

    public static class StarGiftDrawableIcon extends CompatDrawable {
        private final Paint countdownPaint;
        private AnimatedTextView.AnimatedTextDrawable countdownText;
        private CountdownTimer countdownTimer;
        private int endTime;
        private Text giftName;
        private Text giftStatus;
        private RadialGradient gradient;
        private final ImageReceiver imageReceiver;
        private final Matrix matrix;
        private StarsReactionsSheet.Particles particles;
        private final Path path;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        private float patternsScale;
        private int patternsType;
        private final RectF rect;
        private int rounding;
        private final int sizeDp;
        private final TL_stars.StarGift starGift;
        private int startTime;
        private final View view;

        public StarGiftDrawableIcon(View view, TL_stars.StarGift starGift, int i, float f) {
            super(view);
            this.path = new Path();
            this.rect = new RectF();
            this.matrix = new Matrix();
            this.countdownPaint = new Paint(1);
            this.rounding = AndroidUtilities.dp(16.0f);
            this.patternsType = 0;
            this.starGift = starGift;
            this.view = view;
            this.patternsScale = f;
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.imageReceiver = imageReceiver;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(i > 180 ? 24.0f : 18.0f));
            this.pattern = swapAnimatedEmojiDrawable;
            this.sizeDp = i;
            if (starGift instanceof TL_stars.TL_starGift) {
                float f2 = i;
                StarsIntroActivity.setGiftImage(imageReceiver, starGift.sticker, (int) (0.75f * f2));
                String str = starGift.title;
                Text text = new Text(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
                this.giftName = text;
                text.setColor(-1);
                float f3 = i - 30;
                this.giftName.setMaxWidth(AndroidUtilities.dp(f3));
                Text text2 = this.giftName;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                text2.align(alignment);
                this.giftName.multiline(1);
                Text text3 = new Text(starGift.sold_out ? LocaleController.getString(R.string.Gift2SoldOutTitle) : LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]), 13.0f);
                this.giftStatus = text3;
                text3.setMaxWidth(AndroidUtilities.dp(f3));
                this.giftStatus.align(alignment);
                this.giftStatus.multiline(1);
                StarsReactionsSheet.Particles particles = new StarsReactionsSheet.Particles(1, 40);
                this.particles = particles;
                float f4 = 0.45f * f2;
                particles.setBounds(-AndroidUtilities.dp(f4), -AndroidUtilities.dp(f4), AndroidUtilities.dp(f4), AndroidUtilities.dp(f2 * 0.25f));
                this.particles.generateGrid();
            } else if (starGift != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                if (stargiftattributepattern != null) {
                    swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, false);
                }
                if (stargiftattributebackdrop != null) {
                    this.gradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
                }
                if (stargiftattributemodel != null) {
                    StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
                }
            }
            this.paint.setShader(this.gradient);
            if (view.isAttachedToWindow()) {
                onAttachedToWindow();
            }
        }

        public void setGradient(int i, int i2) {
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.sizeDp) / 2.0f, new int[]{i | (-16777216), i2 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradient = radialGradient;
            this.paint.setShader(radialGradient);
        }

        public void setAuctionStateTextColor(int i) {
            Text text = this.giftStatus;
            if (text != null) {
                text.setColor(i | (-16777216));
            }
        }

        public void setCountdownRemainingTime(int i, int i2) {
            this.startTime = i;
            this.endTime = i2;
            if (this.countdownTimer == null) {
                this.countdownTimer = new CountdownTimer(new CountdownTimer.Callback() {
                    @Override
                    public final void onTimerUpdate(long j) {
                        this.f$0.lambda$setCountdownRemainingTime$0(j);
                    }
                });
            }
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            long j = currentTime < i ? i - currentTime : i2 - currentTime;
            this.countdownTimer.start(j);
            if (this.countdownText == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
                this.countdownText = animatedTextDrawable;
                animatedTextDrawable.setTextColor(-1);
                this.countdownText.setTextSize(AndroidUtilities.dp(12.0f));
                this.countdownText.setCallback(new Drawable.Callback() {
                    @Override
                    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                    }

                    @Override
                    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    }

                    @Override
                    public void invalidateDrawable(Drawable drawable) {
                        StarGiftDrawableIcon.this.view.invalidate();
                    }
                });
            }
            updateCountdownText(j, false);
        }

        public void lambda$setCountdownRemainingTime$0(long j) {
            updateCountdownText(j, true);
        }

        private void updateCountdownText(long j, boolean z) {
            Text text;
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i = this.endTime;
            if (currentTime > i) {
                this.countdownText.setText(LocaleController.getString(R.string.Gift2AuctionCountdownFinished));
            } else {
                int i2 = this.startTime;
                if (currentTime < i2) {
                    this.countdownText.setText(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i2 - currentTime, true)));
                } else {
                    this.countdownText.setText(AndroidUtilities.formatDuration(i - currentTime, true));
                }
            }
            if (currentTime <= this.endTime || (text = this.giftStatus) == null) {
                return;
            }
            text.setText(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }

        public StarGiftDrawableIcon setRounding(int i) {
            this.rounding = i;
            return this;
        }

        public StarGiftDrawableIcon setPatternsType(int i) {
            this.patternsType = i;
            return this;
        }

        @Override
        public void draw(Canvas canvas) {
            this.rect.set(getBounds());
            canvas.save();
            this.path.rewind();
            Path path = this.path;
            RectF rectF = this.rect;
            float f = this.rounding;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.path);
            if (this.gradient != null) {
                this.matrix.reset();
                this.matrix.postTranslate(this.rect.centerX(), this.rect.centerY());
                this.gradient.setLocalMatrix(this.matrix);
                this.paint.setShader(this.gradient);
            }
            canvas.drawPaint(this.paint);
            canvas.save();
            canvas.translate(this.rect.centerX(), this.rect.centerY());
            StarGiftPatterns.drawPattern(canvas, this.patternsType, this.pattern, this.rect.width(), this.rect.height(), 1.0f, this.patternsScale);
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles != null) {
                particles.draw(canvas, -1, 1.0f);
            }
            canvas.restore();
            if (this.giftName != null && this.giftStatus != null) {
                if (this.countdownText != null) {
                    this.countdownPaint.setColor(1342177280);
                    canvas.drawRoundRect(this.rect.left + AndroidUtilities.dp(6.0f), this.rect.top + AndroidUtilities.dp(6.0f), this.rect.left + AndroidUtilities.dp(20.0f) + Math.max(this.countdownText.getCurrentWidth(), AndroidUtilities.dp(3.0f)), this.rect.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.countdownPaint);
                    canvas.save();
                    canvas.translate(this.rect.left + AndroidUtilities.dp(13.0f), this.rect.top + AndroidUtilities.dp(14.0f));
                    this.countdownText.draw(canvas);
                    canvas.restore();
                }
                float fMin = Math.min(this.rect.width(), this.rect.height()) * 0.6f;
                ImageReceiver imageReceiver = this.imageReceiver;
                float fCenterX = this.rect.centerX() - (fMin / 2.0f);
                RectF rectF2 = this.rect;
                imageReceiver.setImageCoords(fCenterX, rectF2.top + (rectF2.height() * 0.12f), fMin, fMin);
                this.imageReceiver.draw(canvas);
                this.giftName.draw(canvas, this.rect.centerX() - (this.giftName.getWidth() / 2.0f), this.rect.bottom - AndroidUtilities.dp(50.0f));
                this.giftStatus.draw(canvas, this.rect.centerX() - (this.giftStatus.getWidth() / 2.0f), this.rect.bottom - AndroidUtilities.dp(30.0f));
            } else {
                float fMin2 = Math.min(this.rect.width(), this.rect.height()) * 0.75f;
                float f2 = fMin2 / 2.0f;
                this.imageReceiver.setImageCoords(this.rect.centerX() - f2, this.rect.centerY() - f2, fMin2, fMin2);
                this.imageReceiver.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public void onAttachedToWindow() {
            this.pattern.attach();
            this.imageReceiver.onAttachedToWindow();
            if (this.countdownTimer != null) {
                int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                int i = this.startTime;
                if (currentTime >= i) {
                    i = this.endTime;
                }
                this.countdownTimer.start(i - currentTime);
            }
        }

        @Override
        public void onDetachedToWindow() {
            this.pattern.detach();
            this.imageReceiver.onDetachedFromWindow();
            CountdownTimer countdownTimer = this.countdownTimer;
            if (countdownTimer != null) {
                countdownTimer.stop();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(this.sizeDp);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(this.sizeDp);
        }
    }

    public static class UpgradeIcon extends CompatDrawable {
        private float alpha;
        private final Path arrow;
        private final long start;
        private final Paint strokePaint;
        private final View view;

        public UpgradeIcon(View view, int i) {
            super(view);
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            Path path = new Path();
            this.arrow = path;
            this.start = System.currentTimeMillis();
            this.alpha = 1.0f;
            this.view = view;
            this.paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i);
            path.rewind();
            path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
            path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
            path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        }

        @Override
        public void draw(Canvas canvas) {
            this.paint.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, this.paint);
            float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) % 400) / 400.0f;
            int alpha = this.strokePaint.getAlpha();
            this.strokePaint.setAlpha((int) (alpha * this.alpha));
            this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(2.16f) * 3.0f) + (AndroidUtilities.dpf2(1.166f) * 2.0f)) / 2.0f));
            int i = 0;
            while (i < 4) {
                float f = i == 0 ? 1.0f - fCurrentTimeMillis : i == 3 ? fCurrentTimeMillis : 1.0f;
                this.strokePaint.setAlpha((int) (f * 255.0f * this.alpha));
                canvas.save();
                float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
                canvas.scale(fLerp, fLerp);
                canvas.drawPath(this.arrow, this.strokePaint);
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f);
                i++;
            }
            canvas.restore();
            this.strokePaint.setAlpha(alpha);
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }
    }

    public static class PageTransition {
        public int from;
        public float progress;
        public int to;

        public PageTransition(int i, int i2, float f) {
            this.from = i;
            this.to = i2;
        }

        public void setProgress(float f) {
            this.progress = f;
        }

        public float at(int i) {
            int i2 = this.to;
            if (i2 == i && this.from == i) {
                return 1.0f;
            }
            if (i2 == i) {
                return this.progress;
            }
            if (this.from == i) {
                return 1.0f - this.progress;
            }
            return 0.0f;
        }

        public boolean to(int i) {
            return this.to == i;
        }

        public float at(int i, int i2) {
            if (contains(i) && contains(i2)) {
                return 1.0f;
            }
            return Math.max(at(i), at(i2));
        }

        public float at(int i, int i2, int i3) {
            if (contains(i) && contains(i2)) {
                return 1.0f;
            }
            if (contains(i2) && contains(i3)) {
                return 1.0f;
            }
            if (contains(i3) && contains(i)) {
                return 1.0f;
            }
            return Math.max(at(i), Math.max(at(i2), at(i3)));
        }

        public boolean contains(int i) {
            return this.from == i || this.to == i;
        }

        public boolean is(int i) {
            return this.to == i;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (this.giftsList == ((StarsController.GiftsList) objArr[1])) {
                if (this.topView.craftTopView == null || !this.topView.craftTopView.crafting) {
                    updateViewPager();
                }
            }
        }
    }

    public static class PaymentFormState {
        public final AmountUtils$Amount amount;
        public final AmountUtils$Currency currency;
        public final TLRPC.TL_payments_paymentFormStarGift form;

        public PaymentFormState(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            this.currency = amountUtils$Currency;
            this.form = tL_payments_paymentFormStarGift;
            long formStarsPrice = StarsController.getFormStarsPrice(tL_payments_paymentFormStarGift);
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
            if (amountUtils$Currency == amountUtils$Currency2) {
                this.amount = AmountUtils$Amount.fromDecimal(formStarsPrice, amountUtils$Currency2);
                return;
            }
            AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
            if (amountUtils$Currency == amountUtils$Currency3) {
                this.amount = AmountUtils$Amount.fromNano(formStarsPrice, amountUtils$Currency3);
            } else {
                this.amount = AmountUtils$Amount.fromNano(0L, amountUtils$Currency2);
            }
        }
    }

    public static class ResaleBuyTransferAlert {
        public final AlertDialog alertDialog;
        private BalanceCloud balanceCloud;
        private final boolean canSwitchToTON;
        public final Context context;
        private final HorizontalRoundTabsLayout currencyTabsView;
        public final int currentAccount;
        public final long dialogId;
        private final HashMap forms;
        public final TL_stars.TL_starGiftUnique gift;
        private final String giftName;
        private Browser.Progress lastPositiveButtonProgress;
        private final HashSet loadingForms;
        private TextView positiveButton;
        private final Theme.ResourcesProvider resourcesProvider;
        private FrameLayout rootView;
        private AmountUtils$Currency selectedCurrency;
        private final TextView textInfoView;
        private HintView2 tonHint;

        public static void lambda$onUpdateCurrency$3(View view) {
        }

        public ResaleBuyTransferAlert(final Context context, final Theme.ResourcesProvider resourcesProvider, TL_stars.TL_starGiftUnique tL_starGiftUnique, PaymentFormState paymentFormState, final int i, long j, String str, boolean z, final Utilities.Callback2 callback2) {
            TLObject chat;
            HashMap map = new HashMap();
            this.forms = map;
            this.loadingForms = new HashSet();
            this.context = context;
            this.gift = tL_starGiftUnique;
            this.dialogId = j;
            this.currentAccount = i;
            AmountUtils$Currency amountUtils$Currency = paymentFormState.currency;
            this.selectedCurrency = amountUtils$Currency;
            map.put(amountUtils$Currency, paymentFormState);
            this.resourcesProvider = resourcesProvider;
            this.giftName = str;
            boolean z2 = tL_starGiftUnique.resale_ton_only;
            this.canSwitchToTON = !z2;
            if (j >= 0) {
                chat = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            } else {
                chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context) {
                private final int[] c = new int[2];

                @Override
                protected void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                    super.onLayout(z3, i2, i3, i4, i5);
                    if (ResaleBuyTransferAlert.this.currencyTabsView == null || ResaleBuyTransferAlert.this.currencyTabsView.linearLayout.getChildCount() < 2 || ResaleBuyTransferAlert.this.tonHint == null || ResaleBuyTransferAlert.this.rootView == null) {
                        return;
                    }
                    ResaleBuyTransferAlert.this.rootView.getLocationInWindow(this.c);
                    float translationX = this.c[0] - ResaleBuyTransferAlert.this.rootView.getTranslationX();
                    float translationY = this.c[1] - ResaleBuyTransferAlert.this.rootView.getTranslationY();
                    View childAt = ResaleBuyTransferAlert.this.currencyTabsView.linearLayout.getChildAt(1);
                    childAt.getLocationInWindow(this.c);
                    float translationX2 = this.c[0] - childAt.getTranslationX();
                    ResaleBuyTransferAlert.this.tonHint.setTranslationY((((this.c[1] - childAt.getTranslationY()) - translationY) - ResaleBuyTransferAlert.this.tonHint.getMeasuredHeight()) - ResaleBuyTransferAlert.this.currencyTabsView.getMeasuredHeight());
                    ResaleBuyTransferAlert.this.tonHint.setJointPx(0.0f, ((translationX2 - translationX) + (childAt.getMeasuredWidth() / 2.0f)) - AndroidUtilities.dp(12.0f));
                }
            };
            frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
            if (!z2) {
                HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context);
                this.currencyTabsView = horizontalRoundTabsLayout;
                ArrayList arrayList = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
                horizontalRoundTabsLayout.setTabs(arrayList, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i2) {
                        this.f$0.lambda$new$0(i2);
                    }
                });
                linearLayout.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(-2, -2, 1, 18, 0, 18, 12));
            } else {
                this.currencyTabsView = null;
                TextView textView = new TextView(context);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.Gift2BuyPriceOnlyTON));
                textView.setGravity(17);
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 17, 24, 4, 24, 4));
            }
            linearLayout.addView(new GiftTransferTopView(context, tL_starGiftUnique, chat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView2 = new TextView(context);
            this.textInfoView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView2.setTextSize(1, 16.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
            if (z) {
                TableView tableView = new TableView(context, resourcesProvider);
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                    String currency = BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true);
                    tableView.addRow(LocaleController.getString(R.string.GiftValue2), "~" + currency);
                }
                linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
            }
            this.alertDialog = new AlertDialog.Builder(context, resourcesProvider).setView(frameLayout).setPositiveButton("_", new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    this.f$0.lambda$new$1(i, context, resourcesProvider, callback2, alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        }

        public void lambda$new$0(int i) {
            AmountUtils$Currency amountUtils$Currency;
            if (i == 0) {
                amountUtils$Currency = AmountUtils$Currency.STARS;
            } else {
                amountUtils$Currency = AmountUtils$Currency.TON;
            }
            this.selectedCurrency = amountUtils$Currency;
            onUpdateCurrency(true);
        }

        public void lambda$new$1(int i, Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback2 callback2, AlertDialog alertDialog, int i2) {
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(this.selectedCurrency);
            if (paymentFormState == null) {
                return;
            }
            StarsController starsController = StarsController.getInstance(i, this.selectedCurrency);
            AmountUtils$Amount amountUtils$AmountOf = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            if (amountUtils$AmountOf != null && paymentFormState.amount.asNano() > amountUtils$AmountOf.asNano()) {
                AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
                if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                    new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount.asDecimal(), 14, null, null, 0L).show();
                    return;
                } else {
                    if (amountUtils$Currency == AmountUtils$Currency.TON) {
                        new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount, true, null).show();
                        return;
                    }
                    return;
                }
            }
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null) {
                progress.cancel();
                this.lastPositiveButtonProgress = null;
            }
            callback2.run(paymentFormState, alertDialog.makeButtonLoading(i2));
        }

        public void show() {
            this.alertDialog.setShowStarsBalance(true).show();
            this.positiveButton = (TextView) this.alertDialog.getButton(-1);
            this.balanceCloud = this.alertDialog.getStarsBalanceCloud();
            FrameLayout fullscreenContainerView = this.alertDialog.getFullscreenContainerView();
            this.rootView = fullscreenContainerView;
            if (fullscreenContainerView != null && this.canSwitchToTON) {
                HintView2 hintView2Show = new HintView2(this.context, 3).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_NORMAL).setDuration(5000L).setText(LocaleController.getString(R.string.Gift2BuyPricePayHintTON)).show();
                this.tonHint = hintView2Show;
                hintView2Show.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                this.rootView.addView(this.tonHint, LayoutHelper.createFrame(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
            }
            onUpdateCurrency(false);
        }

        private void onUpdateCurrency(boolean z) {
            String string;
            String pluralStringComma;
            HintView2 hintView2;
            final AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(amountUtils$Currency);
            this.textInfoView.animate().alpha(paymentFormState != null ? 1.0f : 0.25f).start();
            this.textInfoView.setEnabled(paymentFormState != null);
            this.positiveButton.setEnabled(paymentFormState != null);
            this.balanceCloud.setCurrency(amountUtils$Currency, z);
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
            if (horizontalRoundTabsLayout != null) {
                horizontalRoundTabsLayout.setSelectedIndex(amountUtils$Currency == AmountUtils$Currency.TON ? 1 : 0, z);
            }
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
            if (amountUtils$Currency == amountUtils$Currency2 && (hintView2 = this.tonHint) != null && hintView2.shown()) {
                this.tonHint.hide();
            }
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                    balanceCloud.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onUpdateCurrency$2(view);
                        }
                    });
                } else {
                    balanceCloud.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StarGiftSheet.ResaleBuyTransferAlert.lambda$onUpdateCurrency$3(view);
                        }
                    });
                }
            }
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null) {
                progress.cancel();
                this.lastPositiveButtonProgress = null;
            }
            if (paymentFormState != null) {
                boolean z2 = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                if (paymentFormState.currency == AmountUtils$Currency.STARS) {
                    this.positiveButton.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) paymentFormState.amount.asDecimal())));
                    TextView textView = this.textInfoView;
                    if (z2) {
                        pluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) paymentFormState.amount.asDecimal(), this.giftName);
                    } else {
                        pluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) paymentFormState.amount.asDecimal(), this.giftName, DialogObject.getShortName(this.dialogId));
                    }
                    textView.setText(AndroidUtilities.replaceTags(pluralStringComma));
                }
                if (paymentFormState.currency == amountUtils$Currency2) {
                    this.positiveButton.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, paymentFormState.amount.asFormatString())));
                    TextView textView2 = this.textInfoView;
                    if (z2) {
                        string = LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, paymentFormState.amount.asFormatString(), this.giftName);
                    } else {
                        string = LocaleController.formatString(R.string.Gift2BuyPriceTextTON, paymentFormState.amount.asFormatString(), this.giftName, DialogObject.getShortName(this.dialogId));
                    }
                    textView2.setText(AndroidUtilities.replaceTags(string));
                    return;
                }
                return;
            }
            Browser.Progress progressMakeButtonLoading = this.alertDialog.makeButtonLoading(-1, false, false);
            this.lastPositiveButtonProgress = progressMakeButtonLoading;
            progressMakeButtonLoading.init();
            if (this.loadingForms.add(amountUtils$Currency)) {
                StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(this.gift, this.dialogId, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onUpdateCurrency$4(amountUtils$Currency, (TLRPC.TL_payments_paymentFormStarGift) obj);
                    }
                });
            }
        }

        public void lambda$onUpdateCurrency$2(View view) {
            new StarsIntroActivity.StarsOptionsSheet(this.context, this.resourcesProvider).show();
        }

        public void lambda$onUpdateCurrency$4(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null && amountUtils$Currency == this.selectedCurrency) {
                progress.end();
            }
            this.loadingForms.remove(amountUtils$Currency);
            if (tL_payments_paymentFormStarGift != null) {
                this.forms.put(amountUtils$Currency, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift));
                onUpdateCurrency(true);
            }
        }
    }

    private void openValueStats(final long j, final String str, final String str2, final String str3, final TLRPC.Document document, String str4) {
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog.showDelayed(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$openValueStats$183(alertDialog, document, str3, str, str2, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$openValueStats$183(final AlertDialog alertDialog, final TLRPC.Document document, final String str, final String str2, final String str3, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openValueStats$182(alertDialog, tLObject, document, str, str2, str3, j, tL_error);
            }
        });
    }

    public void lambda$openValueStats$182(AlertDialog alertDialog, TLObject tLObject, TLRPC.Document document, String str, final String str2, String str3, final long j, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                getBulletinFactory().showForError(tL_error);
                return;
            }
            return;
        }
        final TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        BottomSheet.Builder builder = new BottomSheet.Builder(getContext(), false, this.resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        BackupImageView backupImageView = new BackupImageView(getContext());
        StarsIntroActivity.setGiftImage(backupImageView.getImageReceiver(), document, 160);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(21.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftValueAverage, str2)));
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftValueLastFragment, str3)));
        } else {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftValueLastTelegram, str3)));
        }
        final FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        final HintView2[] hintView2Arr = new HintView2[1];
        final Utilities.Callback2 callback2 = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$openValueStats$174(hintView2Arr, frameLayout, (View) obj, (CharSequence) obj2);
            }
        };
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -1, 119));
        tableView.addRow(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true));
        tableView.addRow(LocaleController.getString(R.string.GiftValueInitialPrice), StarsIntroActivity.replaceStarsWithPlain("⭐️" + uniqueStarGiftValueInfo.initial_sale_stars + " (~" + BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency) + ")", 0.8f));
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            tableView.addRow(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true));
            int iRound = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (iRound > 0) {
                tableView.addRow(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(iRound, ' ') + "%", (Runnable) null);
            } else {
                tableView.addRow(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency));
            }
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            final ButtonSpan.TextViewButtons[] textViewButtonsArr = {(ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableRowAddRow.getChildAt(1)).getChildAt(0)};
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    StarGiftSheet.lambda$openValueStats$175(callback2, textViewButtonsArr, uniqueStarGiftValueInfo, str2);
                }
            };
            TableRow tableRowAddRow = tableView.addRow(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", runnable);
            tableRowAddRow.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            final ButtonSpan.TextViewButtons[] textViewButtonsArr2 = {(ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableRowAddRow.getChildAt(1)).getChildAt(0)};
            final Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    StarGiftSheet.lambda$openValueStats$177(callback2, textViewButtonsArr2, uniqueStarGiftValueInfo, str2);
                }
            };
            TableRow tableRowAddRow2 = tableView.addRow(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", runnable2);
            tableRowAddRow2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable2.run();
                }
            });
        }
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), false, this.resourcesProvider);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(document, 1.5f, buttonWithCounterView.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            buttonWithCounterView.setText(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$openValueStats$180(str2, j, view);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 42, 7, 0, 0, 0, 2));
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(getContext(), false, this.resourcesProvider);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document, 1.5f, buttonWithCounterView2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            buttonWithCounterView2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false);
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$openValueStats$181(uniqueStarGiftValueInfo, view);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 42, 7, 0, 0, 0, 0));
        }
        builder.setCustomView(linearLayout);
        builder.show();
    }

    public void lambda$openValueStats$174(HintView2[] hintView2Arr, FrameLayout frameLayout, View view, CharSequence charSequence) {
        ButtonSpan buttonSpan;
        HintView2 hintView2 = hintView2Arr[0];
        if (hintView2 != null) {
            hintView2.hide();
        }
        CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(charSequence);
        float x = view.getX() + ((View) view.getParent()).getX() + ((View) ((View) view.getParent()).getParent()).getX();
        float y = view.getY() + ((View) view.getParent()).getY() + ((View) ((View) view.getParent()).getParent()).getY();
        if (view instanceof ButtonSpan.TextViewButtons) {
            Layout layout = ((ButtonSpan.TextViewButtons) view).getLayout();
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, text.length(), ButtonSpan.class);
                if (buttonSpanArr.length > 0 && (buttonSpan = buttonSpanArr[0]) != null) {
                    x += layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpan)) + (buttonSpanArr[0].getSize() / 2);
                    y += layout.getLineTop(layout.getLineForOffset(r4));
                }
            }
        }
        final HintView2 hintView22 = new HintView2(getContext(), 3);
        hintView2Arr[0] = hintView22;
        hintView22.setMultilineText(true);
        hintView22.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
        hintView22.setRounding(10.0f);
        hintView22.setText(charSequenceReplaceTags);
        hintView22.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.removeFromParent(hintView22);
            }
        });
        hintView22.setTranslationY((-AndroidUtilities.dp(100.0f)) + y);
        hintView22.setMaxWidthPx(AndroidUtilities.dp(300.0f));
        hintView22.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        hintView22.setJointPx(0.0f, x - AndroidUtilities.dp(4.0f));
        frameLayout.addView(hintView22, LayoutHelper.createFrame(-1, 100, 55));
        hintView22.show();
    }

    public static void lambda$openValueStats$175(Utilities.Callback2 callback2, ButtonSpan.TextViewButtons[] textViewButtonsArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str) {
        callback2.run(textViewButtonsArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
    }

    public static void lambda$openValueStats$177(Utilities.Callback2 callback2, ButtonSpan.TextViewButtons[] textViewButtonsArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str) {
        callback2.run(textViewButtonsArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
    }

    public void lambda$openValueStats$180(String str, long j, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        ResaleGiftsFragment resaleGiftsFragment = new ResaleGiftsFragment(this.dialogId, str, j, this.resourcesProvider);
        resaleGiftsFragment.setCloseParentSheet(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openValueStats$179();
            }
        });
        lastFragment.showAsSheet(resaleGiftsFragment, bottomSheetParams);
    }

    public void lambda$openValueStats$179() {
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$openValueStats$181(TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, View view) {
        Browser.openUrlInSystemBrowser(getContext(), uniqueStarGiftValueInfo.fragment_listed_url);
    }

    static final class UpgradePricesSheet extends BottomSheetLayouted {
        private LimitPreviewView limitPreviewView;
        private ArrayList prices;

        public UpgradePricesSheet(Context context, long j, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider) {
            int i;
            int i2;
            super(context, resourcesProvider);
            this.prices = arrayList;
            float f = this.backgroundPaddingLeft / AndroidUtilities.density;
            LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, 0, resourcesProvider);
            this.limitPreviewView = limitPreviewView;
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            limitPreviewView.setIconScale(1.8f);
            this.layout.addView(limitPreviewView, LayoutHelper.createLinear(-1, -2, 17, f, 20.0f, f, 10.0f));
            setCurrentPrice(j);
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true);
            textViewMakeTextView.setGravity(17);
            int i4 = R.string.Gift2UpgradeCostsTitle;
            textViewMakeTextView.setText(LocaleController.getString(i4));
            setTitle(LocaleController.getString(i4));
            this.layout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 0));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false);
            textViewMakeTextView2.setGravity(17);
            textViewMakeTextView2.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
            this.layout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 10, 32, 10));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TableView tableView = new TableView(context, resourcesProvider);
            int i5 = 0;
            boolean z = false;
            while (i5 < arrayList.size()) {
                if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i5)).date || ((i2 = i5 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i2)).date)) {
                    i = currentTime;
                    Date date = new Date(r11.date * 1000);
                    tableView.addRow(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber((int) r11.upgrade_stars, ','), 0.8f));
                    z = true;
                } else {
                    i = currentTime;
                }
                i5++;
                currentTime = i;
            }
            if (!z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) it.next();
                    Date date2 = new Date(starGiftUpgradePrice.date * 1000);
                    tableView.addRow(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber((int) starGiftUpgradePrice.upgrade_stars, ','), 0.8f));
                }
            }
            float f2 = f + 14.0f;
            this.layout.addView(tableView, LayoutHelper.createLinear(-1, -2, 7, f2, 16.0f, f2, 15.0f));
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 12.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            textViewMakeTextView3.setGravity(17);
            textViewMakeTextView3.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
            this.layout.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 15));
            createButton();
            this.button.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false);
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            lambda$new$0();
        }

        public void setCurrentPrice(long j) {
            ArrayList arrayList = this.prices;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            this.limitPreviewView.setStarsUpgradePrice((TL_stars.StarGiftUpgradePrice) this.prices.get(0), j, (TL_stars.StarGiftUpgradePrice) this.prices.get(r1.size() - 1));
        }
    }

    public static CharSequence replaceUnderstood(CharSequence charSequence) {
        return replaceUnderstood(charSequence, null);
    }

    public static CharSequence replaceUnderstood(CharSequence charSequence, ColoredImageSpan[] coloredImageSpanArr) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new ColoredImageSpan(R.drawable.filled_understood), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new ColoredImageSpan(R.drawable.filled_reactions), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static class ActionView extends View {
        private final Paint bgDarkerPaint;
        private final Paint bgPaint;
        private BitmapShader blurBitmapShader;
        private Matrix blurInvertMatrix;
        private Matrix blurMatrix;
        private boolean fullRect;
        private StaticLayout layout;
        private final TextPaint paint;
        private final LinkPath path;
        private int px;
        private int py;
        private CharSequence textToSet;

        public ActionView(Context context) {
            super(context);
            this.px = AndroidUtilities.dp(6.0f);
            this.py = AndroidUtilities.dp(2.0f);
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
            Paint paint2 = new Paint(1);
            this.bgDarkerPaint = paint2;
            paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
            this.path = new LinkPath(true);
        }

        public void setFullRect(boolean z) {
            this.fullRect = z;
        }

        public void setPadding(int i, int i2) {
            this.px = i;
            this.py = i2;
        }

        public void setRoundRadius(float f) {
            this.bgPaint.setPathEffect(new CornerPathEffect(f));
            this.bgDarkerPaint.setPathEffect(new CornerPathEffect(f));
        }

        public void prepareBlur(View view) {
            ArrayList arrayList = new ArrayList();
            if (view != null) {
                arrayList.add(view);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$prepareBlur$0((Bitmap) obj);
                }
            }, 12.0f, 12, null, arrayList);
        }

        public void lambda$prepareBlur$0(Bitmap bitmap) {
            this.blurMatrix = new Matrix();
            this.blurInvertMatrix = new Matrix();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.blurBitmapShader = bitmapShader;
            this.bgPaint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
            this.bgPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            CharSequence charSequence = this.textToSet;
            if (charSequence != null) {
                set(charSequence, size);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            StaticLayout staticLayout = this.layout;
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + AndroidUtilities.dp(32.0f), 1073741824));
            setPivotX(getMeasuredWidth() / 2.0f);
            setPivotY(getMeasuredHeight());
        }

        public void set(MessageObject messageObject) {
            TLRPC.Message message;
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.action == null) {
                setVisibility(8);
                return;
            }
            int i = messageObject.currentAccount;
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                setVisibility(8);
                return;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
                if (peer == null) {
                    setVisibility(8);
                    return;
                }
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (clientUserId == peerDialogId) {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString((tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(messageObject.messageOwner.date))));
                } else {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
                }
                setVisibility(0);
                return;
            }
            setVisibility(8);
        }

        public void set(int i, TL_stars.SavedStarGift savedStarGift) {
            if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            if (clientUserId == peerDialogId) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(savedStarGift.gift.crafted ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(savedStarGift.date))));
            } else {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
            }
        }

        public void set(CharSequence charSequence) {
            set(charSequence, getMeasuredWidth());
        }

        private void set(CharSequence charSequence, int i) {
            if (i <= 0) {
                this.textToSet = charSequence;
                return;
            }
            this.layout = new StaticLayout(charSequence, this.paint, i - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.path.rewind();
            this.path.setPadding(this.px, this.py);
            if (this.fullRect) {
                this.path.setCurrentLayout(null, 0, 0.0f, 0.0f);
                float fMax = Float.MAX_VALUE;
                float width = this.layout.getWidth();
                float fMin = Float.MIN_VALUE;
                float fMax2 = 0.0f;
                for (int i2 = 0; i2 < this.layout.getLineCount(); i2++) {
                    width = Math.min(width, this.layout.getLineLeft(i2));
                    fMin = Math.min(fMin, this.layout.getLineTop(i2));
                    fMax2 = Math.max(fMax2, this.layout.getLineRight(i2));
                    fMax = Math.max(fMax, this.layout.getLineBottom(i2));
                }
                this.path.addRect(width, fMin, fMax2, this.layout.getHeight(), Path.Direction.CW);
            } else {
                this.path.setCurrentLayout(this.layout, 0, 0.0f, 0.0f);
                StaticLayout staticLayout = this.layout;
                staticLayout.getSelectionPath(0, staticLayout.getText().length(), this.path);
                this.path.closeRects();
            }
            invalidate();
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.layout != null) {
                canvas.save();
                canvas.translate((getWidth() - this.layout.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
                Matrix matrix = this.blurMatrix;
                if (matrix != null) {
                    matrix.reset();
                    this.blurInvertMatrix.reset();
                    View view = this;
                    while (view != null) {
                        this.blurInvertMatrix.postConcat(view.getMatrix());
                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                    }
                    this.blurInvertMatrix.invert(this.blurMatrix);
                    this.blurMatrix.preTranslate((-this.px) / 2, -AndroidUtilities.dp(16.0f));
                    this.blurMatrix.preScale(12.0f, 12.0f);
                    this.blurBitmapShader.setLocalMatrix(this.blurMatrix);
                }
                canvas.drawPath(this.path, this.bgPaint);
                this.bgDarkerPaint.setColor(Theme.multAlpha(-16777216, 0.35f));
                canvas.drawPath(this.path, this.bgDarkerPaint);
                this.layout.draw(canvas);
                canvas.restore();
            }
        }
    }

    public static class CraftTopView extends FrameLayout {
        private final int[] BACKGROUND_COLORS;
        private final int[] COLORS;
        private final LinearLayout attributesLayoutLine1;
        private final LinearLayout attributesLayoutLine2;
        private boolean attributesTwoLines;
        private final AttributeView[] backdropAttributes;
        private final SwitchGradientDrawable bg;
        private RLottieImageView brokenGiftImage;
        private final LinearLayout button;
        private final ButtonBackground buttonBackground;
        private final AnimatedTextView buttonSubtitle;
        private final AnimatedTextView buttonTitle;
        private final FrameLayout buttonsLayout;
        private final ImageView closeButton;
        private String collectionTitle;
        public boolean crafted;
        private TL_stars.StarGift craftedGift;
        public boolean crafting;
        private final TextView craftingChanceView;
        private final TextView craftingFooterView;
        private final RLottieImageView craftingIconView;
        private final FrameLayout craftingLayout;
        private final TextView craftingSubtitleView;
        private final TextView craftingTitleView;
        private final Cube3D cube;
        private int currentAccount;
        private HintView2 currentHint;
        private TLRPC.Document document;
        private final Face[] faces;
        public boolean failed;
        private GiftSheet.GiftCell[] failedGifts;
        private final LinearLayout failedGiftsLayout;
        private final FrameLayout failedLayout;
        private final TextView failedSubtitle;
        private final TextView failedTitle;
        private final Face frontFace;
        private long giftId;
        private final SelectGiftView[] gifts;
        private final ImageView helpButton;
        private Utilities.Callback onAddGift;
        private Runnable onClose;
        private Utilities.Callback3 onCraft;
        private Runnable openCraftedGift;
        private final AttributeView[] patternAttributes;
        private CharSequence plus;
        private final FrameLayout precraftingLayout;
        private ArrayList previewAttributes;
        private final RaysView rays;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SpoilersTextView textView;
        private final TextView titleView;
        private final AnimatedEmojiSpan.TextViewEmojis variantsButton;

        public CraftTopView(Context context, final Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.BACKGROUND_COLORS = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
            this.COLORS = new int[]{Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.08f), -294362, -3914963, -13519030, -12613223};
            this.resourcesProvider = resourcesProvider;
            SwitchGradientDrawable switchGradientDrawable = new SwitchGradientDrawable(1);
            this.bg = switchGradientDrawable;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
            switchGradientDrawable.setIcon(drawableMutate);
            setBackground(switchGradientDrawable);
            FrameLayout frameLayout = new FrameLayout(context);
            this.buttonsLayout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, 60, 55));
            ImageView imageView = new ImageView(context);
            this.helpButton = imageView;
            imageView.setImageResource(R.drawable.outline_question_mark);
            imageView.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(24.0f), Theme.multAlpha(-1, 0.08f)));
            frameLayout.addView(imageView, LayoutHelper.createFrame(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            ScaleStateListAnimator.apply(imageView);
            ImageView imageView2 = new ImageView(context);
            this.closeButton = imageView2;
            imageView2.setImageResource(R.drawable.msg_close);
            imageView2.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(24.0f), Theme.multAlpha(-1, 0.08f)));
            frameLayout.addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$1(view);
                }
            });
            ScaleStateListAnimator.apply(imageView2);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(-1);
            textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.precraftingLayout = frameLayout2;
            addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.craftingLayout = frameLayout3;
            frameLayout3.setAlpha(0.0f);
            addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.failedLayout = frameLayout4;
            frameLayout4.setAlpha(0.0f);
            addView(frameLayout4, LayoutHelper.createFrame(-1, -1, 119));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context);
            this.textView = spoilersTextView;
            spoilersTextView.setGravity(17);
            spoilersTextView.setTextSize(1, 13.0f);
            spoilersTextView.setTextColor(-1);
            frameLayout2.addView(spoilersTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.attributesLayoutLine1 = linearLayout;
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(2, 320L);
            layoutTransition.setDuration(3, 320L);
            layoutTransition.setDuration(0, 320L);
            layoutTransition.setDuration(1, 320L);
            layoutTransition.setDuration(4, 320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            layoutTransition.setInterpolator(2, cubicBezierInterpolator);
            layoutTransition.setInterpolator(3, cubicBezierInterpolator);
            layoutTransition.setInterpolator(0, cubicBezierInterpolator);
            layoutTransition.setInterpolator(1, cubicBezierInterpolator);
            layoutTransition.setInterpolator(4, cubicBezierInterpolator);
            linearLayout.setLayoutTransition(layoutTransition);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.attributesLayoutLine2 = linearLayout2;
            LayoutTransition layoutTransition2 = new LayoutTransition();
            layoutTransition2.setDuration(2, 320L);
            layoutTransition2.setDuration(3, 320L);
            layoutTransition2.setDuration(0, 320L);
            layoutTransition2.setDuration(1, 320L);
            layoutTransition2.setDuration(4, 320L);
            layoutTransition2.setInterpolator(2, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(3, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(0, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(1, cubicBezierInterpolator);
            layoutTransition2.setInterpolator(4, cubicBezierInterpolator);
            linearLayout2.setLayoutTransition(layoutTransition2);
            linearLayout2.setOrientation(0);
            linearLayout2.setAlpha(0.0f);
            linearLayout2.setGravity(17);
            this.backdropAttributes = new AttributeView[4];
            this.patternAttributes = new AttributeView[4];
            for (int i = 0; i < 4; i++) {
                LinearLayout linearLayout3 = this.attributesLayoutLine1;
                AttributeView[] attributeViewArr = this.backdropAttributes;
                AttributeView attributeView = new AttributeView(context);
                attributeViewArr[i] = attributeView;
                linearLayout3.addView(attributeView, LayoutHelper.createLinear(48, 54, 0.0f, 0.0f, 0.0f, 0.0f));
                this.backdropAttributes[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$new$2(view);
                    }
                });
            }
            for (int i2 = 0; i2 < 4; i2++) {
                LinearLayout linearLayout4 = this.attributesLayoutLine1;
                AttributeView[] attributeViewArr2 = this.patternAttributes;
                AttributeView attributeView2 = new AttributeView(context);
                attributeViewArr2[i2] = attributeView2;
                linearLayout4.addView(attributeView2, LayoutHelper.createLinear(48, 54, 0.0f, 0.0f, 0.0f, 0.0f));
                this.patternAttributes[i2].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$new$3(view);
                    }
                });
            }
            this.gifts = new SelectGiftView[4];
            this.faces = new Face[6];
            int i3 = 0;
            while (i3 < 6) {
                this.faces[i3] = new Face(context, i3 == 5);
                i3++;
            }
            this.frontFace = this.faces[5];
            RaysView raysView = new RaysView(context);
            this.rays = raysView;
            raysView.setVisibility(8);
            raysView.setAlpha(0.0f);
            addView(raysView, LayoutHelper.createFrame(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            Cube3D cube3D = new Cube3D(context, this.faces);
            this.cube = cube3D;
            addView(cube3D, LayoutHelper.createFrame(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.variantsButton = textViewEmojis;
            textViewEmojis.setTextSize(1, 12.0f);
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            textViewEmojis.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            textViewEmojis.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
            textViewEmojis.setGravity(17);
            textViewEmojis.setTextColor(-1);
            textViewEmojis.setAlpha(this.previewAttributes == null ? 0.25f : 1.0f);
            textViewEmojis.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(14.0f), Theme.multAlpha(-1, 0.08f)));
            ScaleStateListAnimator.apply(textViewEmojis, 0.02f, 1.2f);
            this.precraftingLayout.addView(textViewEmojis, LayoutHelper.createFrame(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
            textViewEmojis.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$4(resourcesProvider, view);
                }
            });
            this.precraftingLayout.addView(this.attributesLayoutLine1, LayoutHelper.createFrame(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
            this.precraftingLayout.addView(this.attributesLayoutLine2, LayoutHelper.createFrame(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.button = linearLayout5;
            linearLayout5.setOrientation(1);
            ButtonBackground buttonBackground = new ButtonBackground();
            this.buttonBackground = buttonBackground;
            linearLayout5.setBackground(buttonBackground);
            buttonBackground.setColor(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.08f));
            ScaleStateListAnimator.apply(linearLayout5, 0.02f, 1.2f);
            addView(linearLayout5, LayoutHelper.createFrame(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
            linearLayout5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$5(view);
                }
            });
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.buttonTitle = animatedTextView;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setGravity(17);
            animatedTextView.setTextColor(Theme.multAlpha(-1, 0.75f));
            animatedTextView.setText(LocaleController.getString(R.string.GiftCraftButton));
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            linearLayout5.addView(animatedTextView, LayoutHelper.createLinear(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
            this.buttonSubtitle = animatedTextView2;
            animatedTextView2.getDrawable().setHacks(true, true, false);
            animatedTextView2.setGravity(17);
            animatedTextView2.setTextColor(Theme.multAlpha(-1, 0.75f));
            animatedTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
            animatedTextView2.setTextSize(AndroidUtilities.dp(12.0f));
            linearLayout5.addView(animatedTextView2, LayoutHelper.createLinear(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
            LinearLayout linearLayout6 = new LinearLayout(context);
            linearLayout6.setOrientation(0);
            linearLayout6.setGravity(17);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.craftingIconView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.gift_crafting, 30, 30);
            linearLayout6.addView(rLottieImageView, LayoutHelper.createLinear(30, 30, 17, 0, 0, 4, 0));
            TextView textView2 = new TextView(context);
            this.craftingTitleView = textView2;
            textView2.setTextSize(1, 20.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
            linearLayout6.addView(textView2, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
            this.craftingLayout.addView(linearLayout6, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.craftingSubtitleView = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(Theme.multAlpha(-1, 0.5f));
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            this.craftingLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f));
            TextView textView4 = new TextView(context);
            this.craftingChanceView = textView4;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(-1);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            textView4.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
            textView4.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(14.0f), Theme.multAlpha(-1, 0.08f)));
            this.craftingLayout.addView(textView4, LayoutHelper.createFrame(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f));
            TextView textView5 = new TextView(context);
            this.craftingFooterView = textView5;
            textView5.setTextSize(1, 13.0f);
            textView5.setTextColor(Theme.multAlpha(-1, 0.5f));
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.GiftCraftProgressText));
            this.craftingLayout.addView(textView5, LayoutHelper.createFrame(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f));
            TextView textView6 = new TextView(context);
            this.failedTitle = textView6;
            textView6.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
            textView6.setTextColor(-505270);
            textView6.setTextSize(1, 20.0f);
            textView6.setTypeface(AndroidUtilities.bold());
            textView6.setGravity(17);
            this.failedLayout.addView(textView6, LayoutHelper.createFrame(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f));
            TextView textView7 = new TextView(context);
            this.failedSubtitle = textView7;
            textView7.setTextColor(-17253);
            textView7.setTextSize(1, 13.0f);
            textView7.setGravity(17);
            this.failedLayout.addView(textView7, LayoutHelper.createFrame(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
            LinearLayout linearLayout7 = new LinearLayout(context);
            this.failedGiftsLayout = linearLayout7;
            linearLayout7.setOrientation(0);
            this.failedLayout.addView(linearLayout7, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
            this.failedGifts = null;
            updateCounts();
        }

        public void lambda$new$0(View view) {
            if (this.buttonsLayout.getAlpha() < 1.0f) {
                return;
            }
            this.onClose.run();
        }

        public void lambda$new$1(View view) {
            if (this.buttonsLayout.getAlpha() < 1.0f) {
                return;
            }
            this.onClose.run();
        }

        public void lambda$new$4(Theme.ResourcesProvider resourcesProvider, View view) {
            if (this.variantsButton.getAlpha() < 1.0f || this.crafting || this.failed || this.previewAttributes == null) {
                return;
            }
            new StarGiftPreviewSheet(getContext(), resourcesProvider, this.currentAccount, this.collectionTitle, this.previewAttributes, true).show();
        }

        public void lambda$new$5(View view) {
            if (getAlpha() >= 1.0f && !this.crafting) {
                if (this.failed) {
                    setup();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    SelectGiftView[] selectGiftViewArr = this.gifts;
                    if (i >= selectGiftViewArr.length) {
                        break;
                    }
                    SelectGiftView selectGiftView = selectGiftViewArr[i];
                    if (selectGiftView != null && selectGiftView.getGift() != null) {
                        arrayList.add(this.gifts[i].getGift());
                    }
                    i++;
                }
                if (arrayList.isEmpty() || this.onCraft == null) {
                    AndroidUtilities.shakeViewSpring(this.button);
                } else {
                    playAnimation();
                }
            }
        }

        public void lambda$new$3(AttributeView attributeView) {
            if (attributeView.backdrop != null) {
                showHint(attributeView, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(attributeView.progress * 100.0f), attributeView.backdrop.name)));
            } else if (attributeView.pattern != null) {
                showHint(attributeView, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(attributeView.progress * 100.0f), attributeView.pattern.name)));
            }
        }

        public void showHint(View view, CharSequence charSequence) {
            HintView2 hintView2 = this.currentHint;
            if (hintView2 != null) {
                hintView2.hide();
                this.currentHint = null;
            }
            if (this.crafting || this.failed) {
                return;
            }
            View view2 = view.getParent() instanceof View ? (View) view.getParent() : null;
            float x = (view2 != null ? view2.getX() : 0.0f) + view.getX();
            float y = (view2 != null ? view2.getY() : 0.0f) + view.getY();
            HintView2 hintView22 = new HintView2(getContext(), 3);
            this.currentHint = hintView22;
            hintView22.setMultilineText(true);
            this.currentHint.setText(charSequence);
            HintView2 hintView23 = this.currentHint;
            hintView23.setMaxWidthPx(HintView2.cutInFancyHalf(hintView23.getText(), this.currentHint.getTextPaint()));
            this.currentHint.setTextAlign(Layout.Alignment.ALIGN_CENTER);
            this.currentHint.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.currentHint, LayoutHelper.createFrame(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.currentHint.setTranslationY(y - AndroidUtilities.dp(100.0f));
            this.currentHint.setJointPx(0.0f, (x + (view.getWidth() / 2.0f)) - AndroidUtilities.dp(2.0f));
            this.currentHint.show();
        }

        public void setup() {
            setup(this.currentAccount, this.giftId, this.document, this.collectionTitle);
        }

        public void setup(int i, final long j, TLRPC.Document document, String str) {
            this.currentAccount = i;
            this.giftId = j;
            this.document = document;
            this.collectionTitle = str;
            this.crafting = false;
            this.failed = false;
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i2 >= selectGiftViewArr.length) {
                    break;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i2];
                if (selectGiftView != null) {
                    AndroidUtilities.removeFromParent(selectGiftView);
                }
                i2++;
            }
            this.cube.reset();
            setupGiftButtons();
            updateCounts(false);
            this.crafting = false;
            this.precraftingLayout.animate().cancel();
            this.precraftingLayout.setAlpha(1.0f);
            this.button.animate().cancel();
            this.button.setAlpha(1.0f);
            this.craftingLayout.animate().cancel();
            this.craftingLayout.setAlpha(0.0f);
            this.failedLayout.animate().cancel();
            this.failedLayout.setAlpha(0.0f);
            this.buttonsLayout.animate().cancel();
            this.buttonsLayout.setAlpha(1.0f);
            this.variantsButton.setAlpha(this.attributesTwoLines ? 0.0f : this.previewAttributes != null ? 1.0f : 0.25f);
            this.rays.setVisibility(8);
            this.rays.setAlpha(0.0f);
            this.buttonTitle.setText(LocaleController.getString(R.string.GiftCraftButton));
            this.buttonTitle.setTranslationY(0.0f);
            this.buttonSubtitle.setAlpha(1.0f);
            GiftAuctionController.getInstance(i).requestAuctionUpgrades(j, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$setup$6(j, j, (ArrayList) obj);
                }
            });
        }

        public void lambda$setup$6(long j, long j2, ArrayList arrayList) {
            if (j != j2) {
                return;
            }
            this.previewAttributes = arrayList;
            this.variantsButton.animate().alpha(this.attributesTwoLines ? 0.0f : this.previewAttributes != null ? 1.0f : 0.25f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                    arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i));
                    if (arrayList2.size() >= 3) {
                        break;
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) it.next();
                spannableStringBuilder.append((CharSequence) "x");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(stargiftattributemodel.document, this.variantsButton.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
            }
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
            this.variantsButton.setText(spannableStringBuilder);
        }

        private void setupGiftButtons() {
            SelectGiftView[] selectGiftViewArr = this.gifts;
            SelectGiftView selectGiftView = new SelectGiftView(getContext());
            int i = 0;
            selectGiftViewArr[0] = selectGiftView;
            addView(selectGiftView, LayoutHelper.createFrame(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
            SelectGiftView[] selectGiftViewArr2 = this.gifts;
            SelectGiftView selectGiftView2 = new SelectGiftView(getContext());
            selectGiftViewArr2[1] = selectGiftView2;
            addView(selectGiftView2, LayoutHelper.createFrame(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
            SelectGiftView[] selectGiftViewArr3 = this.gifts;
            SelectGiftView selectGiftView3 = new SelectGiftView(getContext());
            selectGiftViewArr3[2] = selectGiftView3;
            addView(selectGiftView3, LayoutHelper.createFrame(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
            SelectGiftView[] selectGiftViewArr4 = this.gifts;
            SelectGiftView selectGiftView4 = new SelectGiftView(getContext());
            selectGiftViewArr4[3] = selectGiftView4;
            addView(selectGiftView4, LayoutHelper.createFrame(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
            while (true) {
                SelectGiftView[] selectGiftViewArr5 = this.gifts;
                if (i >= selectGiftViewArr5.length) {
                    return;
                }
                ScaleStateListAnimator.apply(selectGiftViewArr5[i]);
                this.gifts[i].setClickable(true);
                this.gifts[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$setupGiftButtons$8(view);
                    }
                });
                i++;
            }
        }

        public void lambda$setupGiftButtons$8(View view) {
            final SelectGiftView selectGiftView = (SelectGiftView) view;
            if (selectGiftView.getGift() != null && !selectGiftView.isReplaceIcon) {
                selectGiftView.setGift(null, true);
                updateCounts();
            } else {
                this.onAddGift.run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$setupGiftButtons$7(selectGiftView, (TL_stars.StarGift) obj);
                    }
                });
            }
        }

        public void lambda$setupGiftButtons$7(SelectGiftView selectGiftView, TL_stars.StarGift starGift) {
            selectGiftView.setGift(starGift, true);
            updateCounts();
        }

        private void updateGiftButtonIcons() {
            TL_stars.StarGift gift;
            if (this.gifts == null) {
                return;
            }
            int i = 0;
            boolean z = true;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null && selectGiftView.getGift() != null) {
                    if (z) {
                        int i2 = i + 1;
                        while (true) {
                            SelectGiftView[] selectGiftViewArr2 = this.gifts;
                            if (i2 >= selectGiftViewArr2.length) {
                                gift = null;
                                break;
                            }
                            SelectGiftView selectGiftView2 = selectGiftViewArr2[i2];
                            if (selectGiftView2 != null && selectGiftView2.getGift() != null) {
                                gift = this.gifts[i2].getGift();
                                break;
                            }
                            i2++;
                        }
                        this.gifts[i].setReplaceIcon((gift == null || TextUtils.isEmpty(gift.gift_address)) ? false : true);
                    } else {
                        this.gifts[i].setReplaceIcon(false);
                    }
                    z = false;
                }
                i++;
            }
        }

        public void setOnAddGift(Utilities.Callback<Utilities.Callback<TL_stars.StarGift>> callback) {
            this.onAddGift = callback;
        }

        public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
            this.onCraft = callback3;
        }

        public void setOnClose(Runnable runnable) {
            this.onClose = runnable;
        }

        public void playAnimation() {
            this.crafting = true;
            int i = 0;
            this.failed = false;
            this.openCraftedGift = null;
            HintView2 hintView2 = this.currentHint;
            if (hintView2 != null) {
                hintView2.hide();
                this.currentHint = null;
            }
            this.craftingSubtitleView.setText("");
            this.craftingChanceView.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, AffiliateProgramFragment.percents(getGiftsSuccessChance())));
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i2 >= selectGiftViewArr.length) {
                    break;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i2];
                if (selectGiftView != null) {
                    selectGiftView.setClickable(false);
                    if (this.gifts[i2].getGift() == null) {
                        this.gifts[i2].animate().alpha(0.0f).start();
                    }
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr2 = this.gifts;
                if (i3 < selectGiftViewArr2.length) {
                    SelectGiftView selectGiftView2 = selectGiftViewArr2[i3];
                    if (selectGiftView2 != null && selectGiftView2.getGift() != null) {
                        TL_stars.StarGift gift = this.gifts[i3].getGift();
                        this.craftingSubtitleView.setText(gift.title + " #" + LocaleController.formatNumber(gift.num, ','));
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            this.precraftingLayout.animate().alpha(0.0f).start();
            this.button.animate().alpha(0.0f).start();
            this.craftingLayout.animate().alpha(1.0f).start();
            this.buttonsLayout.animate().alpha(0.25f).start();
            this.craftingIconView.playAnimation();
            final ArrayList arrayList = new ArrayList();
            while (true) {
                SelectGiftView[] selectGiftViewArr3 = this.gifts;
                if (i < selectGiftViewArr3.length) {
                    if (selectGiftViewArr3[i].getGift() != null) {
                        arrayList.add(this.gifts[i].getGift());
                    }
                    i++;
                } else {
                    this.onCraft.run(arrayList, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            this.f$0.lambda$playAnimation$12(arrayList, (TL_stars.StarGift) obj, (Runnable) obj2);
                        }
                    }, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$playAnimation$13();
                        }
                    });
                    return;
                }
            }
        }

        public void lambda$playAnimation$12(final ArrayList arrayList, final TL_stars.StarGift starGift, final Runnable runnable) {
            int i;
            HintView2 hintView2 = this.currentHint;
            if (hintView2 != null) {
                hintView2.hide();
                this.currentHint = null;
            }
            this.crafted = true;
            this.failed = starGift == null;
            this.craftedGift = starGift;
            this.openCraftedGift = runnable;
            Cube3D.AnimSequence animSequence = new Cube3D.AnimSequence(this.cube);
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i2 >= selectGiftViewArr.length) {
                    break;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i2];
                if (selectGiftView != null && selectGiftView.getGift() != null) {
                    arrayList2.add(Integer.valueOf(i2));
                }
                i2++;
            }
            final int i3 = 4;
            int i4 = 40;
            if (arrayList2.size() == 1) {
                animSequence.put(this.gifts[((Integer) arrayList2.get(0)).intValue()], 5, 32).friction(false).fling(26.0f, -26.0f).delay(90).friction(true).delay(20);
            } else {
                int[] iArr = {5, 0, 2, 3, 4};
                SelectGiftView selectGiftView2 = this.gifts[0];
                if (selectGiftView2 == null || selectGiftView2.getGift() == null) {
                    i = 0;
                } else {
                    animSequence.put(this.gifts[0], iArr[0], 32).fling(25.0f, -22.0f);
                    i = 1;
                }
                SelectGiftView selectGiftView3 = this.gifts[1];
                if (selectGiftView3 != null && selectGiftView3.getGift() != null) {
                    if (i > 0) {
                        animSequence.delay(42);
                    }
                    animSequence.put(this.gifts[1], iArr[i], 32).fling(25.0f, 31.0f);
                    i++;
                }
                SelectGiftView selectGiftView4 = this.gifts[2];
                if (selectGiftView4 != null && selectGiftView4.getGift() != null) {
                    if (i > 0) {
                        animSequence.delay(42);
                    }
                    animSequence.put(this.gifts[2], iArr[i], 32, 180.0f).fling(-36.0f, -36.0f);
                    i++;
                }
                SelectGiftView selectGiftView5 = this.gifts[3];
                if (selectGiftView5 != null && selectGiftView5.getGift() != null) {
                    if (i > 0) {
                        animSequence.delay(42);
                    }
                    animSequence.put(this.gifts[3], iArr[i], 32).fling(-31.0f, 31.0f);
                    i++;
                }
                animSequence.friction(false);
                animSequence.delay(40);
                animSequence.friction(true);
                animSequence.delay(40);
                i3 = iArr[i];
                i4 = 80;
            }
            animSequence.run(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$playAnimation$9(i3, starGift);
                }
            }).steerTo(i3, i4, -90).start(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$playAnimation$11(starGift, arrayList, runnable);
                }
            });
        }

        public void lambda$playAnimation$11(TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
            this.crafting = false;
            if (starGift == null) {
                RLottieImageView rLottieImageView = this.brokenGiftImage;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StarGiftSheet.CraftTopView.lambda$playAnimation$10();
                        }
                    }, 750L);
                }
                this.precraftingLayout.animate().alpha(0.0f).start();
                this.failedLayout.animate().alpha(1.0f).start();
                this.button.animate().alpha(1.0f).start();
                this.craftingLayout.animate().alpha(0.0f).start();
                this.buttonsLayout.animate().alpha(1.0f).start();
                this.failedSubtitle.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                this.buttonTitle.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                this.buttonTitle.setTranslationY(AndroidUtilities.dp(6.0f));
                this.buttonSubtitle.setAlpha(0.0f);
                if (this.failedGifts != null) {
                    int i = 0;
                    while (true) {
                        GiftSheet.GiftCell[] giftCellArr = this.failedGifts;
                        if (i >= giftCellArr.length) {
                            break;
                        }
                        AndroidUtilities.removeFromParent(giftCellArr[i]);
                        i++;
                    }
                    this.failedGifts = null;
                }
                this.failedGifts = new GiftSheet.GiftCell[arrayList.size()];
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i2);
                    GiftSheet.GiftCell giftCell = new GiftSheet.GiftCell(getContext(), this.currentAccount, this.resourcesProvider);
                    giftCell.setStarsGift(starGift2, false, false, false, false, true);
                    giftCell.chanceTextView.setVisibility(8);
                    giftCell.setRibbonColor(-3065286);
                    BackupImageView backupImageView = giftCell.imageView;
                    FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(42, 42, 17);
                    giftCell.imageViewLayoutParams = layoutParamsCreateFrame;
                    backupImageView.setLayoutParams(layoutParamsCreateFrame);
                    int i3 = i2 + 1;
                    boolean z = i3 >= arrayList.size();
                    LinearLayout linearLayout = this.failedGiftsLayout;
                    this.failedGifts[i2] = giftCell;
                    linearLayout.addView(giftCell, LayoutHelper.createLinear(74, 74, 0.0f, 51, 0, 0, z ? 0 : 6, 0));
                    i2 = i3;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(runnable);
        }

        public static void lambda$playAnimation$10() {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }

        public void lambda$playAnimation$13() {
            this.crafting = false;
            this.openCraftedGift = null;
            this.failed = false;
            setup();
        }

        public void lambda$playAnimation$9(int i, TL_stars.StarGift starGift) {
            if (starGift != null) {
                SelectGiftView selectGiftView = new SelectGiftView(getContext());
                selectGiftView.setGift(starGift, false);
                selectGiftView.setRotation(180.0f);
                this.cube.putView(i, selectGiftView);
                selectGiftView.setScaleX(0.5f);
                selectGiftView.setScaleY(0.5f);
                selectGiftView.setAlpha(0.0f);
                ViewPropertyAnimator duration = selectGiftView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                ViewPropertyAnimator interpolator = duration.setInterpolator(cubicBezierInterpolator);
                interpolator.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$setupFinishFace$14(valueAnimator);
                    }
                });
                interpolator.start();
                this.cube.faces[i].setVisibility(8);
                this.rays.setVisibility(0);
                this.rays.setAlpha(0.0f);
                this.rays.animate().alpha(0.5f).setDuration(820L).setInterpolator(cubicBezierInterpolator).start();
                return;
            }
            FrameLayout frameLayout = new FrameLayout(getContext());
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            rLottieImageView.setAnimation(R.raw.gift_broken, 32, 32);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(32, 32, 17));
            rLottieImageView.setScaleX(0.5f);
            rLottieImageView.setScaleY(0.5f);
            rLottieImageView.setAlpha(0.0f);
            rLottieImageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
            this.brokenGiftImage = rLottieImageView;
            frameLayout.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(12.0f), Theme.multAlpha(-1, 0.075f)));
            this.cube.faces[i].setVisibility(8);
            frameLayout.setRotation(180.0f);
            this.cube.putView(i, frameLayout);
            ButtonBackground buttonBackground = this.buttonBackground;
            int[] iArr = this.COLORS;
            buttonBackground.setColor(iArr[2], iArr[3]);
            SwitchGradientDrawable switchGradientDrawable = this.bg;
            int[] iArr2 = this.BACKGROUND_COLORS;
            switchGradientDrawable.setColors(iArr2[2], iArr2[3]);
            RaysView raysView = this.rays;
            int[] iArr3 = this.COLORS;
            raysView.setColor(iArr3[3], iArr3[2]);
        }

        public void lambda$setupFinishFace$14(ValueAnimator valueAnimator) {
            this.cube.invalidate();
        }

        public void selectGift(TL_stars.StarGift starGift) {
            if (starGift == null) {
                return;
            }
            int i = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    break;
                }
                if (selectGiftViewArr[i].getGift() == null) {
                    this.gifts[i].setGift(starGift, true);
                    break;
                }
                i++;
            }
            updateCounts();
        }

        public void updateCounts() {
            updateCounts(true);
        }

        public void updateCounts(boolean z) {
            int giftsSelectedCount = getGiftsSelectedCount();
            this.frontFace.setChance(getGiftsSuccessChance() / 10.0f, z);
            if (giftsSelectedCount <= 0) {
                if (this.plus == null) {
                    this.plus = new SpannableStringBuilder("+");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_add_album);
                    coloredImageSpan.setScale(0.65f, 0.65f);
                    CharSequence charSequence = this.plus;
                    ((SpannableStringBuilder) charSequence).setSpan(coloredImageSpan, 0, charSequence.length(), 33);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
                AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder, this.plus);
                this.buttonSubtitle.setText(spannableStringBuilder);
            } else {
                this.buttonSubtitle.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, AffiliateProgramFragment.percents(getGiftsSuccessChance()))));
            }
            int i = giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2;
            ButtonBackground buttonBackground = this.buttonBackground;
            int[] iArr = this.COLORS;
            int i2 = i * 2;
            int i3 = i2 + 1;
            buttonBackground.setColor(iArr[i2], iArr[i3]);
            SwitchGradientDrawable switchGradientDrawable = this.bg;
            int[] iArr2 = this.BACKGROUND_COLORS;
            switchGradientDrawable.setColors(iArr2[i2], iArr2[i3]);
            RaysView raysView = this.rays;
            int[] iArr3 = this.COLORS;
            raysView.setColor(iArr3[i3], iArr3[i2]);
            if (this.document != null) {
                if (getFirstGift() != null) {
                    SpannableString spannableString = new SpannableString("x");
                    spannableString.setSpan(new AnimatedEmojiSpan(this.document, this.textView.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                    this.textView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.collectionTitle, LocaleController.formatNumber(r6.num, ',')))));
                } else {
                    SpannableString spannableString2 = new SpannableString("x");
                    spannableString2.setSpan(new AnimatedEmojiSpan(this.document, this.textView.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                    this.textView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.collectionTitle))));
                }
            }
            updateAttributeFreq();
            updateGiftButtonIcons();
        }

        private void removeFromParent(View view) {
            if (view == null) {
                return;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                boolean z = layoutTransition != null;
                if (z) {
                    layoutTransition.disableTransitionType(3);
                }
                viewGroup.removeView(view);
                if (z) {
                    layoutTransition.enableTransitionType(3);
                }
                view.animate().cancel();
                view.clearAnimation();
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setTranslationZ(0.0f);
                view.setAlpha(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setRotation(0.0f);
                view.setRotationX(0.0f);
                view.setRotationY(0.0f);
            }
        }

        private void updateAttributeFreq() {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
            TL_stars.starGiftAttributePattern stargiftattributepattern;
            int[][] iArr = MessagesController.getInstance(this.currentAccount).stargiftsCraftAttributesPermilles;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    break;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null && selectGiftView.getGift() != null) {
                    i2++;
                    TL_stars.StarGift gift = this.gifts[i].getGift();
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(gift.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    map.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.EL.getOrDefault(map, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    map2.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.EL.getOrDefault(map2, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
                i++;
            }
            if (map.isEmpty()) {
                AttributeView attributeView = this.backdropAttributes[0];
                attributeView.setBackdrop(null);
                attributeView.setProgress(0.0f, true);
                arrayList.add(attributeView);
                for (int i3 = 1; i3 < 4; i3++) {
                    this.backdropAttributes[i3].setVisibility(8);
                }
            } else {
                ArrayList<Map.Entry> arrayList2 = new ArrayList(map.entrySet());
                Collections.sort(arrayList2, Map$Entry$CC.comparingByValue());
                int i4 = 0;
                for (Map.Entry entry : arrayList2) {
                    int iIntValue = ((Integer) entry.getKey()).intValue();
                    int iIntValue2 = ((Integer) entry.getValue()).intValue();
                    int i5 = 0;
                    while (true) {
                        SelectGiftView[] selectGiftViewArr2 = this.gifts;
                        if (i5 >= selectGiftViewArr2.length) {
                            stargiftattributebackdrop = null;
                            break;
                        }
                        SelectGiftView selectGiftView2 = selectGiftViewArr2[i5];
                        if (selectGiftView2 != null && selectGiftView2.getGift() != null) {
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(this.gifts[i5].getGift().attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == iIntValue) {
                                break;
                            }
                        }
                        i5++;
                    }
                    if (stargiftattributebackdrop != null) {
                        int i6 = i4 + 1;
                        AttributeView attributeView2 = this.backdropAttributes[i4];
                        attributeView2.setBackdrop(stargiftattributebackdrop);
                        int[] iArr2 = iArr[Utilities.clamp(i2 - 1, iArr.length - 1, 0)];
                        attributeView2.setProgress(iArr2[Utilities.clamp(iIntValue2 - 1, iArr2.length - 1, 0)] / 1000.0f, true);
                        arrayList.add(attributeView2);
                        i4 = i6;
                    }
                }
                while (i4 < 4) {
                    this.backdropAttributes[i4].setVisibility(8);
                    i4++;
                }
            }
            if (map2.isEmpty()) {
                AttributeView attributeView3 = this.patternAttributes[0];
                attributeView3.setIcon(null);
                attributeView3.setProgress(0.0f, true);
                arrayList.add(attributeView3);
                int i7 = 1;
                for (int i8 = 4; i7 < i8; i8 = 4) {
                    this.patternAttributes[i7].setVisibility(8);
                    i7++;
                }
            } else {
                ArrayList<Map.Entry> arrayList3 = new ArrayList(map2.entrySet());
                Collections.sort(arrayList3, Map$Entry$CC.comparingByValue());
                int i9 = 0;
                for (Map.Entry entry2 : arrayList3) {
                    long jLongValue = ((Long) entry2.getKey()).longValue();
                    int iIntValue3 = ((Integer) entry2.getValue()).intValue();
                    int i10 = 0;
                    while (true) {
                        SelectGiftView[] selectGiftViewArr3 = this.gifts;
                        if (i10 >= selectGiftViewArr3.length) {
                            stargiftattributepattern = null;
                            break;
                        }
                        SelectGiftView selectGiftView3 = selectGiftViewArr3[i10];
                        if (selectGiftView3 != null && selectGiftView3.getGift() != null && (stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(this.gifts[i10].getGift().attributes, TL_stars.starGiftAttributePattern.class)) != null && stargiftattributepattern.document.id == jLongValue) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (stargiftattributepattern != null) {
                        AttributeView attributeView4 = this.patternAttributes[i9];
                        attributeView4.setIcon(stargiftattributepattern);
                        int[] iArr3 = iArr[Utilities.clamp(i2 - 1, iArr.length - 1, 0)];
                        attributeView4.setProgress(iArr3[Utilities.clamp(iIntValue3 - 1, iArr3.length - 1, 0)] / 1000.0f, true);
                        arrayList.add(attributeView4);
                        i9++;
                    }
                }
                while (i9 < 4) {
                    this.patternAttributes[i9].setVisibility(8);
                    i9++;
                }
            }
            this.attributesTwoLines = arrayList.size() > 5;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                AttributeView attributeView5 = (AttributeView) arrayList.get(i11);
                LinearLayout linearLayout = (!this.attributesTwoLines || ((float) i11) < ((float) arrayList.size()) / 2.0f) ? this.attributesLayoutLine1 : this.attributesLayoutLine2;
                if (attributeView5.getParent() != linearLayout) {
                    removeFromParent(attributeView5);
                    linearLayout.addView(attributeView5, LayoutHelper.createLinear(48, 54, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                attributeView5.setVisibility(0);
            }
            this.attributesLayoutLine2.animate().alpha(this.attributesTwoLines ? 1.0f : 0.0f);
            this.variantsButton.animate().alpha(this.attributesTwoLines ? 0.0f : this.previewAttributes != null ? 1.0f : 0.25f);
        }

        public int getGiftsSelectedCount() {
            int i = 0;
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return i2;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null && selectGiftView.getGift() != null) {
                    i2++;
                }
                i++;
            }
        }

        public int getGiftsSuccessChance() {
            int i = 0;
            int i2 = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return i2;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null && selectGiftView.getGift() != null) {
                    i2 += this.gifts[i].getGift().craft_chance_permille;
                }
                i++;
            }
        }

        public TL_stars.StarGift getFirstGift() {
            int i = 0;
            while (true) {
                SelectGiftView[] selectGiftViewArr = this.gifts;
                if (i >= selectGiftViewArr.length) {
                    return null;
                }
                SelectGiftView selectGiftView = selectGiftViewArr[i];
                if (selectGiftView != null && selectGiftView.getGift() != null) {
                    return this.gifts[i].getGift();
                }
                i++;
            }
        }

        final class SelectGiftView extends FrameLayout {
            private final TextView chance;
            private final ImageView closeIcon;
            private final FrameLayout closeLayout;
            public TL_stars.StarGift gift;
            private final GiftSheet.CardBackground giftBackground;
            private final BackupImageView giftImage;
            private final FrameLayout giftLayout;
            public boolean isReplaceIcon;
            private final FrameLayout layout;
            private final ImageView plus;
            public TL_stars.SavedStarGift savedGift;

            public SelectGiftView(Context context) {
                super(context);
                FrameLayout frameLayout = new FrameLayout(context);
                this.layout = frameLayout;
                addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
                frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.multAlpha(-4530177, 0.12f)));
                frameLayout.setForeground(new RoundRectStrokeDrawable(AndroidUtilities.dp(18.0f), 0));
                ImageView imageView = new ImageView(context);
                this.plus = imageView;
                imageView.setImageResource(R.drawable.filled_add_album);
                imageView.setScaleX(1.25f);
                imageView.setScaleY(1.25f);
                frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.giftLayout = frameLayout2;
                GiftSheet.CardBackground cardBackground = new GiftSheet.CardBackground(frameLayout2, null, false);
                this.giftBackground = cardBackground;
                frameLayout2.setBackground(cardBackground);
                cardBackground.setRoundRadius(AndroidUtilities.dp(18.0f));
                cardBackground.setPadding(false);
                frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
                frameLayout2.setAlpha(0.0f);
                frameLayout2.setScaleX(0.6f);
                frameLayout2.setScaleY(0.6f);
                BackupImageView backupImageView = new BackupImageView(context);
                this.giftImage = backupImageView;
                frameLayout2.addView(backupImageView, LayoutHelper.createFrame(52, 52, 17));
                TextView textView = new TextView(context);
                this.chance = textView;
                textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 10.0f);
                textView.setTextColor(-1);
                textView.setAlpha(0.0f);
                addView(textView, LayoutHelper.createFrame(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.closeLayout = frameLayout3;
                frameLayout3.setAlpha(0.0f);
                addView(frameLayout3, LayoutHelper.createFrame(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                this.closeIcon = imageView2;
                imageView2.setImageResource(R.drawable.msg_close);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                frameLayout3.addView(imageView2, LayoutHelper.createFrame(12, 12, 17));
                setGiftVisible(false, false);
            }

            public TL_stars.StarGift getGift() {
                TL_stars.StarGift starGift = this.gift;
                if (starGift != null) {
                    return starGift;
                }
                TL_stars.SavedStarGift savedStarGift = this.savedGift;
                if (savedStarGift != null) {
                    return savedStarGift.gift;
                }
                return null;
            }

            public void setReplaceIcon(boolean z) {
                float f = z ? 1.0f : 0.8f;
                this.closeIcon.setScaleX(f);
                this.closeIcon.setScaleY(f);
                ImageView imageView = this.closeIcon;
                this.isReplaceIcon = z;
                imageView.setImageResource(z ? R.drawable.mini_replace2 : R.drawable.msg_close);
            }

            public void setGift(TL_stars.StarGift starGift, boolean z) {
                this.gift = starGift;
                if (starGift != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                    this.giftBackground.setBackdrop(stargiftattributebackdrop);
                    this.giftBackground.setPattern(stargiftattributepattern);
                    StarsIntroActivity.setGiftImage(this.giftImage.getImageReceiver(), stargiftattributemodel.document, 52);
                    int iAdaptHSV = Theme.adaptHSV(Theme.multAlpha(stargiftattributebackdrop.edge_color | (-16777216), 0.88f), -0.05f, -0.15f);
                    this.chance.setText(AffiliateProgramFragment.percents(starGift.craft_chance_permille));
                    this.chance.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(10.0f), iAdaptHSV));
                    this.closeLayout.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(10.0f), iAdaptHSV));
                }
                setGiftVisible(starGift != null, z);
            }

            public void setHideButtons(float f) {
                float f2 = 1.0f - f;
                this.chance.setAlpha(f2);
                this.closeLayout.setAlpha(f2);
            }

            public void setGiftVisible(final boolean z, boolean z2) {
                this.giftLayout.animate().cancel();
                this.chance.animate().cancel();
                this.closeLayout.animate().cancel();
                if (!z2) {
                    this.giftLayout.setVisibility(z ? 0 : 8);
                    this.giftLayout.setScaleX(z ? 1.0f : 0.6f);
                    this.giftLayout.setScaleY(z ? 1.0f : 0.6f);
                    this.giftLayout.setAlpha(z ? 1.0f : 0.0f);
                    this.chance.setVisibility(z ? 0 : 8);
                    this.chance.setAlpha(z ? 1.0f : 0.0f);
                    this.closeLayout.setVisibility(z ? 0 : 8);
                    this.closeLayout.setAlpha(z ? 1.0f : 0.0f);
                    return;
                }
                this.giftLayout.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.giftLayout.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).alpha(z ? 1.0f : 0.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setGiftVisible$0(z);
                    }
                }).start();
                this.chance.setVisibility(0);
                this.chance.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setGiftVisible$1(z);
                    }
                }).start();
                this.closeLayout.setVisibility(0);
                this.closeLayout.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setGiftVisible$2(z);
                    }
                }).start();
            }

            public void lambda$setGiftVisible$0(boolean z) {
                if (z) {
                    return;
                }
                this.closeLayout.setVisibility(8);
            }

            public void lambda$setGiftVisible$1(boolean z) {
                if (z) {
                    return;
                }
                this.closeLayout.setVisibility(8);
            }

            public void lambda$setGiftVisible$2(boolean z) {
                if (z) {
                    return;
                }
                this.closeLayout.setVisibility(8);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
            }
        }

        private static class Face extends FrameLayout {
            private AnimatedTextView counter;
            private BackupImageView image;
            private FrameLayout layout;
            private ProgressView progress;

            public Face(Context context, boolean z) {
                super(context);
                FrameLayout frameLayout = new FrameLayout(context);
                this.layout = frameLayout;
                frameLayout.setBackground(new RoundRectStrokeDrawable(AndroidUtilities.dp(24.0f), Theme.multAlpha(-1, 0.08f)));
                addView(this.layout, LayoutHelper.createFrame(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
                BackupImageView backupImageView = new BackupImageView(context);
                this.image = backupImageView;
                backupImageView.setImageResource(R.drawable.large_forge);
                this.image.setAlpha(z ? 1.0f : 0.45f);
                this.layout.addView(this.image, LayoutHelper.createFrame(z ? 42 : 64, z ? 42 : 64, 17));
                if (z) {
                    this.image.setTranslationX(AndroidUtilities.dp(-4.0f));
                    ProgressView progressView = new ProgressView(context);
                    this.progress = progressView;
                    progressView.setRadius(AndroidUtilities.dp(37.0f));
                    this.progress.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                    this.layout.addView(this.progress, LayoutHelper.createFrame(90, 90, 17));
                    AnimatedTextView animatedTextView = new AnimatedTextView(context);
                    this.counter = animatedTextView;
                    animatedTextView.getDrawable().setHacks(false, true, true);
                    this.counter.setTypeface(AndroidUtilities.bold());
                    this.counter.setTextColor(-1);
                    this.counter.setTextSize(AndroidUtilities.dp(14.0f));
                    this.counter.setGravity(17);
                    this.counter.setText("0%");
                    this.layout.addView(this.counter, LayoutHelper.createFrame(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
                }
            }

            public void setChance(float f, boolean z) {
                AnimatedTextView animatedTextView = this.counter;
                if (animatedTextView == null) {
                    return;
                }
                animatedTextView.setText(Math.round(f) + "%", z);
                this.progress.setProgress(f / 100.0f, z);
            }
        }

        private static class ProgressView extends View {
            private final AnimatedFloat animatedProgress;
            private final AnimatedFloat animatedProgressAlpha;
            private final Paint paint;
            private float progress;
            private float radius;

            public ProgressView(Context context) {
                super(context);
                Paint paint = new Paint(1);
                this.paint = paint;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidate();
                    }
                };
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedProgress = new AnimatedFloat(runnable, 0L, 420L, cubicBezierInterpolator);
                this.animatedProgressAlpha = new AnimatedFloat(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidate();
                    }
                }, 0L, 420L, cubicBezierInterpolator);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            }

            public void setProgress(float f, boolean z) {
                this.progress = f;
                if (!z) {
                    this.animatedProgress.force(f);
                }
                invalidate();
            }

            public void setRadius(float f) {
                this.radius = f;
            }

            public void setStrokeWidth(float f) {
                this.paint.setStrokeWidth(f);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f = this.animatedProgress.set(this.progress);
                float f2 = this.animatedProgressAlpha.set(this.progress > 0.0f);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f3 = this.radius;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(width - f3, height - f3, width + f3, height + f3);
                this.paint.setColor(Theme.multAlpha(-1, 0.25f));
                canvas.drawArc(rectF, 135.0f, 270.0f, false, this.paint);
                if (f2 > 0.0f) {
                    this.paint.setColor(Theme.multAlpha(-1, f2));
                    canvas.drawArc(rectF, 135.0f, f * 270.0f, false, this.paint);
                }
            }
        }

        private static class RaysView extends View {
            private final Paint fillPaint;
            private RadialGradient[] gradient;
            private Matrix gradientMatrix;
            private int leftColor;
            private RadialGradient maskGradient;
            private final Paint maskPaint;
            private final Path path;
            private int rightColor;
            private final Paint strokePaint;
            private AnimatedFloat swapGradient;

            public RaysView(Context context) {
                super(context);
                this.fillPaint = new Paint(1);
                this.strokePaint = new Paint(1);
                Paint paint = new Paint(1);
                this.maskPaint = paint;
                this.gradient = new RadialGradient[2];
                this.gradientMatrix = new Matrix();
                this.swapGradient = new AnimatedFloat(1.0f, this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.maskGradient = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
                this.path = new Path();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }

            public void setColor(int i, int i2) {
                if (this.leftColor == i && this.rightColor == i2) {
                    return;
                }
                RadialGradient[] radialGradientArr = this.gradient;
                radialGradientArr[0] = radialGradientArr[1];
                this.leftColor = i;
                this.rightColor = i2;
                radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.swapGradient.force(0.0f);
                invalidate();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f = this.swapGradient.set(1.0f);
                float fCurrentTimeMillis = ((System.currentTimeMillis() % 15000) / 15000.0f) * 360.0f;
                if (getAlpha() > 0.0f) {
                    invalidate();
                }
                this.strokePaint.setStyle(Paint.Style.STROKE);
                this.strokePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.path.rewind();
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
                int i = 0;
                int i2 = 0;
                while (i2 < 6) {
                    float f2 = (i2 * 60.0f) + 12.5f + fCurrentTimeMillis;
                    this.path.moveTo(width, height);
                    double d = ((f2 - 12.5f) / 180.0f) * 3.141592653589793d;
                    this.path.lineTo((((float) Math.cos(d)) * fMin) + width, (((float) Math.sin(d)) * fMin) + height);
                    double d2 = ((f2 + 12.5f) / 180.0f) * 3.141592653589793d;
                    this.path.lineTo((((float) Math.cos(d2)) * fMin) + width, (((float) Math.sin(d2)) * fMin) + height);
                    this.path.lineTo(width, height);
                    i2++;
                    f = f;
                }
                float f3 = f;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                while (true) {
                    RadialGradient[] radialGradientArr = this.gradient;
                    if (i < radialGradientArr.length) {
                        if (radialGradientArr[i] != null) {
                            float fPow = (float) Math.pow(1.0f - Math.abs(i - f3), 0.5d);
                            if (fPow > 0.0f) {
                                this.gradientMatrix.reset();
                                float f4 = fMin / 100.0f;
                                this.gradientMatrix.postScale(f4, f4);
                                this.gradientMatrix.postTranslate(width, height);
                                this.gradient[i].setLocalMatrix(this.gradientMatrix);
                                this.fillPaint.setShader(this.gradient[i]);
                                float f5 = fPow * 255.0f;
                                this.fillPaint.setAlpha((int) (0.3f * f5));
                                this.strokePaint.setShader(this.gradient[i]);
                                this.strokePaint.setAlpha((int) f5);
                                canvas.drawPath(this.path, this.fillPaint);
                                canvas.drawPath(this.path, this.strokePaint);
                            }
                        }
                        i++;
                    } else {
                        this.gradientMatrix.reset();
                        float f6 = fMin / 100.0f;
                        this.gradientMatrix.postScale(f6, f6);
                        this.gradientMatrix.postTranslate(width, height);
                        this.maskGradient.setLocalMatrix(this.gradientMatrix);
                        this.maskPaint.setShader(this.maskGradient);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.maskPaint);
                        canvas.restore();
                        return;
                    }
                }
            }
        }

        static class Cube3D extends FrameLayout {
            private final Matrix cameraMatrix;
            private final Integer[] drawOrder;
            private final float[] faceDepths;
            private final float[][] faceNormals;
            private final float[] faceRotations;
            private View[] faces;
            private final float friction;
            private boolean frictionEnabled;
            private final HashMap index2Position;
            private final HashMap index2face;
            private ValueAnimator pulling;
            private int pullingIndex;
            private float pullingT;
            private final float[] rotationMatrix;
            private AnimSequence sequence;
            private final float[] transformedNormal;
            private final Runnable updateRunnable;
            private final HashSet usedFaces;
            private float vx;
            private float vy;

            public Cube3D(Context context, View[] viewArr) {
                super(context);
                this.cameraMatrix = new Matrix();
                float[] fArr = new float[16];
                this.rotationMatrix = fArr;
                this.vx = 0.0f;
                this.vy = 0.0f;
                this.friction = 0.96f;
                this.frictionEnabled = true;
                this.faceNormals = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
                this.transformedNormal = new float[4];
                this.faceDepths = new float[6];
                this.drawOrder = new Integer[]{0, 1, 2, 3, 4, 5};
                this.usedFaces = new HashSet();
                this.index2face = new HashMap();
                this.index2Position = new HashMap();
                this.faceRotations = new float[6];
                this.pullingIndex = -1;
                this.updateRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$2();
                    }
                };
                setClipToOutline(false);
                setClipToPadding(false);
                android.opengl.Matrix.setIdentityM(fArr, 0);
                this.faces = viewArr;
                for (View view : viewArr) {
                    addView(view, LayoutHelper.createFrame(108, 108, 17));
                }
            }

            public int putView(int i, View view) {
                if (i == -1) {
                    i = 5;
                }
                AndroidUtilities.removeFromParent(view);
                int childCount = getChildCount();
                addView(view, LayoutHelper.createFrame(64, 64, 17));
                this.usedFaces.add(Integer.valueOf(i));
                this.index2face.put(Integer.valueOf(childCount), Integer.valueOf(i));
                return i;
            }

            public static class AnimSequence {
                private final Cube3D cube;
                private int framesRemaining;
                private Runnable onComplete;
                private float startVx;
                private float startVy;
                private int totalFrames;
                private final ArrayList commands = new ArrayList();
                private int currentIndex = 0;
                private boolean cancelled = false;
                private float[] startMatrix = new float[16];
                private float[] targetMatrix = new float[16];
                private boolean waitingForPull = false;

                private enum CmdType {
                    RUN,
                    FLING,
                    DELAY,
                    STEER,
                    PUT,
                    FRICTION
                }

                public AnimSequence(Cube3D cube3D) {
                    this.cube = cube3D;
                }

                public AnimSequence run(Runnable runnable) {
                    this.commands.add(new Cmd(CmdType.RUN, 0.0f, 0.0f, 0, -1, 0.0f, null, runnable));
                    return this;
                }

                public AnimSequence fling(float f, float f2) {
                    this.commands.add(new Cmd(CmdType.FLING, f, f2, 0, -1, 0.0f, null, null));
                    return this;
                }

                public AnimSequence delay(int i) {
                    this.commands.add(new Cmd(CmdType.DELAY, 0.0f, 0.0f, i, -1, 0.0f, null, null));
                    return this;
                }

                public AnimSequence steerTo(int i, int i2, float f) {
                    this.commands.add(new Cmd(CmdType.STEER, 0.0f, 0.0f, i2, i, f, null, null));
                    return this;
                }

                public AnimSequence put(View view, int i, int i2) {
                    return put(view, i, i2, 0.0f);
                }

                public AnimSequence put(View view, int i, int i2, float f) {
                    this.commands.add(new Cmd(CmdType.PUT, 0.0f, 0.0f, i2, i, f, view, null));
                    return this;
                }

                public AnimSequence friction(boolean z) {
                    this.commands.add(new Cmd(CmdType.FRICTION, z ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
                    return this;
                }

                public void start(Runnable runnable) {
                    this.onComplete = runnable;
                    this.cancelled = false;
                    this.currentIndex = 0;
                    this.waitingForPull = false;
                    Iterator it = this.commands.iterator();
                    while (it.hasNext()) {
                        Cmd cmd = (Cmd) it.next();
                        int i = cmd.face;
                        if (i >= 0 && i < 6 && cmd.rotation != 0.0f) {
                            this.cube.faceRotations[cmd.face] = cmd.rotation;
                        }
                    }
                    this.cube.sequence = this;
                    executeNext();
                }

                public void cancel() {
                    this.cancelled = true;
                    this.waitingForPull = false;
                    this.cube.sequence = null;
                }

                void onPullComplete() {
                    if (this.waitingForPull) {
                        this.waitingForPull = false;
                        executeNext();
                    }
                }

                private void executeNext() {
                    Runnable runnable;
                    if (this.cancelled || this.currentIndex >= this.commands.size()) {
                        this.cube.sequence = null;
                        if (this.cancelled || (runnable = this.onComplete) == null) {
                            return;
                        }
                        runnable.run();
                        return;
                    }
                    Cmd cmd = (Cmd) this.commands.get(this.currentIndex);
                    this.currentIndex++;
                    int iOrdinal = cmd.type.ordinal();
                    if (iOrdinal == 0) {
                        Runnable runnable2 = cmd.runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        executeNext();
                        return;
                    }
                    if (iOrdinal == 1) {
                        this.cube.fling(cmd.x, cmd.y);
                        this.framesRemaining = 1;
                        this.totalFrames = 1;
                        return;
                    }
                    if (iOrdinal == 2) {
                        int i = cmd.frames;
                        this.framesRemaining = i;
                        this.totalFrames = i;
                        return;
                    }
                    if (iOrdinal == 3) {
                        System.arraycopy(this.cube.rotationMatrix, 0, this.startMatrix, 0, 16);
                        this.targetMatrix = this.cube.createFaceMatrix(cmd.face, cmd.rotation);
                        int i2 = cmd.frames;
                        this.totalFrames = i2;
                        this.framesRemaining = i2;
                        this.startVx = this.cube.vx;
                        this.startVy = this.cube.vy;
                        return;
                    }
                    if (iOrdinal == 4) {
                        this.waitingForPull = true;
                        this.cube.doPull(cmd.view, cmd.face, cmd.frames);
                    } else {
                        if (iOrdinal != 5) {
                            return;
                        }
                        this.cube.frictionEnabled = cmd.x > 0.0f;
                        executeNext();
                    }
                }

                void tick() {
                    int i;
                    if (this.cancelled || (i = this.currentIndex) == 0) {
                        return;
                    }
                    if (this.waitingForPull) {
                        this.cube.applyPhysics();
                        return;
                    }
                    int iOrdinal = ((Cmd) this.commands.get(i - 1)).type.ordinal();
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        this.cube.applyPhysics();
                        int i2 = this.framesRemaining - 1;
                        this.framesRemaining = i2;
                        if (i2 <= 0) {
                            executeNext();
                            return;
                        }
                        return;
                    }
                    if (iOrdinal != 3) {
                        return;
                    }
                    float fEaseOutCubic = easeOutCubic(1.0f - (this.framesRemaining / this.totalFrames));
                    float f = 1.0f - fEaseOutCubic;
                    if (Math.abs(this.startVx * f) > 1.0E-4f || Math.abs(this.startVy * f) > 1.0E-4f) {
                        float[] fArr = new float[16];
                        this.cube.axisAngleToMatrix(1.0f, 0.0f, 0.0f, this.startVx * f * 0.96f, fArr);
                        Cube3D cube3D = this.cube;
                        float[] fArr2 = this.startMatrix;
                        cube3D.multiplyMatrix(fArr, fArr2, fArr2);
                        this.cube.axisAngleToMatrix(0.0f, 1.0f, 0.0f, this.startVy * f * 0.96f, fArr);
                        Cube3D cube3D2 = this.cube;
                        float[] fArr3 = this.startMatrix;
                        cube3D2.multiplyMatrix(fArr, fArr3, fArr3);
                    }
                    Cube3D cube3D3 = this.cube;
                    cube3D3.lerpMatrix(this.startMatrix, this.targetMatrix, fEaseOutCubic, cube3D3.rotationMatrix);
                    int i3 = this.framesRemaining - 1;
                    this.framesRemaining = i3;
                    if (i3 <= 0) {
                        System.arraycopy(this.targetMatrix, 0, this.cube.rotationMatrix, 0, 16);
                        this.cube.vx = 0.0f;
                        this.cube.vy = 0.0f;
                        executeNext();
                    }
                }

                private float easeOutCubic(float f) {
                    return 1.0f - ((float) Math.pow(1.0f - f, 3.0d));
                }

                private static class Cmd {
                    final int face;
                    final int frames;
                    final float rotation;
                    final Runnable runnable;
                    final CmdType type;
                    final View view;
                    final float x;
                    final float y;

                    Cmd(CmdType cmdType, float f, float f2, int i, int i2, float f3, View view, Runnable runnable) {
                        this.type = cmdType;
                        this.x = f;
                        this.y = f2;
                        this.frames = i;
                        this.face = i2;
                        this.rotation = f3;
                        this.view = view;
                        this.runnable = runnable;
                    }
                }
            }

            public void fling(float f, float f2) {
                this.vx += f2 * 0.01f;
                this.vy += f * 0.01f;
            }

            public void reset() {
                AnimSequence animSequence = this.sequence;
                if (animSequence != null) {
                    animSequence.cancel();
                    this.sequence = null;
                }
                ValueAnimator valueAnimator = this.pulling;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.pulling = null;
                }
                this.pullingIndex = -1;
                this.pullingT = 0.0f;
                this.usedFaces.clear();
                this.index2face.clear();
                this.index2Position.clear();
                for (int i = 0; i < 6; i++) {
                    this.faceRotations[i] = 0.0f;
                }
                removeAllViews();
                int i2 = 0;
                while (true) {
                    View[] viewArr = this.faces;
                    if (i2 < viewArr.length) {
                        viewArr[i2].setAlpha(1.0f);
                        this.faces[i2].setVisibility(0);
                        addView(this.faces[i2], LayoutHelper.createFrame(108, 108, 17));
                        i2++;
                    } else {
                        android.opengl.Matrix.setIdentityM(this.rotationMatrix, 0);
                        this.vy = 0.0f;
                        this.vx = 0.0f;
                        this.frictionEnabled = true;
                        return;
                    }
                }
            }

            public void doPull(View view, int i, int i2) {
                ValueAnimator valueAnimator = this.pulling;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.pulling = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - getX();
                rectF.top = view.getY() - getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = getChildCount();
                addView(view, LayoutHelper.createFrame(64, 64, 17));
                this.usedFaces.add(Integer.valueOf(i));
                this.index2face.put(Integer.valueOf(childCount), Integer.valueOf(i));
                this.index2Position.put(Integer.valueOf(childCount), rectF);
                this.pullingIndex = childCount;
                this.pullingT = 0.0f;
                long j = i2 * 16;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.pulling = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$doPull$0(valueAnimator2);
                    }
                });
                this.pulling.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Cube3D.this.pullingT = 1.0f;
                        Cube3D.this.pullingIndex = -1;
                        if (Cube3D.this.sequence != null && Cube3D.this.sequence.waitingForPull) {
                            Cube3D.this.sequence.onPullComplete();
                        }
                        Cube3D.this.pulling = null;
                    }
                });
                this.pulling.setDuration(j);
                this.pulling.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.pulling.start();
            }

            public void lambda$doPull$0(ValueAnimator valueAnimator) {
                AnimSequence animSequence;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.pullingT = fFloatValue;
                if (fFloatValue >= 0.8f && (animSequence = this.sequence) != null && animSequence.waitingForPull) {
                    this.sequence.onPullComplete();
                }
                invalidate();
            }

            public float[] createFaceMatrix(int i, float f) {
                float[] fArr = new float[16];
                android.opengl.Matrix.setIdentityM(fArr, 0);
                if (f != 0.0f) {
                    android.opengl.Matrix.rotateM(fArr, 0, -f, 0.0f, 0.0f, 1.0f);
                }
                if (i == 0) {
                    android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                } else if (i == 1) {
                    android.opengl.Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                } else if (i == 2) {
                    android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                } else if (i == 3) {
                    android.opengl.Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                } else if (i == 4) {
                    android.opengl.Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                }
                return fArr;
            }

            public void axisAngleToMatrix(float f, float f2, float f3, float f4, float[] fArr) {
                double d = f4;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                float f5 = 1.0f - fCos;
                float f6 = f5 * f;
                fArr[0] = (f6 * f) + fCos;
                float f7 = f6 * f2;
                float f8 = fSin * f3;
                fArr[4] = f7 - f8;
                float f9 = f6 * f3;
                float f10 = fSin * f2;
                fArr[8] = f9 + f10;
                fArr[12] = 0.0f;
                fArr[1] = f7 + f8;
                float f11 = f5 * f2;
                fArr[5] = (f2 * f11) + fCos;
                float f12 = f11 * f3;
                float f13 = fSin * f;
                fArr[9] = f12 - f13;
                fArr[13] = 0.0f;
                fArr[2] = f9 - f10;
                fArr[6] = f12 + f13;
                fArr[10] = (f5 * f3 * f3) + fCos;
                fArr[14] = 0.0f;
                fArr[3] = 0.0f;
                fArr[7] = 0.0f;
                fArr[11] = 0.0f;
                fArr[15] = 1.0f;
            }

            public void multiplyMatrix(float[] fArr, float[] fArr2, float[] fArr3) {
                float[] fArr4 = new float[16];
                android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr2, 0);
                System.arraycopy(fArr4, 0, fArr3, 0, 16);
            }

            public void lerpMatrix(float[] fArr, float[] fArr2, float f, float[] fArr3) {
                for (int i = 0; i < 16; i++) {
                    float f2 = fArr[i];
                    fArr3[i] = f2 + ((fArr2[i] - f2) * f);
                }
                orthonormalize(fArr3);
            }

            private void orthonormalize(float[] fArr) {
                float[] fArr2 = {fArr[0], fArr[1], fArr[2]};
                float[] fArr3 = {fArr[4], fArr[5], fArr[6]};
                float[] fArr4 = new float[3];
                normalize(fArr2);
                cross(fArr2, fArr3, fArr4);
                normalize(fArr4);
                cross(fArr4, fArr2, fArr3);
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                fArr[4] = fArr3[0];
                fArr[5] = fArr3[1];
                fArr[6] = fArr3[2];
                fArr[8] = fArr4[0];
                fArr[9] = fArr4[1];
                fArr[10] = fArr4[2];
            }

            private void normalize(float[] fArr) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                if (fSqrt > 0.0f) {
                    fArr[0] = fArr[0] / fSqrt;
                    fArr[1] = fArr[1] / fSqrt;
                    fArr[2] = fArr[2] / fSqrt;
                }
            }

            private void cross(float[] fArr, float[] fArr2, float[] fArr3) {
                float f = fArr[1];
                float f2 = fArr2[2];
                float f3 = fArr[2];
                fArr3[0] = (f * f2) - (fArr2[1] * f3);
                float f4 = fArr2[0];
                float f5 = fArr[0];
                fArr3[1] = (f3 * f4) - (f2 * f5);
                fArr3[2] = (f5 * fArr2[1]) - (fArr[1] * f4);
            }

            private void getFaceBasis(int i, float[] fArr, float[] fArr2, float[] fArr3) {
                System.arraycopy(this.faceNormals[i], 0, fArr, 0, 4);
                if (i == 0) {
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = 1.0f;
                    fArr3[0] = 0.0f;
                    fArr3[1] = -1.0f;
                    fArr3[2] = 0.0f;
                } else if (i == 1) {
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = -1.0f;
                    fArr3[0] = 0.0f;
                    fArr3[1] = -1.0f;
                    fArr3[2] = 0.0f;
                } else if (i == 2) {
                    fArr2[0] = 1.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = 0.0f;
                    fArr3[0] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 1.0f;
                } else if (i == 3) {
                    fArr2[0] = 1.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = 0.0f;
                    fArr3[0] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[2] = -1.0f;
                } else if (i == 4) {
                    fArr2[0] = -1.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = 0.0f;
                    fArr3[0] = 0.0f;
                    fArr3[1] = -1.0f;
                    fArr3[2] = 0.0f;
                } else if (i == 5) {
                    fArr2[0] = 1.0f;
                    fArr2[1] = 0.0f;
                    fArr2[2] = 0.0f;
                    fArr3[0] = 0.0f;
                    fArr3[1] = -1.0f;
                    fArr3[2] = 0.0f;
                }
                fArr2[3] = 0.0f;
                fArr3[3] = 0.0f;
            }

            public void applyPhysics() {
                if (Math.abs(this.vx) > 1.0E-4f || Math.abs(this.vy) > 1.0E-4f) {
                    float[] fArr = new float[16];
                    axisAngleToMatrix(1.0f, 0.0f, 0.0f, this.vx, fArr);
                    float[] fArr2 = this.rotationMatrix;
                    multiplyMatrix(fArr, fArr2, fArr2);
                    axisAngleToMatrix(0.0f, 1.0f, 0.0f, this.vy, fArr);
                    float[] fArr3 = this.rotationMatrix;
                    multiplyMatrix(fArr, fArr3, fArr3);
                    if (this.frictionEnabled) {
                        this.vx *= 0.96f;
                        this.vy *= 0.96f;
                    }
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(this.updateRunnable, 16L);
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            }

            public void lambda$new$2() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftSheet.CraftTopView.Cube3D.lambda$new$2():void");
            }

            public int lambda$update$3(Integer num, Integer num2) {
                return Float.compare(this.faceDepths[num.intValue()], this.faceDepths[num2.intValue()]);
            }

            @Override
            protected int getChildDrawingOrder(int i, int i2) {
                if (i2 < 6) {
                    Integer[] numArr = this.drawOrder;
                    if (i2 < numArr.length) {
                        return numArr[i2].intValue();
                    }
                }
                return i2;
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                RectF rectF;
                boolean z;
                boolean z2;
                float fDp;
                float[] fArr;
                boolean z3;
                int iIndexOfChild = indexOfChild(view);
                if (iIndexOfChild >= 6) {
                    z2 = this.pullingIndex == iIndexOfChild;
                    rectF = (RectF) this.index2Position.get(Integer.valueOf(iIndexOfChild));
                    Integer num = (Integer) this.index2face.get(Integer.valueOf(iIndexOfChild));
                    if (num != null) {
                        iIndexOfChild = num.intValue();
                    }
                    if (view instanceof SelectGiftView) {
                        ((SelectGiftView) view).setHideButtons(z2 ? this.pullingT : 1.0f);
                        if (!z2 || this.pullingT >= 1.0f) {
                            this.faces[iIndexOfChild].setVisibility(8);
                        }
                    }
                    z = true;
                } else {
                    rectF = null;
                    z = false;
                    z2 = false;
                }
                android.opengl.Matrix.multiplyMV(this.transformedNormal, 0, this.rotationMatrix, 0, this.faceNormals[iIndexOfChild], 0);
                float f = this.transformedNormal[2];
                if (f < 0.001f) {
                    return false;
                }
                view.setAlpha(Math.min(1.0f, f / 0.3f));
                float width = view.getWidth() / 2.0f;
                if (z && (view instanceof SelectGiftView)) {
                    fDp = AndroidUtilities.dp(-6.0f) + ((z2 ? this.pullingT : 1.0f) * AndroidUtilities.dp(2.0f));
                } else {
                    fDp = 0.0f;
                }
                float fDp2 = AndroidUtilities.dp(108.0f) / 2.0f;
                float width2 = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float[] fArr2 = new float[4];
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                getFaceBasis(iIndexOfChild, fArr2, fArr3, fArr4);
                float f2 = this.faceRotations[iIndexOfChild];
                if (f2 != 0.0f) {
                    z3 = z2;
                    double radians = (float) Math.toRadians(f2);
                    fArr = fArr2;
                    float fCos = (float) Math.cos(radians);
                    float fSin = (float) Math.sin(radians);
                    float f3 = fArr3[0];
                    float f4 = fArr4[0];
                    float f5 = fArr3[1];
                    float f6 = fArr4[1];
                    float f7 = fArr3[2];
                    float f8 = fArr4[2];
                    fArr3[0] = (f3 * fCos) + (f4 * fSin);
                    fArr3[1] = (f5 * fCos) + (f6 * fSin);
                    fArr3[2] = (f7 * fCos) + (f8 * fSin);
                    fArr4[0] = ((-f3) * fSin) + (f4 * fCos);
                    fArr4[1] = ((-f5) * fSin) + (f6 * fCos);
                    fArr4[2] = ((-f7) * fSin) + (f8 * fCos);
                } else {
                    fArr = fArr2;
                    z3 = z2;
                }
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                float[] fArr7 = new float[4];
                android.opengl.Matrix.multiplyMV(fArr5, 0, this.rotationMatrix, 0, fArr, 0);
                android.opengl.Matrix.multiplyMV(fArr6, 0, this.rotationMatrix, 0, fArr3, 0);
                android.opengl.Matrix.multiplyMV(fArr7, 0, this.rotationMatrix, 0, fArr4, 0);
                float f9 = 64.0f * fDp2;
                int i = 1;
                int i2 = 4;
                float[][] fArr8 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 3);
                int i3 = 0;
                while (i3 < i2) {
                    float f10 = (i3 == i || i3 == 2) ? 1.0f : -1.0f;
                    float f11 = (i3 == 0 || i3 == i) ? 1.0f : -1.0f;
                    float[] fArr9 = fArr8[i3];
                    fArr9[0] = (fArr5[0] + (fArr6[0] * f10) + (fArr7[0] * f11)) * fDp2;
                    fArr9[1] = (fArr5[1] + (fArr6[1] * f10) + (fArr7[1] * f11)) * fDp2;
                    fArr9[2] = (fArr5[2] + (fArr6[2] * f10) + (fArr7[2] * f11)) * fDp2;
                    i3++;
                    i2 = 4;
                    i = 1;
                }
                char c = 2;
                float[] fArr10 = new float[8];
                int i4 = 0;
                int i5 = 4;
                while (i4 < i5) {
                    float[] fArr11 = fArr8[i4];
                    float f12 = f9 / (f9 - fArr11[c]);
                    int i6 = i4 * 2;
                    fArr10[i6] = (fArr11[0] * f12) + width2;
                    fArr10[i6 + 1] = (fArr11[1] * f12) + height;
                    i4++;
                    i5 = 4;
                    c = 2;
                }
                float f13 = (width2 - width) - fDp;
                float f14 = (height - width) - fDp;
                float f15 = width2 + width + fDp;
                float f16 = height + width + fDp;
                float[] fArr12 = {f13, f14, f15, f14, f15, f16, f13, f16};
                if (z3 && rectF != null) {
                    float f17 = rectF.left;
                    float f18 = rectF.top;
                    float f19 = rectF.right;
                    float f20 = rectF.bottom;
                    AndroidUtilities.lerp(new float[]{f17, f18, f19, f18, f19, f20, f17, f20}, fArr10, this.pullingT, fArr10);
                }
                this.cameraMatrix.reset();
                this.cameraMatrix.setPolyToPoly(fArr12, 0, fArr10, 0, 4);
                canvas.save();
                canvas.concat(this.cameraMatrix);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
        }

        private static class AttributeView extends FrameLayout {
            public TL_stars.starGiftAttributeBackdrop backdrop;
            private final BackupImageView imageView;
            public TL_stars.starGiftAttributePattern pattern;
            public float progress;
            private final ProgressView progressView;
            private final AnimatedTextView textView;

            public AttributeView(Context context) {
                super(context);
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.setRoundRadius(AndroidUtilities.dp(13.0f));
                addView(backupImageView, LayoutHelper.createFrame(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
                ProgressView progressView = new ProgressView(context);
                this.progressView = progressView;
                progressView.setRadius(AndroidUtilities.dp(18.0f));
                progressView.setStrokeWidth(AndroidUtilities.dp(3.0f));
                addView(progressView, LayoutHelper.createFrame(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
                AnimatedTextView animatedTextView = new AnimatedTextView(context);
                this.textView = animatedTextView;
                animatedTextView.setTypeface(AndroidUtilities.bold());
                animatedTextView.setGravity(17);
                animatedTextView.setTextSize(AndroidUtilities.dp(12.0f));
                animatedTextView.setTextColor(-1);
                addView(animatedTextView, LayoutHelper.createFrame(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
                setProgress(0.0f, false);
                ScaleStateListAnimator.apply(this);
            }

            public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
                this.backdrop = stargiftattributebackdrop;
                this.pattern = null;
                this.imageView.setScaleX(1.0f);
                this.imageView.setScaleY(1.0f);
                if (stargiftattributebackdrop != null) {
                    this.imageView.setAlpha(1.0f);
                    OvalShape ovalShape = new OvalShape();
                    ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
                    ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
                    shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
                    shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
                    shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    this.imageView.setImageDrawable(shapeDrawable);
                    return;
                }
                this.imageView.setAlpha(1.0f);
                this.imageView.setImageDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(26.0f), Theme.multAlpha(-1, 0.25f)));
            }

            public void setIcon(TL_stars.starGiftAttributePattern stargiftattributepattern) {
                this.backdrop = null;
                this.pattern = stargiftattributepattern;
                if (stargiftattributepattern == null) {
                    this.imageView.setAlpha(0.25f);
                    this.imageView.setScaleX(0.75f);
                    this.imageView.setScaleY(0.75f);
                    this.imageView.setTranslationY(0.0f);
                    this.imageView.setAnimatedEmojiDrawable(null);
                    this.imageView.setImageResource(R.drawable.mini_roll);
                    return;
                }
                this.imageView.setAlpha(1.0f);
                this.imageView.setScaleX(0.95f);
                this.imageView.setScaleY(0.95f);
                this.imageView.setTranslationY(AndroidUtilities.dp(2.0f));
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
                animatedEmojiDrawableMake.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.imageView.setAnimatedEmojiDrawable(animatedEmojiDrawableMake);
            }

            public void setProgress(float f, boolean z) {
                this.progress = f;
                this.progressView.setProgress(f, z);
                this.textView.setText(Math.round(f * 100.0f) + "%", z);
            }
        }

        private static class SwitchGradientDrawable extends Drawable {
            private int color1;
            private int color2;
            private Drawable icon;
            private final int type;
            private final Paint paint = new Paint(1);
            private Shader[] gradient = new Shader[2];
            private Matrix gradientMatrix = new Matrix();
            private AnimatedFloat swapGradient = new AnimatedFloat(1.0f, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidateSelf();
                }
            }, 0, 420, CubicBezierInterpolator.EASE_OUT_QUINT);
            private final RectF rect = new RectF();
            private float r = 0.0f;

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            public SwitchGradientDrawable(int i) {
                this.type = i;
            }

            public void setColors(int i, int i2) {
                if (this.color1 == i && this.color2 == i2) {
                    return;
                }
                Shader[] shaderArr = this.gradient;
                shaderArr[0] = shaderArr[1];
                if (this.type == 0) {
                    this.color1 = i;
                    this.color2 = i2;
                    shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                } else {
                    float fDp = AndroidUtilities.dp(340.0f);
                    this.color1 = i;
                    this.color2 = i2;
                    shaderArr[1] = new RadialGradient(0.0f, 0.0f, fDp, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
                this.swapGradient.force(0.0f);
                invalidateSelf();
            }

            public void setIcon(Drawable drawable) {
                this.icon = drawable;
            }

            @Override
            public void draw(Canvas canvas) {
                this.rect.set(getBounds());
                RectF rectF = this.rect;
                rectF.right = rectF.left + rectF.width();
                float f = this.swapGradient.set(1.0f);
                int i = 0;
                while (true) {
                    Shader[] shaderArr = this.gradient;
                    if (i >= shaderArr.length) {
                        break;
                    }
                    if (shaderArr[i] != null) {
                        float fPow = (float) Math.pow(1.0f - Math.abs(i - f), 0.25d);
                        if (fPow > 0.0f) {
                            this.gradientMatrix.reset();
                            if (this.type == 1) {
                                this.gradientMatrix.postTranslate(this.rect.centerX(), AndroidUtilities.dp(145.0f));
                            } else {
                                this.gradientMatrix.postScale(getBounds().width() / 100.0f, 1.0f);
                            }
                            this.gradient[i].setLocalMatrix(this.gradientMatrix);
                            this.paint.setShader(this.gradient[i]);
                            this.paint.setAlpha((int) (fPow * 255.0f));
                            RectF rectF2 = this.rect;
                            float f2 = this.r;
                            canvas.drawRoundRect(rectF2, f2, f2, this.paint);
                        }
                    }
                    i++;
                }
                if (this.icon != null) {
                    canvas.save();
                    canvas.translate(this.rect.centerX(), AndroidUtilities.dp(145.0f));
                    StarGiftPatterns.drawPattern(canvas, 0, this.icon, this.rect.width(), AndroidUtilities.dp(290.0f), 2.0f, 1.0f);
                    canvas.restore();
                }
            }
        }

        private static class ButtonBackground extends Drawable {
            private final Paint backgroundPaint;
            private final Path clipPath;
            private LinearGradient[] gradient;
            private Matrix gradientMatrix;
            private int leftColor;
            private final Paint paintStrokeBottom;
            private final Paint paintStrokeTop;
            private StarsReactionsSheet.Particles particles;
            private int rightColor;
            private AnimatedFloat swapGradient;

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            public ButtonBackground() {
                Paint paint = new Paint(1);
                this.paintStrokeTop = paint;
                Paint paint2 = new Paint(1);
                this.paintStrokeBottom = paint2;
                this.backgroundPaint = new Paint(1);
                this.gradient = new LinearGradient[2];
                this.gradientMatrix = new Matrix();
                this.swapGradient = new AnimatedFloat(1.0f, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateSelf();
                    }
                }, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.clipPath = new Path();
                this.particles = new StarsReactionsSheet.Particles(1, 45);
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setColor(117440511);
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
                paint2.setStyle(style);
                paint2.setColor(301989887);
                paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
            }

            public void setColor(int i, int i2) {
                if (this.leftColor == i && this.rightColor == i2) {
                    return;
                }
                LinearGradient[] linearGradientArr = this.gradient;
                linearGradientArr[0] = linearGradientArr[1];
                this.leftColor = i;
                this.rightColor = i2;
                linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.swapGradient.force(0.0f);
                invalidateSelf();
            }

            @Override
            public void draw(Canvas canvas) {
                AndroidUtilities.rectTmp.set(getBounds());
                float fDp = AndroidUtilities.dp(24.0f);
                float f = this.swapGradient.set(1.0f);
                int i = 0;
                while (true) {
                    LinearGradient[] linearGradientArr = this.gradient;
                    if (i < linearGradientArr.length) {
                        if (linearGradientArr[i] != null) {
                            float fPow = (float) Math.pow(1.0f - Math.abs(i - f), 0.5d);
                            if (fPow > 0.0f) {
                                this.gradientMatrix.reset();
                                Matrix matrix = this.gradientMatrix;
                                RectF rectF = AndroidUtilities.rectTmp;
                                matrix.postScale(rectF.width() / 100.0f, 1.0f);
                                this.gradient[i].setLocalMatrix(this.gradientMatrix);
                                this.backgroundPaint.setShader(this.gradient[i]);
                                this.backgroundPaint.setAlpha((int) (fPow * 255.0f));
                                canvas.drawRoundRect(rectF, fDp, fDp, this.backgroundPaint);
                            }
                        }
                        i++;
                    } else {
                        this.clipPath.rewind();
                        Path path = this.clipPath;
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        path.addRoundRect(rectF2, fDp, fDp, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.clipPath);
                        this.particles.setBounds(rectF2);
                        this.particles.setSpeed(30.0f);
                        this.particles.process();
                        this.particles.draw(canvas, Theme.multAlpha(-1, 0.6f));
                        invalidateSelf();
                        canvas.restore();
                        AndroidUtilities.drawStroke(canvas, rectF2, fDp);
                        return;
                    }
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public static final class RoundRectStrokeDrawable extends Drawable {
        private final Paint paint;
        private float radius;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public RoundRectStrokeDrawable(float f, int i) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.radius = f;
            paint.setColor(i);
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            float f = this.radius;
            canvas.drawRoundRect(rectF, f, f, this.paint);
            AndroidUtilities.drawStroke(canvas, rectF, this.radius);
        }
    }
}
