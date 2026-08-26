package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Components.ReactionsContainerLayout;

public final class ChatActivity$$ExternalSyntheticLambda383 implements Runnable {
    public final int $r8$classId = 1;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final int f$1;
    public final int f$2;
    public final boolean f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda383(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i, int i2, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$4 = message;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$createMenu$302(this.f$1, this.f$2, this.f$3, (ReactionsContainerLayout) this.f$4);
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$98((TLRPC.Message) this.f$4, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((NotificationsSettingsActivity) this.f$0).lambda$createView$3(this.f$1, this.f$3, (NotificationsCheckCell) this.f$4, this.f$2);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda383(ChatActivity chatActivity, int i, int i2, boolean z, ReactionsContainerLayout reactionsContainerLayout) {
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = z;
        this.f$4 = reactionsContainerLayout;
    }

    public ChatActivity$$ExternalSyntheticLambda383(NotificationsSettingsActivity notificationsSettingsActivity, int i, boolean z, NotificationsCheckCell notificationsCheckCell, int i2) {
        this.f$0 = notificationsSettingsActivity;
        this.f$1 = i;
        this.f$3 = z;
        this.f$4 = notificationsCheckCell;
        this.f$2 = i2;
    }
}
