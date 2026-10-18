package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38068a;
    public final Utilities.Callback f38069b;
    public final long f38070c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38068a = i10;
        this.f38069b = callback;
        this.f38070c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38068a) {
            case 0:
                this.f38069b.run(Long.valueOf(this.f38070c));
                return;
            default:
                this.f38069b.run(Long.valueOf(this.f38070c));
                return;
        }
    }
}
