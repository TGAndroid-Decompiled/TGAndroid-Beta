package org.telegram.ui.Wallet;

import android.view.View;
public final class r1 implements View.OnClickListener {
    public final int f43088a;
    public final z2 f43089b;

    public r1(z2 z2Var, int i7) {
        this.f43088a = i7;
        this.f43089b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43088a) {
            case 0:
                this.f43089b.dismiss();
                return;
            default:
                this.f43089b.dismiss();
                return;
        }
    }
}
