package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class oc implements org.telegram.ui.ActionBar.e6 {
    public final pc f48256a;

    public oc(pc pcVar) {
        this.f48256a = pcVar;
    }

    @Override
    public final boolean a() {
        return this.f48256a.K;
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f28211v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f48256a.f48545z0;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.az.H0;
    }

    @Override
    public final int f(int i3) {
        return h(i3);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        pc pcVar = this.f48256a;
        Drawable drawable = pcVar.f48544y0;
        Drawable drawable2 = pcVar.f48542x0;
        if (str.equals("drawableMsgIn")) {
            return pcVar.f48536t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return pcVar.f48537u0;
        }
        if (str.equals("drawableMsgOut")) {
            return pcVar.f48538v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return pcVar.f48540w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.k6.f28295zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.k6.f28295zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = pcVar.f48533r0;
            if (e6Var != null) {
                return e6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.k6.R0(str);
        }
    }

    @Override
    public final int h(int i3) {
        pc pcVar = this.f48256a;
        int indexOfKey = pcVar.f48535s0.indexOfKey(i3);
        if (indexOfKey >= 0) {
            return pcVar.f48535s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = pcVar.f48533r0;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return org.telegram.ui.ActionBar.k6.v0(i3);
    }

    @Override
    public final int j(int i3) {
        return h(i3);
    }

    @Override
    public final void i(int i3, int i10) {
    }
}
