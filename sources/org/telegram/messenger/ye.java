package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f17977a;
    public final MessagesStorage f17978b;
    public final Utilities.Callback f17979c;
    public final long d;
    public final long e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f17977a = i10;
        this.f17978b = messagesStorage;
        this.f17979c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17977a) {
            case 0:
                this.f17978b.lambda$getEphemeralMessages$208(this.f17979c, this.d, this.e);
                return;
            default:
                this.f17978b.lambda$getEphemeralMessages$207(this.f17979c, this.d, this.e);
                return;
        }
    }
}
