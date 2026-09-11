package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f30744a;
    public final boolean f30745b;
    public final boolean f30746c;
    public final boolean d;
    public final Object f30747e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30744a = i10;
        this.f30747e = obj;
        this.f30745b = z10;
        this.f30746c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f30744a) {
            case 0:
                vz vzVar = (vz) this.f30747e;
                if (this.f30745b) {
                    zz zzVar = vzVar.J;
                    zzVar.f33277a = true;
                    zzVar.f33280b = true;
                }
                if (this.f30746c) {
                    vzVar.f32036x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f32024a0 - currentTimeMillis) > 30) {
                    vzVar.f32024a0 = currentTimeMillis;
                    vzVar.f32029d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.f30747e).w1(this.f30745b, this.f30746c, this.d);
                return;
        }
    }
}
