package org.telegram.ui.Components;

import android.view.View;
public final class r2 implements View.OnClickListener {
    public final int f39044a;
    public final org.telegram.ui.ActionBar.w2[] f39045b;

    public r2(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f39044a = i7;
        this.f39045b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39044a) {
            case 0:
                this.f39045b[0].dismiss();
                return;
            case 1:
                this.f39045b[0].dismiss();
                return;
            default:
                this.f39045b[0].dismiss();
                return;
        }
    }
}
