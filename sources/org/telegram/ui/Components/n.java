package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f30686a;
    public final q f30687b;

    public n(q qVar, int i10) {
        this.f30686a = i10;
        this.f30687b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30686a) {
            case 0:
                this.f30687b.dismiss();
                return;
            default:
                q.Q(this.f30687b);
                return;
        }
    }
}
