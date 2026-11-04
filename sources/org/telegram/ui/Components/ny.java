package org.telegram.ui.Components;
public final class ny implements Runnable {
    public final int f36647a;
    public final boolean f36648b;
    public final boolean f36649c;
    public final boolean d;
    public final Object f36650e;

    public ny(Object obj, boolean z10, boolean z11, boolean z12, int i3) {
        this.f36647a = i3;
        this.f36650e = obj;
        this.f36648b = z10;
        this.f36649c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.u uVar;
        h71 h71Var;
        switch (this.f36647a) {
            case 0:
                py pyVar = (py) this.f36650e;
                boolean z10 = this.f36648b;
                boolean z11 = this.f36649c;
                boolean z12 = this.d;
                if (z10) {
                    sy syVar = pyVar.K;
                    syVar.f38136a = true;
                    syVar.f38139b = true;
                }
                if (z11) {
                    pyVar.f37283y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(pyVar.f37271b0 - currentTimeMillis) > 30) {
                    pyVar.f37271b0 = currentTimeMillis;
                    pyVar.f37276e0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.xd0) this.f36650e).F1(this.f36648b, this.f36649c, this.d);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f36650e;
                boolean z13 = this.f36648b;
                boolean z14 = this.f36649c;
                boolean z15 = this.d;
                if (!h0Var.f52882u && (uVar = h0Var.J) != null && (h71Var = uVar.h) != null && h71Var.f34337w && !h71Var.f34338x) {
                    h71Var.k(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
