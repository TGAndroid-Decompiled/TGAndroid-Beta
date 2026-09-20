package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ze implements Runnable {
    public final int f18308a;
    public final MessagesStorage f18309b;
    public final Utilities.Callback f18310c;
    public final long d;
    public final long e;

    public ze(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f18308a = i10;
        this.f18309b = messagesStorage;
        this.f18310c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18308a) {
            case 0:
                this.f18309b.lambda$getEphemeralMessages$208(this.f18310c, this.d, this.e);
                return;
            default:
                this.f18309b.lambda$getEphemeralMessages$207(this.f18310c, this.d, this.e);
                return;
        }
    }
}
