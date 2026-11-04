package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r90 extends org.telegram.ui.Cells.i9 {
    public final x90 f37694w0;

    public r90(x90 x90Var) {
        this.f37694w0 = x90Var;
        this.f30671g0 = x90Var.f40291d0.G;
    }

    @Override
    public final void I(int i3, int i10, org.telegram.messenger.zi ziVar) {
        org.telegram.ui.mm mmVar;
        org.telegram.messenger.zi ziVar2;
        x90 x90Var = this.f37694w0;
        r90 r90Var = x90Var.f40292e;
        int i11 = r90Var.v - r90Var.f30691u;
        da0 da0Var = x90Var.f40291d0;
        if (i11 > org.telegram.messenger.hp.s1(da0Var.f33042x).f23081o4) {
            x90Var.g();
            return;
        }
        org.telegram.messenger.dj djVar = da0Var.d;
        djVar.f22200e = r90Var.f30691u;
        djVar.f22201f = r90Var.v;
        org.telegram.messenger.zi c2 = x90Var.c(ziVar);
        if (c2 != null && ((mmVar = da0Var.d.d) == null || mmVar.f47710m || (ziVar2 = mmVar.f47700a) == null || ziVar2.f1() != c2.f1())) {
            da0Var.d.d = org.telegram.ui.mm.b(i3, i10, c2);
        }
        da0Var.b();
        da0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.zi c2;
        TLRPC.Message message;
        x90 x90Var = this.f37694w0;
        if (x90Var.f40285a == 0 && (c2 = x90Var.c(null)) != null && (message = c2.f26868k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.dj djVar = x90Var.f40291d0.d;
        if (djVar != null && djVar.f22213s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.zi c2;
        TLRPC.Message message;
        x90 x90Var = this.f37694w0;
        int i3 = x90Var.f40285a;
        if (i3 == 0 && !x90Var.f40291d0.d.f22203i) {
            if (i3 != 0 || (c2 = x90Var.c(null)) == null || (message = c2.f26868k) == null || message.rich_message == null || org.telegram.messenger.gv.c(x90Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 q() {
        return this.f30671g0;
    }

    @Override
    public final void w() {
        super.w();
        ci.j1 j1Var = this.f37694w0.f40293f;
        if (j1Var != null) {
            j1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.zi ziVar) {
        x90 x90Var = this.f37694w0;
        if (x90Var.f40285a == 0 && !x90Var.f40291d0.d.f22203i && x()) {
            return true;
        }
        return false;
    }
}
