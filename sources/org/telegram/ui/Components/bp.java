package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class bp {
    public final org.telegram.ui.ActionBar.b4 f27261a;
    public Drawable f27262b;
    public int f27263c;
    public boolean d;
    public Bitmap f27264e;

    public bp(org.telegram.ui.ActionBar.b4 b4Var) {
        this.f27261a = b4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.b4 b4Var = this.f27261a;
        if (b4Var != null && !b4Var.f22748a) {
            return b4Var.f22751e;
        }
        return null;
    }
}
