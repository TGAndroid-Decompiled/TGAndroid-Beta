package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.g6 {
    public final bd f35131a;

    public ad(bd bdVar) {
        this.f35131a = bdVar;
    }

    @Override
    public final int B0(int i10) {
        bd bdVar = this.f35131a;
        int indexOfKey = bdVar.f35439o0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f35439o0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.f35438n0;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f35131a.f35448v0;
        }
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    @Override
    public final int Z0(int i10) {
        return B0(i10);
    }

    @Override
    public final boolean a() {
        return this.f35131a.G;
    }

    @Override
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f35131a;
        Drawable drawable = bdVar.f35447u0;
        Drawable drawable2 = bdVar.f35446t0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f35440p0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f35441q0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f35443r0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f35445s0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(B0(org.telegram.ui.ActionBar.k6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(B0(org.telegram.ui.ActionBar.k6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = bdVar.f35438n0;
            if (g6Var != null) {
                return g6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.k6.O0(str);
        }
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean o0() {
        return false;
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21976v3;
    }

    @Override
    public final void J0(int i10, int i11) {
    }
}
