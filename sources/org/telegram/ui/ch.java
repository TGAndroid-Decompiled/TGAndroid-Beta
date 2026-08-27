package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

public final class ch implements View.OnClickListener {

    public final int f37091a;

    public final org.telegram.ui.Components.b70 f37092b;

    public ch(org.telegram.ui.Components.b70 b70Var, int i10) {
        this.f37091a = i10;
        this.f37092b = b70Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37091a;
        org.telegram.ui.Components.b70 b70Var = this.f37092b;
        switch (i10) {
            case 0:
                b70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.P8;
                b70Var.s();
                break;
        }
    }
}
