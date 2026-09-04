package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f36572a;
    public final Utilities.Callback f36573b;
    public final long f36574c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f36572a = i10;
        this.f36573b = callback;
        this.f36574c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36572a) {
            case 0:
                this.f36573b.run(Long.valueOf(this.f36574c));
                return;
            default:
                this.f36573b.run(Long.valueOf(this.f36574c));
                return;
        }
    }
}
