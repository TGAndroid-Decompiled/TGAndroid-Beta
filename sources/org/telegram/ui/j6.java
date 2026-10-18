package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38050a;
    public final Utilities.Callback f38051b;
    public final long f38052c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38050a = i10;
        this.f38051b = callback;
        this.f38052c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38050a) {
            case 0:
                this.f38051b.run(Long.valueOf(this.f38052c));
                return;
            default:
                this.f38051b.run(Long.valueOf(this.f38052c));
                return;
        }
    }
}
