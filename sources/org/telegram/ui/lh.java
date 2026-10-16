package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lh implements View.OnClickListener {
    public final int f37747a;
    public final org.telegram.ui.Components.l80 f37748b;

    public lh(org.telegram.ui.Components.l80 l80Var, int i10) {
        this.f37747a = i10;
        this.f37748b = l80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37747a;
        org.telegram.ui.Components.l80 l80Var = this.f37748b;
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
