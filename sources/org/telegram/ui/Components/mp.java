package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class mp {
    public final org.telegram.ui.ActionBar.c4 f26253a;
    public Drawable f26254b;
    public int f26255c;
    public boolean d;
    public Bitmap e;

    public mp(org.telegram.ui.ActionBar.c4 c4Var) {
        this.f26253a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.f26253a;
        if (c4Var != null && !c4Var.f18533a) {
            return c4Var.e;
        }
        return null;
    }
}
