package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class dh implements View.OnClickListener {
    public final int f33197a;
    public final org.telegram.ui.Components.b80 f33198b;

    public dh(org.telegram.ui.Components.b80 b80Var, int i10) {
        this.f33197a = i10;
        this.f33198b = b80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33197a;
        org.telegram.ui.Components.b80 b80Var = this.f33198b;
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
