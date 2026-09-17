package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f36600a;
    public final Utilities.Callback f36601b;
    public final long f36602c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f36600a = i10;
        this.f36601b = callback;
        this.f36602c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36600a) {
            case 0:
                this.f36601b.run(Long.valueOf(this.f36602c));
                return;
            default:
                this.f36601b.run(Long.valueOf(this.f36602c));
                return;
        }
    }
}
