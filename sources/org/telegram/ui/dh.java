package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class dh implements View.OnClickListener {
    public final int f33120a;
    public final org.telegram.ui.Components.y70 f33121b;

    public dh(org.telegram.ui.Components.y70 y70Var, int i10) {
        this.f33120a = i10;
        this.f33121b = y70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33120a;
        org.telegram.ui.Components.y70 y70Var = this.f33121b;
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
