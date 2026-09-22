package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28568a;
    public final boolean f28569b;
    public final boolean f28570c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28568a = i10;
        this.e = obj;
        this.f28569b = z10;
        this.f28570c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28568a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28569b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30980a = true;
                    zzVar.f30983b = true;
                }
                if (this.f28570c) {
                    vzVar.f29846x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29835a0 - currentTimeMillis) > 30) {
                    vzVar.f29835a0 = currentTimeMillis;
                    vzVar.f29840d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.yg0) this.e).w1(this.f28569b, this.f28570c, this.d);
                return;
        }
    }
}
