package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f36861a;
    public final org.telegram.ui.ActionBar.e3 f36862b;

    public qd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f36861a = i10;
        this.f36862b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36861a) {
            case 0:
                this.f36862b.dismiss();
                return;
            default:
                this.f36862b.dismiss();
                return;
        }
    }
}
