package org.telegram.ui.bots;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda39;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.AuctionWearingSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda160;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoryMediaAreasView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$9$1;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunityEditActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.web.WebActionBar;

public final class BotAdView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public BotAdView$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        BaseFragment lastFragment;
        BaseFragment lastFragment2;
        BlockRow blockRow;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity$$ExternalSyntheticLambda39) this.f$0).run();
                break;
            case 1:
                ((AcquiredGiftsSheet) this.f$0).lambda$new$1$12(view);
                break;
            case 2:
                ((AuctionWearingSheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 3:
                if (((GiftSheet) this.f$0).balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
                break;
            case 4:
                ((ExplainStarsSheet) this.f$0).lambda$new$0$18(view);
                break;
            case 5:
                ((MessageSuggestionOfferSheet) this.f$0).lambda$new$1$15(view);
                break;
            case 6:
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = (SellGiftEnterPriceSheet) this.f$0;
                AmountUtils$Currency amountUtils$Currency = sellGiftEnterPriceSheet.inputAmount.currency;
                AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
                if (amountUtils$Currency == amountUtils$Currency2) {
                    amountUtils$Currency2 = AmountUtils$Currency.STARS;
                }
                sellGiftEnterPriceSheet.setAmount$2(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), true, false, true);
                sellGiftEnterPriceSheet.starsCountEditField.setText("");
                break;
            case 7:
                ((StarGiftPreviewSheet) this.f$0).lambda$new$6$3(view);
                break;
            case 8:
                ((StarGiftSheet$$ExternalSyntheticLambda160) this.f$0).run();
                break;
            case 9:
                ((StarGiftSheet$$ExternalSyntheticLambda160) this.f$0).run();
                break;
            case 10:
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) this.f$0;
                resaleBuyTransferAlert.getClass();
                new StarsIntroActivity.StarsOptionsSheet(resaleBuyTransferAlert.context, resaleBuyTransferAlert.resourcesProvider).show();
                break;
            case 11:
                ((StarGiftSheet.UpgradePricesSheet) this.f$0).lambda$new$0$15(view);
                break;
            case 12:
                ((StarsIntroActivity$$ExternalSyntheticLambda9) this.f$0).run();
                break;
            case 13:
                if (((StarsIntroActivity.StarsNeededSheet.HeaderView) this.f$0).balanceView.lastBalance > 0 && (lastFragment2 = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                    bottomSheetParams2.transitionFromLeft = true;
                    lastFragment2.showAsSheet(new StarsIntroActivity(), bottomSheetParams2);
                }
                break;
            case 14:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                anonymousClass10.setCollapsed(!anonymousClass10.collapsed, true);
                break;
            case 15:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                if (storyViewer != null) {
                    storyViewer.switchToPip();
                }
                break;
            case 16:
                ((StealthModeAlert) this.f$0).lambda$showGiftOfferSheet$15();
                BaseFragment lastFragment3 = LaunchActivity.getLastFragment();
                if (lastFragment3 != null) {
                    lastFragment3.showDialog(new PremiumFeatureBottomSheet(lastFragment3, lastFragment3.getContext(), lastFragment3.getCurrentAccount(), false, 14, false, null));
                }
                break;
            case 17:
                StoryMediaAreasView storyMediaAreasView = (StoryMediaAreasView) this.f$0;
                storyMediaAreasView.onClick(storyMediaAreasView.selectedArea);
                break;
            case 18:
                StoryViewer.AnonymousClass8 anonymousClass8 = (StoryViewer.AnonymousClass8) this.f$0;
                anonymousClass8.this$0.storiesIntro.animate().alpha(0.0f).setDuration(150L).setListener(new StoryViewer$9$1(anonymousClass8, 0)).start();
                break;
            case 19:
                ((BotSensors$1$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 20:
                ((FileLoader$$ExternalSyntheticLambda1) this.f$0).run();
                break;
            case 21:
                ((ChatActivity$$ExternalSyntheticLambda39) this.f$0).run();
                break;
            case 22:
                ((BotKeyboardView) this.f$0).lambda$setButtons$0(view);
                break;
            case 23:
                ((BotVerifySheet$$ExternalSyntheticLambda7) this.f$0).run();
                break;
            case 24:
                CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.f$0;
                TLRPC.Chat chat = communityEditActivity.currentChat;
                if (chat != null && !chat.title.equals(((WebActionBar.AnonymousClass4) communityEditActivity.editTextCell.this$0).getText().toString())) {
                    communityEditActivity.getMessagesController().changeChatTitle(communityEditActivity.currentChat.id, ((WebActionBar.AnonymousClass4) communityEditActivity.editTextCell.this$0).getText().toString(), new CommunityEditActivity$$ExternalSyntheticLambda6(communityEditActivity, 0));
                }
                TLRPC.Chat chat2 = communityEditActivity.currentChat;
                if (chat2 != null && communityEditActivity.canAllManageLinkedPeers != communityEditActivity.canAllManageLinkedPeersOriginal) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    communityEditActivity.currentChat.default_banned_rights.manage_linked_peers = !communityEditActivity.canAllManageLinkedPeers;
                    communityEditActivity.getMessagesController().setDefaultBannedRole(communityEditActivity.communityId, communityEditActivity.currentChat.default_banned_rights, false, communityEditActivity);
                }
                communityEditActivity.finishFragment();
                break;
            case 25:
                CommunitySheet.this.viewPager.scrollToPosition(0);
                break;
            case 26:
                CommunitySheet communitySheet = CommunitySheet.this;
                if (!ChatObject.canAddChatToCommunity(communitySheet.currentCommunity)) {
                    communitySheet.lambda$showGiftOfferSheet$15();
                } else {
                    communitySheet.loadChatsToAddToCommunity();
                }
                break;
            case 27:
                ((CommunityInviteOnlySheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 28:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = (ChatAttachAlertRichLayout) this.f$0;
                chatAttachAlertRichLayout.sendSelectedItems(true, 0, 0, 0L, false);
                MessageSendPreview messageSendPreview = chatAttachAlertRichLayout.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.dismiss(true);
                    chatAttachAlertRichLayout.messageSendPreview = null;
                }
                break;
            default:
                RichDetailsCell richDetailsCell = (RichDetailsCell) this.f$0;
                RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
                if (anonymousClass13 != null && (blockRow = richDetailsCell.currentRow) != null) {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    richEditorListView.getClass();
                    if (RichEditorListView.isDetailsHeader(blockRow)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                            richEditorHistory.commit();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        richEditorListView.adapter.update(true);
                        RichEditorHistory richEditorHistory2 = richEditorListView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.record();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
