package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s60 extends oj0 {
    public final Context f37955c;
    public final t60 d;

    public s60(t60 t60Var, Context context) {
        this.d = t60Var;
        this.f37955c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f38268p1.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLObject M0;
        String str;
        View view = d1Var.f56927a;
        t60 t60Var = this.d;
        long C1 = org.telegram.messenger.ij.C1((TLRPC.Peer) t60Var.f38268p1.get(i7));
        if (C1 > 0) {
            M0 = org.telegram.messenger.qp.s1(t60Var.f28612a).a2(Long.valueOf(C1));
            str = org.telegram.messenger.hd.M0(2131743350, null);
        } else {
            M0 = org.telegram.messenger.qp.s1(t60Var.f28612a).M0(Long.valueOf(-C1));
            str = null;
        }
        boolean z9 = false;
        if (t60Var.f38271s1 == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            if (C1 == org.telegram.messenger.ij.C1(t60Var.f38272t1)) {
                z9 = true;
            }
            d7Var.c(C1, z9, null);
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
        t60 t60Var = this.d;
        if (t60Var.f38271s1 == 0) {
            h4Var = new org.telegram.ui.Cells.d7(2, this.f37955c, null);
            h4Var.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            if (t60Var.f38271s1 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.f37955c, null, false, z9);
        }
        return new v4.d1(h4Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        long j3;
        d1Var.b();
        long C1 = org.telegram.messenger.ij.C1(this.d.f38272t1);
        View view = d1Var.f56927a;
        boolean z9 = true;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26952id;
                } else {
                    j3 = ((TLRPC.User) object).f27101id;
                }
            } else {
                j3 = 0;
            }
            if (C1 != j3) {
                z9 = false;
            }
            h4Var.c(z9, false);
            return;
        }
        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
        if (C1 != d7Var.getCurrentDialog()) {
            z9 = false;
        }
        d7Var.b(z9, false);
    }
}
