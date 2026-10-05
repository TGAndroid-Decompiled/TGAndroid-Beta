package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28869a;
    public final q f28870b;

    public n(q qVar, int i10) {
        this.f28869a = i10;
        this.f28870b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28869a) {
            case 0:
                this.f28870b.dismiss();
                return;
            default:
                q.O(this.f28870b);
                return;
        }
    }
}
