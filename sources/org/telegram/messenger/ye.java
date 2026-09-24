package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f18218a;
    public final MessagesStorage f18219b;
    public final Utilities.Callback f18220c;
    public final long d;
    public final long e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f18218a = i10;
        this.f18219b = messagesStorage;
        this.f18220c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18218a) {
            case 0:
                this.f18219b.lambda$getEphemeralMessages$208(this.f18220c, this.d, this.e);
                return;
            default:
                this.f18219b.lambda$getEphemeralMessages$207(this.f18220c, this.d, this.e);
                return;
        }
    }
}
