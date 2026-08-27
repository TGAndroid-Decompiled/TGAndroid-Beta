package org.telegram.ui;

import android.view.View;

public final class nd implements View.OnClickListener {

    public final int f40801a;

    public final org.telegram.ui.ActionBar.e3 f40802b;

    public nd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f40801a = i10;
        this.f40802b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40801a) {
            case 0:
                this.f40802b.dismiss();
                break;
            default:
                this.f40802b.dismiss();
                break;
        }
    }
}
