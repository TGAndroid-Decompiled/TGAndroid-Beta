package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ze implements Runnable {
    public final int f18265a;
    public final MessagesStorage f18266b;
    public final Utilities.Callback f18267c;
    public final long d;
    public final long e;

    public ze(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f18265a = i10;
        this.f18266b = messagesStorage;
        this.f18267c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                this.f18266b.lambda$getEphemeralMessages$208(this.f18267c, this.d, this.e);
                return;
            default:
                this.f18266b.lambda$getEphemeralMessages$207(this.f18267c, this.d, this.e);
                return;
        }
    }
}
