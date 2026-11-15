package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class x80 extends ys0 {
    public final y80 f41619x2;

    public x80(y80 y80Var, Context context, long j3, qs0 qs0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, y80 y80Var2, w80 w80Var, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(context, j3, qs0Var, 0, null, chatFull, userFull, i7, 0, y80Var2, w80Var, 0, e6Var, cVar);
        this.f41619x2 = y80Var;
    }

    @Override
    public final boolean A0() {
        if (this.f41619x2.f41931a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f41619x2.d0();
    }

    @Override
    public final boolean I0() {
        return this.f41619x2.d0();
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        y80 y80Var = this.f41619x2;
        y80Var.f41939w = sparseArray;
        hi.d dVar = y80Var.O;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            y80Var.O.c(size, true);
            if (y80Var.S.getClosestTab() == 8) {
                y80Var.O.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void X0(boolean z10) {
        y80 y80Var = this.f41619x2;
        org.telegram.messenger.g0.B2(y80Var.getParentActivity(), y80.a0(y80Var));
    }

    @Override
    public final boolean Y() {
        y80 y80Var = this.f41619x2;
        if (!y80Var.d0() && y80Var.f41931a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y0() {
        super.Y0();
        this.f41619x2.g0();
    }

    @Override
    public final void Z0(float f10) {
        int i7;
        y80 y80Var = this.f41619x2;
        if (y80Var.f41931a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.le0 le0Var = y80Var.K;
        if (le0Var != null && y80Var.M != i7) {
            y80Var.M = i7;
            le0Var.q(y80Var.L[i7], true);
        }
        y80Var.h0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.f41619x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f41619x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f41619x2.f41936n;
    }

    @Override
    public final void q1(boolean z10) {
        if (this.F1 != z10) {
            super.q1(z10);
            y80 y80Var = this.f41619x2;
            if (y80Var.d0()) {
                if (z10) {
                    v1(null);
                }
                this.P1 = z10;
            }
            te.a aVar = y80Var.P;
            if (aVar != null) {
                aVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        y80 y80Var = this.f41619x2;
        if (y80Var.f41931a == 0 && y80Var.f41934e == y80Var.getUserConfig().e() && y80Var.f41935f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f41619x2.d0();
    }
}
