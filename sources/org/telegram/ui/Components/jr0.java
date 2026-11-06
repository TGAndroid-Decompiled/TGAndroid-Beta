package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jr0 extends oj0 {
    public final Context f35021c;
    public final ArrayList d = new ArrayList();
    public int f35022e;
    public final xs0 f35023f;

    public jr0(xs0 xs0Var, Context context) {
        this.f35023f = xs0Var;
        this.f35021c = context;
        E(false);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(boolean z9) {
        xs0 xs0Var = this.f35023f;
        long j3 = xs0Var.l1;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
        if (f2Var != null) {
            if (org.telegram.messenger.m5.z(j3)) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
                if (M0 == null || !org.telegram.messenger.t3.V(M0)) {
                    return;
                }
            } else if (org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).a2(Long.valueOf(j3)) == null) {
                return;
            }
            org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).L0(j3);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i7 = 0;
            if (L0 != null) {
                ArrayList arrayList2 = L0.f25306b;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).q()) {
                i7 = L0.f25307c;
            }
            this.f35022e = i7;
            if (z9) {
                f();
            }
        }
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final int d(int i7) {
        if (this.f35022e > 0 && i7 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        int i10 = d1Var.f56956f;
        View view = d1Var.f56952a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.g6) {
                g6Var = (org.telegram.ui.Cells.g6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof vr0) {
                g6Var = ((vr0) view).f39660b;
            } else {
                return;
            }
        } else {
            g6Var = null;
        }
        org.telegram.ui.Cells.g6 g6Var2 = g6Var;
        if (g6Var2 != null) {
            ArrayList arrayList = this.d;
            g6Var2.x(arrayList.get(i7), null, null, null, false, false);
            boolean z9 = true;
            if (i7 == arrayList.size() - 1) {
                z9 = false;
            }
            g6Var2.M = z9;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View g6Var;
        int currentAccount;
        boolean z9;
        xs0 xs0Var = this.f35023f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
            if (f2Var == null) {
                currentAccount = org.telegram.messenger.p10.f24459s0;
            } else {
                currentAccount = f2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (xs0Var.l1 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z9;
            g6Var = new vr0(i10, this.f35021c, z10, xs0Var.H1, new ir0(this, 0));
        } else {
            g6Var = new org.telegram.ui.Cells.g6(this.f35021c, xs0Var.H1);
        }
        g6Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(g6Var);
    }
}
