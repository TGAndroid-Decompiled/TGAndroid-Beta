package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ka0 extends org.telegram.ui.Cells.k9 {
    public final qa0 f36874w0;

    public ka0(qa0 qa0Var) {
        this.f36874w0 = qa0Var;
        this.f32280g0 = qa0Var.f38858d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.gj gjVar2;
        qa0 qa0Var = this.f36874w0;
        ka0 ka0Var = qa0Var.f38859e;
        int i11 = ka0Var.v - ka0Var.f32300u;
        wa0 wa0Var = qa0Var.f38858d0;
        if (i11 > org.telegram.messenger.np.u1(wa0Var.f41746x).f25948r4) {
            qa0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = wa0Var.d;
        kjVar.f25082e = ka0Var.f32300u;
        kjVar.f25083f = ka0Var.v;
        org.telegram.messenger.gj c10 = qa0Var.c(gjVar);
        if (c10 != null && ((rmVar = wa0Var.d.d) == null || rmVar.f51629m || (gjVar2 = rmVar.f51619a) == null || gjVar2.e1() != c10.e1())) {
            wa0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        wa0Var.b();
        wa0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.f36874w0;
        if (qa0Var.f38852a == 0 && (c10 = qa0Var.c(null)) != null && (message = c10.f24213k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = qa0Var.f38858d0.d;
        if (kjVar != null && kjVar.f25095s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.f36874w0;
        int i7 = qa0Var.f38852a;
        if (i7 == 0 && !qa0Var.f38858d0.d.f25085i) {
            if (i7 != 0 || (c10 = qa0Var.c(null)) == null || (message = c10.f24213k) == null || message.rich_message == null || org.telegram.messenger.jv.c(qa0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        return this.f32280g0;
    }

    @Override
    public final void w() {
        super.w();
        di.b1 b1Var = this.f36874w0.f38860f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.gj gjVar) {
        qa0 qa0Var = this.f36874w0;
        if (qa0Var.f38852a == 0 && !qa0Var.f38858d0.d.f25085i && x()) {
            return true;
        }
        return false;
    }
}
