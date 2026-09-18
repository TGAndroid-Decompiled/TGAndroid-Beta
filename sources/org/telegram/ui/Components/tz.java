package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28514a;
    public final boolean f28515b;
    public final boolean f28516c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28514a = i10;
        this.e = obj;
        this.f28515b = z10;
        this.f28516c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28514a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28515b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30919a = true;
                    zzVar.f30922b = true;
                }
                if (this.f28516c) {
                    vzVar.f29801x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29790a0 - currentTimeMillis) > 30) {
                    vzVar.f29790a0 = currentTimeMillis;
                    vzVar.f29795d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.xg0) this.e).w1(this.f28515b, this.f28516c, this.d);
                return;
        }
    }
}
