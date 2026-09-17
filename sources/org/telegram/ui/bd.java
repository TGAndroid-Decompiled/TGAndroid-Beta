package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class bd implements org.telegram.ui.ActionBar.f6 {
    public final cd f32103a;

    public bd(cd cdVar) {
        this.f32103a = cdVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f32103a.f32757y0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        cd cdVar = this.f32103a;
        int indexOfKey = cdVar.f32746r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cdVar.f32746r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cdVar.f32744q0;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f32103a.J;
    }

    @Override
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        cd cdVar = this.f32103a;
        Drawable drawable = cdVar.f32755x0;
        Drawable drawable2 = cdVar.f32753w0;
        if (str.equals("drawableMsgIn")) {
            return cdVar.f32748s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cdVar.f32749t0;
        }
        if (str.equals("drawableMsgOut")) {
            return cdVar.f32750u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return cdVar.f32751v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = cdVar.f32744q0;
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
    public final boolean p0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19189v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
