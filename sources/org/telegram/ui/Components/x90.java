package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x90 extends org.telegram.ui.Cells.j9 {
    public final da0 f40349w0;

    public x90(da0 da0Var) {
        this.f40349w0 = da0Var;
        this.f30664g0 = da0Var.f32920c0.F;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.sm smVar;
        org.telegram.messenger.ij ijVar2;
        da0 da0Var = this.f40349w0;
        x90 x90Var = da0Var.f32921e;
        int i11 = x90Var.v - x90Var.f30684u;
        ja0 ja0Var = da0Var.f32920c0;
        if (i11 > org.telegram.messenger.qp.s1(ja0Var.f34979x).o4) {
            da0Var.g();
            return;
        }
        org.telegram.messenger.mj mjVar = ja0Var.d;
        mjVar.f24033e = x90Var.f30684u;
        mjVar.f24034f = x90Var.v;
        org.telegram.messenger.ij c10 = da0Var.c(ijVar);
        if (c10 != null && ((smVar = ja0Var.d.d) == null || smVar.f49953m || (ijVar2 = smVar.f49943a) == null || ijVar2.e1() != c10.e1())) {
            ja0Var.d.d = org.telegram.ui.sm.b(i7, i10, c10);
        }
        ja0Var.b();
        ja0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        da0 da0Var = this.f40349w0;
        if (da0Var.f32915a == 0 && (c10 = da0Var.c(null)) != null && (message = c10.f23262k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.mj mjVar = da0Var.f32920c0.d;
        if (mjVar != null && mjVar.f24046s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        da0 da0Var = this.f40349w0;
        int i7 = da0Var.f32915a;
        if (i7 == 0 && !da0Var.f32920c0.d.f24036i) {
            if (i7 != 0 || (c10 = da0Var.c(null)) == null || (message = c10.f23262k) == null || message.rich_message == null || org.telegram.messenger.ov.c(da0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 q() {
        return this.f30664g0;
    }

    @Override
    public final void w() {
        super.w();
        bi.q1 q1Var = this.f40349w0.f32922f;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.ij ijVar) {
        da0 da0Var = this.f40349w0;
        if (da0Var.f32915a == 0 && !da0Var.f32920c0.d.f24036i && x()) {
            return true;
        }
        return false;
    }
}
