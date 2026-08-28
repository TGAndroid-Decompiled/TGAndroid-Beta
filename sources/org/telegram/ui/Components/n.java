package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f30954a;
    public final q f30955b;

    public n(q qVar, int i9) {
        this.f30954a = i9;
        this.f30955b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30954a) {
            case 0:
                this.f30955b.dismiss();
                return;
            default:
                q.P(this.f30955b);
                return;
        }
    }
}
