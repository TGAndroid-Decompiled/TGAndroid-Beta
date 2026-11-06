package org.telegram.ui.Wallet;

import android.view.View;
public final class s1 implements View.OnClickListener {
    public final int f43101a;
    public final a3 f43102b;

    public s1(a3 a3Var, int i7) {
        this.f43101a = i7;
        this.f43102b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43101a) {
            case 0:
                this.f43102b.dismiss();
                return;
            default:
                this.f43102b.dismiss();
                return;
        }
    }
}
