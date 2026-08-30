package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class eh implements View.OnClickListener {
    public final int f34018a;
    public final org.telegram.ui.Components.o70 f34019b;

    public eh(org.telegram.ui.Components.o70 o70Var, int i10) {
        this.f34018a = i10;
        this.f34019b = o70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f34018a;
        org.telegram.ui.Components.o70 o70Var = this.f34019b;
        switch (i10) {
            case 0:
                o70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                o70Var.s();
                return;
        }
    }
}
