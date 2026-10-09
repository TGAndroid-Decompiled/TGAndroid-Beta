package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class bq {
    public final org.telegram.ui.ActionBar.c4 f25082a;
    public Drawable f25083b;
    public int f25084c;
    public boolean d;
    public Bitmap f25085e;

    public bq(org.telegram.ui.ActionBar.c4 c4Var) {
        this.f25082a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.f25082a;
        if (c4Var != null && !c4Var.f20505a) {
            return c4Var.f20508e;
        }
        return null;
    }
}
