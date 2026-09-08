package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.f6 {
    public final bd f34413a;

    public ad(bd bdVar) {
        this.f34413a = bdVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f34413a.f34795y0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        bd bdVar = this.f34413a;
        int indexOfKey = bdVar.f34784r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f34784r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.f34782q0;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f34413a.J;
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f34413a;
        Drawable drawable = bdVar.f34793x0;
        Drawable drawable2 = bdVar.f34791w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f34786s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f34787t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f34788u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f34789v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = bdVar.f34782q0;
            if (f6Var != null) {
                return f6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.j6.O0(str);
        }
    }

    @Override
    public final int h0(int i10) {
        return G0(i10);
    }

    @Override
    public final int h1(int i10) {
        return G0(i10);
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean o0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f21014v3;
    }

    @Override
    public final void O0(int i10, int i11) {
    }
}
