package org.telegram.ui.Components;

import android.view.View;
public final class g2 implements View.OnClickListener {
    public final int f33941a;
    public final org.telegram.ui.ActionBar.t2[] f33942b;

    public g2(org.telegram.ui.ActionBar.t2[] t2VarArr, int i3) {
        this.f33941a = i3;
        this.f33942b = t2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33941a) {
            case 0:
                this.f33942b[0].dismiss();
                return;
            case 1:
                this.f33942b[0].dismiss();
                return;
            case 2:
                this.f33942b[0].dismiss();
                return;
            default:
                this.f33942b[0].dismiss();
                return;
        }
    }
}
