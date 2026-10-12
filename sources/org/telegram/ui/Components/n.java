package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f27546a;
    public final q f27547b;

    public n(q qVar, int i10) {
        this.f27546a = i10;
        this.f27547b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27546a) {
            case 0:
                this.f27547b.dismiss();
                return;
            default:
                q.R(this.f27547b);
                return;
        }
    }
}
