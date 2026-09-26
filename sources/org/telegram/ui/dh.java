package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class dh implements View.OnClickListener {
    public final int f33118a;
    public final org.telegram.ui.Components.z70 f33119b;

    public dh(org.telegram.ui.Components.z70 z70Var, int i10) {
        this.f33118a = i10;
        this.f33119b = z70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33118a;
        org.telegram.ui.Components.z70 z70Var = this.f33119b;
        switch (i10) {
            case 0:
                z70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                z70Var.s();
                return;
        }
    }
}
