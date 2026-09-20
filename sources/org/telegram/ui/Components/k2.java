package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f25618a;
    public final org.telegram.ui.ActionBar.f3[] f25619b;

    public k2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f25618a = i10;
        this.f25619b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25618a) {
            case 0:
                this.f25619b[0].dismiss();
                return;
            case 1:
                this.f25619b[0].dismiss();
                return;
            case 2:
                this.f25619b[0].dismiss();
                return;
            default:
                this.f25619b[0].dismiss();
                return;
        }
    }
}
