package org.telegram.ui.Components;

import android.view.View;
public final class j2 implements View.OnClickListener {
    public final int f25187a;
    public final org.telegram.ui.ActionBar.f3[] f25188b;

    public j2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f25187a = i10;
        this.f25188b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25187a) {
            case 0:
                this.f25188b[0].dismiss();
                return;
            case 1:
                this.f25188b[0].dismiss();
                return;
            case 2:
                this.f25188b[0].dismiss();
                return;
            default:
                this.f25188b[0].dismiss();
                return;
        }
    }
}
