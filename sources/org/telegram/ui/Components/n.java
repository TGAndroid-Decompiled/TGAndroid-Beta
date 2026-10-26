package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f30786a;
    public final q f30787b;

    public n(q qVar, int i10) {
        this.f30786a = i10;
        this.f30787b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30786a) {
            case 0:
                this.f30787b.dismiss();
                return;
            default:
                q.Q(this.f30787b);
                return;
        }
    }
}
