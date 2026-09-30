package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f18250a;
    public final MessagesStorage f18251b;
    public final Utilities.Callback f18252c;
    public final long d;
    public final long e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f18250a = i10;
        this.f18251b = messagesStorage;
        this.f18252c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$getEphemeralMessages$208(this.f18252c, this.d, this.e);
                return;
            default:
                this.f18251b.lambda$getEphemeralMessages$207(this.f18252c, this.d, this.e);
                return;
        }
    }
}
