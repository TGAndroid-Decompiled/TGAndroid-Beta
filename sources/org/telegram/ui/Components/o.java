package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f29617a;
    public final r f29618b;

    public o(r rVar, int i10) {
        this.f29617a = i10;
        this.f29618b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29617a) {
            case 0:
                this.f29618b.dismiss();
                return;
            default:
                r.Q(this.f29618b);
                return;
        }
    }
}
