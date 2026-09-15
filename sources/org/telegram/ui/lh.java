package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lh implements View.OnClickListener {
    public final int f35504a;
    public final org.telegram.ui.Components.n70 f35505b;

    public lh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f35504a = i10;
        this.f35505b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f35504a;
        org.telegram.ui.Components.n70 n70Var = this.f35505b;
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
