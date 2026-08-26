package org.telegram.ui.Stars;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StarsController$$ExternalSyntheticLambda88 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final long f$5;
    public final int f$6;
    public final Object f$7;
    public final long f$8;

    public StarsController$$ExternalSyntheticLambda88(MessagesStorage messagesStorage, long j, boolean z, String str, long j2, int i, String str2, String str3, String str4) {
        this.f$0 = messagesStorage;
        this.f$5 = j;
        this.f$4 = z;
        this.f$1 = str;
        this.f$8 = j2;
        this.f$6 = i;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$7 = str4;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = (StarsController) this.f$0;
                TLObject tLObject = (TLObject) this.f$1;
                Runnable runnable = (Runnable) this.f$2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$3;
                boolean z = this.f$4;
                long j = this.f$5;
                int i = this.f$6;
                MessageObject messageObject = (MessageObject) this.f$7;
                long j2 = this.f$8;
                starsController.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new StarsController$$ExternalSyntheticLambda48(starsController, tLObject, 5));
                    runnable.run();
                } else if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || z) {
                    runnable.run();
                } else {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(starsController.currentAccount).getInputPeer(j);
                    tL_messages_getScheduledMessages.id.add(Integer.valueOf(i));
                    ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_messages_getScheduledMessages, new StarGiftSheet$$ExternalSyntheticLambda162(starsController, messageObject, j2, runnable, 8));
                }
                break;
            default:
                ((MessagesStorage) this.f$0).lambda$updateUnreadReactionsCountInternal$261(this.f$5, this.f$4, (String) this.f$1, this.f$8, this.f$6, (String) this.f$2, (String) this.f$3, (String) this.f$7);
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda88(StarsController starsController, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z, long j, int i, MessageObject messageObject, long j2) {
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$2 = runnable;
        this.f$3 = tL_error;
        this.f$4 = z;
        this.f$5 = j;
        this.f$6 = i;
        this.f$7 = messageObject;
        this.f$8 = j2;
    }
}
