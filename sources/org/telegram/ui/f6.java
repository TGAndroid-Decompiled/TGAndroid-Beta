package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f37499a;
    public final Utilities.Callback f37500b;
    public final long f37501c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f37499a = i10;
        this.f37500b = callback;
        this.f37501c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37499a) {
            case 0:
                this.f37500b.run(Long.valueOf(this.f37501c));
                return;
            default:
                this.f37500b.run(Long.valueOf(this.f37501c));
                return;
        }
    }
}
