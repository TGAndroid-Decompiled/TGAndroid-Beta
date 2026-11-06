package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class w90 extends org.telegram.ui.Cells.j9 {
    public final ca0 f39944w0;

    public w90(ca0 ca0Var) {
        this.f39944w0 = ca0Var;
        this.f30655g0 = ca0Var.f32507c0.F;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.qm qmVar;
        org.telegram.messenger.ij ijVar2;
        ca0 ca0Var = this.f39944w0;
        w90 w90Var = ca0Var.f32508e;
        int i11 = w90Var.v - w90Var.f30675u;
        ia0 ia0Var = ca0Var.f32507c0;
        if (i11 > org.telegram.messenger.qp.s1(ia0Var.f34547x).o4) {
            ca0Var.g();
            return;
        }
        org.telegram.messenger.mj mjVar = ia0Var.d;
        mjVar.f24021e = w90Var.f30675u;
        mjVar.f24022f = w90Var.v;
        org.telegram.messenger.ij c10 = ca0Var.c(ijVar);
        if (c10 != null && ((qmVar = ia0Var.d.d) == null || qmVar.f49273m || (ijVar2 = qmVar.f49263a) == null || ijVar2.f1() != c10.f1())) {
            ia0Var.d.d = org.telegram.ui.qm.b(i7, i10, c10);
        }
        ia0Var.b();
        ia0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        ca0 ca0Var = this.f39944w0;
        if (ca0Var.f32502a == 0 && (c10 = ca0Var.c(null)) != null && (message = c10.f23237k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.mj mjVar = ca0Var.f32507c0.d;
        if (mjVar != null && mjVar.f24034s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        ca0 ca0Var = this.f39944w0;
        int i7 = ca0Var.f32502a;
        if (i7 == 0 && !ca0Var.f32507c0.d.f24024i) {
            if (i7 != 0 || (c10 = ca0Var.c(null)) == null || (message = c10.f23237k) == null || message.rich_message == null || org.telegram.messenger.ov.c(ca0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 q() {
        return this.f30655g0;
    }

    @Override
    public final void w() {
        super.w();
        bi.q1 q1Var = this.f39944w0.f32509f;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.ij ijVar) {
        ca0 ca0Var = this.f39944w0;
        if (ca0Var.f32502a == 0 && !ca0Var.f32507c0.d.f24024i && x()) {
            return true;
        }
        return false;
    }
}
