package org.telegram.ui.Wallet;

import android.view.View;
public final class r3 implements View.OnClickListener {
    public final int f33395a;
    public final org.telegram.ui.ActionBar.e3[] f33396b;

    public r3(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f33395a = i10;
        this.f33396b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33395a) {
            case 0:
                this.f33396b[0].dismiss();
                return;
            default:
                this.f33396b[0].dismiss();
                return;
        }
    }
}
