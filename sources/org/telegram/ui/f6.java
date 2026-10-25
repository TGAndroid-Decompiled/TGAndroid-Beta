package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f39275a;
    public final Utilities.Callback f39276b;
    public final long f39277c;

    public f6(long j10, int i10, Utilities.Callback callback) {
        this.f39275a = i10;
        this.f39276b = callback;
        this.f39277c = j10;
    }

    @Override
    public final void run() {
        switch (this.f39275a) {
            case 0:
                this.f39276b.run(Long.valueOf(this.f39277c));
                return;
            default:
                this.f39276b.run(Long.valueOf(this.f39277c));
                return;
        }
    }
}
