package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.z1 {
    public final int f24940a;
    public final Utilities.Callback f24941b;
    public final boolean[] f24942c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f24940a = i10;
        this.f24941b = callback;
        this.f24942c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f24940a) {
            case 0:
                this.f24941b.run(Boolean.valueOf(this.f24942c[0]));
                return;
            default:
                this.f24941b.run(Boolean.TRUE);
                this.f24942c[0] = true;
                c2Var.dismiss();
                return;
        }
    }
}
