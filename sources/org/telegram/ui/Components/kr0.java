package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr0 extends tj0 {
    public final Context f36592c;
    public final ArrayList d = new ArrayList();
    public int f36593e;
    public final ys0 f36594f;

    public kr0(ys0 ys0Var, Context context) {
        this.f36594f = ys0Var;
        this.f36592c = context;
        E(false);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E(boolean z10) {
        ys0 ys0Var = this.f36594f;
        long j3 = ys0Var.f42114m1;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
        if (e2Var != null) {
            if (org.telegram.messenger.m5.z(j3)) {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
                if (M0 == null || !org.telegram.messenger.t3.V(M0)) {
                    return;
                }
            } else if (org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).a2(Long.valueOf(j3)) == null) {
                return;
            }
            org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).L0(j3);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i7 = 0;
            if (L0 != null) {
                ArrayList arrayList2 = L0.f25786b;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList2.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !org.telegram.messenger.m10.i(e2Var.getCurrentAccount()).q()) {
                i7 = L0.f25787c;
            }
            this.f36593e = i7;
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
        if (this.f36593e > 0 && i7 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Cells.f6 f6Var;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.f6) {
                f6Var = (org.telegram.ui.Cells.f6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof wr0) {
                f6Var = ((wr0) view).f41427b;
            } else {
                return;
            }
        } else {
            f6Var = null;
        }
        org.telegram.ui.Cells.f6 f6Var2 = f6Var;
        if (f6Var2 != null) {
            ArrayList arrayList = this.d;
            f6Var2.x(arrayList.get(i7), null, null, null, false, false);
            boolean z10 = true;
            if (i7 == arrayList.size() - 1) {
                z10 = false;
            }
            f6Var2.N = z10;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View f6Var;
        int currentAccount;
        boolean z10;
        ys0 ys0Var = this.f36594f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
            if (e2Var == null) {
                currentAccount = org.telegram.messenger.m10.f24934t0;
            } else {
                currentAccount = e2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (ys0Var.f42114m1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            f6Var = new wr0(i10, this.f36592c, z11, ys0Var.I1, new ro0(this, 3));
        } else {
            f6Var = new org.telegram.ui.Cells.f6(this.f36592c, ys0Var.I1);
        }
        f6Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(f6Var);
    }
}
