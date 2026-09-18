package org.telegram.ui.Components;

import android.view.View;
public final class j2 implements View.OnClickListener {
    public final int f25075a;
    public final org.telegram.ui.ActionBar.g3[] f25076b;

    public j2(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f25075a = i10;
        this.f25076b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25075a) {
            case 0:
                this.f25076b[0].dismiss();
                return;
            case 1:
                this.f25076b[0].dismiss();
                return;
            case 2:
                this.f25076b[0].dismiss();
                return;
            default:
                this.f25076b[0].dismiss();
                return;
        }
    }
}
