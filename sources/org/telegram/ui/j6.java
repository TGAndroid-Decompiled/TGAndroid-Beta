package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38472a;
    public final Utilities.Callback f38473b;
    public final long f38474c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38472a = i10;
        this.f38473b = callback;
        this.f38474c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38472a) {
            case 0:
                this.f38473b.run(Long.valueOf(this.f38474c));
                return;
            default:
                this.f38473b.run(Long.valueOf(this.f38474c));
                return;
        }
    }
}
