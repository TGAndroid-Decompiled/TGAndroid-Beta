package org.telegram.ui.Wallet;

import android.view.View;
public final class d4 implements View.OnClickListener {
    public final int f42389a;
    public final org.telegram.ui.ActionBar.v2 f42390b;

    public d4(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f42389a = i7;
        this.f42390b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42389a) {
            case 0:
                this.f42390b.dismiss();
                return;
            default:
                this.f42390b.dismiss();
                return;
        }
    }
}
