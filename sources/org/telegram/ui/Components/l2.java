package org.telegram.ui.Components;

import android.view.View;
public final class l2 implements View.OnClickListener {
    public final int f26581a;
    public final org.telegram.ui.ActionBar.e3[] f26582b;

    public l2(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f26581a = i10;
        this.f26582b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26581a) {
            case 0:
                this.f26582b[0].dismiss();
                return;
            case 1:
                this.f26582b[0].dismiss();
                return;
            case 2:
                this.f26582b[0].dismiss();
                return;
            default:
                this.f26582b[0].dismiss();
                return;
        }
    }
}
