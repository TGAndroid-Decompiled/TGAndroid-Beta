package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.b2 {
    public final int f27362a;
    public final Utilities.Callback f27363b;
    public final boolean[] f27364c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f27362a = i10;
        this.f27363b = callback;
        this.f27364c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f27362a) {
            case 0:
                this.f27363b.run(Boolean.valueOf(this.f27364c[0]));
                return;
            default:
                this.f27363b.run(Boolean.TRUE);
                this.f27364c[0] = true;
                e2Var.dismiss();
                return;
        }
    }
}
