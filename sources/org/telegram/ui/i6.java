package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f37557a;
    public final Utilities.Callback f37558b;
    public final long f37559c;

    public i6(long j10, int i10, Utilities.Callback callback) {
        this.f37557a = i10;
        this.f37558b = callback;
        this.f37559c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37557a) {
            case 0:
                this.f37558b.run(Long.valueOf(this.f37559c));
                return;
            default:
                this.f37558b.run(Long.valueOf(this.f37559c));
                return;
        }
    }
}
