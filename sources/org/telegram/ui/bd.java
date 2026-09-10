package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class bd implements org.telegram.ui.ActionBar.f6 {
    public final cd f31236a;

    public bd(cd cdVar) {
        this.f31236a = cdVar;
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f31236a.f31641y0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final int F0(int i10) {
        cd cdVar = this.f31236a;
        int indexOfKey = cdVar.f31630r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cdVar.f31630r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cdVar.f31628q0;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f31236a.J;
    }

    @Override
    public final int e0(int i10) {
        return F0(i10);
    }

    @Override
    public final int f1(int i10) {
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        cd cdVar = this.f31236a;
        Drawable drawable = cdVar.f31639x0;
        Drawable drawable2 = cdVar.f31637w0;
        if (str.equals("drawableMsgIn")) {
            return cdVar.f31632s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cdVar.f31633t0;
        }
        if (str.equals("drawableMsgOut")) {
            return cdVar.f31634u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return cdVar.f31635v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(F0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(F0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = cdVar.f31628q0;
            if (f6Var != null) {
                return f6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.j6.O0(str);
        }
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.f18251v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
