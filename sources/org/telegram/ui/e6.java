package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f37248a;
    public final Utilities.Callback f37249b;
    public final long f37250c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f37248a = i10;
        this.f37249b = callback;
        this.f37250c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37248a) {
            case 0:
                this.f37249b.run(Long.valueOf(this.f37250c));
                return;
            default:
                this.f37249b.run(Long.valueOf(this.f37250c));
                return;
        }
    }
}
