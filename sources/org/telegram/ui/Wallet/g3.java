package org.telegram.ui.Wallet;

import android.view.View;
public final class g3 implements View.OnClickListener {
    public final int f35011a;
    public final org.telegram.ui.ActionBar.e3 f35012b;

    public g3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f35011a = i10;
        this.f35012b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35011a) {
            case 0:
                this.f35012b.dismiss();
                return;
            default:
                this.f35012b.dismiss();
                return;
        }
    }
}
