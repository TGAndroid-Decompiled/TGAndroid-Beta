package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class vp {
    public final org.telegram.ui.ActionBar.c4 f31900a;
    public Drawable f31901b;
    public int f31902c;
    public boolean d;

    public vp(org.telegram.ui.ActionBar.c4 c4Var) {
        this.f31900a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.f31900a;
        if (c4Var != null && !c4Var.f20722a) {
            return c4Var.e;
        }
        return null;
    }
}
