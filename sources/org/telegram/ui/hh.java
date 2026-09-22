package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hh implements View.OnClickListener {
    public final int f34220a;
    public final org.telegram.ui.Components.y70 f34221b;

    public hh(org.telegram.ui.Components.y70 y70Var, int i10) {
        this.f34220a = i10;
        this.f34221b = y70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f34220a;
        org.telegram.ui.Components.y70 y70Var = this.f34221b;
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
