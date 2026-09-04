package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ze implements Runnable {
    public final int f19836a;
    public final MessagesStorage f19837b;
    public final Utilities.Callback f19838c;
    public final long d;
    public final long f19839e;

    public ze(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19836a = i10;
        this.f19837b = messagesStorage;
        this.f19838c = callback;
        this.d = j3;
        this.f19839e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19836a) {
            case 0:
                this.f19837b.lambda$getEphemeralMessages$208(this.f19838c, this.d, this.f19839e);
                return;
            default:
                this.f19837b.lambda$getEphemeralMessages$207(this.f19838c, this.d, this.f19839e);
                return;
        }
    }
}
