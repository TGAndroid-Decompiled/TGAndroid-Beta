package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38177a;
    public final Utilities.Callback f38178b;
    public final long f38179c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38177a = i10;
        this.f38178b = callback;
        this.f38179c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38177a) {
            case 0:
                this.f38178b.run(Long.valueOf(this.f38179c));
                return;
            default:
                this.f38178b.run(Long.valueOf(this.f38179c));
                return;
        }
    }
}
