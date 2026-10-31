package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j70 extends sk0 {
    public final Context f27242c;
    public final k70 d;

    public j70(k70 k70Var, Context context) {
        this.d = k70Var;
        this.f27242c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.f27662p1.size();
    }

    @Override
    public final int d(int i10) {
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLObject L0;
        String str;
        View view = c1Var.f47898a;
        k70 k70Var = this.d;
        long C1 = org.telegram.messenger.jj.C1((TLRPC.Peer) k70Var.f27662p1.get(i10));
        if (C1 > 0) {
            L0 = org.telegram.messenger.vp.r1(k70Var.f21583a).Z1(Long.valueOf(C1));
            str = org.telegram.messenger.cd.L0(2131743375, null);
        } else {
            L0 = org.telegram.messenger.vp.r1(k70Var.f21583a).L0(Long.valueOf(-C1));
            str = null;
        }
        boolean z10 = false;
        if (k70Var.f27665s1 == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            if (C1 == org.telegram.messenger.jj.C1(k70Var.f27666t1)) {
                z10 = true;
            }
            h7Var.c(C1, z10, null);
            return;
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        if (i10 != b() - 1) {
            z10 = true;
        }
        j4Var.e(L0, null, str, z10);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        View j4Var;
        k70 k70Var = this.d;
        if (k70Var.f27665s1 == 0) {
            j4Var = new org.telegram.ui.Cells.h7(2, this.f27242c, null);
            j4Var.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(100.0f)));
        } else {
            if (k70Var.f27665s1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            j4Var = new org.telegram.ui.Cells.j4(2, 0, this.f27242c, null, false, z10);
        }
        return new s4.c1(j4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        long j10;
        c1Var.b();
        long C1 = org.telegram.messenger.jj.C1(this.d.f27666t1);
        View view = c1Var.f47898a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.j4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            Object object = j4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19793id;
                } else {
                    j10 = ((TLRPC.User) object).f19942id;
                }
            } else {
                j10 = 0;
            }
            if (C1 != j10) {
                z10 = false;
            }
            j4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
        if (C1 != h7Var.getCurrentDialog()) {
            z10 = false;
        }
        h7Var.b(z10, false);
    }
}
