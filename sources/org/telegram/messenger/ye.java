package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f20175a;
    public final MessagesStorage f20176b;
    public final Utilities.Callback f20177c;
    public final long d;
    public final long e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f20175a = i10;
        this.f20176b = messagesStorage;
        this.f20177c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20175a) {
            case 0:
                this.f20176b.lambda$getEphemeralMessages$208(this.f20177c, this.d, this.e);
                return;
            default:
                this.f20176b.lambda$getEphemeralMessages$207(this.f20177c, this.d, this.e);
                return;
        }
    }
}
