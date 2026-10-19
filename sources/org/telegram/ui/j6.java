package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38165a;
    public final Utilities.Callback f38166b;
    public final long f38167c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38165a = i10;
        this.f38166b = callback;
        this.f38167c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38165a) {
            case 0:
                this.f38166b.run(Long.valueOf(this.f38167c));
                return;
            default:
                this.f38166b.run(Long.valueOf(this.f38167c));
                return;
        }
    }
}
