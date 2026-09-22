package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ze implements Runnable {
    public final int f18079a;
    public final MessagesStorage f18080b;
    public final Utilities.Callback f18081c;
    public final long d;
    public final long e;

    public ze(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f18079a = i10;
        this.f18080b = messagesStorage;
        this.f18081c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18079a) {
            case 0:
                this.f18080b.lambda$getEphemeralMessages$208(this.f18081c, this.d, this.e);
                return;
            default:
                this.f18080b.lambda$getEphemeralMessages$207(this.f18081c, this.d, this.e);
                return;
        }
    }
}
