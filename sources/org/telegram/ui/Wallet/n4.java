package org.telegram.ui.Wallet;

import android.view.View;
public final class n4 implements View.OnClickListener {
    public final int f42832a;
    public final org.telegram.ui.ActionBar.v2[] f42833b;

    public n4(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.f42832a = i7;
        this.f42833b = v2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42832a) {
            case 0:
                this.f42833b[0].dismiss();
                return;
            default:
                this.f42833b[0].dismiss();
                return;
        }
    }
}
