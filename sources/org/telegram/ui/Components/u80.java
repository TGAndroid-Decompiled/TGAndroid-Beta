package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class u80 extends zs0 {
    public final v80 f38645w2;

    public u80(v80 v80Var, Context context, long j3, rs0 rs0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i7, v80 v80Var2, t80 t80Var, org.telegram.ui.ActionBar.g6 g6Var, dh.c cVar) {
        super(context, j3, rs0Var, 0, null, chatFull, userFull, i7, 0, v80Var2, t80Var, 0, g6Var, cVar);
        this.f38645w2 = v80Var;
    }

    @Override
    public final boolean A0() {
        if (this.f38645w2.f39003a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f38645w2.d0();
    }

    @Override
    public final boolean I0() {
        return this.f38645w2.d0();
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        boolean z9;
        int size = sparseArray.size();
        v80 v80Var = this.f38645w2;
        v80Var.f39011w = sparseArray;
        fi.d dVar = v80Var.N;
        if (dVar != null) {
            if (size > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            dVar.setEnabled(z9);
            v80Var.N.c(size, true);
            if (v80Var.R.getClosestTab() == 8) {
                v80Var.N.i(org.telegram.messenger.id.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void X0(boolean z9) {
        v80 v80Var = this.f38645w2;
        org.telegram.messenger.g0.B2(v80Var.getParentActivity(), v80.a0(v80Var));
    }

    @Override
    public final boolean Y() {
        v80 v80Var = this.f38645w2;
        if (!v80Var.d0() && v80Var.f39003a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y0() {
        super.Y0();
        this.f38645w2.g0();
    }

    @Override
    public final void Z0(float f10) {
        int i7;
        v80 v80Var = this.f38645w2;
        if (v80Var.f39003a != 1) {
            return;
        }
        if (Math.round(f10 - 8.0f) > 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        org.telegram.ui.ne0 ne0Var = v80Var.J;
        if (ne0Var != null && v80Var.L != i7) {
            v80Var.L = i7;
            ne0Var.q(v80Var.K[i7], true);
        }
        v80Var.h0(true);
    }

    @Override
    public final int getInitialTab() {
        return this.f38645w2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f38645w2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f38645w2.f39008n;
    }

    @Override
    public final void q1(boolean z9) {
        if (this.E1 != z9) {
            super.q1(z9);
            v80 v80Var = this.f38645w2;
            if (v80Var.d0()) {
                if (z9) {
                    v1(null);
                }
                this.O1 = z9;
            }
            te.a aVar = v80Var.O;
            if (aVar != null) {
                aVar.a(z9, true);
            }
        }
    }

    @Override
    public final boolean x0() {
        v80 v80Var = this.f38645w2;
        if (v80Var.f39003a == 0 && v80Var.f39006e == v80Var.getUserConfig().e() && v80Var.f39007f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return this.f38645w2.d0();
    }
}
