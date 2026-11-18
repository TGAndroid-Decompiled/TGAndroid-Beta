package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kg implements View.OnClickListener {
    public final int f49268a;
    public final org.telegram.ui.Components.y60 f49269b;

    public kg(org.telegram.ui.Components.y60 y60Var, int i7) {
        this.f49268a = i7;
        this.f49269b = y60Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49268a;
        org.telegram.ui.Components.y60 y60Var = this.f49269b;
        switch (i7) {
            case 0:
                y60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                y60Var.s();
                return;
        }
    }
}
