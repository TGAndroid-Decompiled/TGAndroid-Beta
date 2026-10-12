package org.telegram.ui.Components;

import android.view.View;
public final class m2 implements View.OnClickListener {
    public final int f28356a;
    public final org.telegram.ui.ActionBar.e3[] f28357b;

    public m2(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f28356a = i10;
        this.f28357b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28356a) {
            case 0:
                this.f28357b[0].dismiss();
                return;
            case 1:
                this.f28357b[0].dismiss();
                return;
            case 2:
                this.f28357b[0].dismiss();
                return;
            default:
                this.f28357b[0].dismiss();
                return;
        }
    }
}
