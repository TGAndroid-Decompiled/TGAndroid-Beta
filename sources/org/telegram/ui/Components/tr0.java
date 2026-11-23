package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tr0 extends dk0 {
    public final Context f40137c;
    public final ArrayList d = new ArrayList();
    public int f40138e;
    public final it0 f40139f;

    public tr0(it0 it0Var, Context context) {
        this.f40139f = it0Var;
        this.f40137c = context;
        E(false);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(boolean z10) {
        it0 it0Var = this.f40139f;
        long j3 = it0Var.f36130m1;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
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
                ArrayList arrayList2 = N0.f26049b;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.v3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.i10.i(g2Var.getCurrentAccount()).q()) {
                i7 = N0.f26050c;
            }
            this.f40138e = i7;
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
        if (this.f40138e > 0 && i7 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.g6) {
                g6Var = (org.telegram.ui.Cells.g6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof gs0) {
                g6Var = ((gs0) view).f35531b;
            } else {
                return;
            }
        } else {
            g6Var = null;
        }
        org.telegram.ui.Cells.g6 g6Var2 = g6Var;
        if (g6Var2 != null) {
            ArrayList arrayList = this.d;
            g6Var2.z(arrayList.get(i7), null, null, null, false, false);
            boolean z10 = true;
            if (i7 == arrayList.size() - 1) {
                z10 = false;
            }
            g6Var2.N = z10;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View g6Var;
        int currentAccount;
        boolean z10;
        it0 it0Var = this.f40139f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
            if (g2Var == null) {
                currentAccount = org.telegram.messenger.i10.f24637t0;
            } else {
                currentAccount = g2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (it0Var.f36130m1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            g6Var = new gs0(i10, this.f40137c, z11, it0Var.I1, new bp0(this, 3));
        } else {
            g6Var = new org.telegram.ui.Cells.g6(this.f40137c, it0Var.I1);
        }
        g6Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(g6Var);
    }
}
