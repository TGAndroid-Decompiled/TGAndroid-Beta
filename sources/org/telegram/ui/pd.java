package org.telegram.ui;

import android.view.View;
public final class pd implements View.OnClickListener {
    public final int f40459a;
    public final org.telegram.ui.ActionBar.z2 f40460b;

    public pd(org.telegram.ui.ActionBar.z2 z2Var, int i10) {
        this.f40459a = i10;
        this.f40460b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40459a) {
            case 0:
                this.f40460b.dismiss();
                return;
            default:
                this.f40460b.dismiss();
                return;
        }
    }
}
