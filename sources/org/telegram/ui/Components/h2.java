package org.telegram.ui.Components;

import android.view.View;

public final class h2 implements View.OnClickListener {

    public final int f28903a;

    public final org.telegram.ui.ActionBar.e3[] f28904b;

    public h2(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f28903a = i10;
        this.f28904b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28903a) {
            case 0:
                this.f28904b[0].dismiss();
                break;
            case 1:
                this.f28904b[0].dismiss();
                break;
            case 2:
                this.f28904b[0].dismiss();
                break;
            default:
                this.f28904b[0].dismiss();
                break;
        }
    }
}
