package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f28898a;
    public final r f28899b;

    public o(r rVar, int i10) {
        this.f28898a = i10;
        this.f28899b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28898a) {
            case 0:
                this.f28899b.dismiss();
                return;
            default:
                r.Q(this.f28899b);
                return;
        }
    }
}
