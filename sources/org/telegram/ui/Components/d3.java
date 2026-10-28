package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.b2 {
    public final int f27325a;
    public final Utilities.Callback f27326b;
    public final boolean[] f27327c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f27325a = i10;
        this.f27326b = callback;
        this.f27327c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f27325a) {
            case 0:
                this.f27326b.run(Boolean.valueOf(this.f27327c[0]));
                return;
            default:
                this.f27326b.run(Boolean.TRUE);
                this.f27327c[0] = true;
                e2Var.dismiss();
                return;
        }
    }
}
