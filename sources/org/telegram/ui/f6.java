package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33556a;
    public final Utilities.Callback f33557b;
    public final long f33558c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f33556a = i10;
        this.f33557b = callback;
        this.f33558c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33556a) {
            case 0:
                this.f33557b.run(Long.valueOf(this.f33558c));
                return;
            default:
                this.f33557b.run(Long.valueOf(this.f33558c));
                return;
        }
    }
}
