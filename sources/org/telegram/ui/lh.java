package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lh implements View.OnClickListener {
    public final int f38004a;
    public final org.telegram.ui.Components.m80 f38005b;

    public lh(org.telegram.ui.Components.m80 m80Var, int i10) {
        this.f38004a = i10;
        this.f38005b = m80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38004a;
        org.telegram.ui.Components.m80 m80Var = this.f38005b;
        switch (i10) {
            case 0:
                m80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                m80Var.s();
                return;
        }
    }
}
