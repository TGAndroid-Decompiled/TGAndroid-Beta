package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28221a;
    public final boolean f28222b;
    public final boolean f28223c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28221a = i10;
        this.e = obj;
        this.f28222b = z10;
        this.f28223c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28221a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28222b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30690a = true;
                    zzVar.f30693b = true;
                }
                if (this.f28223c) {
                    vzVar.f29443x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29432a0 - currentTimeMillis) > 30) {
                    vzVar.f29432a0 = currentTimeMillis;
                    vzVar.f29437d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.yg0) this.e).w1(this.f28222b, this.f28223c, this.d);
                return;
        }
    }
}
