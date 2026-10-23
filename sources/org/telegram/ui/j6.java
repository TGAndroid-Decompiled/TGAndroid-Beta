package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38178a;
    public final Utilities.Callback f38179b;
    public final long f38180c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38178a = i10;
        this.f38179b = callback;
        this.f38180c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38178a) {
            case 0:
                this.f38179b.run(Long.valueOf(this.f38180c));
                return;
            default:
                this.f38179b.run(Long.valueOf(this.f38180c));
                return;
        }
    }
}
