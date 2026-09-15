package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f33768a;
    public final Utilities.Callback f33769b;
    public final long f33770c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f33768a = i10;
        this.f33769b = callback;
        this.f33770c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33768a) {
            case 0:
                this.f33769b.run(Long.valueOf(this.f33770c));
                return;
            default:
                this.f33769b.run(Long.valueOf(this.f33770c));
                return;
        }
    }
}
