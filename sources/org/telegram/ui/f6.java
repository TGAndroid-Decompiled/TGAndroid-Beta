package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33640a;
    public final Utilities.Callback f33641b;
    public final long f33642c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f33640a = i10;
        this.f33641b = callback;
        this.f33642c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33640a) {
            case 0:
                this.f33641b.run(Long.valueOf(this.f33642c));
                return;
            default:
                this.f33641b.run(Long.valueOf(this.f33642c));
                return;
        }
    }
}
