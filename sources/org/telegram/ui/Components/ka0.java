package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ka0 extends org.telegram.ui.Cells.k9 {
    public final qa0 f36839w0;

    public ka0(qa0 qa0Var) {
        this.f36839w0 = qa0Var;
        this.f32246g0 = qa0Var.f38811d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.gj gjVar2;
        qa0 qa0Var = this.f36839w0;
        ka0 ka0Var = qa0Var.f38812e;
        int i11 = ka0Var.v - ka0Var.f32266u;
        wa0 wa0Var = qa0Var.f38811d0;
        if (i11 > org.telegram.messenger.np.u1(wa0Var.f41719x).f25912r4) {
            qa0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = wa0Var.d;
        kjVar.f25046e = ka0Var.f32266u;
        kjVar.f25047f = ka0Var.v;
        org.telegram.messenger.gj c10 = qa0Var.c(gjVar);
        if (c10 != null && ((rmVar = wa0Var.d.d) == null || rmVar.f51661m || (gjVar2 = rmVar.f51651a) == null || gjVar2.e1() != c10.e1())) {
            wa0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        wa0Var.b();
        wa0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.f36839w0;
        if (qa0Var.f38805a == 0 && (c10 = qa0Var.c(null)) != null && (message = c10.f24177k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = qa0Var.f38811d0.d;
        if (kjVar != null && kjVar.f25059s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.f36839w0;
        int i7 = qa0Var.f38805a;
        if (i7 == 0 && !qa0Var.f38811d0.d.f25049i) {
            if (i7 != 0 || (c10 = qa0Var.c(null)) == null || (message = c10.f24177k) == null || message.rich_message == null || org.telegram.messenger.jv.c(qa0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        return this.f32246g0;
    }

    @Override
    public final void w() {
        super.w();
        di.b1 b1Var = this.f36839w0.f38813f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.gj gjVar) {
        qa0 qa0Var = this.f36839w0;
        if (qa0Var.f38805a == 0 && !qa0Var.f38811d0.d.f25049i && x()) {
            return true;
        }
        return false;
    }
}
