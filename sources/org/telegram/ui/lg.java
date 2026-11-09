package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lg implements View.OnClickListener {
    public final int f47599a;
    public final org.telegram.ui.Components.l60 f47600b;

    public lg(org.telegram.ui.Components.l60 l60Var, int i7) {
        this.f47599a = i7;
        this.f47600b = l60Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47599a;
        org.telegram.ui.Components.l60 l60Var = this.f47600b;
        switch (i7) {
            case 0:
                l60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                l60Var.s();
                return;
        }
    }
}
