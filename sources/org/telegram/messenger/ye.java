package org.telegram.messenger;

public final class ye implements Runnable {

    public final int f22251a;

    public final MessagesStorage f22252b;

    public final Utilities.Callback f22253c;
    public final long d;

    public final long f22254e;

    public ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f22251a = i10;
        this.f22252b = messagesStorage;
        this.f22253c = callback;
        this.d = j10;
        this.f22254e = j11;
    }

    @Override
    public final void run() {
        switch (this.f22251a) {
            case 0:
                this.f22252b.lambda$getEphemeralMessages$208(this.f22253c, this.d, this.f22254e);
                break;
            default:
                this.f22252b.lambda$getEphemeralMessages$207(this.f22253c, this.d, this.f22254e);
                break;
        }
    }
}
