package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19923a;
    public final MessagesStorage f19924b;
    public final Utilities.Callback f19925c;
    public final long d;
    public final long f19926e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19923a = i10;
        this.f19924b = messagesStorage;
        this.f19925c = callback;
        this.d = j3;
        this.f19926e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19923a) {
            case 0:
                this.f19924b.lambda$getEphemeralMessages$208(this.f19925c, this.d, this.f19926e);
                return;
            default:
                this.f19924b.lambda$getEphemeralMessages$207(this.f19925c, this.d, this.f19926e);
                return;
        }
    }
}
