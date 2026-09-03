package org.telegram.ui.Components;

import android.view.View;
public final class i2 implements View.OnClickListener {
    public final int f27690a;
    public final org.telegram.ui.ActionBar.h3[] f27691b;

    public i2(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f27690a = i10;
        this.f27691b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27690a) {
            case 0:
                this.f27691b[0].dismiss();
                return;
            case 1:
                this.f27691b[0].dismiss();
                return;
            case 2:
                this.f27691b[0].dismiss();
                return;
            default:
                this.f27691b[0].dismiss();
                return;
        }
    }
}
