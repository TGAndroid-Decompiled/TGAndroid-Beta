package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f37453a;
    public final Utilities.Callback f37454b;
    public final long f37455c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f37453a = i10;
        this.f37454b = callback;
        this.f37455c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37453a) {
            case 0:
                this.f37454b.run(Long.valueOf(this.f37455c));
                return;
            default:
                this.f37454b.run(Long.valueOf(this.f37455c));
                return;
        }
    }
}
