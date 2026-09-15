package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f36852a;
    public final org.telegram.ui.ActionBar.f3 f36853b;

    public qd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f36852a = i10;
        this.f36853b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36852a) {
            case 0:
                this.f36853b.dismiss();
                return;
            default:
                this.f36853b.dismiss();
                return;
        }
    }
}
