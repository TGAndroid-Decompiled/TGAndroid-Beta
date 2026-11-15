package org.telegram.ui.Components;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f35150a;
    public final org.telegram.ui.ActionBar.u2[] f35151b;

    public h2(org.telegram.ui.ActionBar.u2[] u2VarArr, int i7) {
        this.f35150a = i7;
        this.f35151b = u2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35150a) {
            case 0:
                this.f35151b[0].dismiss();
                return;
            case 1:
                this.f35151b[0].dismiss();
                return;
            case 2:
                this.f35151b[0].dismiss();
                return;
            default:
                this.f35151b[0].dismiss();
                return;
        }
    }
}
