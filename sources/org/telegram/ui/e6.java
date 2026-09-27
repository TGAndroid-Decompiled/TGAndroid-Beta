package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f33151a;
    public final Utilities.Callback f33152b;
    public final long f33153c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f33151a = i10;
        this.f33152b = callback;
        this.f33153c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33151a) {
            case 0:
                this.f33152b.run(Long.valueOf(this.f33153c));
                return;
            default:
                this.f33152b.run(Long.valueOf(this.f33153c));
                return;
        }
    }
}
