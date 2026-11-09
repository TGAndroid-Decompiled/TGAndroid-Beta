package org.telegram.ui.Wallet;

import android.view.View;
public final class c4 implements View.OnClickListener {
    public final int f42308a;
    public final org.telegram.ui.ActionBar.v2 f42309b;

    public c4(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f42308a = i7;
        this.f42309b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42308a) {
            case 0:
                this.f42309b.dismiss();
                return;
            default:
                this.f42309b.dismiss();
                return;
        }
    }
}
