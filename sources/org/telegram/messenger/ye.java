package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19911a;
    public final MessagesStorage f19912b;
    public final Utilities.Callback f19913c;
    public final long d;
    public final long f19914e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19911a = i10;
        this.f19912b = messagesStorage;
        this.f19913c = callback;
        this.d = j3;
        this.f19914e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19911a) {
            case 0:
                this.f19912b.lambda$getEphemeralMessages$208(this.f19913c, this.d, this.f19914e);
                return;
            default:
                this.f19912b.lambda$getEphemeralMessages$207(this.f19913c, this.d, this.f19914e);
                return;
        }
    }
}
