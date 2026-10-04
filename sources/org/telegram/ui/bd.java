package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class bd implements org.telegram.ui.ActionBar.d6 {
    public final cd f35060a;

    public bd(cd cdVar) {
        this.f35060a = cdVar;
    }

    @Override
    public final Paint H(String str) {
        if (str.equals("paintDivider")) {
            return this.f35060a.f35443y0;
        }
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override
    public final int H0(int i10) {
        cd cdVar = this.f35060a;
        int indexOfKey = cdVar.f35432r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cdVar.f35432r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = cdVar.f35430q0;
        if (d6Var != null) {
            return d6Var.H0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f35060a.J;
    }

    @Override
    public final Drawable getDrawable(String str) {
        cd cdVar = this.f35060a;
        Drawable drawable = cdVar.f35441x0;
        Drawable drawable2 = cdVar.f35439w0;
        if (str.equals("drawableMsgIn")) {
            return cdVar.f35434s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cdVar.f35435t0;
        }
        if (str.equals("drawableMsgOut")) {
            return cdVar.f35436u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return cdVar.f35437v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(H0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(H0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = cdVar.f35430q0;
            if (d6Var != null) {
                return d6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.i6.O0(str);
        }
    }

    @Override
    public final int j0(int i10) {
        return H0(i10);
    }

    @Override
    public final int j1(int i10) {
        return H0(i10);
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean r0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21150v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
