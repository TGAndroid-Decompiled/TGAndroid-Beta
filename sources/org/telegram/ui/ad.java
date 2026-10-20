package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.d6 {
    public final bd f35347a;

    public ad(bd bdVar) {
        this.f35347a = bdVar;
    }

    @Override
    public final int G(int i10) {
        return w(i10);
    }

    @Override
    public final boolean a() {
        return this.f35347a.J;
    }

    @Override
    public final void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f35347a;
        Drawable drawable = bdVar.f35603x0;
        Drawable drawable2 = bdVar.f35601w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f35596s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f35597t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f35598u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f35599v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(w(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(w(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = bdVar.f35592q0;
            if (d6Var != null) {
                return d6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.f21320v3;
    }

    @Override
    public final Paint n(String str) {
        if (str.equals("paintDivider")) {
            return this.f35347a.f35605y0;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public final int r(int i10) {
        return w(i10);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final int w(int i10) {
        bd bdVar = this.f35347a;
        int indexOfKey = bdVar.f35594r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f35594r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = bdVar.f35592q0;
        if (d6Var != null) {
            return d6Var.w(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public final void B(int i10, int i11) {
    }
}
