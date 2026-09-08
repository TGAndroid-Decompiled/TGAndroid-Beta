package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class mh implements View.OnClickListener {
    public final int f38735a;
    public final org.telegram.ui.Components.n70 f38736b;

    public mh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f38735a = i10;
        this.f38736b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38735a;
        org.telegram.ui.Components.n70 n70Var = this.f38736b;
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
