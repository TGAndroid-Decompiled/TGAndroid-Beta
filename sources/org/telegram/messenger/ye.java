package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19942a;
    public final MessagesStorage f19943b;
    public final Utilities.Callback f19944c;
    public final long d;
    public final long f19945e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19942a = i10;
        this.f19943b = messagesStorage;
        this.f19944c = callback;
        this.d = j3;
        this.f19945e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19942a) {
            case 0:
                this.f19943b.lambda$getEphemeralMessages$208(this.f19944c, this.d, this.f19945e);
                return;
            default:
                this.f19943b.lambda$getEphemeralMessages$207(this.f19944c, this.d, this.f19945e);
                return;
        }
    }
}
