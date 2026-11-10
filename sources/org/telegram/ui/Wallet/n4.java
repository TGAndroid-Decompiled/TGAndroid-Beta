package org.telegram.ui.Wallet;

import android.view.View;
public final class n4 implements View.OnClickListener {
    public final int f42860a;
    public final org.telegram.ui.ActionBar.w2[] f42861b;

    public n4(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f42860a = i7;
        this.f42861b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42860a) {
            case 0:
                this.f42861b[0].dismiss();
                return;
            default:
                this.f42861b[0].dismiss();
                return;
        }
    }
}
