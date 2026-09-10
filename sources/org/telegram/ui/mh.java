package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class mh implements View.OnClickListener {
    public final int f34946a;
    public final org.telegram.ui.Components.w70 f34947b;

    public mh(org.telegram.ui.Components.w70 w70Var, int i10) {
        this.f34946a = i10;
        this.f34947b = w70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f34946a;
        org.telegram.ui.Components.w70 w70Var = this.f34947b;
        switch (i10) {
            case 0:
                w70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.T8;
                w70Var.s();
                return;
        }
    }
}
