package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f30745a;
    public final boolean f30746b;
    public final boolean f30747c;
    public final boolean d;
    public final Object f30748e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30745a = i10;
        this.f30748e = obj;
        this.f30746b = z10;
        this.f30747c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f30745a) {
            case 0:
                vz vzVar = (vz) this.f30748e;
                if (this.f30746b) {
                    zz zzVar = vzVar.J;
                    zzVar.f33278a = true;
                    zzVar.f33281b = true;
                }
                if (this.f30747c) {
                    vzVar.f32037x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f32025a0 - currentTimeMillis) > 30) {
                    vzVar.f32025a0 = currentTimeMillis;
                    vzVar.f32030d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.f30748e).w1(this.f30746b, this.f30747c, this.d);
                return;
        }
    }
}
