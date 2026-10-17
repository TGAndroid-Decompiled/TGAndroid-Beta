package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class cd implements org.telegram.ui.ActionBar.d6 {
    public final dd f35917a;

    public cd(dd ddVar) {
        this.f35917a = ddVar;
    }

    @Override
    public final int I(int i10) {
        return u(i10);
    }

    @Override
    public final boolean a() {
        return this.f35917a.J;
    }

    @Override
    public final void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final Drawable getDrawable(String str) {
        dd ddVar = this.f35917a;
        Drawable drawable = ddVar.f36167x0;
        Drawable drawable2 = ddVar.f36165w0;
        if (str.equals("drawableMsgIn")) {
            return ddVar.f36160s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return ddVar.f36161t0;
        }
        if (str.equals("drawableMsgOut")) {
            return ddVar.f36162u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ddVar.f36163v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(u(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(u(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = ddVar.f36156q0;
            if (d6Var != null) {
                return d6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.f21316v3;
    }

    @Override
    public final Paint n(String str) {
        if (str.equals("paintDivider")) {
            return this.f35917a.f36169y0;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public final int r(int i10) {
        return u(i10);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final int u(int i10) {
        dd ddVar = this.f35917a;
        int indexOfKey = ddVar.f36158r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return ddVar.f36158r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = ddVar.f36156q0;
        if (d6Var != null) {
            return d6Var.u(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public final void B(int i10, int i11) {
    }
}
