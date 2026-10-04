package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class kh implements View.OnClickListener {
    public final int f37978a;
    public final org.telegram.ui.Components.b80 f37979b;

    public kh(org.telegram.ui.Components.b80 b80Var, int i10) {
        this.f37978a = i10;
        this.f37979b = b80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37978a;
        org.telegram.ui.Components.b80 b80Var = this.f37979b;
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
