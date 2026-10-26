package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class sa0 extends aw0 {
    public final ta0 f32500r2;

    public sa0(ta0 ta0Var, Context context, long j10, sv0 sv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ta0 ta0Var2, ra0 ra0Var, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context, j10, sv0Var, 0, null, chatFull, userFull, i10, 0, ta0Var2, ra0Var, 0, u6Var, bVar);
        this.f32500r2 = ta0Var;
    }

    @Override
    public final boolean D0() {
        return this.f32500r2.Z();
    }

    @Override
    public final boolean G() {
        return !this.f32500r2.Z();
    }

    @Override
    public final void K0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        ta0 ta0Var = this.f32500r2;
        ta0Var.v = sparseArray;
        fi.d dVar = ta0Var.N;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            ta0Var.N.b(size, true);
            if (ta0Var.R.getClosestTab() == 8) {
                ta0Var.N.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void R0(boolean z10) {
        ta0 ta0Var = this.f32500r2;
        AndroidUtilities.removeAdjustResize(ta0Var.getParentActivity(), ta0.W(ta0Var));
    }

    @Override
    public final void S0() {
        super.S0();
        this.f32500r2.c0();
    }

    @Override
    public final void T0(float f7) {
        int i10;
        ta0 ta0Var = this.f32500r2;
        if (ta0Var.f32950a != 1) {
            return;
        }
        if (Math.round(f7 - 8.0f) > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.rg0 rg0Var = ta0Var.J;
        if (rg0Var != null && ta0Var.L != i10) {
            ta0Var.L = i10;
            rg0Var.q(ta0Var.K[i10], true);
        }
        ta0Var.d0(true);
    }

    @Override
    public final boolean V() {
        ta0 ta0Var = this.f32500r2;
        if (!ta0Var.Z() && ta0Var.f32950a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final int getInitialTab() {
        return this.f32500r2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f32500r2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f32500r2.f32954n;
    }

    @Override
    public final void k1(boolean z10) {
        if (this.E1 != z10) {
            super.k1(z10);
            ta0 ta0Var = this.f32500r2;
            if (ta0Var.Z()) {
                if (z10) {
                    p1(null);
                }
                this.O1 = z10;
            }
            oe.b bVar = ta0Var.O;
            if (bVar != null) {
                bVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean u0() {
        ta0 ta0Var = this.f32500r2;
        if (ta0Var.f32950a == 0 && ta0Var.e == ta0Var.getUserConfig().getClientUserId() && ta0Var.f32953f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        return this.f32500r2.Z();
    }

    @Override
    public final boolean x0() {
        if (this.f32500r2.f32950a == 2) {
            return true;
        }
        return false;
    }
}
