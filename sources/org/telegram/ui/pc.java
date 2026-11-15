package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class pc implements org.telegram.ui.ActionBar.e6 {
    public final qc f50240a;

    public pc(qc qcVar) {
        this.f50240a = qcVar;
    }

    @Override
    public final boolean a() {
        return this.f50240a.K;
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.j6.f29181v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f50240a.f50587z0;
        }
        return org.telegram.ui.ActionBar.j6.V0(str);
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.gz.H0;
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        qc qcVar = this.f50240a;
        Drawable drawable = qcVar.f50586y0;
        Drawable drawable2 = qcVar.f50584x0;
        if (str.equals("drawableMsgIn")) {
            return qcVar.f50578t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return qcVar.f50579u0;
        }
        if (str.equals("drawableMsgOut")) {
            return qcVar.f50580v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qcVar.f50582w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.j6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.j6.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = qcVar.f50575r0;
            if (e6Var != null) {
                return e6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.j6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        qc qcVar = this.f50240a;
        int indexOfKey = qcVar.f50577s0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return qcVar.f50577s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = qcVar.f50575r0;
        if (e6Var != null) {
            return e6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.j6.v0(i7);
    }

    @Override
    public final int j(int i7) {
        return h(i7);
    }

    @Override
    public final void i(int i7, int i10) {
    }
}
