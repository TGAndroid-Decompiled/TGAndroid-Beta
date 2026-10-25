package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f30784a;
    public final q f30785b;

    public n(q qVar, int i10) {
        this.f30784a = i10;
        this.f30785b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30784a) {
            case 0:
                this.f30785b.dismiss();
                return;
            default:
                q.Q(this.f30785b);
                return;
        }
    }
}
