package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hh implements View.OnClickListener {
    public final int f38328a;
    public final org.telegram.ui.Components.p80 f38329b;

    public hh(org.telegram.ui.Components.p80 p80Var, int i10) {
        this.f38328a = i10;
        this.f38329b = p80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38328a;
        org.telegram.ui.Components.p80 p80Var = this.f38329b;
        switch (i10) {
            case 0:
                p80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                p80Var.s();
                return;
        }
    }
}
