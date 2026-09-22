package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class c6 implements Runnable {
    public final int f32656a;
    public final Utilities.Callback f32657b;
    public final long f32658c;

    public c6(long j3, int i10, Utilities.Callback callback) {
        this.f32656a = i10;
        this.f32657b = callback;
        this.f32658c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32656a) {
            case 0:
                this.f32657b.run(Long.valueOf(this.f32658c));
                return;
            default:
                this.f32657b.run(Long.valueOf(this.f32658c));
                return;
        }
    }
}
