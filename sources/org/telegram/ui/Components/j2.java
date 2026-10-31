package org.telegram.ui.Components;

import android.view.View;
public final class j2 implements View.OnClickListener {
    public final int f27197a;
    public final org.telegram.ui.ActionBar.z2[] f27198b;

    public j2(org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.f27197a = i10;
        this.f27198b = z2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27197a) {
            case 0:
                this.f27198b[0].dismiss();
                return;
            case 1:
                this.f27198b[0].dismiss();
                return;
            case 2:
                this.f27198b[0].dismiss();
                return;
            default:
                this.f27198b[0].dismiss();
                return;
        }
    }
}
