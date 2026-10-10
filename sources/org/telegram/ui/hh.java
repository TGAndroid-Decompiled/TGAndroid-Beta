package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hh implements View.OnClickListener {
    public final int f38374a;
    public final org.telegram.ui.Components.q80 f38375b;

    public hh(org.telegram.ui.Components.q80 q80Var, int i10) {
        this.f38374a = i10;
        this.f38375b = q80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38374a;
        org.telegram.ui.Components.q80 q80Var = this.f38375b;
        switch (i10) {
            case 0:
                q80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                q80Var.s();
                return;
        }
    }
}
