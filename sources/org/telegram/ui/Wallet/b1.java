package org.telegram.ui.Wallet;

import org.telegram.ui.mt;
public final class b1 implements Runnable {
    public final int f32950a;
    public final mt f32951b;
    public final String f32952c;

    public b1(mt mtVar, String str, int i10) {
        this.f32950a = i10;
        this.f32951b = mtVar;
        this.f32952c = str;
    }

    @Override
    public final void run() {
        switch (this.f32950a) {
            case 0:
                this.f32951b.run(this.f32952c);
                return;
            default:
                this.f32951b.run(this.f32952c);
                return;
        }
    }
}
