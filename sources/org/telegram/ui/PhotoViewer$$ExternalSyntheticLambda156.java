package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.PreviewView$$ExternalSyntheticLambda8;

public final class PhotoViewer$$ExternalSyntheticLambda156 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda156(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(int i) {
        PhotoViewer.FrameLayoutDrawer frameLayoutDrawer;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.TON;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.parentActivity != null && (frameLayoutDrawer = photoViewer.containerView) != null && i > 0) {
                    BulletinFactory.createSaveToGalleryBulletin(frameLayoutDrawer, true).show();
                    break;
                }
                break;
            case 1:
                ((ChannelAdminLogActivity) obj).loadMessages(true);
                break;
            case 2:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) obj;
                if (i <= 0) {
                    chatMessageCellDelegate.getClass();
                    break;
                } else {
                    ChatActivity chatActivity = ChatActivity.this;
                    if (chatActivity.getParentActivity() != null && chatActivity.fragmentView != null) {
                        BulletinFactory.of(chatActivity).createDownloadBulletin(BulletinFactory.FileType.UNKNOWNS, i, 0, 0, chatActivity.themeDelegate).show();
                        break;
                    }
                }
                break;
            case 3:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) obj;
                ChatAttachAlert chatAttachAlert = chatAttachAlertLocationLayout.parentAlert;
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + 1, new PreviewView$$ExternalSyntheticLambda8(chatAttachAlertLocationLayout, i, 3), 0L);
                break;
            case 4:
                ((NotificationsCustomSettingsActivity) obj).updateRows(true);
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.userId));
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i2 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i2);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                    profileActivity.playProfileAnimation = 0;
                    profileActivity.finishFragment();
                }
                break;
            case 6:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) obj;
                giftOfferSheet.getClass();
                if (i == 0) {
                    amountUtils$Currency = amountUtils$Currency2;
                }
                giftOfferSheet.setAmount(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), true, false, true);
                giftOfferSheet.starsCountEditField.setText("");
                break;
            case 7:
                MessageSuggestionOfferSheet messageSuggestionOfferSheet = (MessageSuggestionOfferSheet) obj;
                messageSuggestionOfferSheet.getClass();
                if (i == 0) {
                    amountUtils$Currency = amountUtils$Currency2;
                }
                messageSuggestionOfferSheet.setAmount$1(AmountUtils$Amount.fromNano(0L, amountUtils$Currency), true, false, true);
                messageSuggestionOfferSheet.starsCountEditField.setText("");
                break;
            case 8:
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) obj;
                resaleBuyTransferAlert.getClass();
                if (i == 0) {
                    amountUtils$Currency = amountUtils$Currency2;
                }
                resaleBuyTransferAlert.selectedCurrency = amountUtils$Currency;
                resaleBuyTransferAlert.onUpdateCurrency(true);
                break;
            default:
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (i != 0) {
                    topicsFragment.finishFragment();
                } else {
                    topicsFragment.updateChatInfo(false);
                }
                break;
        }
    }
}
