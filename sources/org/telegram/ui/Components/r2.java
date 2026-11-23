package org.telegram.ui.Components;

import android.view.View;
public final class r2 implements View.OnClickListener {
    public final int f39054a;
    public final org.telegram.ui.ActionBar.w2[] f39055b;

    public r2(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f39054a = i7;
        this.f39055b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39054a) {
            case 0:
                this.f39055b[0].dismiss();
                return;
            case 1:
                this.f39055b[0].dismiss();
                return;
            default:
                this.f39055b[0].dismiss();
                return;
        }
    }
}
