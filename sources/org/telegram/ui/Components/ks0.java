package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ks0 extends tk0 {
    public final Context f27953c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final au0 f27954f;

    public ks0(au0 au0Var, Context context) {
        this.f27954f = au0Var;
        this.f27953c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        au0 au0Var = this.f27954f;
        long j10 = au0Var.l1;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        if (k2Var != null) {
            if (org.telegram.messenger.o5.z(j10)) {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10));
                if (L0 == null || !org.telegram.messenger.w3.V(L0)) {
                    return;
                }
            } else if (org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10)) == null) {
                return;
            }
            org.telegram.messenger.xo K0 = org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).K0(j10);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i10 = 0;
            if (K0 != null) {
                ArrayList arrayList2 = K0.f19460b;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i11);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.w3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.e20.i(k2Var.getCurrentAccount()).q()) {
                i10 = K0.f19461c;
            }
            this.e = i10;
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
    public final int d(int i10) {
        if (this.e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.k6 k6Var;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.k6) {
                k6Var = (org.telegram.ui.Cells.k6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof ws0) {
                k6Var = ((ws0) view).f32306b;
            } else {
                return;
            }
        } else {
            k6Var = null;
        }
        org.telegram.ui.Cells.k6 k6Var2 = k6Var;
        if (k6Var2 != null) {
            ArrayList arrayList = this.d;
            k6Var2.z(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            k6Var2.M = z10;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View k6Var;
        int currentAccount;
        boolean z10;
        au0 au0Var = this.f27954f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
            if (k2Var == null) {
                currentAccount = org.telegram.messenger.e20.f15506s0;
            } else {
                currentAccount = k2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (au0Var.l1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            k6Var = new ws0(i11, this.f27953c, z11, au0Var.H1, new vo0(this, 5));
        } else {
            k6Var = new org.telegram.ui.Cells.k6(this.f27953c, au0Var.H1);
        }
        k6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(k6Var);
    }
}
