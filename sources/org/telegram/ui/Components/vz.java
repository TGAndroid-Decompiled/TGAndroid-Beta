package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f32572a;
    public final boolean f32573b;
    public final boolean f32574c;
    public final boolean d;
    public final Object f32575e;

    public vz(Object obj, boolean z4, boolean z10, boolean z11, int i10) {
        this.f32572a = i10;
        this.f32575e = obj;
        this.f32573b = z4;
        this.f32574c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f32572a) {
            case 0:
                xz xzVar = (xz) this.f32575e;
                if (this.f32573b) {
                    b00 b00Var = xzVar.G;
                    b00Var.f25397a = true;
                    b00Var.f25400b = true;
                }
                if (this.f32574c) {
                    xzVar.f33260x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.X - currentTimeMillis) > 30) {
                    xzVar.X = currentTimeMillis;
                    xzVar.f33251a0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.og0) this.f32575e).w1(this.f32573b, this.f32574c, this.d);
                return;
        }
    }
}
