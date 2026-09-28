package org.telegram.ui.ActionBar;

import android.view.View;
public final class g0 implements View.OnClickListener {
    public final int f18911a;
    public final e1 f18912b;

    public g0(e1 e1Var, int i10) {
        this.f18911a = i10;
        this.f18912b = e1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18911a) {
            case 0:
                this.f18912b.b();
                return;
            default:
                this.f18912b.b();
                return;
        }
    }
}
