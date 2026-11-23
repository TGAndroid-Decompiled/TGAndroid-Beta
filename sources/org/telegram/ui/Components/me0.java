package org.telegram.ui.Components;

import android.view.View;
public final class me0 implements View.OnClickListener {
    public final int f37441a;
    public final oe0 f37442b;
    public final Runnable f37443c;

    public me0(oe0 oe0Var, Runnable runnable, int i7) {
        this.f37441a = i7;
        this.f37442b = oe0Var;
        this.f37443c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37441a) {
            case 0:
                oe0 oe0Var = this.f37442b;
                org.telegram.ui.ActionBar.k5 k5Var = oe0Var.d;
                if (k5Var.I) {
                    oe0Var.I = this.f37443c;
                    k5Var.a(true);
                    return;
                }
                return;
            default:
                oe0 oe0Var2 = this.f37442b;
                org.telegram.ui.ActionBar.k5 k5Var2 = oe0Var2.d;
                if (k5Var2.I) {
                    oe0Var2.I = this.f37443c;
                    k5Var2.a(true);
                    return;
                }
                return;
        }
    }
}
