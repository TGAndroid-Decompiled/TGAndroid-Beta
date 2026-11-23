package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ha0 extends org.telegram.ui.Cells.j9 {
    public final na0 f35706w0;

    public ha0(na0 na0Var) {
        this.f35706w0 = na0Var;
        this.f32269g0 = na0Var.f37742d0.G;
    }

    @Override
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.rm rmVar;
        org.telegram.messenger.fj fjVar2;
        na0 na0Var = this.f35706w0;
        ha0 ha0Var = na0Var.f37743e;
        int i11 = ha0Var.v - ha0Var.f32289u;
        ta0 ta0Var = na0Var.f37742d0;
        if (i11 > org.telegram.messenger.mp.u1(ta0Var.f39890x).f25844r4) {
            na0Var.g();
            return;
        }
        org.telegram.messenger.jj jjVar = ta0Var.d;
        jjVar.f24977e = ha0Var.f32289u;
        jjVar.f24978f = ha0Var.v;
        org.telegram.messenger.fj c10 = na0Var.c(fjVar);
        if (c10 != null && ((rmVar = ta0Var.d.d) == null || rmVar.f51756m || (fjVar2 = rmVar.f51746a) == null || fjVar2.e1() != c10.e1())) {
            ta0Var.d.d = org.telegram.ui.rm.b(i7, i10, c10);
        }
        ta0Var.b();
        ta0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        na0 na0Var = this.f35706w0;
        if (na0Var.f37736a == 0 && (c10 = na0Var.c(null)) != null && (message = c10.f24073k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.jj jjVar = na0Var.f37742d0.d;
        if (jjVar != null && jjVar.f24990s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.fj c10;
        TLRPC.Message message;
        na0 na0Var = this.f35706w0;
        int i7 = na0Var.f37736a;
        if (i7 == 0 && !na0Var.f37742d0.d.f24980i) {
            if (i7 != 0 || (c10 = na0Var.c(null)) == null || (message = c10.f24073k) == null || message.rich_message == null || org.telegram.messenger.iv.c(na0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 q() {
        return this.f32269g0;
    }

    @Override
    public final void w() {
        super.w();
        di.b1 b1Var = this.f35706w0.f37744f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.fj fjVar) {
        na0 na0Var = this.f35706w0;
        if (na0Var.f37736a == 0 && !na0Var.f37742d0.d.f24980i && x()) {
            return true;
        }
        return false;
    }
}
