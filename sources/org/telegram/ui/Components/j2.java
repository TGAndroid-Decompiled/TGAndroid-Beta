package org.telegram.ui.Components;

import android.view.View;
public final class j2 implements View.OnClickListener {
    public final int f27537a;
    public final org.telegram.ui.ActionBar.h3[] f27538b;

    public j2(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f27537a = i10;
        this.f27538b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27537a) {
            case 0:
                this.f27538b[0].dismiss();
                return;
            case 1:
                this.f27538b[0].dismiss();
                return;
            case 2:
                this.f27538b[0].dismiss();
                return;
            default:
                this.f27538b[0].dismiss();
                return;
        }
    }
}
