package org.telegram.ui.Components;
public final class py implements Runnable {
    public final int f37096a;
    public final boolean f37097b;
    public final boolean f37098c;
    public final boolean d;
    public final Object f37099e;

    public py(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.f37096a = i7;
        this.f37099e = obj;
        this.f37097b = z9;
        this.f37098c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.u uVar;
        p71 p71Var;
        switch (this.f37096a) {
            case 0:
                ry ryVar = (ry) this.f37099e;
                boolean z9 = this.f37097b;
                boolean z10 = this.f37098c;
                boolean z11 = this.d;
                if (z9) {
                    vy vyVar = ryVar.J;
                    vyVar.f39726a = true;
                    vyVar.f39729b = true;
                }
                if (z10) {
                    ryVar.f37789y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(ryVar.f37776a0 - currentTimeMillis) > 30) {
                    ryVar.f37776a0 = currentTimeMillis;
                    ryVar.f37781d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ce0) this.f37099e).O1(this.f37097b, this.f37098c, this.d);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f37099e;
                boolean z12 = this.f37097b;
                boolean z13 = this.f37098c;
                boolean z14 = this.d;
                if (!h0Var.f52815u && (uVar = h0Var.J) != null && (p71Var = uVar.h) != null && p71Var.f36807w && !p71Var.f36808x) {
                    p71Var.k(z12, z13, z14);
                    return;
                }
                return;
        }
    }
}
