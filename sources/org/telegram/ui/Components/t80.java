package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class t80 extends xs0 {
    public final u80 f38297w2;

    public t80(u80 u80Var, Context context, long j3, ps0 ps0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, u80 u80Var2, s80 s80Var, org.telegram.ui.ActionBar.f6 f6Var, dh.c cVar) {
        super(context, j3, ps0Var, 0, null, chatFull, userFull, i7, 0, u80Var2, s80Var, 0, f6Var, cVar);
        this.f38297w2 = u80Var;
    }

    @Override
    public final boolean A0() {
        if (this.f38297w2.f38552a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0() {
        return this.f38297w2.d0();
    }

    @Override
    public final boolean I() {
        return !this.f38297w2.d0();
    }

    @Override
    public final void O0(SparseArray sparseArray) {
        boolean z9;
        int size = sparseArray.size();
        u80 u80Var = this.f38297w2;
        u80Var.f38560w = sparseArray;
        fi.d dVar = u80Var.N;
        if (dVar != null) {
            if (size > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            dVar.setEnabled(z9);
            u80Var.N.c(size, true);
            if (u80Var.R.getClosestTab() == 8) {
                u80Var.N.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void V0(boolean z9) {
        u80 u80Var = this.f38297w2;
        org.telegram.messenger.g0.B2(u80Var.getParentActivity(), u80.a0(u80Var));
    }

    @Override
    public final void W0() {
        super.W0();
        this.f38297w2.g0();
    }

    @Override
    public final void X0(float f10) {
        int i7;
        u80 u80Var = this.f38297w2;
        if (u80Var.f38552a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.le0 le0Var = u80Var.J;
        if (le0Var != null && u80Var.L != i7) {
            u80Var.L = i7;
            le0Var.q(u80Var.K[i7], true);
        }
        u80Var.h0(true);
    }

    @Override
    public final boolean Y() {
        u80 u80Var = this.f38297w2;
        if (!u80Var.d0() && u80Var.f38552a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final int getInitialTab() {
        return this.f38297w2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f38297w2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f38297w2.f38557n;
    }

    @Override
    public final void o1(boolean z9) {
        if (this.E1 != z9) {
            super.o1(z9);
            u80 u80Var = this.f38297w2;
            if (u80Var.d0()) {
                if (z9) {
                    t1(null);
                }
                this.O1 = z9;
            }
            te.a aVar = u80Var.O;
            if (aVar != null) {
                aVar.a(z9, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        u80 u80Var = this.f38297w2;
        if (u80Var.f38552a == 0 && u80Var.f38555e == u80Var.getUserConfig().e() && u80Var.f38556f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f38297w2.d0();
    }
}
