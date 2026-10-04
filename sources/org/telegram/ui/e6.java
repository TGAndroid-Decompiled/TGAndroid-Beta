package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f35928a;
    public final Utilities.Callback f35929b;
    public final long f35930c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f35928a = i10;
        this.f35929b = callback;
        this.f35930c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35928a) {
            case 0:
                this.f35929b.run(Long.valueOf(this.f35930c));
                return;
            default:
                this.f35929b.run(Long.valueOf(this.f35930c));
                return;
        }
    }
}
