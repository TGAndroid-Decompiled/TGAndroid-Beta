package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f45950a;
    public final org.telegram.ui.ActionBar.v2 f45951b;

    public gd(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f45950a = i7;
        this.f45951b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45950a) {
            case 0:
                this.f45951b.dismiss();
                return;
            default:
                this.f45951b.dismiss();
                return;
        }
    }
}
