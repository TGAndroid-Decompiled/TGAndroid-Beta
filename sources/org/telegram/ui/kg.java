package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kg implements View.OnClickListener {
    public final int f49420a;
    public final org.telegram.ui.Components.x60 f49421b;

    public kg(org.telegram.ui.Components.x60 x60Var, int i7) {
        this.f49420a = i7;
        this.f49421b = x60Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49420a;
        org.telegram.ui.Components.x60 x60Var = this.f49421b;
        switch (i7) {
            case 0:
                x60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                x60Var.s();
                return;
        }
    }
}
