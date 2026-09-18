package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class nh implements View.OnClickListener {
    public final int f36110a;
    public final org.telegram.ui.Components.n70 f36111b;

    public nh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.f36110a = i10;
        this.f36111b = n70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36110a;
        org.telegram.ui.Components.n70 n70Var = this.f36111b;
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
