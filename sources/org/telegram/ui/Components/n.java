package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28626a;
    public final q f28627b;

    public n(q qVar, int i10) {
        this.f28626a = i10;
        this.f28627b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28626a) {
            case 0:
                this.f28627b.dismiss();
                return;
            default:
                q.R(this.f28627b);
                return;
        }
    }
}
