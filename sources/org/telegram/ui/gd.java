package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f45924a;
    public final org.telegram.ui.ActionBar.v2 f45925b;

    public gd(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f45924a = i7;
        this.f45925b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45924a) {
            case 0:
                this.f45925b.dismiss();
                return;
            default:
                this.f45925b.dismiss();
                return;
        }
    }
}
