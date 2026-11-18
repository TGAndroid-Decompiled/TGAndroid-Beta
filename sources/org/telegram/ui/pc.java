package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class pc implements org.telegram.ui.ActionBar.i6 {
    public final qc f50878a;

    public pc(qc qcVar) {
        this.f50878a = qcVar;
    }

    @Override
    public final boolean d() {
        return this.f50878a.K;
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter f() {
        return org.telegram.ui.ActionBar.n6.f29728v3;
    }

    @Override
    public final Paint g(String str) {
        if (str.equals("paintDivider")) {
            return this.f50878a.f51236z0;
        }
        return org.telegram.ui.ActionBar.n6.V0(str);
    }

    @Override
    public final Drawable getDrawable(String str) {
        qc qcVar = this.f50878a;
        Drawable drawable = qcVar.f51235y0;
        Drawable drawable2 = qcVar.f51233x0;
        if (str.equals("drawableMsgIn")) {
            return qcVar.f51227t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return qcVar.f51228u0;
        }
        if (str.equals("drawableMsgOut")) {
            return qcVar.f51229v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qcVar.f51231w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(k(org.telegram.ui.ActionBar.n6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(k(org.telegram.ui.ActionBar.n6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = qcVar.f51224r0;
            if (i6Var != null) {
                return i6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.n6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        return org.telegram.messenger.bz.H0;
    }

    @Override
    public final int i(int i7) {
        return k(i7);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final int k(int i7) {
        qc qcVar = this.f50878a;
        int indexOfKey = qcVar.f51226s0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return qcVar.f51226s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.i6 i6Var = qcVar.f51224r0;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override
    public final int m(int i7) {
        return k(i7);
    }

    @Override
    public final void l(int i7, int i10) {
    }
}
