package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;

public final class ConnectionsManager$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final TLRPC.Updates f$1;

    public ConnectionsManager$$ExternalSyntheticLambda5(int i, TLRPC.Updates updates, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = updates;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f$0, this.f$1);
                break;
            default:
                MessagesController.getInstance(this.f$0).processUpdates(this.f$1, false);
                break;
        }
    }
}
