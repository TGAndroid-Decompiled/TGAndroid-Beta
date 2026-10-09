package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f37455a;
    public final Utilities.Callback f37456b;
    public final long f37457c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f37455a = i10;
        this.f37456b = callback;
        this.f37457c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37455a) {
            case 0:
                this.f37456b.run(Long.valueOf(this.f37457c));
                return;
            default:
                this.f37456b.run(Long.valueOf(this.f37457c));
                return;
        }
    }
}
