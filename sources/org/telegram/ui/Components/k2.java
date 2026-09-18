package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f25540a;
    public final org.telegram.ui.ActionBar.f3[] f25541b;

    public k2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f25540a = i10;
        this.f25541b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25540a) {
            case 0:
                this.f25541b[0].dismiss();
                return;
            case 1:
                this.f25541b[0].dismiss();
                return;
            case 2:
                this.f25541b[0].dismiss();
                return;
            default:
                this.f25541b[0].dismiss();
                return;
        }
    }
}
