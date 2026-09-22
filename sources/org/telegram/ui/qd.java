package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f36846a;
    public final org.telegram.ui.ActionBar.f3 f36847b;

    public qd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f36846a = i10;
        this.f36847b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36846a) {
            case 0:
                this.f36847b.dismiss();
                return;
            default:
                this.f36847b.dismiss();
                return;
        }
    }
}
