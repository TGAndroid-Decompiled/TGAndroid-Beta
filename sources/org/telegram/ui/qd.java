package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f36863a;
    public final org.telegram.ui.ActionBar.e3 f36864b;

    public qd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f36863a = i10;
        this.f36864b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36863a) {
            case 0:
                this.f36864b.dismiss();
                return;
            default:
                this.f36864b.dismiss();
                return;
        }
    }
}
