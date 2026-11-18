package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ia0 extends org.telegram.ui.Cells.j9 {
    public final oa0 f36093w0;

    public ia0(oa0 oa0Var) {
        this.f36093w0 = oa0Var;
        this.f32191g0 = oa0Var.f38045d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.fj fjVar2;
        oa0 oa0Var = this.f36093w0;
        ia0 ia0Var = oa0Var.f38046e;
        int i11 = ia0Var.v - ia0Var.f32211u;
        ua0 ua0Var = oa0Var.f38045d0;
        if (i11 > org.telegram.messenger.mp.u1(ua0Var.f40286x).f25751r4) {
            oa0Var.g();
            return;
        }
        org.telegram.messenger.jj jjVar = ua0Var.d;
        jjVar.f24870e = ia0Var.f32211u;
        jjVar.f24871f = ia0Var.v;
        org.telegram.messenger.fj c10 = oa0Var.c(fjVar);
        if (c10 != null && ((rmVar = ua0Var.d.d) == null || rmVar.f51661m || (fjVar2 = rmVar.f51651a) == null || fjVar2.e1() != c10.e1())) {
            ua0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        ua0Var.b();
        ua0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        oa0 oa0Var = this.f36093w0;
        if (oa0Var.f38039a == 0 && (c10 = oa0Var.c(null)) != null && (message = c10.f23968k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.jj jjVar = oa0Var.f38045d0.d;
        if (jjVar != null && jjVar.f24883s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        oa0 oa0Var = this.f36093w0;
        int i7 = oa0Var.f38039a;
        if (i7 == 0 && !oa0Var.f38045d0.d.f24873i) {
            if (i7 != 0 || (c10 = oa0Var.c(null)) == null || (message = c10.f23968k) == null || message.rich_message == null || org.telegram.messenger.iv.c(oa0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 q() {
        return this.f32191g0;
    }

    @Override
    public final void w() {
        super.w();
        di.b1 b1Var = this.f36093w0.f38047f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.fj fjVar) {
        oa0 oa0Var = this.f36093w0;
        if (oa0Var.f38039a == 0 && !oa0Var.f38045d0.d.f24873i && x()) {
            return true;
        }
        return false;
    }
}
