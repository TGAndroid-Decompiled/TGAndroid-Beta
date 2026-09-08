package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f28924a;
    public final r f28925b;

    public o(r rVar, int i10) {
        this.f28924a = i10;
        this.f28925b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28924a) {
            case 0:
                this.f28925b.dismiss();
                return;
            default:
                r.Q(this.f28925b);
                return;
        }
    }
}
