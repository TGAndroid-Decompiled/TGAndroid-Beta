package org.telegram.ui.Wallet;

import android.view.View;
public final class a4 implements View.OnClickListener {
    public final int f33981a;
    public final org.telegram.ui.ActionBar.f3[] f33982b;

    public a4(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f33981a = i10;
        this.f33982b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33981a) {
            case 0:
                this.f33982b[0].dismiss();
                return;
            default:
                this.f33982b[0].dismiss();
                return;
        }
    }
}
