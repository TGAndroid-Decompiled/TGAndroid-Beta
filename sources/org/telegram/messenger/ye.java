package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ye implements Runnable {
    public final int f19915a;
    public final MessagesStorage f19916b;
    public final Utilities.Callback f19917c;
    public final long d;
    public final long f19918e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f19915a = i10;
        this.f19916b = messagesStorage;
        this.f19917c = callback;
        this.d = j3;
        this.f19918e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                this.f19916b.lambda$getEphemeralMessages$208(this.f19917c, this.d, this.f19918e);
                return;
            default:
                this.f19916b.lambda$getEphemeralMessages$207(this.f19917c, this.d, this.f19918e);
                return;
        }
    }
}
