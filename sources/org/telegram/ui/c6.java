package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class c6 implements Runnable {
    public final int f32636a;
    public final Utilities.Callback f32637b;
    public final long f32638c;

    public c6(long j3, int i10, Utilities.Callback callback) {
        this.f32636a = i10;
        this.f32637b = callback;
        this.f32638c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32636a) {
            case 0:
                this.f32637b.run(Long.valueOf(this.f32638c));
                return;
            default:
                this.f32637b.run(Long.valueOf(this.f32638c));
                return;
        }
    }
}
