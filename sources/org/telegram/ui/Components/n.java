package org.telegram.ui.Components;

import android.view.View;

public final class n implements View.OnClickListener {

    public final int f30797a;

    public final q f30798b;

    public n(q qVar, int i10) {
        this.f30797a = i10;
        this.f30798b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30797a) {
            case 0:
                this.f30798b.dismiss();
                break;
            default:
                q.Q(this.f30798b);
                break;
        }
    }
}
