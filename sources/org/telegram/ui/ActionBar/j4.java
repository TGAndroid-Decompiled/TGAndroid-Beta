package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 implements View.OnClickListener {
    public final int f19512a;
    public final t4 f19513b;

    public j4(t4 t4Var, int i10) {
        this.f19512a = i10;
        this.f19513b = t4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19512a) {
            case 0:
                this.f19513b.g();
                return;
            case 1:
                this.f19513b.g();
                return;
            default:
                this.f19513b.g();
                return;
        }
    }
}
