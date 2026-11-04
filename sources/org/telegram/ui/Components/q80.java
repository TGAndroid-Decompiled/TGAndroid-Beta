package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class q80 extends ws0 {
    public final r80 f37380x2;

    public q80(r80 r80Var, Context context, long j10, os0 os0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i3, r80 r80Var2, p80 p80Var, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(context, j10, os0Var, 0, null, chatFull, userFull, i3, 0, r80Var2, p80Var, 0, e6Var, cVar);
        this.f37380x2 = r80Var;
    }

    @Override
    public final boolean A0() {
        if (this.f37380x2.f37681a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0() {
        return this.f37380x2.d0();
    }

    @Override
    public final boolean I() {
        return !this.f37380x2.d0();
    }

    @Override
    public final void O0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        r80 r80Var = this.f37380x2;
        r80Var.f37689w = sparseArray;
        gi.d dVar = r80Var.O;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            r80Var.O.c(size, true);
            if (r80Var.S.getClosestTab() == 8) {
                r80Var.O.i(org.telegram.messenger.bd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void V0(boolean z10) {
        r80 r80Var = this.f37380x2;
        org.telegram.messenger.g0.B2(r80Var.getParentActivity(), r80.a0(r80Var));
    }

    @Override
    public final void W0() {
        super.W0();
        this.f37380x2.g0();
    }

    @Override
    public final void X0(float f10) {
        int i3;
        r80 r80Var = this.f37380x2;
        if (r80Var.f37681a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        org.telegram.ui.ge0 ge0Var = r80Var.K;
        if (ge0Var != null && r80Var.M != i3) {
            r80Var.M = i3;
            ge0Var.q(r80Var.L[i3], true);
        }
        r80Var.h0(true);
    }

    @Override
    public final boolean Y() {
        r80 r80Var = this.f37380x2;
        if (!r80Var.d0() && r80Var.f37681a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final int getInitialTab() {
        return this.f37380x2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f37380x2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f37380x2.f37686n;
    }

    @Override
    public final void o1(boolean z10) {
        if (this.F1 != z10) {
            super.o1(z10);
            r80 r80Var = this.f37380x2;
            if (r80Var.d0()) {
                if (z10) {
                    t1(null);
                }
                this.P1 = z10;
            }
            qe.a aVar = r80Var.P;
            if (aVar != null) {
                aVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        r80 r80Var = this.f37380x2;
        if (r80Var.f37681a == 0 && r80Var.f37684e == r80Var.getUserConfig().e() && r80Var.f37685f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f37380x2.d0();
    }
}
