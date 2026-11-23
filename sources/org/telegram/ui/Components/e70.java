package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e70 extends dk0 {
    public final Context f34590c;
    public final f70 d;

    public e70(f70 f70Var, Context context) {
        this.d = f70Var;
        this.f34590c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f35033t1.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLObject O0;
        String str;
        View view = f1Var.f59245a;
        f70 f70Var = this.d;
        long B1 = org.telegram.messenger.fj.B1((TLRPC.Peer) f70Var.f35033t1.get(i7));
        if (B1 > 0) {
            O0 = org.telegram.messenger.mp.u1(f70Var.f30223a).c2(Long.valueOf(B1));
            str = org.telegram.messenger.gd.N0(2131743099, null);
        } else {
            O0 = org.telegram.messenger.mp.u1(f70Var.f30223a).O0(Long.valueOf(-B1));
            str = null;
        }
        boolean z10 = false;
        if (f70Var.f35036w1 == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            if (B1 == org.telegram.messenger.fj.B1(f70Var.f35037x1)) {
                z10 = true;
            }
            d7Var.c(B1, z10, null);
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
        f70 f70Var = this.d;
        if (f70Var.f35036w1 == 0) {
            i4Var = new org.telegram.ui.Cells.d7(2, this.f34590c, null);
            i4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            if (f70Var.f35036w1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var = new org.telegram.ui.Cells.i4(2, 0, this.f34590c, null, false, z10);
        }
        return new v4.f1(i4Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        long j3;
        f1Var.b();
        long B1 = org.telegram.messenger.fj.B1(this.d.f35037x1);
        View view = f1Var.f59245a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.i4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            Object object = i4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28492id;
                } else {
                    j3 = ((TLRPC.User) object).f28641id;
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
        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
        if (B1 != d7Var.getCurrentDialog()) {
            z10 = false;
        }
        d7Var.b(z10, false);
    }
}
