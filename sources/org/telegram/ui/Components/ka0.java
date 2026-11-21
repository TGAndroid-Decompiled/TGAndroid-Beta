package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ka0 extends org.telegram.ui.Cells.k9 {
    public final qa0 f36871w0;

    public ka0(qa0 qa0Var) {
        this.f36871w0 = qa0Var;
        this.f32277g0 = qa0Var.f38864d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.fj fjVar2;
        qa0 qa0Var = this.f36871w0;
        ka0 ka0Var = qa0Var.f38865e;
        int i11 = ka0Var.v - ka0Var.f32297u;
        wa0 wa0Var = qa0Var.f38864d0;
        if (i11 > org.telegram.messenger.mp.u1(wa0Var.f41752x).f25777r4) {
            qa0Var.g();
            return;
        }
        org.telegram.messenger.jj jjVar = wa0Var.d;
        jjVar.f24895e = ka0Var.f32297u;
        jjVar.f24896f = ka0Var.v;
        org.telegram.messenger.fj c10 = qa0Var.c(fjVar);
        if (c10 != null && ((rmVar = wa0Var.d.d) == null || rmVar.f51625m || (fjVar2 = rmVar.f51615a) == null || fjVar2.e1() != c10.e1())) {
            wa0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        wa0Var.b();
        wa0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.f36871w0;
        if (qa0Var.f38858a == 0 && (c10 = qa0Var.c(null)) != null && (message = c10.f23993k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.jj jjVar = qa0Var.f38864d0.d;
        if (jjVar != null && jjVar.f24908s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        qa0 qa0Var = this.f36871w0;
        int i7 = qa0Var.f38858a;
        if (i7 == 0 && !qa0Var.f38864d0.d.f24898i) {
            if (i7 != 0 || (c10 = qa0Var.c(null)) == null || (message = c10.f23993k) == null || message.rich_message == null || org.telegram.messenger.iv.c(qa0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        return this.f32277g0;
    }

    @Override
    public final void w() {
        super.w();
        di.b1 b1Var = this.f36871w0.f38866f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.fj fjVar) {
        qa0 qa0Var = this.f36871w0;
        if (qa0Var.f38858a == 0 && !qa0Var.f38864d0.d.f24898i && x()) {
            return true;
        }
        return false;
    }
}
