package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class gh implements View.OnClickListener {
    public final int f34450a;
    public final org.telegram.ui.Components.p70 f34451b;

    public gh(org.telegram.ui.Components.p70 p70Var, int i10) {
        this.f34450a = i10;
        this.f34451b = p70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f34450a;
        org.telegram.ui.Components.p70 p70Var = this.f34451b;
        switch (i10) {
            case 0:
                p70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                p70Var.s();
                return;
        }
    }
}
