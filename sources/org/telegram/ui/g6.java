package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f33777a;
    public final Utilities.Callback f33778b;
    public final long f33779c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f33777a = i10;
        this.f33778b = callback;
        this.f33779c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33777a) {
            case 0:
                this.f33778b.run(Long.valueOf(this.f33779c));
                return;
            default:
                this.f33778b.run(Long.valueOf(this.f33779c));
                return;
        }
    }
}
