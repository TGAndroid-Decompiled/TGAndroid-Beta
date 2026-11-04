package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class fg implements View.OnClickListener {
    public final int f45273a;
    public final org.telegram.ui.Components.f60 f45274b;

    public fg(org.telegram.ui.Components.f60 f60Var, int i3) {
        this.f45273a = i3;
        this.f45274b = f60Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f45273a;
        org.telegram.ui.Components.f60 f60Var = this.f45274b;
        switch (i3) {
            case 0:
                f60Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.V8;
                f60Var.s();
                return;
        }
    }
}
