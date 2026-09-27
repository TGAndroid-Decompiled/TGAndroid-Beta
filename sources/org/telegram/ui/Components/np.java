package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class np {
    public final org.telegram.ui.ActionBar.d4 f26877a;
    public Drawable f26878b;
    public int f26879c;
    public boolean d;
    public Bitmap e;

    public np(org.telegram.ui.ActionBar.d4 d4Var) {
        this.f26877a = d4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.d4 d4Var = this.f26877a;
        if (d4Var != null && !d4Var.f18800a) {
            return d4Var.e;
        }
        return null;
    }
}
