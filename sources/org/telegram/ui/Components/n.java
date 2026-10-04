package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28759a;
    public final q f28760b;

    public n(q qVar, int i10) {
        this.f28759a = i10;
        this.f28760b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28759a) {
            case 0:
                this.f28760b.dismiss();
                return;
            default:
                q.O(this.f28760b);
                return;
        }
    }
}
