package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f30771a;
    public final boolean f30772b;
    public final boolean f30773c;
    public final boolean d;
    public final Object f30774e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30771a = i10;
        this.f30774e = obj;
        this.f30772b = z10;
        this.f30773c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f30771a) {
            case 0:
                vz vzVar = (vz) this.f30774e;
                if (this.f30772b) {
                    zz zzVar = vzVar.J;
                    zzVar.f33304a = true;
                    zzVar.f33307b = true;
                }
                if (this.f30773c) {
                    vzVar.f32063x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f32051a0 - currentTimeMillis) > 30) {
                    vzVar.f32051a0 = currentTimeMillis;
                    vzVar.f32056d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.f30774e).w1(this.f30772b, this.f30773c, this.d);
                return;
        }
    }
}
