package org.telegram.ui.Wallet;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f42780a;
    public final org.telegram.ui.ActionBar.t2[] f42781b;

    public l4(org.telegram.ui.ActionBar.t2[] t2VarArr, int i3) {
        this.f42780a = i3;
        this.f42781b = t2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42780a) {
            case 0:
                this.f42781b[0].dismiss();
                return;
            default:
                this.f42781b[0].dismiss();
                return;
        }
    }
}
