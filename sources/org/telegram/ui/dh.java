package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class dh implements View.OnClickListener {
    public final int f38610a;
    public final org.telegram.ui.Components.l80 f38611b;

    public dh(org.telegram.ui.Components.l80 l80Var, int i10) {
        this.f38610a = i10;
        this.f38611b = l80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38610a;
        org.telegram.ui.Components.l80 l80Var = this.f38611b;
        switch (i10) {
            case 0:
                l80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                l80Var.s();
                return;
        }
    }
}
