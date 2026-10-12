package org.telegram.ui.Components;

import android.view.View;
public final class m2 implements View.OnClickListener {
    public final int f27168a;
    public final org.telegram.ui.ActionBar.e3[] f27169b;

    public m2(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f27168a = i10;
        this.f27169b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27168a) {
            case 0:
                this.f27169b[0].dismiss();
                return;
            case 1:
                this.f27169b[0].dismiss();
                return;
            case 2:
                this.f27169b[0].dismiss();
                return;
            default:
                this.f27169b[0].dismiss();
                return;
        }
    }
}
