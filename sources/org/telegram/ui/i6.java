package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f37755a;
    public final Utilities.Callback f37756b;
    public final long f37757c;

    public i6(long j10, int i10, Utilities.Callback callback) {
        this.f37755a = i10;
        this.f37756b = callback;
        this.f37757c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37755a) {
            case 0:
                this.f37756b.run(Long.valueOf(this.f37757c));
                return;
            default:
                this.f37756b.run(Long.valueOf(this.f37757c));
                return;
        }
    }
}
