package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ah implements View.OnClickListener {
    public final int f36498a;
    public final org.telegram.ui.Components.x60 f36499b;

    public ah(org.telegram.ui.Components.x60 x60Var, int i9) {
        this.f36498a = i9;
        this.f36499b = x60Var;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f36498a;
        org.telegram.ui.Components.x60 x60Var = this.f36499b;
        switch (i9) {
            case 0:
                x60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.P8;
                x60Var.s();
                return;
        }
    }
}
