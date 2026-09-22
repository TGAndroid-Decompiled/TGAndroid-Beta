package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.f6 {
    public final bd f32058a;

    public ad(bd bdVar) {
        this.f32058a = bdVar;
    }

    @Override
    public final int F0(int i10) {
        bd bdVar = this.f32058a;
        int indexOfKey = bdVar.f32394r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f32394r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.f32392q0;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f32058a.f32405y0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final boolean a() {
        return this.f32058a.J;
    }

    @Override
    public final int f0(int i10) {
        return F0(i10);
    }

    @Override
    public final int g1(int i10) {
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f32058a;
        Drawable drawable = bdVar.f32403x0;
        Drawable drawable2 = bdVar.f32401w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f32396s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f32397t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f32398u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f32399v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(F0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(F0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = bdVar.f32392q0;
            if (f6Var != null) {
                return f6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.j6.O0(str);
        }
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean n0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19437v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
