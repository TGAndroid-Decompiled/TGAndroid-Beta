package org.telegram.ui.Components;
public final class oz implements Runnable {
    public final int f31512a;
    public final boolean f31513b;
    public final boolean f31514c;
    public final boolean d;
    public final Object f31515e;

    public oz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f31512a = i10;
        this.f31515e = obj;
        this.f31513b = z10;
        this.f31514c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f31512a) {
            case 0:
                qz qzVar = (qz) this.f31515e;
                if (this.f31513b) {
                    uz uzVar = qzVar.F;
                    uzVar.f33340a = true;
                    uzVar.f33343b = true;
                }
                if (this.f31514c) {
                    qzVar.f32147x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(qzVar.W - currentTimeMillis) > 30) {
                    qzVar.W = currentTimeMillis;
                    qzVar.Z.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.fg0) this.f31515e).w1(this.f31513b, this.f31514c, this.d);
                return;
        }
    }
}
