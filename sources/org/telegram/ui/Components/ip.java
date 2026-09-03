package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class ip {
    public final org.telegram.ui.ActionBar.e4 f25749a;
    public Drawable f25750b;
    public int f25751c;
    public boolean d;
    public Bitmap e;

    public ip(org.telegram.ui.ActionBar.e4 e4Var) {
        this.f25749a = e4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.e4 e4Var = this.f25749a;
        if (e4Var != null && !e4Var.f19638a) {
            return e4Var.e;
        }
        return null;
    }
}
