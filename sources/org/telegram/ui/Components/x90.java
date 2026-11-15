package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x90 extends org.telegram.ui.Cells.i9 {
    public final da0 f41634w0;

    public x90(da0 da0Var) {
        this.f41634w0 = da0Var;
        this.f31747g0 = da0Var.f33900d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.qm qmVar;
        org.telegram.messenger.gj gjVar2;
        da0 da0Var = this.f41634w0;
        x90 x90Var = da0Var.f33901e;
        int i11 = x90Var.v - x90Var.f31767u;
        ja0 ja0Var = da0Var.f33900d0;
        if (i11 > org.telegram.messenger.np.s1(ja0Var.f35957x).f25361p4) {
            da0Var.g();
            return;
        }
        org.telegram.messenger.kj kjVar = ja0Var.d;
        kjVar.f24706e = x90Var.f31767u;
        kjVar.f24707f = x90Var.v;
        org.telegram.messenger.gj c10 = da0Var.c(gjVar);
        if (c10 != null && ((qmVar = ja0Var.d.d) == null || qmVar.f50653m || (gjVar2 = qmVar.f50643a) == null || gjVar2.e1() != c10.e1())) {
            ja0Var.d.d = org.telegram.ui.qm.b(i7, i10, c10);
        }
        ja0Var.b();
        ja0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        da0 da0Var = this.f41634w0;
        if (da0Var.f33894a == 0 && (c10 = da0Var.c(null)) != null && (message = c10.f23817k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.kj kjVar = da0Var.f33900d0.d;
        if (kjVar != null && kjVar.f24719s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.gj c10;
        TLRPC.Message message;
        da0 da0Var = this.f41634w0;
        int i7 = da0Var.f33894a;
        if (i7 == 0 && !da0Var.f33900d0.d.f24709i) {
            if (i7 != 0 || (c10 = da0Var.c(null)) == null || (message = c10.f23817k) == null || message.rich_message == null || org.telegram.messenger.mv.c(da0Var.c(null))) {
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
        di.c1 c1Var = this.f41634w0.f33902f;
        if (c1Var != null) {
            c1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.gj gjVar) {
        da0 da0Var = this.f41634w0;
        if (da0Var.f33894a == 0 && !da0Var.f33900d0.d.f24709i && x()) {
            return true;
        }
        return false;
    }
}
