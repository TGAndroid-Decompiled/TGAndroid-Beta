package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.f6 {
    public final bd f32520a;

    public ad(bd bdVar) {
        this.f32520a = bdVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f32520a.f32937v0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final boolean a() {
        return this.f32520a.G;
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    @Override
    public final int g1(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f32520a;
        Drawable drawable = bdVar.f32936u0;
        Drawable drawable2 = bdVar.f32935t0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f32929p0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f32930q0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f32932r0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f32934s0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = bdVar.f32927n0;
            if (f6Var != null) {
                return f6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.j6.O0(str);
        }
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20222v3;
    }

    @Override
    public final int x0(int i10) {
        bd bdVar = this.f32520a;
        int indexOfKey = bdVar.f32928o0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f32928o0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.f32927n0;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final void K0(int i10, int i11) {
    }
}
