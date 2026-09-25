package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f25600a;
    public final org.telegram.ui.ActionBar.e3[] f25601b;

    public k2(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f25600a = i10;
        this.f25601b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25600a) {
            case 0:
                this.f25601b[0].dismiss();
                return;
            case 1:
                this.f25601b[0].dismiss();
                return;
            case 2:
                this.f25601b[0].dismiss();
                return;
            default:
                this.f25601b[0].dismiss();
                return;
        }
    }
}
