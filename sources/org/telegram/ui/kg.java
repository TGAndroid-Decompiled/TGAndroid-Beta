package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kg implements View.OnClickListener {
    public final int f49307a;
    public final org.telegram.ui.Components.a70 f49308b;

    public kg(org.telegram.ui.Components.a70 a70Var, int i7) {
        this.f49307a = i7;
        this.f49308b = a70Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49307a;
        org.telegram.ui.Components.a70 a70Var = this.f49308b;
        switch (i7) {
            case 0:
                a70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                a70Var.s();
                return;
        }
    }
}
