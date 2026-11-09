package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t60 extends pj0 {
    public final Context f38304c;
    public final u60 d;

    public t60(u60 u60Var, Context context) {
        this.d = u60Var;
        this.f38304c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f38631p1.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLObject M0;
        String str;
        View view = d1Var.f57056a;
        u60 u60Var = this.d;
        long B1 = org.telegram.messenger.ij.B1((TLRPC.Peer) u60Var.f38631p1.get(i7));
        if (B1 > 0) {
            M0 = org.telegram.messenger.qp.s1(u60Var.f28621a).a2(Long.valueOf(B1));
            str = org.telegram.messenger.id.M0(2131743349, null);
        } else {
            M0 = org.telegram.messenger.qp.s1(u60Var.f28621a).M0(Long.valueOf(-B1));
            str = null;
        }
        boolean z9 = false;
        if (u60Var.f38634s1 == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            if (B1 == org.telegram.messenger.ij.B1(u60Var.f38635t1)) {
                z9 = true;
            }
            d7Var.c(B1, z9, null);
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (i7 != b() - 1) {
            z9 = true;
        }
        h4Var.e(M0, null, str, z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        View h4Var;
        u60 u60Var = this.d;
        if (u60Var.f38634s1 == 0) {
            h4Var = new org.telegram.ui.Cells.d7(2, this.f38304c, null);
            h4Var.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            if (u60Var.f38634s1 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.f38304c, null, false, z9);
        }
        return new v4.d1(h4Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        long j3;
        d1Var.b();
        long B1 = org.telegram.messenger.ij.B1(this.d.f38635t1);
        View view = d1Var.f57056a;
        boolean z9 = true;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26956id;
                } else {
                    j3 = ((TLRPC.User) object).f27105id;
                }
            } else {
                j3 = 0;
            }
            if (B1 != j3) {
                z9 = false;
            }
            h4Var.c(z9, false);
            return;
        }
        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
        if (B1 != d7Var.getCurrentDialog()) {
            z9 = false;
        }
        d7Var.b(z9, false);
    }
}
