package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lh implements View.OnClickListener {
    public final int f35485a;
    public final org.telegram.ui.Components.n70 f35486b;

    public lh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f35485a = i10;
        this.f35486b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f35485a;
        org.telegram.ui.Components.n70 n70Var = this.f35486b;
        switch (i10) {
            case 0:
                n70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                n70Var.s();
                return;
        }
    }
}
