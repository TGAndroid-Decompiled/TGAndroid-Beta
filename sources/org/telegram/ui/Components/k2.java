package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f28030a;
    public final org.telegram.ui.ActionBar.f3[] f28031b;

    public k2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f28030a = i10;
        this.f28031b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28030a) {
            case 0:
                this.f28031b[0].dismiss();
                return;
            case 1:
                this.f28031b[0].dismiss();
                return;
            case 2:
                this.f28031b[0].dismiss();
                return;
            default:
                this.f28031b[0].dismiss();
                return;
        }
    }
}
