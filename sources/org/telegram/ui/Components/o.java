package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f28925a;
    public final r f28926b;

    public o(r rVar, int i10) {
        this.f28925a = i10;
        this.f28926b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28925a) {
            case 0:
                this.f28926b.dismiss();
                return;
            default:
                r.Q(this.f28926b);
                return;
        }
    }
}
