package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19929a;
    public final MessagesStorage f19930b;
    public final Utilities.Callback f19931c;
    public final long d;
    public final long f19932e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19929a = i10;
        this.f19930b = messagesStorage;
        this.f19931c = callback;
        this.d = j3;
        this.f19932e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19929a) {
            case 0:
                this.f19930b.lambda$getEphemeralMessages$208(this.f19931c, this.d, this.f19932e);
                return;
            default:
                this.f19930b.lambda$getEphemeralMessages$207(this.f19931c, this.d, this.f19932e);
                return;
        }
    }
}
