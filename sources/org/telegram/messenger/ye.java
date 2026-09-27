package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f18226a;
    public final MessagesStorage f18227b;
    public final Utilities.Callback f18228c;
    public final long d;
    public final long e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f18226a = i10;
        this.f18227b = messagesStorage;
        this.f18228c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18226a) {
            case 0:
                this.f18227b.lambda$getEphemeralMessages$208(this.f18228c, this.d, this.e);
                return;
            default:
                this.f18227b.lambda$getEphemeralMessages$207(this.f18228c, this.d, this.e);
                return;
        }
    }
}
