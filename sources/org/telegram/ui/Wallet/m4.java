package org.telegram.ui.Wallet;

import android.view.View;
public final class m4 implements View.OnClickListener {
    public final int f42801a;
    public final org.telegram.ui.ActionBar.v2[] f42802b;

    public m4(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.f42801a = i7;
        this.f42802b = v2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42801a) {
            case 0:
                this.f42802b[0].dismiss();
                return;
            default:
                this.f42802b[0].dismiss();
                return;
        }
    }
}
