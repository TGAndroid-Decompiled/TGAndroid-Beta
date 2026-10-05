package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f35959a;
    public final Utilities.Callback f35960b;
    public final long f35961c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f35959a = i10;
        this.f35960b = callback;
        this.f35961c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35959a) {
            case 0:
                this.f35960b.run(Long.valueOf(this.f35961c));
                return;
            default:
                this.f35960b.run(Long.valueOf(this.f35961c));
                return;
        }
    }
}
