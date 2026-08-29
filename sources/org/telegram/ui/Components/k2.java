package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f29889a;
    public final org.telegram.ui.ActionBar.f3[] f29890b;

    public k2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f29889a = i10;
        this.f29890b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29889a) {
            case 0:
                this.f29890b[0].dismiss();
                return;
            case 1:
                this.f29890b[0].dismiss();
                return;
            case 2:
                this.f29890b[0].dismiss();
                return;
            default:
                this.f29890b[0].dismiss();
                return;
        }
    }
}
