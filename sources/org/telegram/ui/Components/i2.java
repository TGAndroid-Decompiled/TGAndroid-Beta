package org.telegram.ui.Components;

import android.view.View;
public final class i2 implements View.OnClickListener {
    public final int f25542a;
    public final org.telegram.ui.ActionBar.g3[] f25543b;

    public i2(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f25542a = i10;
        this.f25543b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25542a) {
            case 0:
                this.f25543b[0].dismiss();
                return;
            case 1:
                this.f25543b[0].dismiss();
                return;
            case 2:
                this.f25543b[0].dismiss();
                return;
            default:
                this.f25543b[0].dismiss();
                return;
        }
    }
}
