package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class lp {
    public final org.telegram.ui.ActionBar.d4 f26155a;
    public Drawable f26156b;
    public int f26157c;
    public boolean d;
    public Bitmap e;

    public lp(org.telegram.ui.ActionBar.d4 d4Var) {
        this.f26155a = d4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.d4 d4Var = this.f26155a;
        if (d4Var != null && !d4Var.f18822a) {
            return d4Var.e;
        }
        return null;
    }
}
