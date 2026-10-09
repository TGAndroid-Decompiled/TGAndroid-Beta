package org.telegram.ui.Components;

import android.view.View;
public final class m2 implements View.OnClickListener {
    public final int f28653a;
    public final org.telegram.ui.ActionBar.f3[] f28654b;

    public m2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f28653a = i10;
        this.f28654b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28653a) {
            case 0:
                this.f28654b[0].dismiss();
                return;
            case 1:
                this.f28654b[0].dismiss();
                return;
            case 2:
                this.f28654b[0].dismiss();
                return;
            default:
                this.f28654b[0].dismiss();
                return;
        }
    }
}
