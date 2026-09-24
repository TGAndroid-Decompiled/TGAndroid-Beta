package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class eh implements View.OnClickListener {
    public final int f33381a;
    public final org.telegram.ui.Components.y70 f33382b;

    public eh(org.telegram.ui.Components.y70 y70Var, int i10) {
        this.f33381a = i10;
        this.f33382b = y70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33381a;
        org.telegram.ui.Components.y70 y70Var = this.f33382b;
        switch (i10) {
            case 0:
                y70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                y70Var.s();
                return;
        }
    }
}
