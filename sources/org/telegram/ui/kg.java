package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kg implements View.OnClickListener {
    public final int f49311a;
    public final org.telegram.ui.Components.a70 f49312b;

    public kg(org.telegram.ui.Components.a70 a70Var, int i7) {
        this.f49311a = i7;
        this.f49312b = a70Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49311a;
        org.telegram.ui.Components.a70 a70Var = this.f49312b;
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
