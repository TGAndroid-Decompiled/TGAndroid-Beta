package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u60 extends tj0 {
    public final Context f39936c;
    public final v60 d;

    public u60(v60 v60Var, Context context) {
        this.d = v60Var;
        this.f39936c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f40283t1.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLObject M0;
        String str;
        View view = e1Var.f58535a;
        v60 v60Var = this.d;
        long B1 = org.telegram.messenger.gj.B1((TLRPC.Peer) v60Var.f40283t1.get(i7));
        if (B1 > 0) {
            M0 = org.telegram.messenger.np.s1(v60Var.f29679a).a2(Long.valueOf(B1));
            str = org.telegram.messenger.hd.M0(2131743349, null);
        } else {
            M0 = org.telegram.messenger.np.s1(v60Var.f29679a).M0(Long.valueOf(-B1));
            str = null;
        }
        boolean z10 = false;
        if (v60Var.f40286w1 == 0) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
            if (B1 == org.telegram.messenger.gj.B1(v60Var.f40287x1)) {
                z10 = true;
            }
            c7Var.c(B1, z10, null);
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (i7 != b() - 1) {
            z10 = true;
        }
        h4Var.e(M0, null, str, z10);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        View h4Var;
        v60 v60Var = this.d;
        if (v60Var.f40286w1 == 0) {
            h4Var = new org.telegram.ui.Cells.c7(2, this.f39936c, null);
            h4Var.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            if (v60Var.f40286w1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.f39936c, null, false, z10);
        }
        return new v4.e1(h4Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        long j3;
        e1Var.b();
        long B1 = org.telegram.messenger.gj.B1(this.d.f40287x1);
        View view = e1Var.f58535a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28051id;
                } else {
                    j3 = ((TLRPC.User) object).f28200id;
                }
            } else {
                j3 = 0;
            }
            if (B1 != j3) {
                z10 = false;
            }
            h4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
        if (B1 != c7Var.getCurrentDialog()) {
            z10 = false;
        }
        c7Var.b(z10, false);
    }
}
