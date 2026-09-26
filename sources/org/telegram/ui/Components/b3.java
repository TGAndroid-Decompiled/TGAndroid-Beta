package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.z1 {
    public final int f22871a;
    public final Utilities.Callback f22872b;
    public final boolean[] f22873c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f22871a = i10;
        this.f22872b = callback;
        this.f22873c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f22871a) {
            case 0:
                this.f22872b.run(Boolean.valueOf(this.f22873c[0]));
                return;
            default:
                this.f22872b.run(Boolean.TRUE);
                this.f22873c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
