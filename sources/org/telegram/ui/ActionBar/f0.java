package org.telegram.ui.ActionBar;

import android.view.View;
public final class f0 implements View.OnClickListener {
    public final int f20292a;
    public final b1 f20293b;

    public f0(b1 b1Var, int i10) {
        this.f20292a = i10;
        this.f20293b = b1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20292a) {
            case 0:
                this.f20293b.b();
                return;
            default:
                this.f20293b.b();
                return;
        }
    }
}
