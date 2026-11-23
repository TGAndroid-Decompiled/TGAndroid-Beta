package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class pc implements org.telegram.ui.ActionBar.i6 {
    public final qc f50967a;

    public pc(qc qcVar) {
        this.f50967a = qcVar;
    }

    @Override
    public final boolean b() {
        return this.f50967a.K;
    }

    @Override
    public final void c(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter d() {
        return org.telegram.ui.ActionBar.n6.f29783v3;
    }

    @Override
    public final Paint e(String str) {
        if (str.equals("paintDivider")) {
            return this.f50967a.f51436z0;
        }
        return org.telegram.ui.ActionBar.n6.V0(str);
    }

    @Override
    public final boolean f() {
        return org.telegram.messenger.bz.H0;
    }

    @Override
    public final int g(int i7) {
        return i(i7);
    }

    @Override
    public final Drawable getDrawable(String str) {
        qc qcVar = this.f50967a;
        Drawable drawable = qcVar.f51435y0;
        Drawable drawable2 = qcVar.f51433x0;
        if (str.equals("drawableMsgIn")) {
            return qcVar.f51427t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return qcVar.f51428u0;
        }
        if (str.equals("drawableMsgOut")) {
            return qcVar.f51429v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qcVar.f51431w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(i(org.telegram.ui.ActionBar.n6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(i(org.telegram.ui.ActionBar.n6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = qcVar.f51424r0;
            if (i6Var != null) {
                return i6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.n6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final int i(int i7) {
        qc qcVar = this.f50967a;
        int indexOfKey = qcVar.f51426s0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return qcVar.f51426s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.i6 i6Var = qcVar.f51424r0;
        if (i6Var != null) {
            return i6Var.i(i7);
        }
        return org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override
    public final int k(int i7) {
        return i(i7);
    }

    @Override
    public final void j(int i7, int i10) {
    }
}
