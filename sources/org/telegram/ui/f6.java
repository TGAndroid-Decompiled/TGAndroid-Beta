package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f39278a;
    public final Utilities.Callback f39279b;
    public final long f39280c;

    public f6(long j10, int i10, Utilities.Callback callback) {
        this.f39278a = i10;
        this.f39279b = callback;
        this.f39280c = j10;
    }

    @Override
    public final void run() {
        switch (this.f39278a) {
            case 0:
                this.f39279b.run(Long.valueOf(this.f39280c));
                return;
            default:
                this.f39279b.run(Long.valueOf(this.f39280c));
                return;
        }
    }
}
