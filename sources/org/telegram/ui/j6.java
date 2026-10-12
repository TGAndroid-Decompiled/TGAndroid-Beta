package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f37261a;
    public final Utilities.Callback f37262b;
    public final long f37263c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f37261a = i10;
        this.f37262b = callback;
        this.f37263c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37261a) {
            case 0:
                this.f37262b.run(Long.valueOf(this.f37263c));
                return;
            default:
                this.f37262b.run(Long.valueOf(this.f37263c));
                return;
        }
    }
}
