package org.telegram.ui.Components;
public final class f00 implements Runnable {
    public final int f24534a;
    public final boolean f24535b;
    public final boolean f24536c;
    public final boolean d;
    public final Object e;

    public f00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24534a = i10;
        this.e = obj;
        this.f24535b = z10;
        this.f24536c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f24534a) {
            case 0:
                h00 h00Var = (h00) this.e;
                if (this.f24535b) {
                    l00 l00Var = h00Var.J;
                    l00Var.f26516a = true;
                    l00Var.f26519b = true;
                }
                if (this.f24536c) {
                    h00Var.f25145x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(h00Var.f25134a0 - currentTimeMillis) > 30) {
                    h00Var.f25134a0 = currentTimeMillis;
                    h00Var.f25139d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ah0) this.e).w1(this.f24535b, this.f24536c, this.d);
                return;
        }
    }
}
