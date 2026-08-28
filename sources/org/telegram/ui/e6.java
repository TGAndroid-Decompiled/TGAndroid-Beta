package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f37829a;
    public final Utilities.Callback f37830b;
    public final long f37831c;

    public e6(long j10, int i9, Utilities.Callback callback) {
        this.f37829a = i9;
        this.f37830b = callback;
        this.f37831c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37829a) {
            case 0:
                this.f37830b.run(Long.valueOf(this.f37831c));
                return;
            default:
                this.f37830b.run(Long.valueOf(this.f37831c));
                return;
        }
    }
}
