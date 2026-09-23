package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f33469a;
    public final Utilities.Callback f33470b;
    public final long f33471c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f33469a = i10;
        this.f33470b = callback;
        this.f33471c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33469a) {
            case 0:
                this.f33470b.run(Long.valueOf(this.f33471c));
                return;
            default:
                this.f33470b.run(Long.valueOf(this.f33471c));
                return;
        }
    }
}
