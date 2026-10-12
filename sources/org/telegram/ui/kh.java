package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kh implements View.OnClickListener {
    public final int f39486a;
    public final org.telegram.ui.Components.s80 f39487b;

    public kh(org.telegram.ui.Components.s80 s80Var, int i10) {
        this.f39486a = i10;
        this.f39487b = s80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39486a;
        org.telegram.ui.Components.s80 s80Var = this.f39487b;
        switch (i10) {
            case 0:
                s80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                s80Var.s();
                return;
        }
    }
}
