package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f45951a;
    public final org.telegram.ui.ActionBar.v2 f45952b;

    public gd(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f45951a = i7;
        this.f45952b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45951a) {
            case 0:
                this.f45952b.dismiss();
                return;
            default:
                this.f45952b.dismiss();
                return;
        }
    }
}
