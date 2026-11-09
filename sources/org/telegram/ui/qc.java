package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class qc implements org.telegram.ui.ActionBar.g6 {
    public final rc f49020a;

    public qc(rc rcVar) {
        this.f49020a = rcVar;
    }

    @Override
    public final boolean a() {
        return this.f49020a.J;
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.l6.f28197v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f49020a.f49440y0;
        }
        return org.telegram.ui.ActionBar.l6.V0(str);
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
        rc rcVar = this.f49020a;
        Drawable drawable = rcVar.f49438x0;
        Drawable drawable2 = rcVar.f49436w0;
        if (str.equals("drawableMsgIn")) {
            return rcVar.f49431s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return rcVar.f49432t0;
        }
        if (str.equals("drawableMsgOut")) {
            return rcVar.f49433u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return rcVar.f49434v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.l6.f28279zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.l6.f28279zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = rcVar.f49427q0;
            if (g6Var != null) {
                return g6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.l6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        rc rcVar = this.f49020a;
        int indexOfKey = rcVar.f49429r0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return rcVar.f49429r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.g6 g6Var = rcVar.f49427q0;
        if (g6Var != null) {
            return g6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.l6.v0(i7);
    }

    @Override
    public final int j(int i7) {
        return h(i7);
    }

    @Override
    public final void i(int i7, int i10) {
    }
}
