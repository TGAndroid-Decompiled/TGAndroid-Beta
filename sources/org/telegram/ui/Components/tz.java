package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28224a;
    public final boolean f28225b;
    public final boolean f28226c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28224a = i10;
        this.e = obj;
        this.f28225b = z10;
        this.f28226c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28224a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28225b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30693a = true;
                    zzVar.f30696b = true;
                }
                if (this.f28226c) {
                    vzVar.f29446x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29435a0 - currentTimeMillis) > 30) {
                    vzVar.f29435a0 = currentTimeMillis;
                    vzVar.f29440d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.yg0) this.e).w1(this.f28225b, this.f28226c, this.d);
                return;
        }
    }
}
