package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f35026a;
    public final Utilities.Callback f35027b;
    public final long f35028c;

    public i6(long j10, int i10, Utilities.Callback callback) {
        this.f35026a = i10;
        this.f35027b = callback;
        this.f35028c = j10;
    }

    @Override
    public final void run() {
        switch (this.f35026a) {
            case 0:
                this.f35027b.run(Long.valueOf(this.f35028c));
                return;
            default:
                this.f35027b.run(Long.valueOf(this.f35028c));
                return;
        }
    }
}
