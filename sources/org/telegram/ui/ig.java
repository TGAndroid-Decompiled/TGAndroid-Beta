package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ig implements View.OnClickListener {
    public final int f48046a;
    public final org.telegram.ui.Components.m60 f48047b;

    public ig(org.telegram.ui.Components.m60 m60Var, int i7) {
        this.f48046a = i7;
        this.f48047b = m60Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f48046a;
        org.telegram.ui.Components.m60 m60Var = this.f48047b;
        switch (i7) {
            case 0:
                m60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                m60Var.s();
                return;
        }
    }
}
