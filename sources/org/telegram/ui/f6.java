package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33554a;
    public final Utilities.Callback f33555b;
    public final long f33556c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f33554a = i10;
        this.f33555b = callback;
        this.f33556c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33554a) {
            case 0:
                this.f33555b.run(Long.valueOf(this.f33556c));
                return;
            default:
                this.f33555b.run(Long.valueOf(this.f33556c));
                return;
        }
    }
}
