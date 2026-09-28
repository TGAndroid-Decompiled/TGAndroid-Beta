package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26629a;
    public final q f26630b;

    public n(q qVar, int i10) {
        this.f26629a = i10;
        this.f26630b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26629a) {
            case 0:
                this.f26630b.dismiss();
                return;
            default:
                q.Q(this.f26630b);
                return;
        }
    }
}
