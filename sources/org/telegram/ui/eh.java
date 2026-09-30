package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class eh implements View.OnClickListener {
    public final int f33397a;
    public final org.telegram.ui.Components.a80 f33398b;

    public eh(org.telegram.ui.Components.a80 a80Var, int i10) {
        this.f33397a = i10;
        this.f33398b = a80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33397a;
        org.telegram.ui.Components.a80 a80Var = this.f33398b;
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
