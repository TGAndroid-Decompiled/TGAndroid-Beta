package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28758a;
    public final q f28759b;

    public n(q qVar, int i10) {
        this.f28758a = i10;
        this.f28759b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28758a) {
            case 0:
                this.f28759b.dismiss();
                return;
            default:
                q.O(this.f28759b);
                return;
        }
    }
}
