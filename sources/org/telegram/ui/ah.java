package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ah implements View.OnClickListener {
    public final int f36549a;
    public final org.telegram.ui.Components.j70 f36550b;

    public ah(org.telegram.ui.Components.j70 j70Var, int i10) {
        this.f36549a = i10;
        this.f36550b = j70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36549a;
        org.telegram.ui.Components.j70 j70Var = this.f36550b;
        switch (i10) {
            case 0:
                j70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.P8;
                j70Var.s();
                return;
        }
    }
}
