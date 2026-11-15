package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class w80 extends ys0 {
    public final x80 f41314x2;

    public w80(x80 x80Var, Context context, long j3, qs0 qs0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, x80 x80Var2, v80 v80Var, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(context, j3, qs0Var, 0, null, chatFull, userFull, i7, 0, x80Var2, v80Var, 0, e6Var, cVar);
        this.f41314x2 = x80Var;
    }

    @Override
    public final boolean A0() {
        if (this.f41314x2.f41616a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f41314x2.d0();
    }

    @Override
    public final boolean I0() {
        return this.f41314x2.d0();
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        x80 x80Var = this.f41314x2;
        x80Var.f41624w = sparseArray;
        hi.d dVar = x80Var.O;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            x80Var.O.c(size, true);
            if (x80Var.S.getClosestTab() == 8) {
                x80Var.O.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void X0(boolean z10) {
        x80 x80Var = this.f41314x2;
        org.telegram.messenger.g0.B2(x80Var.getParentActivity(), x80.a0(x80Var));
    }

    @Override
    public final boolean Y() {
        x80 x80Var = this.f41314x2;
        if (!x80Var.d0() && x80Var.f41616a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y0() {
        super.Y0();
        this.f41314x2.g0();
    }

    @Override
    public final void Z0(float f10) {
        int i7;
        x80 x80Var = this.f41314x2;
        if (x80Var.f41616a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.le0 le0Var = x80Var.K;
        if (le0Var != null && x80Var.M != i7) {
            x80Var.M = i7;
            le0Var.q(x80Var.L[i7], true);
        }
        x80Var.h0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.f41314x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f41314x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f41314x2.f41621n;
    }

    @Override
    public final void q1(boolean z10) {
        if (this.F1 != z10) {
            super.q1(z10);
            x80 x80Var = this.f41314x2;
            if (x80Var.d0()) {
                if (z10) {
                    v1(null);
                }
                this.P1 = z10;
            }
            te.a aVar = x80Var.P;
            if (aVar != null) {
                aVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        x80 x80Var = this.f41314x2;
        if (x80Var.f41616a == 0 && x80Var.f41619e == x80Var.getUserConfig().e() && x80Var.f41620f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f41314x2.d0();
    }
}
