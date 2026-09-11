package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19753a;
    public final MessagesStorage f19754b;
    public final Utilities.Callback f19755c;
    public final long d;
    public final long f19756e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19753a = i10;
        this.f19754b = messagesStorage;
        this.f19755c = callback;
        this.d = j3;
        this.f19756e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19753a) {
            case 0:
                this.f19754b.lambda$getEphemeralMessages$208(this.f19755c, this.d, this.f19756e);
                return;
            default:
                this.f19754b.lambda$getEphemeralMessages$207(this.f19755c, this.d, this.f19756e);
                return;
        }
    }
}
