package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class jg implements View.OnClickListener {
    public final int f46959a;
    public final org.telegram.ui.Components.k60 f46960b;

    public jg(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.f46959a = i7;
        this.f46960b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f46959a;
        org.telegram.ui.Components.k60 k60Var = this.f46960b;
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
