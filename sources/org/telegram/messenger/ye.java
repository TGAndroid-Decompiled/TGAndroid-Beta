package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19922a;
    public final MessagesStorage f19923b;
    public final Utilities.Callback f19924c;
    public final long d;
    public final long f19925e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19922a = i10;
        this.f19923b = messagesStorage;
        this.f19924c = callback;
        this.d = j3;
        this.f19925e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                this.f19923b.lambda$getEphemeralMessages$208(this.f19924c, this.d, this.f19925e);
                return;
            default:
                this.f19923b.lambda$getEphemeralMessages$207(this.f19924c, this.d, this.f19925e);
                return;
        }
    }
}
