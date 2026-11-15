package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y90 extends org.telegram.ui.Cells.i9 {
    public final ea0 f41961w0;

    public y90(ea0 ea0Var) {
        this.f41961w0 = ea0Var;
        this.f31747g0 = ea0Var.f34260d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.qm qmVar;
        org.telegram.messenger.gj gjVar2;
        ea0 ea0Var = this.f41961w0;
        y90 y90Var = ea0Var.f34261e;
        int i11 = y90Var.v - y90Var.f31767u;
        ka0 ka0Var = ea0Var.f34260d0;
        if (i11 > org.telegram.messenger.np.s1(ka0Var.f36344x).f25364p4) {
            ea0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = ka0Var.d;
        kjVar.f24709e = y90Var.f31767u;
        kjVar.f24710f = y90Var.v;
        org.telegram.messenger.gj c10 = ea0Var.c(gjVar);
        if (c10 != null && ((qmVar = ka0Var.d.d) == null || qmVar.f50657m || (gjVar2 = qmVar.f50647a) == null || gjVar2.e1() != c10.e1())) {
            ka0Var.d.d = org.telegram.ui.qm.b(i7, i10, c10);
        }
        ka0Var.b();
        ka0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        ea0 ea0Var = this.f41961w0;
        if (ea0Var.f34254a == 0 && (c10 = ea0Var.c(null)) != null && (message = c10.f23819k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = ea0Var.f34260d0.d;
        if (kjVar != null && kjVar.f24722s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        ea0 ea0Var = this.f41961w0;
        int i7 = ea0Var.f34254a;
        if (i7 == 0 && !ea0Var.f34260d0.d.f24712i) {
            if (i7 != 0 || (c10 = ea0Var.c(null)) == null || (message = c10.f23819k) == null || message.rich_message == null || org.telegram.messenger.mv.c(ea0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 q() {
        return this.f31747g0;
    }

    @Override
    public final void w() {
        super.w();
        di.c1 c1Var = this.f41961w0.f34262f;
        if (c1Var != null) {
            c1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.gj gjVar) {
        ea0 ea0Var = this.f41961w0;
        if (ea0Var.f34254a == 0 && !ea0Var.f34260d0.d.f24712i && x()) {
            return true;
        }
        return false;
    }
}
