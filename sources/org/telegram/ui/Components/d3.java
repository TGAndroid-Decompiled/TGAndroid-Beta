package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.a2 {
    public final int f25532a;
    public final Utilities.Callback f25533b;
    public final boolean[] f25534c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25532a = i10;
        this.f25533b = callback;
        this.f25534c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25532a) {
            case 0:
                this.f25533b.run(Boolean.valueOf(this.f25534c[0]));
                return;
            default:
                this.f25533b.run(Boolean.TRUE);
                this.f25534c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
