package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f29073a;
    public final boolean f29074b;
    public final boolean f29075c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z4, boolean z10, boolean z11, int i10) {
        this.f29073a = i10;
        this.e = obj;
        this.f29074b = z4;
        this.f29075c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29073a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f29074b) {
                    zz zzVar = vzVar.G;
                    zzVar.f31479a = true;
                    zzVar.f31482b = true;
                }
                if (this.f29075c) {
                    vzVar.f30118x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.X - currentTimeMillis) > 30) {
                    vzVar.X = currentTimeMillis;
                    vzVar.f30110a0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ng0) this.e).w1(this.f29074b, this.f29075c, this.d);
                return;
        }
    }
}
