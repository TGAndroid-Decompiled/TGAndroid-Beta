package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class op {
    public final org.telegram.ui.ActionBar.b4 f27160a;
    public Drawable f27161b;
    public int f27162c;
    public boolean d;
    public Bitmap e;

    public op(org.telegram.ui.ActionBar.b4 b4Var) {
        this.f27160a = b4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.b4 b4Var = this.f27160a;
        if (b4Var != null && !b4Var.f18773a) {
            return b4Var.e;
        }
        return null;
    }
}
