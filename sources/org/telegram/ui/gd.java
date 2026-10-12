package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class gd implements org.telegram.ui.ActionBar.c6 {
    public final hd f36376a;

    public gd(hd hdVar) {
        this.f36376a = hdVar;
    }

    @Override
    public final int F0(int i10) {
        hd hdVar = this.f36376a;
        int indexOfKey = hdVar.f36746r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return hdVar.f36746r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = hdVar.f36744q0;
        if (c6Var != null) {
            return c6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f36376a.f36757y0;
        }
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override
    public final boolean a() {
        return this.f36376a.J;
    }

    @Override
    public final int b0(int i10) {
        return F0(i10);
    }

    @Override
    public final int g1(int i10) {
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        hd hdVar = this.f36376a;
        Drawable drawable = hdVar.f36755x0;
        Drawable drawable2 = hdVar.f36753w0;
        if (str.equals("drawableMsgIn")) {
            return hdVar.f36748s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return hdVar.f36749t0;
        }
        if (str.equals("drawableMsgOut")) {
            return hdVar.f36750u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return hdVar.f36751v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(F0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(F0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = hdVar.f36744q0;
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
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.f20230v3;
    }

    @Override
    public final void N0(int i10, int i11) {
    }
}
