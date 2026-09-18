package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class lp {
    public final org.telegram.ui.ActionBar.d4 f26230a;
    public Drawable f26231b;
    public int f26232c;
    public boolean d;
    public Bitmap e;

    public lp(org.telegram.ui.ActionBar.d4 d4Var) {
        this.f26230a = d4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.d4 d4Var = this.f26230a;
        if (d4Var != null && !d4Var.f18774a) {
            return d4Var.e;
        }
        return null;
    }
}
