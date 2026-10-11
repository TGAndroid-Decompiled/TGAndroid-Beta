package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f41185a;
    public final org.telegram.ui.ActionBar.e3 f41186b;

    public qd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f41185a = i10;
        this.f41186b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41185a) {
            case 0:
                this.f41186b.dismiss();
                return;
            default:
                this.f41186b.dismiss();
                return;
        }
    }
}
