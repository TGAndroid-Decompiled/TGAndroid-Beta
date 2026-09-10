package org.telegram.ui.Components;

import android.view.View;
public final class l2 implements View.OnClickListener {
    public final int f24853a;
    public final org.telegram.ui.ActionBar.h3[] f24854b;

    public l2(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f24853a = i10;
        this.f24854b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24853a) {
            case 0:
                this.f24854b[0].dismiss();
                return;
            case 1:
                this.f24854b[0].dismiss();
                return;
            case 2:
                this.f24854b[0].dismiss();
                return;
            default:
                this.f24854b[0].dismiss();
                return;
        }
    }
}
