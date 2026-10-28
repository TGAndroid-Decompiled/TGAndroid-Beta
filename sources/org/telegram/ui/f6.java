package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f39178a;
    public final Utilities.Callback f39179b;
    public final long f39180c;

    public f6(long j10, int i10, Utilities.Callback callback) {
        this.f39178a = i10;
        this.f39179b = callback;
        this.f39180c = j10;
    }

    @Override
    public final void run() {
        switch (this.f39178a) {
            case 0:
                this.f39179b.run(Long.valueOf(this.f39180c));
                return;
            default:
                this.f39179b.run(Long.valueOf(this.f39180c));
                return;
        }
    }
}
