package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f36599a;
    public final Utilities.Callback f36600b;
    public final long f36601c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f36599a = i10;
        this.f36600b = callback;
        this.f36601c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36599a) {
            case 0:
                this.f36600b.run(Long.valueOf(this.f36601c));
                return;
            default:
                this.f36600b.run(Long.valueOf(this.f36601c));
                return;
        }
    }
}
