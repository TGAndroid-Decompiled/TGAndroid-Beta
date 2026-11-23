package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class g90 extends it0 {
    public final h90 f35374x2;

    public g90(h90 h90Var, Context context, long j3, at0 at0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, h90 h90Var2, f90 f90Var, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context, j3, at0Var, 0, null, chatFull, userFull, i7, 0, h90Var2, f90Var, 0, i6Var, cVar);
        this.f35374x2 = h90Var;
    }

    @Override
    public final boolean A0() {
        if (this.f35374x2.f35688a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f35374x2.d0();
    }

    @Override
    public final boolean I0() {
        return this.f35374x2.d0();
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        h90 h90Var = this.f35374x2;
        h90Var.f35696w = sparseArray;
        hi.e eVar = h90Var.O;
        if (eVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.setEnabled(z10);
            h90Var.O.c(size, true);
            if (h90Var.S.getClosestTab() == 8) {
                h90Var.O.i(org.telegram.messenger.gd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void X0(boolean z10) {
        h90 h90Var = this.f35374x2;
        org.telegram.messenger.g0.B2(h90Var.getParentActivity(), h90.a0(h90Var));
    }

    @Override
    public final boolean Y() {
        h90 h90Var = this.f35374x2;
        if (!h90Var.d0() && h90Var.f35688a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y0() {
        super.Y0();
        this.f35374x2.g0();
    }

    @Override
    public final void Z0(float f10) {
        int i7;
        h90 h90Var = this.f35374x2;
        if (h90Var.f35688a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.ne0 ne0Var = h90Var.K;
        if (ne0Var != null && h90Var.M != i7) {
            h90Var.M = i7;
            ne0Var.r(h90Var.L[i7], true);
        }
        h90Var.h0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.f35374x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f35374x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f35374x2.f35693n;
    }

    @Override
    public final void q1(boolean z10) {
        if (this.F1 != z10) {
            super.q1(z10);
            h90 h90Var = this.f35374x2;
            if (h90Var.d0()) {
                if (z10) {
                    v1(null);
                }
                this.P1 = z10;
            }
            te.a aVar = h90Var.P;
            if (aVar != null) {
                aVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        h90 h90Var = this.f35374x2;
        if (h90Var.f35688a == 0 && h90Var.f35691e == h90Var.getUserConfig().e() && h90Var.f35692f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f35374x2.d0();
    }
}
