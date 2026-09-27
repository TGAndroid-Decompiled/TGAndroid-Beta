package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f25606a;
    public final org.telegram.ui.ActionBar.g3[] f25607b;

    public k2(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f25606a = i10;
        this.f25607b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25606a) {
            case 0:
                this.f25607b[0].dismiss();
                return;
            case 1:
                this.f25607b[0].dismiss();
                return;
            case 2:
                this.f25607b[0].dismiss();
                return;
            default:
                this.f25607b[0].dismiss();
                return;
        }
    }
}
