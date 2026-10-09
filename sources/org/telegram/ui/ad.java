package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ad implements org.telegram.ui.ActionBar.e6 {
    public final bd f35907a;

    public ad(bd bdVar) {
        this.f35907a = bdVar;
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f35907a.f36279y0;
        }
        return org.telegram.ui.ActionBar.i6.T0(str);
    }

    @Override
    public final boolean a() {
        return this.f35907a.J;
    }

    @Override
    public final int a1(int i10) {
        return x0(i10);
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        bd bdVar = this.f35907a;
        Drawable drawable = bdVar.f36277x0;
        Drawable drawable2 = bdVar.f36275w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.f36270s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.f36271t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.f36272u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.f36273v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = bdVar.f36266q0;
            if (e6Var != null) {
                return e6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.i6.P0(str);
        }
    }

    @Override
    public final boolean k0() {
        return false;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21125v3;
    }

    @Override
    public final int x0(int i10) {
        bd bdVar = this.f35907a;
        int indexOfKey = bdVar.f36268r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.f36268r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = bdVar.f36266q0;
        if (e6Var != null) {
            return e6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    @Override
    public final void I0(int i10, int i11) {
    }
}
