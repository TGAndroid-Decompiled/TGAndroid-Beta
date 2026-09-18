package org.telegram.ui.ActionBar;

import android.view.View;
public final class h0 implements View.OnClickListener {
    public final int f18901a;
    public final f1 f18902b;

    public h0(f1 f1Var, int i10) {
        this.f18901a = i10;
        this.f18902b = f1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18901a) {
            case 0:
                this.f18902b.b();
                return;
            default:
                this.f18902b.b();
                return;
        }
    }
}
