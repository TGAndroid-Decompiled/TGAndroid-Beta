package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f20169a;
    public final MessagesStorage f20170b;
    public final Utilities.Callback f20171c;
    public final long d;
    public final long e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f20169a = i10;
        this.f20170b = messagesStorage;
        this.f20171c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20169a) {
            case 0:
                this.f20170b.lambda$getEphemeralMessages$208(this.f20171c, this.d, this.e);
                return;
            default:
                this.f20170b.lambda$getEphemeralMessages$207(this.f20171c, this.d, this.e);
                return;
        }
    }
}
