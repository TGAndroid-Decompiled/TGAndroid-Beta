package org.telegram.ui.Components;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f28947a;
    public final org.telegram.ui.ActionBar.f3[] f28948b;

    public h2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i9) {
        this.f28947a = i9;
        this.f28948b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28947a) {
            case 0:
                this.f28948b[0].dismiss();
                return;
            case 1:
                this.f28948b[0].dismiss();
                return;
            case 2:
                this.f28948b[0].dismiss();
                return;
            default:
                this.f28948b[0].dismiss();
                return;
        }
    }
}
