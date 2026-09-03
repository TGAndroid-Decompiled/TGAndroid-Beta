package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f29052a;
    public final boolean f29053b;
    public final boolean f29054c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z4, boolean z10, boolean z11, int i10) {
        this.f29052a = i10;
        this.e = obj;
        this.f29053b = z4;
        this.f29054c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29052a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f29053b) {
                    a00 a00Var = vzVar.G;
                    a00Var.f23203a = true;
                    a00Var.f23206b = true;
                }
                if (this.f29054c) {
                    vzVar.f30082x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.X - currentTimeMillis) > 30) {
                    vzVar.X = currentTimeMillis;
                    vzVar.f30074a0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.pg0) this.e).w1(this.f29053b, this.f29054c, this.d);
                return;
        }
    }
}
