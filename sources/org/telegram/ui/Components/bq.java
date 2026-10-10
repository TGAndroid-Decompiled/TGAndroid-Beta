package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class bq {
    public final org.telegram.ui.ActionBar.c4 f25019a;
    public Drawable f25020b;
    public int f25021c;
    public boolean d;
    public Bitmap f25022e;

    public bq(org.telegram.ui.ActionBar.c4 c4Var) {
        this.f25019a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.f25019a;
        if (c4Var != null && !c4Var.f20509a) {
            return c4Var.f20512e;
        }
        return null;
    }
}
