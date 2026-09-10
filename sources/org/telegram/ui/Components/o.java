package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f25624a;
    public final r f25625b;

    public o(r rVar, int i10) {
        this.f25624a = i10;
        this.f25625b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25624a) {
            case 0:
                this.f25625b.dismiss();
                return;
            default:
                r.Q(this.f25625b);
                return;
        }
    }
}
