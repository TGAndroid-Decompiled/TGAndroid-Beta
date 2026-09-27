package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class gh implements View.OnClickListener {
    public final int f33930a;
    public final org.telegram.ui.Components.a80 f33931b;

    public gh(org.telegram.ui.Components.a80 a80Var, int i10) {
        this.f33930a = i10;
        this.f33931b = a80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33930a;
        org.telegram.ui.Components.a80 a80Var = this.f33931b;
        switch (i10) {
            case 0:
                a80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                a80Var.s();
                return;
        }
    }
}
