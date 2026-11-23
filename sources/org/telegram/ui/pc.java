package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class pc implements org.telegram.ui.ActionBar.h6 {
    public final qc f50820a;

    public pc(qc qcVar) {
        this.f50820a = qcVar;
    }

    @Override
    public final boolean d() {
        return this.f50820a.K;
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter f() {
        return org.telegram.ui.ActionBar.m6.f29679v3;
    }

    @Override
    public final Paint g(String str) {
        if (str.equals("paintDivider")) {
            return this.f50820a.f51175z0;
        }
        return org.telegram.ui.ActionBar.m6.V0(str);
    }

    @Override
    public final Drawable getDrawable(String str) {
        qc qcVar = this.f50820a;
        Drawable drawable = qcVar.f51174y0;
        Drawable drawable2 = qcVar.f51172x0;
        if (str.equals("drawableMsgIn")) {
            return qcVar.f51166t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return qcVar.f51167u0;
        }
        if (str.equals("drawableMsgOut")) {
            return qcVar.f51168v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qcVar.f51170w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(k(org.telegram.ui.ActionBar.m6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(k(org.telegram.ui.ActionBar.m6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = qcVar.f51163r0;
            if (h6Var != null) {
                return h6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.m6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        return org.telegram.messenger.cz.H0;
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
        qc qcVar = this.f50820a;
        int indexOfKey = qcVar.f51165s0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return qcVar.f51165s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.h6 h6Var = qcVar.f51163r0;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override
    public final int m(int i7) {
        return k(i7);
    }

    @Override
    public final void l(int i7, int i10) {
    }
}
