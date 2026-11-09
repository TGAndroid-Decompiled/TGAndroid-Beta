package org.telegram.ui.Wallet;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f42719a;
    public final org.telegram.ui.ActionBar.v2[] f42720b;

    public l4(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.f42719a = i7;
        this.f42720b = v2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42719a) {
            case 0:
                this.f42720b[0].dismiss();
                return;
            default:
                this.f42720b[0].dismiss();
                return;
        }
    }
}
