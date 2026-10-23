package org.telegram.ui.Components;

import android.view.View;
public final class l2 implements View.OnClickListener {
    public final int f28012a;
    public final org.telegram.ui.ActionBar.f3[] f28013b;

    public l2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f28012a = i10;
        this.f28013b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28012a) {
            case 0:
                this.f28013b[0].dismiss();
                return;
            case 1:
                this.f28013b[0].dismiss();
                return;
            case 2:
                this.f28013b[0].dismiss();
                return;
            default:
                this.f28013b[0].dismiss();
                return;
        }
    }
}
