package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class mh implements View.OnClickListener {
    public final int f38709a;
    public final org.telegram.ui.Components.n70 f38710b;

    public mh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f38709a = i10;
        this.f38710b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38709a;
        org.telegram.ui.Components.n70 n70Var = this.f38710b;
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
