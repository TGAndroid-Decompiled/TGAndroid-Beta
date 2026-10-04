package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kh implements View.OnClickListener {
    public final int f37977a;
    public final org.telegram.ui.Components.b80 f37978b;

    public kh(org.telegram.ui.Components.b80 b80Var, int i10) {
        this.f37977a = i10;
        this.f37978b = b80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37977a;
        org.telegram.ui.Components.b80 b80Var = this.f37978b;
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
