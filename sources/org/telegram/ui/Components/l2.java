package org.telegram.ui.Components;

import android.view.View;
public final class l2 implements View.OnClickListener {
    public final int f28011a;
    public final org.telegram.ui.ActionBar.f3[] f28012b;

    public l2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f28011a = i10;
        this.f28012b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28011a) {
            case 0:
                this.f28012b[0].dismiss();
                return;
            case 1:
                this.f28012b[0].dismiss();
                return;
            case 2:
                this.f28012b[0].dismiss();
                return;
            default:
                this.f28012b[0].dismiss();
                return;
        }
    }
}
