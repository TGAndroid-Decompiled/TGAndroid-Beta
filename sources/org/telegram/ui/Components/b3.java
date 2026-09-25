package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.z1 {
    public final int f22856a;
    public final Utilities.Callback f22857b;
    public final boolean[] f22858c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f22856a = i10;
        this.f22857b = callback;
        this.f22858c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f22856a) {
            case 0:
                this.f22857b.run(Boolean.valueOf(this.f22858c[0]));
                return;
            default:
                this.f22857b.run(Boolean.TRUE);
                this.f22858c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
