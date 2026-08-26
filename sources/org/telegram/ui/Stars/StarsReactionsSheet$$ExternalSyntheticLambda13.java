package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Bulletin;

public final class StarsReactionsSheet$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final StarsController.PendingPaidReactions f$0;

    public StarsReactionsSheet$$ExternalSyntheticLambda13(StarsController.PendingPaidReactions pendingPaidReactions, int i) {
        this.$r8$classId = i;
        this.f$0 = pendingPaidReactions;
    }

    @Override
    public final void run() {
        StarsController.PendingPaidReactions pendingPaidReactions = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (!pendingPaidReactions.applied) {
                    pendingPaidReactions.applied = true;
                    int i = (int) pendingPaidReactions.not_added;
                    long peerId = pendingPaidReactions.getPeerId();
                    MessageObject messageObject = pendingPaidReactions.messageObject;
                    messageObject.addPaidReactions(i, true, peerId);
                    StarsController starsController = StarsController.this;
                    starsController.minus += pendingPaidReactions.not_added;
                    int i2 = starsController.currentAccount;
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                    pendingPaidReactions.not_added = 0L;
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
                }
                if (!pendingPaidReactions.shownBulletin) {
                    pendingPaidReactions.shownBulletin = true;
                    pendingPaidReactions.timerView.timeLeft = 5000L;
                    StarsReactionsSheet$$ExternalSyntheticLambda13 starsReactionsSheet$$ExternalSyntheticLambda13 = pendingPaidReactions.closeRunnable;
                    AndroidUtilities.cancelRunOnUIThread(starsReactionsSheet$$ExternalSyntheticLambda13);
                    AndroidUtilities.runOnUIThread(starsReactionsSheet$$ExternalSyntheticLambda13, 5000L);
                    Bulletin bulletin = pendingPaidReactions.bulletin;
                    bulletin.show(true);
                    bulletin.setOnHideListener(starsReactionsSheet$$ExternalSyntheticLambda13);
                }
                pendingPaidReactions.bulletinLayout.titleTextView.setText(pendingPaidReactions.getToastTitle());
                break;
            case 1:
                pendingPaidReactions.close();
                break;
            default:
                pendingPaidReactions.cancel();
                break;
        }
    }
}
