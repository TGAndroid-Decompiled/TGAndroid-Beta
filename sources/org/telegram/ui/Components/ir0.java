package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir0 extends sj0 {
    public final Context f34802c;
    public final ArrayList d = new ArrayList();
    public int f34803e;
    public final ws0 f34804f;

    public ir0(ws0 ws0Var, Context context) {
        this.f34804f = ws0Var;
        this.f34802c = context;
        E(false);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(boolean z10) {
        ws0 ws0Var = this.f34804f;
        long j10 = ws0Var.m1;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        if (d2Var != null) {
            if (org.telegram.messenger.m5.z(j10)) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).M0(Long.valueOf(-j10));
                if (M0 == null || !org.telegram.messenger.t3.V(M0)) {
                    return;
                }
            } else if (org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).a2(Long.valueOf(j10)) == null) {
                return;
            }
            org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).L0(j10);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i3 = 0;
            if (L0 != null) {
                ArrayList arrayList2 = L0.f23564b;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.h10.i(d2Var.getCurrentAccount()).q()) {
                i3 = L0.f23565c;
            }
            this.f34803e = i3;
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
    public final int d(int i3) {
        if (this.f34803e > 0 && i3 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Cells.f6 f6Var;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.f6) {
                f6Var = (org.telegram.ui.Cells.f6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof ur0) {
                f6Var = ((ur0) view).f38858b;
            } else {
                return;
            }
        } else {
            f6Var = null;
        }
        org.telegram.ui.Cells.f6 f6Var2 = f6Var;
        if (f6Var2 != null) {
            ArrayList arrayList = this.d;
            f6Var2.x(arrayList.get(i3), null, null, null, false, false);
            boolean z10 = true;
            if (i3 == arrayList.size() - 1) {
                z10 = false;
            }
            f6Var2.N = z10;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View f6Var;
        int currentAccount;
        boolean z10;
        ws0 ws0Var = this.f34804f;
        if (i3 == 18) {
            org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
            if (d2Var == null) {
                currentAccount = org.telegram.messenger.h10.f22829t0;
            } else {
                currentAccount = d2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (ws0Var.m1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            f6Var = new ur0(i10, this.f34802c, z11, ws0Var.I1, new sp0(this, 2));
        } else {
            f6Var = new org.telegram.ui.Cells.f6(this.f34802c, ws0Var.I1);
        }
        f6Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(f6Var);
    }
}
