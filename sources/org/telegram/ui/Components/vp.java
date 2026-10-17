package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class vp {
    public final org.telegram.ui.ActionBar.c4 f31889a;
    public Drawable f31890b;
    public int f31891c;
    public boolean d;

    public vp(org.telegram.ui.ActionBar.c4 c4Var) {
        this.f31889a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.f31889a;
        if (c4Var != null && !c4Var.f20719a) {
            return c4Var.e;
        }
        return null;
    }
}
