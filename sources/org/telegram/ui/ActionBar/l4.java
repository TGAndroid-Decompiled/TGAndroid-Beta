package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f21567a;
    public final v4 f21568b;

    public l4(v4 v4Var, int i10) {
        this.f21567a = i10;
        this.f21568b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21567a) {
            case 0:
                this.f21568b.g();
                return;
            case 1:
                this.f21568b.g();
                return;
            default:
                this.f21568b.g();
                return;
        }
    }
}
