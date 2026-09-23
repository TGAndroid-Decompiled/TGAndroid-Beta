package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class jh implements View.OnClickListener {
    public final int f34458a;
    public final org.telegram.ui.Components.o70 f34459b;

    public jh(org.telegram.ui.Components.o70 o70Var, int i10) {
        this.f34458a = i10;
        this.f34459b = o70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f34458a;
        org.telegram.ui.Components.o70 o70Var = this.f34459b;
        switch (i10) {
            case 0:
                o70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                o70Var.s();
                return;
        }
    }
}
