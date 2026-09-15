package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class lp {
    public final org.telegram.ui.ActionBar.d4 f25994a;
    public Drawable f25995b;
    public int f25996c;
    public boolean d;
    public Bitmap e;

    public lp(org.telegram.ui.ActionBar.d4 d4Var) {
        this.f25994a = d4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.d4 d4Var = this.f25994a;
        if (d4Var != null && !d4Var.f18589a) {
            return d4Var.e;
        }
        return null;
    }
}
