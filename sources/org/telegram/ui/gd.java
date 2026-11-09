package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f45975a;
    public final org.telegram.ui.ActionBar.v2 f45976b;

    public gd(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f45975a = i7;
        this.f45976b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45975a) {
            case 0:
                this.f45976b.dismiss();
                return;
            default:
                this.f45976b.dismiss();
                return;
        }
    }
}
