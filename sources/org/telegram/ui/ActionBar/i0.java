package org.telegram.ui.ActionBar;

import android.view.View;
public final class i0 implements View.OnClickListener {
    public final int f18744a;
    public final g1 f18745b;

    public i0(g1 g1Var, int i10) {
        this.f18744a = i10;
        this.f18745b = g1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18744a) {
            case 0:
                this.f18745b.b();
                return;
            default:
                this.f18745b.b();
                return;
        }
    }
}
