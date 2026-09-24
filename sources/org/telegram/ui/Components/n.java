package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26589a;
    public final q f26590b;

    public n(q qVar, int i10) {
        this.f26589a = i10;
        this.f26590b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26589a) {
            case 0:
                this.f26590b.dismiss();
                return;
            default:
                q.Q(this.f26590b);
                return;
        }
    }
}
