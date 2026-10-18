package org.telegram.ui.Wallet;

import android.view.View;
public final class b4 implements View.OnClickListener {
    public final int f34013a;
    public final org.telegram.ui.ActionBar.f3[] f34014b;

    public b4(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f34013a = i10;
        this.f34014b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34013a) {
            case 0:
                this.f34014b[0].dismiss();
                return;
            default:
                this.f34014b[0].dismiss();
                return;
        }
    }
}
