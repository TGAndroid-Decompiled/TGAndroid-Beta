package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kh implements View.OnClickListener {
    public final int f38008a;
    public final org.telegram.ui.Components.b80 f38009b;

    public kh(org.telegram.ui.Components.b80 b80Var, int i10) {
        this.f38008a = i10;
        this.f38009b = b80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38008a;
        org.telegram.ui.Components.b80 b80Var = this.f38009b;
        switch (i10) {
            case 0:
                b80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                b80Var.s();
                return;
        }
    }
}
