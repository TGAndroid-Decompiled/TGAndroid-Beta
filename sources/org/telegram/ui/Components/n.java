package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26628a;
    public final q f26629b;

    public n(q qVar, int i10) {
        this.f26628a = i10;
        this.f26629b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26628a) {
            case 0:
                this.f26629b.dismiss();
                return;
            default:
                q.Q(this.f26629b);
                return;
        }
    }
}
