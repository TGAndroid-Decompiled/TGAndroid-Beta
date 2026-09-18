package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class c6 implements Runnable {
    public final int f32549a;
    public final Utilities.Callback f32550b;
    public final long f32551c;

    public c6(long j3, int i10, Utilities.Callback callback) {
        this.f32549a = i10;
        this.f32550b = callback;
        this.f32551c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32549a) {
            case 0:
                this.f32550b.run(Long.valueOf(this.f32551c));
                return;
            default:
                this.f32550b.run(Long.valueOf(this.f32551c));
                return;
        }
    }
}
