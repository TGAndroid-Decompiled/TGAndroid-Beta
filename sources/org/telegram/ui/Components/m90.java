package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class m90 extends au0 {
    public final n90 f28435w2;

    public m90(n90 n90Var, Context context, long j10, st0 st0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, n90 n90Var2, l90 l90Var, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context, j10, st0Var, 0, null, chatFull, userFull, i10, 0, n90Var2, l90Var, 0, p6Var, bVar);
        this.f28435w2 = n90Var;
    }

    @Override
    public final boolean F0() {
        return this.f28435w2.d0();
    }

    @Override
    public final boolean H() {
        return !this.f28435w2.d0();
    }

    @Override
    public final void M0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        n90 n90Var = this.f28435w2;
        n90Var.f28755w = sparseArray;
        vh.d dVar = n90Var.N;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            n90Var.N.c(size, true);
            if (n90Var.R.getClosestTab() == 8) {
                n90Var.N.i(org.telegram.messenger.dd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void T0(boolean z10) {
        n90 n90Var = this.f28435w2;
        org.telegram.messenger.i0.B2(n90Var.getParentActivity(), n90.a0(n90Var));
    }

    @Override
    public final void U0() {
        super.U0();
        this.f28435w2.g0();
    }

    @Override
    public final void V0(float f7) {
        int i10;
        n90 n90Var = this.f28435w2;
        if (n90Var.f28748a != 1) {
            return;
        }
        if (Math.round(f7 - 8.0f) > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.qf0 qf0Var = n90Var.J;
        if (qf0Var != null && n90Var.L != i10) {
            n90Var.L = i10;
            qf0Var.q(n90Var.K[i10], true);
        }
        n90Var.h0(true);
    }

    @Override
    public final boolean X() {
        n90 n90Var = this.f28435w2;
        if (!n90Var.d0() && n90Var.f28748a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final int getInitialTab() {
        return this.f28435w2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f28435w2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f28435w2.f28752n;
    }

    @Override
    public final void m1(boolean z10) {
        if (this.E1 != z10) {
            super.m1(z10);
            n90 n90Var = this.f28435w2;
            if (n90Var.d0()) {
                if (z10) {
                    r1(null);
                }
                this.O1 = z10;
            }
            fe.b bVar = n90Var.O;
            if (bVar != null) {
                bVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean w0() {
        n90 n90Var = this.f28435w2;
        if (n90Var.f28748a == 0 && n90Var.e == n90Var.getUserConfig().e() && n90Var.f28751f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean x0() {
        return this.f28435w2.d0();
    }

    @Override
    public final boolean z0() {
        if (this.f28435w2.f28748a == 2) {
            return true;
        }
        return false;
    }
}
