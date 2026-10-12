package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f38677a;
    public final Utilities.Callback f38678b;
    public final long f38679c;

    public i6(long j3, int i10, Utilities.Callback callback) {
        this.f38677a = i10;
        this.f38678b = callback;
        this.f38679c = j3;
    }

    @Override
    public final void run() {
        switch (this.f38677a) {
            case 0:
                this.f38678b.run(Long.valueOf(this.f38679c));
                return;
            default:
                this.f38678b.run(Long.valueOf(this.f38679c));
                return;
        }
    }
}
