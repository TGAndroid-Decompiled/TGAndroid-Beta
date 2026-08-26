package org.telegram.ui.Business;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

public final class BusinessBotButton$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final BusinessBotButton f$0;

    public BusinessBotButton$$ExternalSyntheticLambda1(BusinessBotButton businessBotButton, int i) {
        this.$r8$classId = i;
        this.f$0 = businessBotButton;
    }

    @Override
    public final void run() {
        BusinessBotButton businessBotButton = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                businessBotButton.updateTextRightPadding();
                break;
            case 1:
                businessBotButton.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = businessBotButton.currentAccount;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i).getInputPeer(businessBotButton.dialogId);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                MessagesController.getNotificationsSettings(i).edit().remove("dialog_botid" + businessBotButton.dialogId).remove("dialog_boturl" + businessBotButton.dialogId).remove("dialog_botflags" + businessBotButton.dialogId).apply();
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(businessBotButton.dialogId));
                BusinessChatbotController.getInstance(i).loaded = false;
                break;
            default:
                Browser.openUrl(businessBotButton.getContext(), businessBotButton.manageUrl);
                break;
        }
    }
}
