package org.telegram.ui.Gifts;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda78;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.web.BotWebViewContainer;

public class SendGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final TLRPC.MessageAction action;
    public final ChatActionCell actionCell;
    public UniversalAdapter adapter;
    public boolean anonymous;
    public GiftAuctionController.Auction auction;
    public final ButtonWithCounterView button;
    public final ColoredImageSpan[] cachedStarSpan;
    public final LinearLayout chatLinearLayout;
    public final AnonymousClass2 chatView;
    public final Runnable closeParentSheet;
    public final int currentAccount;
    public final long dialogId;
    public final boolean forceNotUpgrade;
    public final boolean forceUpgrade;
    public boolean isDismissed;
    public final FrameLayout limitContainerWrapper;
    public final AnonymousClass3 messageEdit;
    public final MessageObject messageObject;
    public final String name;
    public final GiftPremiumBottomSheet$GiftTier premiumTier;
    public final boolean self;
    public final long send_paid_messages_stars;
    public int shakeDp;
    public final TL_stars.StarGift starGift;
    public boolean upgrade;
    public boolean useStars;

    public final class AnonymousClass1 implements ChatActionCell.ChatActionCellDelegate {
        @Override
        public final boolean canDrawOutboundsContent() {
            return true;
        }

        @Override
        public final void didClickButton(ChatActionCell chatActionCell) {
        }

        @Override
        public final void didClickImage(ChatActionCell chatActionCell) {
        }

        @Override
        public final boolean didLongPress(ChatActionCell chatActionCell, float f, float f2) {
            return false;
        }

        @Override
        public final void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        }

        @Override
        public final void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str) {
        }

        @Override
        public final void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        @Override
        public final void didPressReplyMessage(ChatActionCell chatActionCell, int i) {
        }

        @Override
        public final void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2) {
        }

        @Override
        public final void forceUpdate(ChatActionCell chatActionCell) {
        }

        @Override
        public final BaseFragment getBaseFragment() {
            return null;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final long getTopicId() {
            return 0L;
        }

        @Override
        public final void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        }

        @Override
        public final void needOpenUserProfile(long j) {
        }

        @Override
        public final void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        }

        @Override
        public final void onTopicClick(ChatActionCell chatActionCell) {
        }
    }

    public final class AnonymousClass4 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.3f;
        }
    }

    public final class AnonymousClass8 extends BaseFragment {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass8(Object obj, int i) {
            super(null);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public View createView(Context context) {
            switch (this.$r8$classId) {
                case 4:
                    this.hasOwnBackground = true;
                    this.actionBar.setAddToContainer(false);
                    View view = new View(context);
                    view.setBackgroundColor(0);
                    return view;
                default:
                    return super.createView(context);
            }
        }

        @Override
        public Context getContext() {
            switch (this.$r8$classId) {
                case 1:
                    return EditTextEmoji.this.getContext();
                case 7:
                    return ((StarGiftSheet) this.this$0).getContext();
                case 9:
                    return ((SelfStoryViewsPage.AnonymousClass4) this.this$0).this$0.getContext();
                case 11:
                    return ((PaintView) this.this$0).getContext();
                default:
                    return super.getContext();
            }
        }

        @Override
        public int getCurrentAccount() {
            switch (this.$r8$classId) {
                case 1:
                    return this.currentAccount;
                case 2:
                    return this.currentAccount;
                case 3:
                    return EmojiView.this.currentAccount;
                case 4:
                case 6:
                case 8:
                case 10:
                default:
                    return super.getCurrentAccount();
                case 5:
                    return this.currentAccount;
                case 7:
                    return this.currentAccount;
                case 9:
                    return this.currentAccount;
                case 11:
                    return this.currentAccount;
            }
        }

        @Override
        public View getFragmentView() {
            switch (this.$r8$classId) {
                case 2:
                    return ((BottomSheet) ((EmojiPacksAlert.EmojiPackHeader) this.this$0).this$0).containerView;
                case 3:
                    return EmojiView.this.bulletinContainer;
                case 4:
                default:
                    return super.getFragmentView();
                case 5:
                    return ((BottomSheet) ((PremiumPreviewBottomSheet) this.this$0)).containerView;
            }
        }

        @Override
        public FrameLayout getLayoutContainer() {
            switch (this.$r8$classId) {
                case 2:
                    return (FrameLayout) ((BottomSheet) ((EmojiPacksAlert.EmojiPackHeader) this.this$0).this$0).containerView;
                case 3:
                    return EmojiView.this.bulletinContainer;
                case 4:
                default:
                    return super.getLayoutContainer();
                case 5:
                    return ((PremiumPreviewBottomSheet) this.this$0).bulletinContainer;
            }
        }

        @Override
        public Activity getParentActivity() {
            switch (this.$r8$classId) {
                case 0:
                    SendGiftSheet sendGiftSheet = (SendGiftSheet) this.this$0;
                    Activity ownerActivity = sendGiftSheet.getOwnerActivity();
                    if (ownerActivity == null) {
                        ownerActivity = LaunchActivity.instance;
                    }
                    return ownerActivity == null ? AndroidUtilities.findActivity(sendGiftSheet.getContext()) : ownerActivity;
                case 1:
                    for (Context context = EditTextEmoji.this.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                        if (context instanceof Activity) {
                            return (Activity) context;
                        }
                    }
                    return null;
                case 2:
                case 3:
                case 4:
                case 9:
                default:
                    return super.getParentActivity();
                case 5:
                    BaseFragment baseFragment = ((PremiumPreviewBottomSheet) this.this$0).fragment;
                    if (baseFragment == null) {
                        return null;
                    }
                    return baseFragment.getParentActivity();
                case 6:
                    return ((BaseFragment) this.this$0).getParentActivity();
                case 7:
                    for (Context context2 = ((StarGiftSheet) this.this$0).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                        if (context2 instanceof Activity) {
                            return (Activity) context2;
                        }
                    }
                    return null;
                case 8:
                    PeerStoriesView peerStoriesView = (PeerStoriesView) this.this$0;
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    Activity activityFindActivity = AndroidUtilities.findActivity(peerStoriesView.getContext());
                    return activityFindActivity == null ? LaunchActivity.instance : activityFindActivity;
                case 10:
                    return LaunchActivity.instance;
                case 11:
                    return AndroidUtilities.findActivity(((PaintView) this.this$0).getContext());
                case 12:
                    return ((BotWebViewContainer) this.this$0).parentActivity;
            }
        }

        @Override
        public Theme.ResourcesProvider getResourceProvider() {
            switch (this.$r8$classId) {
                case 0:
                    return ((BottomSheet) ((SendGiftSheet) this.this$0)).resourcesProvider;
                case 1:
                case 4:
                case 5:
                case 7:
                default:
                    return super.getResourceProvider();
                case 2:
                    return ((BottomSheet) ((EmojiPacksAlert.EmojiPackHeader) this.this$0).this$0).resourcesProvider;
                case 3:
                    return EmojiView.this.resourcesProvider;
                case 6:
                    return new PhotoViewer.AnonymousClass14(new DarkThemeResourceProvider());
                case 8:
                    return new PeerStoriesView.AnonymousClass18(1, ((PeerStoriesView) this.this$0).resourcesProvider);
                case 9:
                    return ((SelfStoryViewsPage.AnonymousClass4) this.this$0).this$0.resourcesProvider;
                case 10:
                    return new PeerStoriesView.AnonymousClass18(5, ((BottomSheet) ((PaintView.AnonymousClass22) this.this$0)).resourcesProvider);
                case 11:
                    return ((PaintView) this.this$0).resourcesProvider;
                case 12:
                    return new PeerStoriesView.AnonymousClass18(9, ((BotWebViewContainer) this.this$0).resourcesProvider);
            }
        }

        @Override
        public Dialog getVisibleDialog() {
            switch (this.$r8$classId) {
                case 1:
                    final Context context = EditTextEmoji.this.getContext();
                    return new Dialog(context) {
                        @Override
                        public final void dismiss() {
                            EditTextEmoji.AnonymousClass7 anonymousClass7 = (EditTextEmoji.AnonymousClass7) this.this$2.this$0;
                            EditTextEmoji.this.hidePopup(false);
                            EditTextEmoji.this.closeParent();
                        }
                    };
                default:
                    return super.getVisibleDialog();
            }
        }

        @Override
        public boolean isLightStatusBar() {
            switch (this.$r8$classId) {
                case 6:
                    return false;
                case 7:
                case 9:
                case 11:
                default:
                    return super.isLightStatusBar();
                case 8:
                    return false;
                case 10:
                    return false;
                case 12:
                    return false;
            }
        }

        @Override
        public void onTransitionAnimationEnd(boolean z, boolean z2) {
            switch (this.$r8$classId) {
                case 4:
                    if (z && z2) {
                        ((OverlayActionBarLayoutDialog) this.this$0).dismiss();
                        break;
                    }
                    break;
                default:
                    super.onTransitionAnimationEnd(z, z2);
                    break;
            }
        }

        @Override
        public boolean presentFragment(BaseFragment baseFragment) {
            switch (this.$r8$classId) {
                case 6:
                    return false;
                case 8:
                    StoryViewer storyViewer = ((PeerStoriesView) this.this$0).storyViewer;
                    if (storyViewer == null) {
                        return true;
                    }
                    storyViewer.presentFragment(baseFragment);
                    return true;
                case 11:
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment == null) {
                        return false;
                    }
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(baseFragment, bottomSheetParams);
                    return true;
                default:
                    return super.presentFragment(baseFragment);
            }
        }

        @Override
        public Dialog showDialog(Dialog dialog) {
            switch (this.$r8$classId) {
                case 5:
                    dialog.show();
                    return dialog;
                case 6:
                case 9:
                case 11:
                default:
                    return super.showDialog(dialog);
                case 7:
                    dialog.show();
                    return dialog;
                case 8:
                    StoryViewer storyViewer = ((PeerStoriesView) this.this$0).storyViewer;
                    if (storyViewer != null) {
                        storyViewer.showDialog(dialog);
                    } else if (dialog != null) {
                        dialog.show();
                    }
                    return dialog;
                case 10:
                    dialog.show();
                    return dialog;
                case 12:
                    dialog.show();
                    return dialog;
            }
        }

        public AnonymousClass8(BaseFragment baseFragment) {
            super(null);
            this.$r8$classId = 6;
            this.this$0 = baseFragment;
        }

        public AnonymousClass8(PaintView.AnonymousClass22 anonymousClass22) {
            super(null);
            this.$r8$classId = 10;
            this.this$0 = anonymousClass22;
            this.currentAccount = ((BottomSheet) anonymousClass22).currentAccount;
        }

        public AnonymousClass8(BotWebViewContainer botWebViewContainer) {
            super(null);
            this.$r8$classId = 12;
            this.this$0 = botWebViewContainer;
            this.currentAccount = botWebViewContainer.currentAccount;
        }
    }

    public SendGiftSheet(Context context, final int i, final TL_stars.StarGift starGift, final GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, long j, Runnable runnable, final boolean z, final boolean z2) {
        float f;
        Integer numValueOf;
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource;
        super(context, null, true, false, false, false, false, 2, null);
        this.upgrade = false;
        this.useStars = false;
        this.shakeDp = -2;
        new AnimationNotificationsLocker();
        this.cachedStarSpan = new ColoredImageSpan[1];
        this.isDismissed = false;
        boolean z3 = j == UserConfig.getInstance(i).getClientUserId();
        this.self = z3;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        if (z3) {
            this.anonymous = true;
        }
        this.currentAccount = i;
        this.dialogId = j;
        this.starGift = starGift;
        if (starGift == null || !starGift.auction) {
            f = 4.0f;
        } else {
            f = 4.0f;
            this.auction = GiftAuctionController.getInstance(i).subscribeToGiftAuction(starGift.id, this);
        }
        this.premiumTier = giftPremiumBottomSheet$GiftTier;
        this.closeParentSheet = runnable;
        this.forceUpgrade = z;
        this.forceNotUpgrade = z2;
        if (z) {
            this.upgrade = true;
        } else if (z2) {
            this.upgrade = false;
        }
        this.topPadding = 0.2f;
        if (j >= 0) {
            this.name = UserObject.getForcedFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            this.name = chat == null ? "" : chat.title;
        }
        ChatActionCell chatActionCell = new ChatActionCell(context, this.resourcesProvider, false);
        this.actionCell = chatActionCell;
        chatActionCell.setDelegate(new AnonymousClass1());
        ?? r3 = new SizeNotifierFrameLayout(context) {
            public int maxHeight = -1;

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j2) {
                if (view == this.backgroundView) {
                    return true;
                }
                return super.drawChild(canvas, view, j2);
            }

            @Override
            public final boolean isActionBarVisible() {
                return false;
            }

            @Override
            public final boolean isStatusBarVisible$1() {
                return false;
            }

            @Override
            public final void onBackgroundViewInvalidate() {
                SendGiftSheet.this.recyclerListView.invalidate();
            }

            @Override
            public final void onLayout(boolean z4, int i2, int i3, int i4, int i5) {
                super.onLayout(z4, i2, i3, i4, i5);
                SendGiftSheet sendGiftSheet = SendGiftSheet.this;
                LinearLayout linearLayout = sendGiftSheet.chatLinearLayout;
                linearLayout.setTranslationY(((i5 - i3) - linearLayout.getMeasuredHeight()) / 2.0f);
                sendGiftSheet.actionCell.setVisiblePart(sendGiftSheet.actionCell.getY() + sendGiftSheet.chatLinearLayout.getY(), getBackgroundSizeY());
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                if (this.maxHeight != -1) {
                    super.onMeasure(i2, i3);
                    int measuredHeight = getMeasuredHeight();
                    int i4 = this.maxHeight;
                    if (measuredHeight < i4) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.max(i4, getMeasuredHeight()), Integer.MIN_VALUE);
                    }
                }
                super.onMeasure(i2, i3);
                int i5 = this.maxHeight;
                if (i5 == -1) {
                    this.maxHeight = Math.max(i5, getMeasuredHeight());
                }
            }
        };
        this.chatView = r3;
        Drawable backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.currentTheme.isDark());
        r3.setBackgroundImage(backgroundDrawable);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        if (backgroundDrawable instanceof ColorDrawable) {
            numValueOf = Integer.valueOf(((ColorDrawable) backgroundDrawable).getColor());
        } else if (backgroundDrawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) backgroundDrawable;
            if (motionBackgroundDrawable.intensity < 0) {
                numValueOf = -16777216;
            } else {
                int[] iArr = motionBackgroundDrawable.colors;
                if (iArr == null || iArr.length <= 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(iArr[0]);
                }
            }
        } else {
            numValueOf = null;
        }
        blurredBackgroundSourceColor.paint.setColor(numValueOf != null ? numValueOf.intValue() : getThemedColor(Theme.key_dialogBackground));
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource2 = new BlurredBackgroundDrawableSource(blurredBackgroundSourceColor);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i2 = Theme.key_dialogBackground;
        blurredBackgroundDrawableSource2.setColorProvider(new BlurredBackgroundColorProviderThemed(i2, resourcesProvider));
        blurredBackgroundDrawableSource2.setRadius(AndroidUtilities.dp(20.0f));
        blurredBackgroundDrawableSource2.setPadding(AndroidUtilities.dp(f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.chatLinearLayout = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            blurredBackgroundDrawableSource = blurredBackgroundDrawableSource2;
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.action = tL_messageActionStarGift;
            i2 = i2;
        } else {
            blurredBackgroundDrawableSource = blurredBackgroundDrawableSource2;
            if (giftPremiumBottomSheet$GiftTier == null || giftPremiumBottomSheet$GiftTier.giftCodeOption == null) {
                i2 = i2;
                if (giftPremiumBottomSheet$GiftTier == null || giftPremiumBottomSheet$GiftTier.giftOption == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = giftPremiumBottomSheet$GiftTier.getMonths();
                tL_messageActionGiftPremium.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
                long price = giftPremiumBottomSheet$GiftTier.getPrice();
                tL_messageActionGiftPremium.amount = price;
                if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * price);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.action = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = giftPremiumBottomSheet$GiftTier.getMonths();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
                long price2 = giftPremiumBottomSheet$GiftTier.getPrice();
                tL_messageActionGiftCode.amount = price2;
                if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * price2);
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.action = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z4 = this.upgrade;
            tL_messageActionStarGift2.can_upgrade = z4 || (z3 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (z3 == 0 && z4) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z4 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j;
        tL_messageService.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i).getPeer(j);
        tL_messageService.action = this.action;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i).getSendPaidMessagesStars(j) : 0L;
        this.send_paid_messages_stars = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i, tL_messageService, false, false);
        this.messageObject = messageObject;
        chatActionCell.setMessageObject(messageObject, true);
        linearLayout.addView(chatActionCell, LayoutHelper.createLinear(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        r3.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
        final BlurredBackgroundDrawableSource blurredBackgroundDrawableSource3 = blurredBackgroundDrawableSource;
        ?? r0 = new EditEmojiTextCell(context, (SizeNotifierFrameLayout) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i).stargiftsMessageLengthMax, this.resourcesProvider) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                int iDp = AndroidUtilities.dp(10.0f);
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
                int measuredHeight = getMeasuredHeight();
                BlurredBackgroundDrawableSource blurredBackgroundDrawableSource4 = blurredBackgroundDrawableSource3;
                blurredBackgroundDrawableSource4.setBounds(iDp, 0, measuredWidth, measuredHeight);
                blurredBackgroundDrawableSource4.drawSource(canvas, blurredBackgroundDrawableSource4.source);
                super.dispatchDraw(canvas);
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
                super.onMeasure(i3, i4);
            }

            @Override
            public final void onTextChanged() {
                TLRPC.TL_textWithEntities tL_textWithEntities;
                SendGiftSheet sendGiftSheet = SendGiftSheet.this;
                TLRPC.MessageAction messageAction2 = sendGiftSheet.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    ((TLRPC.TL_messageActionStarGift) messageAction2).message = tL_textWithEntities;
                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                    tL_messageActionGiftCode2.flags |= 16;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionGiftCode2.message = tL_textWithEntities;
                } else {
                    if (!(messageAction2 instanceof TLRPC.TL_messageActionGiftPremium)) {
                        return;
                    }
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                    tL_messageActionGiftPremium2.flags |= 16;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionGiftPremium2.message = tL_textWithEntities;
                }
                CharSequence[] charSequenceArr = {sendGiftSheet.messageEdit.getText()};
                tL_textWithEntities.entities = MediaDataController.getInstance(i).getEntities(charSequenceArr, true);
                tL_textWithEntities.text = charSequenceArr[0].toString();
                sendGiftSheet.messageObject.setType();
                sendGiftSheet.actionCell.setMessageObject(sendGiftSheet.messageObject, true);
                sendGiftSheet.adapter.update(true);
                sendGiftSheet.setButtonText(true);
            }
        };
        this.messageEdit = r0;
        EditEmojiTextCell.AnonymousClass2 anonymousClass2 = r0.editTextEmoji;
        anonymousClass2.getEditText().addTextChangedListener(new EditTextCell.AnonymousClass3());
        anonymousClass2.allowEmojisForNonPremium = true;
        r0.setShowLimitWhenNear(50);
        this.editTextEmoji = anonymousClass2;
        r0.setShowLimitOnFocus(true);
        r0.setDivider(false);
        ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda3 = new ArticleViewer$$ExternalSyntheticLambda3(r0, 27);
        anonymousClass2.getEditText().setImeOptions(6);
        anonymousClass2.getEditText().setOnEditorActionListener(new EditTextCell.AnonymousClass1(articleViewer$$ExternalSyntheticLambda3, 2));
        int i3 = this.backgroundPaddingLeft;
        r0.setPadding(i3, 0, i3, 0);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.delayAnimations = false;
        anonymousClass4.mSupportsChangeAnimations = false;
        anonymousClass4.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        anonymousClass4.mAddInterpolator = cubicBezierInterpolator;
        anonymousClass4.mMoveInterpolator = cubicBezierInterpolator;
        anonymousClass4.mRemoveInterpolator = cubicBezierInterpolator;
        anonymousClass4.mChangeInterpolator = cubicBezierInterpolator;
        anonymousClass4.delayIncrement = 40L;
        this.recyclerListView.setItemAnimator(anonymousClass4);
        this.adapter.update(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int i4 = i2;
        linearLayout2.setBackgroundColor(Theme.getColor(i4, this.resourcesProvider));
        int i5 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i5, 0, i5, 0);
        this.containerView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        final float fClamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider)));
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, LayoutHelper.createLinear(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.limitContainerWrapper = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.limitContainerWrapper = frameLayout2;
            frameLayout2.addView(frameLayout, LayoutHelper.createLinear(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(Theme.getColor(i4, this.resourcesProvider));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(21);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View view2 = new View(context) {
            @Override
            public final void onMeasure(int i7, int i8) {
                if (starGift == null) {
                    super.onMeasure(i7, i8);
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * fClamp), 1073741824), i8);
                }
            }
        };
        view2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        frameLayout.addView(view2, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth() * fClamp, getHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        frameLayout3.setWillNotDraw(false);
        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(19);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(21);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(-1);
        if (starGift != null) {
            textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout3.addView(textView4, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider, true);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        setButtonText(false);
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 119, 10, 10, 10, 10));
        buttonWithCounterView.setOnClickListener(new SendGiftSheet$$ExternalSyntheticLambda1(this, j, context, runnable, starGift, 0));
        PhotoViewer.AnonymousClass36 anonymousClass36 = this.layoutManager;
        this.reverseLayout = true;
        anonymousClass36.setReverseLayout(true);
        this.adapter.update(false);
        PhotoViewer.AnonymousClass36 anonymousClass37 = this.layoutManager;
        anonymousClass37.scrollToPositionWithOffset(this.adapter.items.size(), AndroidUtilities.dp(200.0f), anonymousClass37.mShouldReverseLayout);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i7 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i7, 0, i7, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.limitContainerWrapper == null) ? 40 : 0)));
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            public final PointF p = new PointF();

            @Override
            public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
                float f2;
                float fMax;
                QrActivity.AnonymousClass2 anonymousClass3;
                float height = recyclerView.getHeight();
                SendGiftSheet sendGiftSheet = SendGiftSheet.this;
                PointF pointF = this.p;
                AnonymousClass2 anonymousClass5 = sendGiftSheet.chatView;
                RecyclerListView recyclerListView2 = sendGiftSheet.recyclerListView;
                if (ViewPositionWatcher.computeCoordinatesInParent(anonymousClass5, recyclerListView2, pointF)) {
                    f2 = pointF.x;
                    height = Math.min(height, pointF.y);
                    fMax = Math.max(0.0f, pointF.y + anonymousClass5.getMeasuredHeight());
                } else {
                    f2 = 0.0f;
                    fMax = 0.0f;
                }
                AnonymousClass3 anonymousClass6 = sendGiftSheet.messageEdit;
                if (ViewPositionWatcher.computeCoordinatesInParent(anonymousClass6, recyclerListView2, pointF)) {
                    height = Math.min(height, pointF.y);
                    fMax = Math.max(fMax, pointF.y + anonymousClass6.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
                }
                if (height >= fMax || (anonymousClass3 = anonymousClass5.backgroundView) == null) {
                    return;
                }
                float height2 = (fMax - height) / anonymousClass3.getHeight();
                canvas.save();
                canvas.clipRect(0.0f, height, recyclerView.getWidth(), fMax);
                canvas.translate(f2, height);
                canvas.scale(height2, height2);
                anonymousClass5.backgroundView.draw(canvas);
                canvas.restore();
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(int i8, View view3) {
                TL_stars.StarGift starGift2;
                SendGiftSheet sendGiftSheet = this.f$0;
                UniversalAdapter universalAdapter = sendGiftSheet.adapter;
                if (!sendGiftSheet.reverseLayout) {
                    i8--;
                }
                UItem item = universalAdapter.getItem(i8);
                if (item == null) {
                    return;
                }
                int i9 = item.id;
                ChatActionCell chatActionCell2 = sendGiftSheet.actionCell;
                MessageObject messageObject2 = sendGiftSheet.messageObject;
                TLRPC.MessageAction messageAction2 = sendGiftSheet.action;
                if (i9 == 1) {
                    boolean z5 = !sendGiftSheet.anonymous;
                    sendGiftSheet.anonymous = z5;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z5;
                    }
                    messageObject2.updateMessageText();
                    chatActionCell2.setMessageObject(messageObject2, true);
                    sendGiftSheet.adapter.update(true);
                    return;
                }
                long j2 = 0;
                if (i9 == 2) {
                    if (z || z2) {
                        int i10 = -sendGiftSheet.shakeDp;
                        sendGiftSheet.shakeDp = i10;
                        AndroidUtilities.shakeViewSpring(view3, i10);
                        return;
                    }
                    boolean z6 = sendGiftSheet.upgrade;
                    sendGiftSheet.upgrade = !z6;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        boolean z7 = sendGiftSheet.self;
                        tL_messageActionStarGift3.can_upgrade = !z6 || (z7 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        TL_stars.StarGift starGift3 = sendGiftSheet.starGift;
                        tL_messageActionStarGift3.upgrade_stars = (z7 || z6) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z6 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    chatActionCell2.setMessageObject(messageObject2, true);
                    sendGiftSheet.adapter.update(true);
                    sendGiftSheet.setButtonText(true);
                    return;
                }
                if (i9 == 3) {
                    boolean z8 = sendGiftSheet.useStars;
                    sendGiftSheet.useStars = !z8;
                    boolean z9 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier2 = giftPremiumBottomSheet$GiftTier;
                    if (z9) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z8) {
                            tL_messageActionGiftPremium2.currency = giftPremiumBottomSheet$GiftTier2.getCurrency();
                            long price3 = giftPremiumBottomSheet$GiftTier2.getPrice();
                            tL_messageActionGiftPremium2.amount = price3;
                            if (giftPremiumBottomSheet$GiftTier2.googlePlayProductDetails != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * price3);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = giftPremiumBottomSheet$GiftTier2.starsOption;
                            if (tL_premiumGiftOption != null) {
                                j2 = tL_premiumGiftOption.amount;
                            } else {
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = giftPremiumBottomSheet$GiftTier2.starsCodeOption;
                                if (tL_premiumGiftCodeOption != null) {
                                    j2 = tL_premiumGiftCodeOption.amount;
                                }
                            }
                            tL_messageActionGiftPremium2.amount = j2;
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z8) {
                            tL_messageActionGiftCode2.currency = giftPremiumBottomSheet$GiftTier2.getCurrency();
                            long price4 = giftPremiumBottomSheet$GiftTier2.getPrice();
                            tL_messageActionGiftCode2.amount = price4;
                            if (giftPremiumBottomSheet$GiftTier2.googlePlayProductDetails != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * price4);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption2 = giftPremiumBottomSheet$GiftTier2.starsOption;
                            if (tL_premiumGiftOption2 != null) {
                                j2 = tL_premiumGiftOption2.amount;
                            } else {
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = giftPremiumBottomSheet$GiftTier2.starsCodeOption;
                                if (tL_premiumGiftCodeOption2 != null) {
                                    j2 = tL_premiumGiftCodeOption2.amount;
                                }
                            }
                            tL_messageActionGiftCode2.amount = j2;
                        }
                    }
                    messageObject2.updateMessageText();
                    chatActionCell2.setMessageObject(messageObject2, true);
                    sendGiftSheet.adapter.update(true);
                    sendGiftSheet.setButtonText(true);
                }
            }
        });
        this.actionBar.setTitle(getTitle());
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new SendGiftSheet$$ExternalSyntheticLambda0(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starBalanceUpdated) {
            setButtonText(true);
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || this.premiumTier == null) {
                return;
            }
            universalAdapter.update(true);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        AnonymousClass3 anonymousClass3 = this.messageEdit;
        if (anonymousClass3.editTextEmoji.getEmojiPadding() > 0) {
            anonymousClass3.editTextEmoji.hidePopup(true);
            return;
        }
        EditEmojiTextCell.AnonymousClass2 anonymousClass2 = anonymousClass3.editTextEmoji;
        if (anonymousClass2.keyboardVisible) {
            AndroidUtilities.hideKeyboard(anonymousClass2.editText);
            return;
        }
        anonymousClass2.onPause();
        if (this.auction != null) {
            GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.auction.giftId, this);
        }
        this.isDismissed = true;
        super.lambda$showGiftOfferSheet$15();
    }

    public final TLRPC.TL_textWithEntities getMessage() {
        if (MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    public BulletinFactory getParentBulletinFactory() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return null;
        }
        return BulletinFactory.of(safeLastFragment);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(this.self ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }

    public final void lambda$buyPremiumTier$4(TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda78(3, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            zzks.m(R.string.UnknownErrorCode, new Object[]{str}, new BulletinFactory(this.topBulletinContainer, this.resourcesProvider), R.raw.error);
        }
        this.button.setLoading(false);
    }

    public final void lambda$buyPremiumTier$9(TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda78(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            zzks.m(R.string.UnknownErrorCode, new Object[]{str}, new BulletinFactory(this.topBulletinContainer, this.resourcesProvider), R.raw.error);
        }
        this.button.setLoading(false);
    }

    public final void lambda$fillItems$15$1() {
        new StarGiftSheet(this.currentAccount, getContext(), this.resourcesProvider, this.dialogId, null).openAsLearnMore(this.starGift.id, this.name);
    }

    public final void lambda$fillItems$16$1() {
        AuctionJoinSheet.showMoreInfo(getContext(), this.resourcesProvider, this.starGift);
    }

    public final void lambda$fillItems$17() {
        new StarsIntroActivity.StarsOptionsSheet(getContext(), this.resourcesProvider).show();
    }

    public final void lambda$new$0(long j, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        final int i = 1;
        final int i2 = 0;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (buttonWithCounterView.loading) {
            return;
        }
        GiftAuctionController.Auction auction = this.auction;
        AnonymousClass3 anonymousClass3 = this.messageEdit;
        if (auction != null) {
            AuctionBidSheet auctionBidSheet = new AuctionBidSheet(context, this.resourcesProvider, new AuctionBidSheet.Params(j, this.anonymous, getMessage()), this.auction);
            auctionBidSheet.show();
            auctionBidSheet.closeParentSheet = runnable;
            AndroidUtilities.hideKeyboard(anonymousClass3);
            lambda$showGiftOfferSheet$15();
            if (this.isDismissed) {
                return;
            }
            AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda3(this, 0), 500L);
            return;
        }
        buttonWithCounterView.setLoading(true);
        int emojiPadding = anonymousClass3.editTextEmoji.getEmojiPadding();
        EditEmojiTextCell.AnonymousClass2 anonymousClass2 = anonymousClass3.editTextEmoji;
        if (emojiPadding > 0) {
            anonymousClass2.hidePopup(true);
        } else if (anonymousClass2.keyboardVisible) {
            AndroidUtilities.hideKeyboard(anonymousClass2.editText);
        }
        int i3 = this.currentAccount;
        if (starGift != null) {
            StarsController.getInstance(i3, false).buyStarGift(new SendGiftSheet$$ExternalSyntheticLambda0(this, i), this.starGift, this.anonymous, this.upgrade, this.dialogId, getMessage());
            return;
        }
        final TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(this.dialogId));
        if (user == null) {
            buttonWithCounterView.setLoading(false);
            return;
        }
        boolean z = this.useStars;
        GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
        if (z) {
            tLObject = giftPremiumBottomSheet$GiftTier.starsOption;
            TLObject tLObject2 = giftPremiumBottomSheet$GiftTier.starsCodeOption;
            if (tLObject == null && tLObject2 == null) {
                tLObject = giftPremiumBottomSheet$GiftTier.giftCodeOption;
                if (tLObject == null && (tLObject = giftPremiumBottomSheet$GiftTier.giftOption) == null) {
                    buttonWithCounterView.setLoading(false);
                    return;
                }
            } else if (tLObject == null) {
                tLObject = tLObject2 != null ? tLObject2 : null;
            }
        } else {
            tLObject = giftPremiumBottomSheet$GiftTier.giftCodeOption;
            if (tLObject == null) {
                buttonWithCounterView.setLoading(false);
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
            if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                StarsController.getInstance(i3, false).buyPremiumGift(new Utilities.Callback2(this) {
                    public final SendGiftSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        Boolean bool = (Boolean) obj;
                        String str = (String) obj2;
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$buyPremiumTier$4(user, bool, str);
                                break;
                            default:
                                this.f$0.lambda$buyPremiumTier$9(user, bool, str);
                                break;
                        }
                    }
                }, this.dialogId, tL_premiumGiftCodeOption, getMessage());
                return;
            }
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this, i2);
            ArrayList arrayList = new ArrayList(Arrays.asList(user));
            TLRPC.TL_textWithEntities message = getMessage();
            OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13 = new OAuthSheet$$ExternalSyntheticLambda13(12, this, user);
            PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(this, 15);
            int i4 = UserConfig.selectedAccount;
            HashMap map = BoostRepository.cachedGiftOptions;
            if (map != null) {
                map.remove(Integer.valueOf(i4));
            }
            if (BoostRepository.isGoogleBillingAvailable()) {
                BoostRepository.payGiftCodeByGoogle(arrayList, tL_premiumGiftCodeOption, null, message, anonymousClass8, oAuthSheet$$ExternalSyntheticLambda13, pollItemMenu$$ExternalSyntheticLambda14);
                return;
            } else {
                BoostRepository.payGiftCodeByInvoice(arrayList, tL_premiumGiftCodeOption, null, message, anonymousClass8, oAuthSheet$$ExternalSyntheticLambda13, pollItemMenu$$ExternalSyntheticLambda14);
                return;
            }
        }
        if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
            if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                StarsController.getInstance(i3, false).buyPremiumGift(new Utilities.Callback2(this) {
                    public final SendGiftSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        Boolean bool = (Boolean) obj;
                        String str = (String) obj2;
                        switch (i) {
                            case 0:
                                this.f$0.lambda$buyPremiumTier$4(user, bool, str);
                                break;
                            default:
                                this.f$0.lambda$buyPremiumTier$9(user, bool, str);
                                break;
                        }
                    }
                }, this.dialogId, tL_premiumGiftOption, getMessage());
                return;
            }
            if (BuildVars.useInvoiceBilling()) {
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    Uri uri = Uri.parse(tL_premiumGiftOption.bot_url);
                    if (uri.getHost().equals("t.me")) {
                        if (uri.getPath().startsWith("/$") || uri.getPath().startsWith("/invoice/")) {
                            launchActivity.navigateToPremiumGiftCallback = new SendGiftSheet$$ExternalSyntheticLambda3(this, 1);
                        } else {
                            launchActivity.navigateToPremiumBot = true;
                        }
                    }
                    Browser.openUrl(launchActivity, giftPremiumBottomSheet$GiftTier.giftOption.bot_url);
                    lambda$showGiftOfferSheet$15();
                    return;
                }
                return;
            }
            if (!BillingController.getInstance().isReady() || giftPremiumBottomSheet$GiftTier.googlePlayProductDetails == null) {
                return;
            }
            TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
            tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(i3).getInputUser(user);
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = giftPremiumBottomSheet$GiftTier.googlePlayProductDetails.getOneTimePurchaseOfferDetails();
            tL_inputStorePaymentGiftPremium.currency = oneTimePurchaseOfferDetails.zzc;
            tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
            BillingController.getInstance().addResultListener(giftPremiumBottomSheet$GiftTier.giftOption.store_product, new ChatActivity$$ExternalSyntheticLambda211(this, 7));
            TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
            ConnectionsManager.getInstance(i3).sendRequest(tL_payments_canPurchaseStore, new BoostsActivity$$ExternalSyntheticLambda7(this, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 29));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void lambda$openCrafting$8() {
        AnonymousClass3 anonymousClass3 = this.messageEdit;
        if (anonymousClass3.editTextEmoji.getEmojiPadding() > 0) {
            anonymousClass3.editTextEmoji.hidePopup(true);
            return;
        }
        EditEmojiTextCell.AnonymousClass2 anonymousClass2 = anonymousClass3.editTextEmoji;
        if (anonymousClass2.keyboardVisible) {
            AndroidUtilities.hideKeyboard(anonymousClass2.editText);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    public final void onGiftSuccess(boolean z) {
        int i = 0;
        int i2 = this.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i2);
        long j = this.dialogId;
        TLRPC.UserFull userFull = messagesController.getUserFull(j);
        TLObject userOrChat = MessagesController.getInstance(i2).getUserOrChat(j);
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i2).putUser(user, true);
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            ArrayList arrayList = new ArrayList(((ActionBarLayout) ((LaunchActivity) baseFragment.getParentActivity()).getActionBarLayout()).getFragmentStack());
            INavigationLayout parentLayout = baseFragment.getParentLayout();
            int size = arrayList.size();
            ChatActivity chatActivity = null;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BaseFragment baseFragment2 = (BaseFragment) obj;
                if (baseFragment2 instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment2;
                    if (chatActivity.getDialogId() != j) {
                        baseFragment2.removeSelfFromStack();
                    }
                } else if (baseFragment2 instanceof ProfileActivity) {
                    if (z && ((ActionBarLayout) parentLayout).getLastFragment() == baseFragment2) {
                        baseFragment2.finishFragment();
                    } else {
                        baseFragment2.removeSelfFromStack();
                    }
                }
            }
            if (chatActivity == null || chatActivity.getDialogId() != j) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j);
                ChatActivity chatActivity2 = new ChatActivity(bundle);
                parentLayout.getClass();
                INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(chatActivity2);
                navigationParams.removeLast = true;
                ((ActionBarLayout) parentLayout).presentFragment(navigationParams);
            }
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.recyclerListView.invalidateItemDecorations();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
    }

    public final void setButtonText(boolean z) {
        long j;
        GiftAuctionController.Auction auction = this.auction;
        ButtonWithCounterView buttonWithCounterView = this.button;
        int i = this.currentAccount;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            if (this.auction.isUpcoming(currentTime)) {
                int i2 = this.auction.gift.auction_start_date - currentTime;
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z, true);
                buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auction.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z, true);
                buttonWithCounterView.setSubText(null, z);
                return;
            } else {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z, true);
                buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i3)), z);
                return;
            }
        }
        TL_stars.StarGift starGift = this.starGift;
        ColoredImageSpan[] coloredImageSpanArr = this.cachedStarSpan;
        if (starGift != null) {
            long j2 = StarsController.getInstance(i, false).getBalance().amount;
            long j3 = starGift.stars + (this.upgrade ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(getText()) ? 0L : this.send_paid_messages_stars);
            buttonWithCounterView.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatPluralStringComma(this.self ? "Gift2SendSelf" : "Gift2Send", (int) j3), coloredImageSpanArr), z, true);
            if (!StarsController.getInstance(i, false).balanceLoaded || j3 <= j2) {
                buttonWithCounterView.setSubText(null, z);
                return;
            } else {
                buttonWithCounterView.setSubText(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j2), z);
                return;
            }
        }
        GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
        if (giftPremiumBottomSheet$GiftTier != null) {
            if (this.useStars) {
                int i4 = R.string.Gift2SendPremiumStars;
                TLRPC.TL_premiumGiftOption tL_premiumGiftOption = giftPremiumBottomSheet$GiftTier.starsOption;
                if (tL_premiumGiftOption != null) {
                    j = tL_premiumGiftOption.amount;
                } else {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = giftPremiumBottomSheet$GiftTier.starsCodeOption;
                    j = tL_premiumGiftCodeOption != null ? tL_premiumGiftCodeOption.amount : 0L;
                }
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(i4, LocaleController.formatNumber(j, ',')), 1.0f, coloredImageSpanArr), z, true);
                coloredImageSpanArr[0].spaceScaleX = 0.85f;
            } else {
                buttonWithCounterView.setText(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, giftPremiumBottomSheet$GiftTier.getFormattedPrice())), z, true);
            }
            buttonWithCounterView.setSubText(null, z);
        }
    }

    @Override
    public final void show() {
        AnonymousClass3 anonymousClass3 = this.messageEdit;
        if (anonymousClass3 != null) {
            anonymousClass3.editTextEmoji.onResume();
        }
        super.show();
    }
}
