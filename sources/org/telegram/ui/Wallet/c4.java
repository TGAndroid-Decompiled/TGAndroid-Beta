package org.telegram.ui.Wallet;

import android.view.View;
public final class c4 implements View.OnClickListener {
    public final int f42385a;
    public final org.telegram.ui.ActionBar.t2 f42386b;

    public c4(org.telegram.ui.ActionBar.t2 t2Var, int i3) {
        this.f42385a = i3;
        this.f42386b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42385a) {
            case 0:
                this.f42386b.dismiss();
                return;
            default:
                this.f42386b.dismiss();
                return;
        }
    }
}
