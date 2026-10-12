package org.telegram.ui.Wallet;

import android.view.View;
public final class e3 implements View.OnClickListener {
    public final int f33119a;
    public final org.telegram.ui.ActionBar.e3 f33120b;

    public e3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f33119a = i10;
        this.f33120b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33119a) {
            case 0:
                this.f33120b.dismiss();
                return;
            default:
                this.f33120b.dismiss();
                return;
        }
    }
}
