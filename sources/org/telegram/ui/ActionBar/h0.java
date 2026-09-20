package org.telegram.ui.ActionBar;

import android.view.View;
public final class h0 implements View.OnClickListener {
    public final int f18914a;
    public final f1 f18915b;

    public h0(f1 f1Var, int i10) {
        this.f18914a = i10;
        this.f18915b = f1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18914a) {
            case 0:
                this.f18915b.b();
                return;
            default:
                this.f18915b.b();
                return;
        }
    }
}
