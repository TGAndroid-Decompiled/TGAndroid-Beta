package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class mh implements View.OnClickListener {
    public final int f38736a;
    public final org.telegram.ui.Components.n70 f38737b;

    public mh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f38736a = i10;
        this.f38737b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38736a;
        org.telegram.ui.Components.n70 n70Var = this.f38737b;
        switch (i10) {
            case 0:
                n70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.T8;
                n70Var.s();
                return;
        }
    }
}
