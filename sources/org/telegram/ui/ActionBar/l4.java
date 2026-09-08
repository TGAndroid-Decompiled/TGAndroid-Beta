package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f21196a;
    public final v4 f21197b;

    public l4(v4 v4Var, int i10) {
        this.f21196a = i10;
        this.f21197b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21196a) {
            case 0:
                this.f21197b.g();
                return;
            case 1:
                this.f21197b.g();
                return;
            default:
                this.f21197b.g();
                return;
        }
    }
}
