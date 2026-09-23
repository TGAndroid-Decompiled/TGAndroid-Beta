package org.telegram.ui.Components;
public final class uz implements Runnable {
    public final int f28599a;
    public final boolean f28600b;
    public final boolean f28601c;
    public final boolean d;
    public final Object e;

    public uz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28599a = i10;
        this.e = obj;
        this.f28600b = z10;
        this.f28601c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28599a) {
            case 0:
                wz wzVar = (wz) this.e;
                if (this.f28600b) {
                    a00 a00Var = wzVar.J;
                    a00Var.f22220a = true;
                    a00Var.f22223b = true;
                }
                if (this.f28601c) {
                    wzVar.f29846x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(wzVar.f29835a0 - currentTimeMillis) > 30) {
                    wzVar.f29835a0 = currentTimeMillis;
                    wzVar.f29840d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.rg0) this.e).w1(this.f28600b, this.f28601c, this.d);
                return;
        }
    }
}
