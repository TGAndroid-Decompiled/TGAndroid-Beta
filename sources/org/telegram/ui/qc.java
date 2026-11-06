package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class qc implements org.telegram.ui.ActionBar.f6 {
    public final rc f49189a;

    public qc(rc rcVar) {
        this.f49189a = rcVar;
    }

    @Override
    public final boolean a() {
        return this.f49189a.J;
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f28180v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f49189a.f49481y0;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.iz.H0;
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
        rc rcVar = this.f49189a;
        Drawable drawable = rcVar.f49479x0;
        Drawable drawable2 = rcVar.f49477w0;
        if (str.equals("drawableMsgIn")) {
            return rcVar.f49472s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return rcVar.f49473t0;
        }
        if (str.equals("drawableMsgOut")) {
            return rcVar.f49474u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return rcVar.f49475v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.k6.f28262zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.k6.f28262zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = rcVar.f49468q0;
            if (f6Var != null) {
                return f6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.k6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        rc rcVar = this.f49189a;
        int indexOfKey = rcVar.f49470r0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return rcVar.f49470r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = rcVar.f49468q0;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.k6.v0(i7);
    }

    @Override
    public final int j(int i7) {
        return h(i7);
    }

    @Override
    public final void i(int i7, int i10) {
    }
}
