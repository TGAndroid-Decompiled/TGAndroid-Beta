package org.telegram.ui.Components;

import android.view.View;
public final class j2 implements View.OnClickListener {
    public final int f25072a;
    public final org.telegram.ui.ActionBar.g3[] f25073b;

    public j2(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f25072a = i10;
        this.f25073b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25072a) {
            case 0:
                this.f25073b[0].dismiss();
                return;
            case 1:
                this.f25073b[0].dismiss();
                return;
            case 2:
                this.f25073b[0].dismiss();
                return;
            default:
                this.f25073b[0].dismiss();
                return;
        }
    }
}
