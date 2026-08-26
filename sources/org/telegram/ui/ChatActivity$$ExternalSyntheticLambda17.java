package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final TLRPC.User f$1;

    public ChatActivity$$ExternalSyntheticLambda17(Utilities.Callback callback, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1);
                break;
            default:
                this.f$0.run(this.f$1);
                break;
        }
    }
}
