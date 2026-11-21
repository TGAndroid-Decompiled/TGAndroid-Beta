package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 extends dk0 {
    public final Context f40574c;
    public final ArrayList d = new ArrayList();
    public int f40575e;
    public final jt0 f40576f;

    public ur0(jt0 jt0Var, Context context) {
        this.f40576f = jt0Var;
        this.f40574c = context;
        E(false);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(boolean z10) {
        jt0 jt0Var = this.f40576f;
        long j3 = jt0Var.f36653m1;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
        if (g2Var != null) {
            if (org.telegram.messenger.n5.z(j3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).O0(Long.valueOf(-j3));
                if (O0 == null || !org.telegram.messenger.v3.V(O0)) {
                    return;
                }
            } else if (org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3)) == null) {
                return;
            }
            org.telegram.messenger.no N0 = org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).N0(j3);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i7 = 0;
            if (N0 != null) {
                ArrayList arrayList2 = N0.f25981b;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.v3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.j10.i(g2Var.getCurrentAccount()).q()) {
                i7 = N0.f25982c;
            }
            this.f40575e = i7;
            if (z10) {
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
        if (this.f40575e > 0 && i7 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.h6 h6Var;
        int i10 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof hs0) {
                h6Var = ((hs0) view).f35968b;
            } else {
                return;
            }
        } else {
            h6Var = null;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.x(arrayList.get(i7), null, null, null, false, false);
            boolean z10 = true;
            if (i7 == arrayList.size() - 1) {
                z10 = false;
            }
            h6Var2.N = z10;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View h6Var;
        int currentAccount;
        boolean z10;
        jt0 jt0Var = this.f40576f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
            if (g2Var == null) {
                currentAccount = org.telegram.messenger.j10.f24798t0;
            } else {
                currentAccount = g2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (jt0Var.f36653m1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            h6Var = new hs0(i10, this.f40574c, z11, jt0Var.I1, new cp0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f40574c, jt0Var.I1);
        }
        h6Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(h6Var);
    }
}
