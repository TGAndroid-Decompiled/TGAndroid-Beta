package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f36847a;
    public final org.telegram.ui.ActionBar.e3 f36848b;

    public qd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f36847a = i10;
        this.f36848b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36847a) {
            case 0:
                this.f36848b.dismiss();
                return;
            default:
                this.f36848b.dismiss();
                return;
        }
    }
}
