package org.telegram.ui.Components;

import android.view.View;
public final class q2 implements View.OnClickListener {
    public final int f38684a;
    public final org.telegram.ui.ActionBar.x2[] f38685b;

    public q2(org.telegram.ui.ActionBar.x2[] x2VarArr, int i7) {
        this.f38684a = i7;
        this.f38685b = x2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38684a) {
            case 0:
                this.f38685b[0].dismiss();
                return;
            case 1:
                this.f38685b[0].dismiss();
                return;
            default:
                this.f38685b[0].dismiss();
                return;
        }
    }
}
