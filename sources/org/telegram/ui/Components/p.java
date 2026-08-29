package org.telegram.ui.Components;

import android.view.View;
public final class p implements View.OnClickListener {
    public final int f31516a;
    public final s f31517b;

    public p(s sVar, int i10) {
        this.f31516a = i10;
        this.f31517b = sVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31516a) {
            case 0:
                this.f31517b.dismiss();
                return;
            default:
                s.Q(this.f31517b);
                return;
        }
    }
}
