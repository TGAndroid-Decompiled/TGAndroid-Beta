package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.e6 {
    public final bd f32004a;

    public ad(bd bdVar) {
        this.f32004a = bdVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f32004a.f32343y0;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        bd bdVar = this.f32004a;
        int indexOfKey = bdVar.f32332r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f32332r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = bdVar.f32330q0;
        if (e6Var != null) {
            return e6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f32004a.J;
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
        bd bdVar = this.f32004a;
        Drawable drawable = bdVar.f32341x0;
        Drawable drawable2 = bdVar.f32339w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f32334s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f32335t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f32336u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f32337v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = bdVar.f32330q0;
            if (e6Var != null) {
                return e6Var.getDrawable(str);
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
        return org.telegram.ui.ActionBar.j6.f19390v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
