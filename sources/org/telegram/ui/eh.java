package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class eh implements View.OnClickListener {
    public final int f36494a;
    public final org.telegram.ui.Components.q70 f36495b;

    public eh(org.telegram.ui.Components.q70 q70Var, int i10) {
        this.f36494a = i10;
        this.f36495b = q70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36494a;
        org.telegram.ui.Components.q70 q70Var = this.f36495b;
        switch (i10) {
            case 0:
                q70Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                q70Var.s();
                return;
        }
    }
}
