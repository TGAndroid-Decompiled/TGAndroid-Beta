package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class cd implements org.telegram.ui.ActionBar.f6 {
    public final dd f33082a;

    public cd(dd ddVar) {
        this.f33082a = ddVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f33082a.f33443v0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final boolean a() {
        return this.f33082a.G;
    }

    @Override
    public final int d0(int i10) {
        return x0(i10);
    }

    @Override
    public final int f1(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        dd ddVar = this.f33082a;
        Drawable drawable = ddVar.f33442u0;
        Drawable drawable2 = ddVar.f33441t0;
        if (str.equals("drawableMsgIn")) {
            return ddVar.f33435p0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return ddVar.f33436q0;
        }
        if (str.equals("drawableMsgOut")) {
            return ddVar.f33438r0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ddVar.f33440s0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = ddVar.f33433n0;
            if (f6Var != null) {
                return f6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.j6.O0(str);
        }
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20197v3;
    }

    @Override
    public final int x0(int i10) {
        dd ddVar = this.f33082a;
        int indexOfKey = ddVar.f33434o0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return ddVar.f33434o0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = ddVar.f33433n0;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final void J0(int i10, int i11) {
    }
}
