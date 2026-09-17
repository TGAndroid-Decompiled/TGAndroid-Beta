package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f30772a;
    public final boolean f30773b;
    public final boolean f30774c;
    public final boolean d;
    public final Object f30775e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30772a = i10;
        this.f30775e = obj;
        this.f30773b = z10;
        this.f30774c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f30772a) {
            case 0:
                vz vzVar = (vz) this.f30775e;
                if (this.f30773b) {
                    zz zzVar = vzVar.J;
                    zzVar.f33305a = true;
                    zzVar.f33308b = true;
                }
                if (this.f30774c) {
                    vzVar.f32064x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f32052a0 - currentTimeMillis) > 30) {
                    vzVar.f32052a0 = currentTimeMillis;
                    vzVar.f32057d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.f30775e).w1(this.f30773b, this.f30774c, this.d);
                return;
        }
    }
}
