package org.telegram.ui.Components;
public final class py implements Runnable {
    public final int f37203a;
    public final boolean f37204b;
    public final boolean f37205c;
    public final boolean d;
    public final Object f37206e;

    public py(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.f37203a = i7;
        this.f37206e = obj;
        this.f37204b = z9;
        this.f37205c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.u uVar;
        j71 j71Var;
        switch (this.f37203a) {
            case 0:
                ry ryVar = (ry) this.f37206e;
                boolean z9 = this.f37204b;
                boolean z10 = this.f37205c;
                boolean z11 = this.d;
                if (z9) {
                    vy vyVar = ryVar.J;
                    vyVar.f39710a = true;
                    vyVar.f39713b = true;
                }
                if (z10) {
                    ryVar.f37886y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(ryVar.f37873a0 - currentTimeMillis) > 30) {
                    ryVar.f37873a0 = currentTimeMillis;
                    ryVar.f37878d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ce0) this.f37206e).O1(this.f37204b, this.f37205c, this.d);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f37206e;
                boolean z12 = this.f37204b;
                boolean z13 = this.f37205c;
                boolean z14 = this.d;
                if (!h0Var.f52791u && (uVar = h0Var.J) != null && (j71Var = uVar.h) != null && j71Var.f34919w && !j71Var.f34920x) {
                    j71Var.k(z12, z13, z14);
                    return;
                }
                return;
        }
    }
}
