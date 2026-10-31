package org.telegram.ui;

import android.view.View;
public final class pd implements View.OnClickListener {
    public final int f40631a;
    public final org.telegram.ui.ActionBar.z2 f40632b;

    public pd(org.telegram.ui.ActionBar.z2 z2Var, int i10) {
        this.f40631a = i10;
        this.f40632b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40631a) {
            case 0:
                this.f40632b.dismiss();
                return;
            default:
                this.f40632b.dismiss();
                return;
        }
    }
}
