package org.telegram.ui.Components;

import android.view.View;
public final class m2 implements View.OnClickListener {
    public final int f28513a;
    public final org.telegram.ui.ActionBar.e3[] f28514b;

    public m2(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f28513a = i10;
        this.f28514b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28513a) {
            case 0:
                this.f28514b[0].dismiss();
                return;
            case 1:
                this.f28514b[0].dismiss();
                return;
            case 2:
                this.f28514b[0].dismiss();
                return;
            default:
                this.f28514b[0].dismiss();
                return;
        }
    }
}
