package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28764a;
    public final q f28765b;

    public n(q qVar, int i10) {
        this.f28764a = i10;
        this.f28765b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28764a) {
            case 0:
                this.f28765b.dismiss();
                return;
            default:
                q.O(this.f28765b);
                return;
        }
    }
}
