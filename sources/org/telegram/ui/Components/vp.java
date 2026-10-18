package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class vp {
    public final org.telegram.ui.ActionBar.c4 f31896a;
    public Drawable f31897b;
    public int f31898c;
    public boolean d;

    public vp(org.telegram.ui.ActionBar.c4 c4Var) {
        this.f31896a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.f31896a;
        if (c4Var != null && !c4Var.f20726a) {
            return c4Var.e;
        }
        return null;
    }
}
