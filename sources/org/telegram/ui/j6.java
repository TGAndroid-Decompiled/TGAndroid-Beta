package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38052a;
    public final Utilities.Callback f38053b;
    public final long f38054c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38052a = i10;
        this.f38053b = callback;
        this.f38054c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38052a) {
            case 0:
                this.f38053b.run(Long.valueOf(this.f38054c));
                return;
            default:
                this.f38053b.run(Long.valueOf(this.f38054c));
                return;
        }
    }
}
