package org.telegram.ui.Wallet;

import android.view.View;
public final class e4 implements View.OnClickListener {
    public final int f42395a;
    public final org.telegram.ui.ActionBar.v2 f42396b;

    public e4(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f42395a = i7;
        this.f42396b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42395a) {
            case 0:
                this.f42396b.dismiss();
                return;
            default:
                this.f42396b.dismiss();
                return;
        }
    }
}
