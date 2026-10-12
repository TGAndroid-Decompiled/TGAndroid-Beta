package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements View.OnClickListener {
    public final int f34786a;
    public final org.telegram.ui.ActionBar.e3 f34787b;

    public g3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f34786a = i10;
        this.f34787b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34786a) {
            case 0:
                this.f34787b.dismiss();
                return;
            default:
                this.f34787b.dismiss();
                return;
        }
    }
}
