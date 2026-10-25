package org.telegram.ui.Components;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f30825a;
    public final org.telegram.ui.ActionBar.k3[] f30826b;

    public n2(org.telegram.ui.ActionBar.k3[] k3VarArr, int i10) {
        this.f30825a = i10;
        this.f30826b = k3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30825a) {
            case 0:
                this.f30826b[0].dismiss();
                return;
            case 1:
                this.f30826b[0].dismiss();
                return;
            case 2:
                this.f30826b[0].dismiss();
                return;
            default:
                this.f30826b[0].dismiss();
                return;
        }
    }
}
