package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33555a;
    public final Utilities.Callback f33556b;
    public final long f33557c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f33555a = i10;
        this.f33556b = callback;
        this.f33557c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33555a) {
            case 0:
                this.f33556b.run(Long.valueOf(this.f33557c));
                return;
            default:
                this.f33556b.run(Long.valueOf(this.f33557c));
                return;
        }
    }
}
