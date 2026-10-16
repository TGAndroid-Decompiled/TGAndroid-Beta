package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f36931a;
    public final Utilities.Callback f36932b;
    public final long f36933c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f36931a = i10;
        this.f36932b = callback;
        this.f36933c = j10;
    }

    @Override
    public final void run() {
        switch (this.f36931a) {
            case 0:
                this.f36932b.run(Long.valueOf(this.f36933c));
                return;
            default:
                this.f36932b.run(Long.valueOf(this.f36933c));
                return;
        }
    }
}
