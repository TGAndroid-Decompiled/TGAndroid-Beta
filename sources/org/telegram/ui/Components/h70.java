package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h70 extends dk0 {
    public final Context f35820c;
    public final i70 d;

    public h70(i70 i70Var, Context context) {
        this.d = i70Var;
        this.f35820c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f36192t1.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLObject O0;
        String str;
        View view = f1Var.f59161a;
        i70 i70Var = this.d;
        long B1 = org.telegram.messenger.fj.B1((TLRPC.Peer) i70Var.f36192t1.get(i7));
        if (B1 > 0) {
            O0 = org.telegram.messenger.mp.u1(i70Var.f30170a).c2(Long.valueOf(B1));
            str = org.telegram.messenger.gd.N0(2131743106, null);
        } else {
            O0 = org.telegram.messenger.mp.u1(i70Var.f30170a).O0(Long.valueOf(-B1));
            str = null;
        }
        boolean z10 = false;
        if (i70Var.f36195w1 == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            if (B1 == org.telegram.messenger.fj.B1(i70Var.f36196x1)) {
                z10 = true;
            }
            e7Var.c(B1, z10, null);
            return;
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        if (i7 != b() - 1) {
            z10 = true;
        }
        i4Var.e(O0, null, str, z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        View i4Var;
        i70 i70Var = this.d;
        if (i70Var.f36195w1 == 0) {
            i4Var = new org.telegram.ui.Cells.e7(2, this.f35820c, null);
            i4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            if (i70Var.f36195w1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var = new org.telegram.ui.Cells.i4(2, 0, this.f35820c, null, false, z10);
        }
        return new v4.f1(i4Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        long j3;
        f1Var.b();
        long B1 = org.telegram.messenger.fj.B1(this.d.f36196x1);
        View view = f1Var.f59161a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.i4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            Object object = i4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28431id;
                } else {
                    j3 = ((TLRPC.User) object).f28580id;
                }
            } else {
                j3 = 0;
            }
            if (B1 != j3) {
                z10 = false;
            }
            i4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
        if (B1 != e7Var.getCurrentDialog()) {
            z10 = false;
        }
        e7Var.b(z10, false);
    }
}
