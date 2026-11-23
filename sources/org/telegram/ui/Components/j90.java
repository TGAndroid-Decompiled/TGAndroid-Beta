package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class j90 extends jt0 {
    public final k90 f36451x2;

    public j90(k90 k90Var, Context context, long j3, bt0 bt0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, k90 k90Var2, i90 i90Var, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(context, j3, bt0Var, 0, null, chatFull, userFull, i7, 0, k90Var2, i90Var, 0, h6Var, cVar);
        this.f36451x2 = k90Var;
    }

    @Override
    public final boolean A0() {
        if (this.f36451x2.f36863a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f36451x2.d0();
    }

    @Override
    public final boolean I0() {
        return this.f36451x2.d0();
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        k90 k90Var = this.f36451x2;
        k90Var.f36871w = sparseArray;
        hi.e eVar = k90Var.O;
        if (eVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.setEnabled(z10);
            k90Var.O.c(size, true);
            if (k90Var.S.getClosestTab() == 8) {
                k90Var.O.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void X0(boolean z10) {
        k90 k90Var = this.f36451x2;
        org.telegram.messenger.g0.B2(k90Var.getParentActivity(), k90.a0(k90Var));
    }

    @Override
    public final boolean Y() {
        k90 k90Var = this.f36451x2;
        if (!k90Var.d0() && k90Var.f36863a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y0() {
        super.Y0();
        this.f36451x2.g0();
    }

    @Override
    public final void Z0(float f10) {
        int i7;
        k90 k90Var = this.f36451x2;
        if (k90Var.f36863a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.oe0 oe0Var = k90Var.K;
        if (oe0Var != null && k90Var.M != i7) {
            k90Var.M = i7;
            oe0Var.r(k90Var.L[i7], true);
        }
        k90Var.h0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.f36451x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f36451x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f36451x2.f36868n;
    }

    @Override
    public final void q1(boolean z10) {
        if (this.F1 != z10) {
            super.q1(z10);
            k90 k90Var = this.f36451x2;
            if (k90Var.d0()) {
                if (z10) {
                    v1(null);
                }
                this.P1 = z10;
            }
            te.a aVar = k90Var.P;
            if (aVar != null) {
                aVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        k90 k90Var = this.f36451x2;
        if (k90Var.f36863a == 0 && k90Var.f36866e == k90Var.getUserConfig().e() && k90Var.f36867f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f36451x2.d0();
    }
}
