package org.telegram.ui.Wallet;

import android.view.View;
public final class r4 implements View.OnClickListener {
    public final int f44877a;
    public final org.telegram.ui.ActionBar.x2 f44878b;

    public r4(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.f44877a = i7;
        this.f44878b = x2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44877a) {
            case 0:
                this.f44878b.dismiss();
                return;
            default:
                this.f44878b.dismiss();
                return;
        }
    }
}
