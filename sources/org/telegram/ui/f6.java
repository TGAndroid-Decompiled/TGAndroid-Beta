package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class f6 implements Runnable {

    public final int f37945a;

    public final Utilities.Callback f37946b;

    public final long f37947c;

    public f6(long j10, int i10, Utilities.Callback callback) {
        this.f37945a = i10;
        this.f37946b = callback;
        this.f37947c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37945a) {
            case 0:
                this.f37946b.run(Long.valueOf(this.f37947c));
                break;
            default:
                this.f37946b.run(Long.valueOf(this.f37947c));
                break;
        }
    }
}
