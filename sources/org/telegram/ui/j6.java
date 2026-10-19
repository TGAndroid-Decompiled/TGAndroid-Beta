package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38167a;
    public final Utilities.Callback f38168b;
    public final long f38169c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38167a = i10;
        this.f38168b = callback;
        this.f38169c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38167a) {
            case 0:
                this.f38168b.run(Long.valueOf(this.f38169c));
                return;
            default:
                this.f38168b.run(Long.valueOf(this.f38169c));
                return;
        }
    }
}
