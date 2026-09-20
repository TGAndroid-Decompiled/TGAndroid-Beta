package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26515a;
    public final q f26516b;

    public n(q qVar, int i10) {
        this.f26515a = i10;
        this.f26516b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26515a) {
            case 0:
                this.f26516b.dismiss();
                return;
            default:
                q.Q(this.f26516b);
                return;
        }
    }
}
