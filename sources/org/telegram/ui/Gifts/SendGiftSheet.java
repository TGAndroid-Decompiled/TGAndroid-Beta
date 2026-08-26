package org.telegram.ui.Gifts;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
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
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.WrappedResourceProvider;
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
        public final void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
        }

        @Override
        public final void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str, boolean z) {
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
        public final void forceUpdate(ChatActionCell chatActionCell, boolean z) {
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
        public Context getContext() {
            switch (this.$r8$classId) {
                case 3:
                    return ((StarGiftSheet) this.this$0).getContext();
                case 4:
                case 6:
                default:
                    return super.getContext();
                case 5:
                    return ((SelfStoryViewsPage.AnonymousClass4) this.this$0).this$0.getContext();
                case 7:
                    return ((PaintView) this.this$0).getContext();
            }
        }

        @Override
        public int getCurrentAccount() {
            switch (this.$r8$classId) {
                case 1:
                    return this.currentAccount;
                case 2:
                case 4:
                case 6:
                default:
                    return super.getCurrentAccount();
                case 3:
                    return this.currentAccount;
                case 5:
                    return this.currentAccount;
                case 7:
                    return this.currentAccount;
            }
        }

        @Override
        public View getFragmentView() {
            switch (this.$r8$classId) {
                case 1:
                    return ((BottomSheet) ((PremiumPreviewBottomSheet) this.this$0)).containerView;
                default:
                    return super.getFragmentView();
            }
        }

        @Override
        public FrameLayout getLayoutContainer() {
            switch (this.$r8$classId) {
                case 1:
                    return ((PremiumPreviewBottomSheet) this.this$0).bulletinContainer;
                default:
                    return super.getLayoutContainer();
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
                    BaseFragment baseFragment = ((PremiumPreviewBottomSheet) this.this$0).fragment;
                    if (baseFragment == null) {
                        return null;
                    }
                    return baseFragment.getParentActivity();
                case 2:
                    return ((BaseFragment) this.this$0).getParentActivity();
                case 3:
                    for (Context context = ((StarGiftSheet) this.this$0).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                        if (context instanceof Activity) {
                            return (Activity) context;
                        }
                    }
                    return null;
                case 4:
                    PeerStoriesView peerStoriesView = (PeerStoriesView) this.this$0;
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    Activity activityFindActivity = AndroidUtilities.findActivity(peerStoriesView.getContext());
                    return activityFindActivity == null ? LaunchActivity.instance : activityFindActivity;
                case 5:
                default:
                    return super.getParentActivity();
                case 6:
                    return LaunchActivity.instance;
                case 7:
                    return AndroidUtilities.findActivity(((PaintView) this.this$0).getContext());
                case 8:
                    return ((BotWebViewContainer) this.this$0).parentActivity;
            }
        }

        @Override
        public Theme.ResourcesProvider getResourceProvider() {
            switch (this.$r8$classId) {
                case 0:
                    return ((BottomSheet) ((SendGiftSheet) this.this$0)).resourcesProvider;
                case 1:
                case 3:
                default:
                    return super.getResourceProvider();
                case 2:
                    return new WrappedResourceProvider(new DarkThemeResourceProvider());
                case 4:
                    return new PeerStoriesView.AnonymousClass18(((PeerStoriesView) this.this$0).resourcesProvider, 1);
                case 5:
                    return ((SelfStoryViewsPage.AnonymousClass4) this.this$0).this$0.resourcesProvider;
                case 6:
                    return new PeerStoriesView.AnonymousClass18(((BottomSheet) ((PaintView.AnonymousClass22) this.this$0)).resourcesProvider, 5);
                case 7:
                    return ((PaintView) this.this$0).resourcesProvider;
                case 8:
                    return new PeerStoriesView.AnonymousClass18(((BotWebViewContainer) this.this$0).resourcesProvider, 9);
            }
        }

        @Override
        public boolean isLightStatusBar() {
            switch (this.$r8$classId) {
                case 2:
                    return false;
                case 3:
                case 5:
                case 7:
                default:
                    return super.isLightStatusBar();
                case 4:
                    return false;
                case 6:
                    return false;
                case 8:
                    return false;
            }
        }

        @Override
        public boolean presentFragment(BaseFragment baseFragment) {
            switch (this.$r8$classId) {
                case 2:
                    return false;
                case 4:
                    StoryViewer storyViewer = ((PeerStoriesView) this.this$0).storyViewer;
                    if (storyViewer == null) {
                        return true;
                    }
                    storyViewer.presentFragment(baseFragment);
                    return true;
                case 7:
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
                case 1:
                    dialog.show();
                    return dialog;
                case 2:
                case 5:
                case 7:
                default:
                    return super.showDialog(dialog);
                case 3:
                    dialog.show();
                    return dialog;
                case 4:
                    StoryViewer storyViewer = ((PeerStoriesView) this.this$0).storyViewer;
                    if (storyViewer != null) {
                        storyViewer.showDialog(dialog);
                    } else if (dialog != null) {
                        dialog.show();
                    }
                    return dialog;
                case 6:
                    dialog.show();
                    return dialog;
                case 8:
                    dialog.show();
                    return dialog;
            }
        }

        public AnonymousClass8(BaseFragment baseFragment) {
            super(null);
            this.$r8$classId = 2;
            this.this$0 = baseFragment;
        }

        public AnonymousClass8(PaintView.AnonymousClass22 anonymousClass22) {
            super(null);
            this.$r8$classId = 6;
            this.this$0 = anonymousClass22;
            this.currentAccount = ((BottomSheet) anonymousClass22).currentAccount;
        }

        public AnonymousClass8(BotWebViewContainer botWebViewContainer) {
            super(null);
            this.$r8$classId = 8;
            this.this$0 = botWebViewContainer;
            this.currentAccount = botWebViewContainer.currentAccount;
        }
    }

    public SendGiftSheet(android.content.Context r36, int r37, org.telegram.tgnet.tl.TL_stars.StarGift r38, org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier r39, long r40, java.lang.Runnable r42, boolean r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.SendGiftSheet.<init>(android.content.Context, int, org.telegram.tgnet.tl.TL_stars$StarGift, org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier, long, java.lang.Runnable, boolean, boolean):void");
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new SendGiftSheet$$ExternalSyntheticLambda0(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
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
        if (anonymousClass3.editTextEmoji.isKeyboardVisible()) {
            anonymousClass3.editTextEmoji.closeKeyboard();
            return;
        }
        if (anonymousClass3 != null) {
            anonymousClass3.editTextEmoji.onPause();
        }
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

    public final void lambda$buyPremiumTier$4(TLRPC.User user, String str, Boolean bool) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda15(user, 2), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            zzkh.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider), R.raw.error);
        }
        this.button.setLoading(false);
    }

    public final void lambda$buyPremiumTier$9(TLRPC.User user, String str, Boolean bool) {
        if (bool.booleanValue()) {
            Runnable runnable = this.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(this.messageEdit);
            lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda15(user, 1), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            zzkh.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider), R.raw.error);
        }
        this.button.setLoading(false);
    }

    public final void lambda$fillItems$15() {
        new StarGiftSheet(this.currentAccount, getContext(), this.resourcesProvider, this.dialogId, null).openAsLearnMore(this.starGift.id, this.name);
    }

    public final void lambda$fillItems$16() {
        AuctionJoinSheet.showMoreInfo(getContext(), this.resourcesProvider, this.starGift);
    }

    public final void lambda$fillItems$17() {
        new StarsIntroActivity.StarsOptionsSheet(getContext(), this.resourcesProvider).show();
    }

    public final void lambda$new$0(long j, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        final int i = 0;
        final int i2 = 1;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (buttonWithCounterView.isLoading()) {
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
            AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda3(this, 5), 500L);
            return;
        }
        buttonWithCounterView.setLoading(true);
        if (anonymousClass3.editTextEmoji.getEmojiPadding() > 0) {
            anonymousClass3.editTextEmoji.hidePopup(true);
        } else if (anonymousClass3.editTextEmoji.isKeyboardVisible()) {
            anonymousClass3.editTextEmoji.closeKeyboard();
        }
        int i3 = this.currentAccount;
        if (starGift != null) {
            StarsController.getInstance(i3, false).buyStarGift(new SendGiftSheet$$ExternalSyntheticLambda0(this, 1), this.starGift, this.anonymous, this.upgrade, this.dialogId, getMessage());
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
                        switch (i) {
                            case 0:
                                this.f$0.lambda$buyPremiumTier$4(user, str, bool);
                                break;
                            default:
                                this.f$0.lambda$buyPremiumTier$9(user, str, bool);
                                break;
                        }
                    }
                }, this.dialogId, tL_premiumGiftCodeOption, getMessage());
                return;
            }
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this, i);
            ArrayList arrayList = new ArrayList(Arrays.asList(user));
            TLRPC.TL_textWithEntities message = getMessage();
            GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda4 = new GiftSheet$$ExternalSyntheticLambda4(10, this, user);
            DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 25);
            int i4 = UserConfig.selectedAccount;
            HashMap map = BoostRepository.cachedGiftOptions;
            if (map != null) {
                map.remove(Integer.valueOf(i4));
            }
            if (BoostRepository.isGoogleBillingAvailable()) {
                BoostRepository.payGiftCodeByGoogle(arrayList, tL_premiumGiftCodeOption, null, message, anonymousClass8, giftSheet$$ExternalSyntheticLambda4, dialogCell$$ExternalSyntheticLambda6);
                return;
            } else {
                BoostRepository.payGiftCodeByInvoice(arrayList, tL_premiumGiftCodeOption, null, message, anonymousClass8, giftSheet$$ExternalSyntheticLambda4, dialogCell$$ExternalSyntheticLambda6);
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
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$buyPremiumTier$4(user, str, bool);
                                break;
                            default:
                                this.f$0.lambda$buyPremiumTier$9(user, str, bool);
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
                            launchActivity.setNavigateToPremiumGiftCallback(new SendGiftSheet$$ExternalSyntheticLambda3(this, 1));
                        } else {
                            launchActivity.setNavigateToPremiumBot(true);
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
            BillingController.getInstance().addResultListener(giftPremiumBottomSheet$GiftTier.giftOption.store_product, new SendGiftSheet$$ExternalSyntheticLambda12(this, i));
            TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
            ConnectionsManager.getInstance(i3).sendRequest(tL_payments_canPurchaseStore, new StarGiftSheet$$ExternalSyntheticLambda1(this, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 9));
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
        } else if (anonymousClass3.editTextEmoji.isKeyboardVisible()) {
            anonymousClass3.editTextEmoji.closeKeyboard();
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
        if (getBaseFragment() != null) {
            ArrayList arrayList = new ArrayList(((ActionBarLayout) ((LaunchActivity) getBaseFragment().getParentActivity()).getActionBarLayout()).getFragmentStack());
            INavigationLayout parentLayout = getBaseFragment().getParentLayout();
            int size = arrayList.size();
            ChatActivity chatActivity = null;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BaseFragment baseFragment = (BaseFragment) obj;
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                    if (chatActivity.getDialogId() != j) {
                        baseFragment.removeSelfFromStack();
                    }
                } else if (baseFragment instanceof ProfileActivity) {
                    if (z && ((ActionBarLayout) parentLayout).getLastFragment() == baseFragment) {
                        baseFragment.finishFragment();
                    } else {
                        baseFragment.removeSelfFromStack();
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
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z);
                buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auction.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z);
                buttonWithCounterView.setSubText(null, z);
                return;
            } else {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z);
                buttonWithCounterView.setSubText(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i3)), z);
                return;
            }
        }
        TL_stars.StarGift starGift = this.starGift;
        ColoredImageSpan[] coloredImageSpanArr = this.cachedStarSpan;
        if (starGift != null) {
            long j2 = StarsController.getInstance(i, false).getBalance().amount;
            long j3 = starGift.stars + (this.upgrade ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(getText()) ? 0L : this.send_paid_messages_stars);
            buttonWithCounterView.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatPluralStringComma(this.self ? "Gift2SendSelf" : "Gift2Send", (int) j3), coloredImageSpanArr), z);
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
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(i4, LocaleController.formatNumber(j, ',')), 1.0f, coloredImageSpanArr), z);
                coloredImageSpanArr[0].spaceScaleX = 0.85f;
            } else {
                buttonWithCounterView.setText(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, giftPremiumBottomSheet$GiftTier.getFormattedPrice())), z);
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
