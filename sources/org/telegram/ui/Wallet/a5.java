package org.telegram.ui.Wallet;

import android.view.View;
public final class a5 implements View.OnClickListener {
    public final int f44047a;
    public final org.telegram.ui.ActionBar.w2[] f44048b;

    public a5(org.telegram.ui.ActionBar.w2[] w2VarArr, int i7) {
        this.f44047a = i7;
        this.f44048b = w2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44047a) {
            case 0:
                this.f44048b[0].dismiss();
                return;
            default:
                this.f44048b[0].dismiss();
                return;
        }
    }
}
