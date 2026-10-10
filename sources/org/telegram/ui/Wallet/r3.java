package org.telegram.ui.Wallet;

import android.view.View;
public final class r3 implements View.OnClickListener {
    public final int f35502a;
    public final org.telegram.ui.ActionBar.f3[] f35503b;

    public r3(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f35502a = i10;
        this.f35503b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35502a) {
            case 0:
                this.f35503b[0].dismiss();
                return;
            default:
                this.f35503b[0].dismiss();
                return;
        }
    }
}
