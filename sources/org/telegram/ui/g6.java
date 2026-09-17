package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f36573a;
    public final Utilities.Callback f36574b;
    public final long f36575c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f36573a = i10;
        this.f36574b = callback;
        this.f36575c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36573a) {
            case 0:
                this.f36574b.run(Long.valueOf(this.f36575c));
                return;
            default:
                this.f36574b.run(Long.valueOf(this.f36575c));
                return;
        }
    }
}
