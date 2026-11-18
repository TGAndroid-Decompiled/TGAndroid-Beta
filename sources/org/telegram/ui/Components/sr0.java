package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sr0 extends bk0 {
    public final Context f39831c;
    public final ArrayList d = new ArrayList();
    public int f39832e;
    public final gt0 f39833f;

    public sr0(gt0 gt0Var, Context context) {
        this.f39833f = gt0Var;
        this.f39831c = context;
        E(false);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(boolean z10) {
        gt0 gt0Var = this.f39833f;
        long j3 = gt0Var.f35606m1;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        if (h2Var != null) {
            if (org.telegram.messenger.n5.z(j3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).O0(Long.valueOf(-j3));
                if (O0 == null || !org.telegram.messenger.v3.V(O0)) {
                    return;
                }
            } else if (org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).c2(Long.valueOf(j3)) == null) {
                return;
            }
            org.telegram.messenger.no N0 = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).N0(j3);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i7 = 0;
            if (N0 != null) {
                ArrayList arrayList2 = N0.f25955b;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.v3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.j10.i(h2Var.getCurrentAccount()).q()) {
                i7 = N0.f25956c;
            }
            this.f39832e = i7;
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
        if (this.f39832e > 0 && i7 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.g6) {
                g6Var = (org.telegram.ui.Cells.g6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof es0) {
                g6Var = ((es0) view).f34791b;
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
        gt0 gt0Var = this.f39833f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
            if (h2Var == null) {
                currentAccount = org.telegram.messenger.j10.f24773t0;
            } else {
                currentAccount = h2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (gt0Var.f35606m1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            g6Var = new es0(i10, this.f39831c, z11, gt0Var.I1, new ap0(this, 3));
        } else {
            g6Var = new org.telegram.ui.Cells.g6(this.f39831c, gt0Var.I1);
        }
        g6Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(g6Var);
    }
}
