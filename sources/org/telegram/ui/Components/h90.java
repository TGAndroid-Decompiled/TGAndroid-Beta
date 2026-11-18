package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class h90 extends gt0 {
    public final i90 f35825x2;

    public h90(i90 i90Var, Context context, long j3, ys0 ys0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, i90 i90Var2, g90 g90Var, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context, j3, ys0Var, 0, null, chatFull, userFull, i7, 0, i90Var2, g90Var, 0, i6Var, cVar);
        this.f35825x2 = i90Var;
    }

    @Override
    public final boolean A0() {
        if (this.f35825x2.f36075a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f35825x2.d0();
    }

    @Override
    public final boolean I0() {
        return this.f35825x2.d0();
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        i90 i90Var = this.f35825x2;
        i90Var.f36083w = sparseArray;
        hi.d dVar = i90Var.O;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            i90Var.O.c(size, true);
            if (i90Var.S.getClosestTab() == 8) {
                i90Var.O.i(org.telegram.messenger.gd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void X0(boolean z10) {
        i90 i90Var = this.f35825x2;
        org.telegram.messenger.g0.B2(i90Var.getParentActivity(), i90.a0(i90Var));
    }

    @Override
    public final boolean Y() {
        i90 i90Var = this.f35825x2;
        if (!i90Var.d0() && i90Var.f36075a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y0() {
        super.Y0();
        this.f35825x2.g0();
    }

    @Override
    public final void Z0(float f10) {
        int i7;
        i90 i90Var = this.f35825x2;
        if (i90Var.f36075a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.oe0 oe0Var = i90Var.K;
        if (oe0Var != null && i90Var.M != i7) {
            i90Var.M = i7;
            oe0Var.r(i90Var.L[i7], true);
        }
        i90Var.h0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.f35825x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f35825x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f35825x2.f36080n;
    }

    @Override
    public final void q1(boolean z10) {
        if (this.F1 != z10) {
            super.q1(z10);
            i90 i90Var = this.f35825x2;
            if (i90Var.d0()) {
                if (z10) {
                    v1(null);
                }
                this.P1 = z10;
            }
            te.a aVar = i90Var.P;
            if (aVar != null) {
                aVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        i90 i90Var = this.f35825x2;
        if (i90Var.f36075a == 0 && i90Var.f36078e == i90Var.getUserConfig().e() && i90Var.f36079f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f35825x2.d0();
    }
}
