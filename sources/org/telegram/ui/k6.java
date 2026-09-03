package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f35428a;
    public final Utilities.Callback f35429b;
    public final long f35430c;

    public k6(long j10, int i10, Utilities.Callback callback) {
        this.f35428a = i10;
        this.f35429b = callback;
        this.f35430c = j10;
    }

    @Override
    public final void run() {
        switch (this.f35428a) {
            case 0:
                this.f35429b.run(Long.valueOf(this.f35430c));
                return;
            default:
                this.f35429b.run(Long.valueOf(this.f35430c));
                return;
        }
    }
}
