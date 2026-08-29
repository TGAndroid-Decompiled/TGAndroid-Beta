package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f38002a;
    public final Utilities.Callback f38003b;
    public final long f38004c;

    public f6(long j10, int i10, Utilities.Callback callback) {
        this.f38002a = i10;
        this.f38003b = callback;
        this.f38004c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38002a) {
            case 0:
                this.f38003b.run(Long.valueOf(this.f38004c));
                return;
            default:
                this.f38003b.run(Long.valueOf(this.f38004c));
                return;
        }
    }
}
