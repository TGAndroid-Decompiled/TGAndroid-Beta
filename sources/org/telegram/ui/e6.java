package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f35929a;
    public final Utilities.Callback f35930b;
    public final long f35931c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f35929a = i10;
        this.f35930b = callback;
        this.f35931c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35929a) {
            case 0:
                this.f35930b.run(Long.valueOf(this.f35931c));
                return;
            default:
                this.f35930b.run(Long.valueOf(this.f35931c));
                return;
        }
    }
}
