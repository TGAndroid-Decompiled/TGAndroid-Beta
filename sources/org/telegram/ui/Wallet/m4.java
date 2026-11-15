package org.telegram.ui.Wallet;

import android.view.View;
public final class m4 implements View.OnClickListener {
    public final int f44152a;
    public final org.telegram.ui.ActionBar.u2[] f44153b;

    public m4(org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.f44152a = i7;
        this.f44153b = u2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44152a) {
            case 0:
                this.f44153b[0].dismiss();
                return;
            default:
                this.f44153b[0].dismiss();
                return;
        }
    }
}
