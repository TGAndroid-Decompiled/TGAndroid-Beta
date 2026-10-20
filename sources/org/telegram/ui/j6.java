package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38173a;
    public final Utilities.Callback f38174b;
    public final long f38175c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38173a = i10;
        this.f38174b = callback;
        this.f38175c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38173a) {
            case 0:
                this.f38174b.run(Long.valueOf(this.f38175c));
                return;
            default:
                this.f38174b.run(Long.valueOf(this.f38175c));
                return;
        }
    }
}
