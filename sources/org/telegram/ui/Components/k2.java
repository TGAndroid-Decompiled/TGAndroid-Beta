package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f27829a;
    public final org.telegram.ui.ActionBar.h3[] f27830b;

    public k2(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f27829a = i10;
        this.f27830b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27829a) {
            case 0:
                this.f27830b[0].dismiss();
                return;
            case 1:
                this.f27830b[0].dismiss();
                return;
            case 2:
                this.f27830b[0].dismiss();
                return;
            default:
                this.f27830b[0].dismiss();
                return;
        }
    }
}
