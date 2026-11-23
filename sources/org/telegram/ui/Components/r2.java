package org.telegram.ui.Components;

import android.view.View;
public final class r2 implements View.OnClickListener {
    public final int f39008a;
    public final org.telegram.ui.ActionBar.w2[] f39009b;

    public r2(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f39008a = i7;
        this.f39009b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39008a) {
            case 0:
                this.f39009b[0].dismiss();
                return;
            case 1:
                this.f39009b[0].dismiss();
                return;
            default:
                this.f39009b[0].dismiss();
                return;
        }
    }
}
