package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends bw0 {
    public final ua0 f32922r2;

    public ta0(ua0 ua0Var, Context context, long j10, tv0 tv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ua0 ua0Var2, sa0 sa0Var, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context, j10, tv0Var, 0, null, chatFull, userFull, i10, 0, ua0Var2, sa0Var, 0, u6Var, bVar);
        this.f32922r2 = ua0Var;
    }

    @Override
    public final boolean D0() {
        return this.f32922r2.Z();
    }

    @Override
    public final boolean G() {
        return !this.f32922r2.Z();
    }

    @Override
    public final void K0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        ua0 ua0Var = this.f32922r2;
        ua0Var.v = sparseArray;
        fi.d dVar = ua0Var.N;
        if (dVar != null) {
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.setEnabled(z10);
            ua0Var.N.b(size, true);
            if (ua0Var.R.getClosestTab() == 8) {
                ua0Var.N.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
            }
        }
    }

    @Override
    public final void R0(boolean z10) {
        ua0 ua0Var = this.f32922r2;
        AndroidUtilities.removeAdjustResize(ua0Var.getParentActivity(), ua0.W(ua0Var));
    }

    @Override
    public final void S0() {
        super.S0();
        this.f32922r2.c0();
    }

    @Override
    public final void T0(float f7) {
        int i10;
        ua0 ua0Var = this.f32922r2;
        if (ua0Var.f33323a != 1) {
            return;
        }
        if (Math.round(f7 - 8.0f) > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.tg0 tg0Var = ua0Var.J;
        if (tg0Var != null && ua0Var.L != i10) {
            ua0Var.L = i10;
            tg0Var.q(ua0Var.K[i10], true);
        }
        ua0Var.d0(true);
    }

    @Override
    public final boolean V() {
        ua0 ua0Var = this.f32922r2;
        if (!ua0Var.Z() && ua0Var.f33323a != 3) {
            return false;
        }
        return true;
    }

    @Override
    public final int getInitialTab() {
        return this.f32922r2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f32922r2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f32922r2.f33327n;
    }

    @Override
    public final void k1(boolean z10) {
        if (this.E1 != z10) {
            super.k1(z10);
            ua0 ua0Var = this.f32922r2;
            if (ua0Var.Z()) {
                if (z10) {
                    p1(null);
                }
                this.O1 = z10;
            }
            oe.b bVar = ua0Var.O;
            if (bVar != null) {
                bVar.a(z10, true);
            }
        }
    }

    @Override
    public final boolean u0() {
        ua0 ua0Var = this.f32922r2;
        if (ua0Var.f33323a == 0 && ua0Var.e == ua0Var.getUserConfig().getClientUserId() && ua0Var.f33326f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        return this.f32922r2.Z();
    }

    @Override
    public final boolean x0() {
        if (this.f32922r2.f33323a == 2) {
            return true;
        }
        return false;
    }
}
