package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class fh implements View.OnClickListener {
    public final int f37147a;
    public final org.telegram.ui.Components.z60 f37148b;

    public fh(org.telegram.ui.Components.z60 z60Var, int i10) {
        this.f37147a = i10;
        this.f37148b = z60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37147a;
        org.telegram.ui.Components.z60 z60Var = this.f37148b;
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
