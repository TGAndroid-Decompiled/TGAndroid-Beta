package org.telegram.ui.Wallet;

import android.view.View;
public final class r4 implements View.OnClickListener {
    public final int f44917a;
    public final org.telegram.ui.ActionBar.w2 f44918b;

    public r4(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f44917a = i7;
        this.f44918b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44917a) {
            case 0:
                this.f44918b.dismiss();
                return;
            default:
                this.f44918b.dismiss();
                return;
        }
    }
}
