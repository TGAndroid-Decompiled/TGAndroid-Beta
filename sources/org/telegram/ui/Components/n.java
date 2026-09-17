package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26286a;
    public final q f26287b;

    public n(q qVar, int i10) {
        this.f26286a = i10;
        this.f26287b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26286a) {
            case 0:
                this.f26287b.dismiss();
                return;
            default:
                q.Q(this.f26287b);
                return;
        }
    }
}
