package org.telegram.ui.Components;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f27941a;
    public final org.telegram.ui.ActionBar.f3[] f27942b;

    public k2(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f27941a = i10;
        this.f27942b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27941a) {
            case 0:
                this.f27942b[0].dismiss();
                return;
            case 1:
                this.f27942b[0].dismiss();
                return;
            case 2:
                this.f27942b[0].dismiss();
                return;
            default:
                this.f27942b[0].dismiss();
                return;
        }
    }
}
