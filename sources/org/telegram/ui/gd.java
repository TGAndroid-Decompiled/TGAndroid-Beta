package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f46070a;
    public final org.telegram.ui.ActionBar.w2 f46071b;

    public gd(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f46070a = i7;
        this.f46071b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46070a) {
            case 0:
                this.f46071b.dismiss();
                return;
            default:
                this.f46071b.dismiss();
                return;
        }
    }
}
