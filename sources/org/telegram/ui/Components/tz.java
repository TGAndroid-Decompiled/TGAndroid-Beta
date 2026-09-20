package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28481a;
    public final boolean f28482b;
    public final boolean f28483c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28481a = i10;
        this.e = obj;
        this.f28482b = z10;
        this.f28483c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28481a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28482b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30959a = true;
                    zzVar.f30962b = true;
                }
                if (this.f28483c) {
                    vzVar.f29872x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29861a0 - currentTimeMillis) > 30) {
                    vzVar.f29861a0 = currentTimeMillis;
                    vzVar.f29866d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.yg0) this.e).w1(this.f28482b, this.f28483c, this.d);
                return;
        }
    }
}
