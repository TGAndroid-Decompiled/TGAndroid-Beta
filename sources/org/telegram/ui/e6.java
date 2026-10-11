package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f37214a;
    public final Utilities.Callback f37215b;
    public final long f37216c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f37214a = i10;
        this.f37215b = callback;
        this.f37216c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37214a) {
            case 0:
                this.f37215b.run(Long.valueOf(this.f37216c));
                return;
            default:
                this.f37215b.run(Long.valueOf(this.f37216c));
                return;
        }
    }
}
