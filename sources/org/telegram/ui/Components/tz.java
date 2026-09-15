package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28218a;
    public final boolean f28219b;
    public final boolean f28220c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28218a = i10;
        this.e = obj;
        this.f28219b = z10;
        this.f28220c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28218a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28219b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30675a = true;
                    zzVar.f30678b = true;
                }
                if (this.f28220c) {
                    vzVar.f29496x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29485a0 - currentTimeMillis) > 30) {
                    vzVar.f29485a0 = currentTimeMillis;
                    vzVar.f29490d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.e).w1(this.f28219b, this.f28220c, this.d);
                return;
        }
    }
}
