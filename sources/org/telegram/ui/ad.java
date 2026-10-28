package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.u6 {
    public final bd f37735a;

    public ad(bd bdVar) {
        this.f37735a = bdVar;
    }

    @Override
    public final boolean a() {
        return this.f37735a.J;
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.f23690v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f37735a.f38010y0;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g(int i10) {
        bd bdVar = this.f37735a;
        int indexOfKey = bdVar.f37999r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f37999r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.u6 u6Var = bdVar.f37997q0;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f37735a;
        Drawable drawable = bdVar.f38008x0;
        Drawable drawable2 = bdVar.f38006w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f38001s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f38002t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f38003u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f38004v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(g(org.telegram.ui.ActionBar.y6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(g(org.telegram.ui.ActionBar.y6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = bdVar.f37997q0;
            if (u6Var != null) {
                return u6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.y6.Q0(str);
        }
    }

    @Override
    public final int i(int i10) {
        return g(i10);
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
