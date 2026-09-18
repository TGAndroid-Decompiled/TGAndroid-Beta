package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class gh implements View.OnClickListener {
    public final int f33844a;
    public final org.telegram.ui.Components.w70 f33845b;

    public gh(org.telegram.ui.Components.w70 w70Var, int i10) {
        this.f33844a = i10;
        this.f33845b = w70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33844a;
        org.telegram.ui.Components.w70 w70Var = this.f33845b;
        switch (i10) {
            case 0:
                w70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                w70Var.s();
                return;
        }
    }
}
