package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n60 extends sj0 {
    public final Context f36382c;
    public final o60 d;

    public n60(o60 o60Var, Context context) {
        this.d = o60Var;
        this.f36382c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f36750q1.size();
    }

    @Override
    public final int d(int i3) {
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLObject M0;
        String str;
        View view = d1Var.f55540a;
        o60 o60Var = this.d;
        long C1 = org.telegram.messenger.zi.C1((TLRPC.Peer) o60Var.f36750q1.get(i3));
        if (C1 > 0) {
            M0 = org.telegram.messenger.hp.s1(o60Var.f28583a).a2(Long.valueOf(C1));
            str = org.telegram.messenger.bd.M0(2131743359, null);
        } else {
            M0 = org.telegram.messenger.hp.s1(o60Var.f28583a).M0(Long.valueOf(-C1));
            str = null;
        }
        boolean z10 = false;
        if (o60Var.f36753t1 == 0) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
            if (C1 == org.telegram.messenger.zi.C1(o60Var.f36754u1)) {
                z10 = true;
            }
            c7Var.c(C1, z10, null);
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (i3 != b() - 1) {
            z10 = true;
        }
        h4Var.e(M0, null, str, z10);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        View h4Var;
        o60 o60Var = this.d;
        if (o60Var.f36753t1 == 0) {
            h4Var = new org.telegram.ui.Cells.c7(2, this.f36382c, null);
            h4Var.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            if (o60Var.f36753t1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.f36382c, null, false, z10);
        }
        return new u4.d1(h4Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        long j10;
        d1Var.b();
        long C1 = org.telegram.messenger.zi.C1(this.d.f36754u1);
        View view = d1Var.f55540a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f27001id;
                } else {
                    j10 = ((TLRPC.User) object).f27150id;
                }
            } else {
                j10 = 0;
            }
            if (C1 != j10) {
                z10 = false;
            }
            h4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
        if (C1 != c7Var.getCurrentDialog()) {
            z10 = false;
        }
        c7Var.b(z10, false);
    }
}
