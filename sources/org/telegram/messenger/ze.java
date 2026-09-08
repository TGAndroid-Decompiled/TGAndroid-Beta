package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ze implements Runnable {
    public final int f19863a;
    public final MessagesStorage f19864b;
    public final Utilities.Callback f19865c;
    public final long d;
    public final long f19866e;

    public ze(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19863a = i10;
        this.f19864b = messagesStorage;
        this.f19865c = callback;
        this.d = j3;
        this.f19866e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19863a) {
            case 0:
                this.f19864b.lambda$getEphemeralMessages$208(this.f19865c, this.d, this.f19866e);
                return;
            default:
                this.f19864b.lambda$getEphemeralMessages$207(this.f19865c, this.d, this.f19866e);
                return;
        }
    }
}
