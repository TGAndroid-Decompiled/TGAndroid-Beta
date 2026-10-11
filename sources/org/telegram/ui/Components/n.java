package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28880a;
    public final q f28881b;

    public n(q qVar, int i10) {
        this.f28880a = i10;
        this.f28881b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28880a) {
            case 0:
                this.f28881b.dismiss();
                return;
            default:
                q.R(this.f28881b);
                return;
        }
    }
}
