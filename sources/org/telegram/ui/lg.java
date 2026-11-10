package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lg implements View.OnClickListener {
    public final int f47604a;
    public final org.telegram.ui.Components.k60 f47605b;

    public lg(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.f47604a = i7;
        this.f47605b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47604a;
        org.telegram.ui.Components.k60 k60Var = this.f47605b;
        switch (i7) {
            case 0:
                k60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                k60Var.s();
                return;
        }
    }
}
