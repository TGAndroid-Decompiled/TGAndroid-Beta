package org.telegram.ui.Wallet;

import org.telegram.ui.mt;
public final class c1 implements Runnable {
    public final int f32726a;
    public final mt f32727b;
    public final String f32728c;

    public c1(mt mtVar, String str, int i10) {
        this.f32726a = i10;
        this.f32727b = mtVar;
        this.f32728c = str;
    }

    @Override
    public final void run() {
        switch (this.f32726a) {
            case 0:
                this.f32727b.run(this.f32728c);
                return;
            default:
                this.f32727b.run(this.f32728c);
                return;
        }
    }
}
