package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class w90 extends org.telegram.ui.Cells.j9 {
    public final ca0 f39934w0;

    public w90(ca0 ca0Var) {
        this.f39934w0 = ca0Var;
        this.f30675g0 = ca0Var.f32524c0.F;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.sm smVar;
        org.telegram.messenger.ij ijVar2;
        ca0 ca0Var = this.f39934w0;
        w90 w90Var = ca0Var.f32525e;
        int i11 = w90Var.v - w90Var.f30695u;
        ia0 ia0Var = ca0Var.f32524c0;
        if (i11 > org.telegram.messenger.qp.s1(ia0Var.f34588x).o4) {
            ca0Var.g();
            return;
        }
        org.telegram.messenger.mj mjVar = ia0Var.d;
        mjVar.f24037e = w90Var.f30695u;
        mjVar.f24038f = w90Var.v;
        org.telegram.messenger.ij c10 = ca0Var.c(ijVar);
        if (c10 != null && ((smVar = ia0Var.d.d) == null || smVar.f49889m || (ijVar2 = smVar.f49879a) == null || ijVar2.e1() != c10.e1())) {
            ia0Var.d.d = org.telegram.ui.sm.b(i7, i10, c10);
        }
        ia0Var.b();
        ia0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        ca0 ca0Var = this.f39934w0;
        if (ca0Var.f32519a == 0 && (c10 = ca0Var.c(null)) != null && (message = c10.f23266k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.mj mjVar = ca0Var.f32524c0.d;
        if (mjVar != null && mjVar.f24050s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.ij c10;
        TLRPC.Message message;
        ca0 ca0Var = this.f39934w0;
        int i7 = ca0Var.f32519a;
        if (i7 == 0 && !ca0Var.f32524c0.d.f24040i) {
            if (i7 != 0 || (c10 = ca0Var.c(null)) == null || (message = c10.f23266k) == null || message.rich_message == null || org.telegram.messenger.ov.c(ca0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 q() {
        return this.f30675g0;
    }

    @Override
    public final void w() {
        super.w();
        bi.q1 q1Var = this.f39934w0.f32526f;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.ij ijVar) {
        ca0 ca0Var = this.f39934w0;
        if (ca0Var.f32519a == 0 && !ca0Var.f32524c0.d.f24040i && x()) {
            return true;
        }
        return false;
    }
}
