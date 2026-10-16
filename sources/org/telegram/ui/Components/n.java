package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f27248a;
    public final q f27249b;

    public n(q qVar, int i10) {
        this.f27248a = i10;
        this.f27249b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27248a) {
            case 0:
                this.f27249b.dismiss();
                return;
            default:
                q.R(this.f27249b);
                return;
        }
    }
}
