package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f38674a;
    public final Utilities.Callback f38675b;
    public final long f38676c;

    public i6(long j3, int i10, Utilities.Callback callback) {
        this.f38674a = i10;
        this.f38675b = callback;
        this.f38676c = j3;
    }

    @Override
    public final void run() {
        switch (this.f38674a) {
            case 0:
                this.f38675b.run(Long.valueOf(this.f38676c));
                return;
            default:
                this.f38675b.run(Long.valueOf(this.f38676c));
                return;
        }
    }
}
