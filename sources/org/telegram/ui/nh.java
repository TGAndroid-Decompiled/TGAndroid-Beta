package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class nh implements View.OnClickListener {
    public final int f36105a;
    public final org.telegram.ui.Components.n70 f36106b;

    public nh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f36105a = i10;
        this.f36106b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36105a;
        org.telegram.ui.Components.n70 n70Var = this.f36106b;
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
