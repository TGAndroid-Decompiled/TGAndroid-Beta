package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ed implements org.telegram.ui.ActionBar.c6 {
    public final fd f37062a;

    public ed(fd fdVar) {
        this.f37062a = fdVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f37062a.f37754y0;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public final boolean a() {
        return this.f37062a.J;
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
        fd fdVar = this.f37062a;
        Drawable drawable = fdVar.f37752x0;
        Drawable drawable2 = fdVar.f37750w0;
        if (str.equals("drawableMsgIn")) {
            return fdVar.f37745s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return fdVar.f37746t0;
        }
        if (str.equals("drawableMsgOut")) {
            return fdVar.f37747u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return fdVar.f37748v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = fdVar.f37741q0;
            if (c6Var != null) {
                return c6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f20889v3;
    }

    @Override
    public final int x0(int i10) {
        fd fdVar = this.f37062a;
        int indexOfKey = fdVar.f37743r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return fdVar.f37743r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = fdVar.f37741q0;
        if (c6Var != null) {
            return c6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public final void J0(int i10, int i11) {
    }
}
