package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class fd implements org.telegram.ui.ActionBar.c6 {
    public final gd f35507a;

    public fd(gd gdVar) {
        this.f35507a = gdVar;
    }

    @Override
    public final int E0(int i10) {
        gd gdVar = this.f35507a;
        int indexOfKey = gdVar.f36159r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return gdVar.f36159r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = gdVar.f36157q0;
        if (c6Var != null) {
            return c6Var.E0(i10);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f35507a.f36170y0;
        }
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override
    public final boolean a() {
        return this.f35507a.J;
    }

    @Override
    public final int b0(int i10) {
        return E0(i10);
    }

    @Override
    public final int f1(int i10) {
        return E0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        gd gdVar = this.f35507a;
        Drawable drawable = gdVar.f36168x0;
        Drawable drawable2 = gdVar.f36166w0;
        if (str.equals("drawableMsgIn")) {
            return gdVar.f36161s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return gdVar.f36162t0;
        }
        if (str.equals("drawableMsgOut")) {
            return gdVar.f36163u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return gdVar.f36164v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(E0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(E0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = gdVar.f36157q0;
            if (c6Var != null) {
                return c6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.g6.P0(str);
        }
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.g6.f19930v3;
    }

    @Override
    public final void M0(int i10, int i11) {
    }
}
