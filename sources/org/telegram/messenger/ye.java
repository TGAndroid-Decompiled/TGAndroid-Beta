package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19924a;
    public final MessagesStorage f19925b;
    public final Utilities.Callback f19926c;
    public final long d;
    public final long f19927e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19924a = i10;
        this.f19925b = messagesStorage;
        this.f19926c = callback;
        this.d = j3;
        this.f19927e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19924a) {
            case 0:
                this.f19925b.lambda$getEphemeralMessages$208(this.f19926c, this.d, this.f19927e);
                return;
            default:
                this.f19925b.lambda$getEphemeralMessages$207(this.f19926c, this.d, this.f19927e);
                return;
        }
    }
}
