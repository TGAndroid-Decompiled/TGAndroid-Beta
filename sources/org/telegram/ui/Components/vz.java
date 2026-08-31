package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f32574a;
    public final boolean f32575b;
    public final boolean f32576c;
    public final boolean d;
    public final Object f32577e;

    public vz(Object obj, boolean z4, boolean z10, boolean z11, int i10) {
        this.f32574a = i10;
        this.f32577e = obj;
        this.f32575b = z4;
        this.f32576c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f32574a) {
            case 0:
                xz xzVar = (xz) this.f32577e;
                if (this.f32575b) {
                    b00 b00Var = xzVar.G;
                    b00Var.f25381a = true;
                    b00Var.f25384b = true;
                }
                if (this.f32576c) {
                    xzVar.f33222x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.X - currentTimeMillis) > 30) {
                    xzVar.X = currentTimeMillis;
                    xzVar.f33213a0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.og0) this.f32577e).w1(this.f32575b, this.f32576c, this.d);
                return;
        }
    }
}
