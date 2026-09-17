package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19780a;
    public final MessagesStorage f19781b;
    public final Utilities.Callback f19782c;
    public final long d;
    public final long f19783e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19780a = i10;
        this.f19781b = messagesStorage;
        this.f19782c = callback;
        this.d = j3;
        this.f19783e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19780a) {
            case 0:
                this.f19781b.lambda$getEphemeralMessages$208(this.f19782c, this.d, this.f19783e);
                return;
            default:
                this.f19781b.lambda$getEphemeralMessages$207(this.f19782c, this.d, this.f19783e);
                return;
        }
    }
}
