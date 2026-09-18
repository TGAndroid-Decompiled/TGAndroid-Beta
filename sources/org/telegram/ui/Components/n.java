package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26289a;
    public final q f26290b;

    public n(q qVar, int i10) {
        this.f26289a = i10;
        this.f26290b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26289a) {
            case 0:
                this.f26290b.dismiss();
                return;
            default:
                q.Q(this.f26290b);
                return;
        }
    }
}
