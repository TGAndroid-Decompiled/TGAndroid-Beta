package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class dh implements View.OnClickListener {
    public final int f33119a;
    public final org.telegram.ui.Components.y70 f33120b;

    public dh(org.telegram.ui.Components.y70 y70Var, int i10) {
        this.f33119a = i10;
        this.f33120b = y70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33119a;
        org.telegram.ui.Components.y70 y70Var = this.f33120b;
        switch (i10) {
            case 0:
                y70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                y70Var.s();
                return;
        }
    }
}
