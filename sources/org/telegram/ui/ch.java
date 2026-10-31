package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ch implements View.OnClickListener {
    public final int f36464a;
    public final org.telegram.ui.Components.z60 f36465b;

    public ch(org.telegram.ui.Components.z60 z60Var, int i10) {
        this.f36464a = i10;
        this.f36465b = z60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36464a;
        org.telegram.ui.Components.z60 z60Var = this.f36465b;
        switch (i10) {
            case 0:
                z60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                z60Var.s();
                return;
        }
    }
}
