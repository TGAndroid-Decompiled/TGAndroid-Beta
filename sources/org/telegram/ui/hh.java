package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hh implements View.OnClickListener {
    public final int f38409a;
    public final org.telegram.ui.Components.q80 f38410b;

    public hh(org.telegram.ui.Components.q80 q80Var, int i10) {
        this.f38409a = i10;
        this.f38410b = q80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38409a;
        org.telegram.ui.Components.q80 q80Var = this.f38410b;
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
