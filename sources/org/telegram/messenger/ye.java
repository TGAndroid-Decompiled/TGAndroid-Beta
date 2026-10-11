package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19906a;
    public final MessagesStorage f19907b;
    public final Utilities.Callback f19908c;
    public final long d;
    public final long f19909e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19906a = i10;
        this.f19907b = messagesStorage;
        this.f19908c = callback;
        this.d = j3;
        this.f19909e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19906a) {
            case 0:
                this.f19907b.lambda$getEphemeralMessages$208(this.f19908c, this.d, this.f19909e);
                return;
            default:
                this.f19907b.lambda$getEphemeralMessages$207(this.f19908c, this.d, this.f19909e);
                return;
        }
    }
}
