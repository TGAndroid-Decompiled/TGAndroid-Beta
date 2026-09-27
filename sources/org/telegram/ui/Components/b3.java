package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.b2 {
    public final int f22888a;
    public final Utilities.Callback f22889b;
    public final boolean[] f22890c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f22888a = i10;
        this.f22889b = callback;
        this.f22890c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f22888a) {
            case 0:
                this.f22889b.run(Boolean.valueOf(this.f22890c[0]));
                return;
            default:
                this.f22889b.run(Boolean.TRUE);
                this.f22890c[0] = true;
                c2Var.dismiss();
                return;
        }
    }
}
