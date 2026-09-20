package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hh implements View.OnClickListener {
    public final int f34204a;
    public final org.telegram.ui.Components.v70 f34205b;

    public hh(org.telegram.ui.Components.v70 v70Var, int i10) {
        this.f34204a = i10;
        this.f34205b = v70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f34204a;
        org.telegram.ui.Components.v70 v70Var = this.f34205b;
        switch (i10) {
            case 0:
                v70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                v70Var.s();
                return;
        }
    }
}
