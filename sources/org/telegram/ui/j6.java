package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38174a;
    public final Utilities.Callback f38175b;
    public final long f38176c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38174a = i10;
        this.f38175b = callback;
        this.f38176c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38174a) {
            case 0:
                this.f38175b.run(Long.valueOf(this.f38176c));
                return;
            default:
                this.f38175b.run(Long.valueOf(this.f38176c));
                return;
        }
    }
}
