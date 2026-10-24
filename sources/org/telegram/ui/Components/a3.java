package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class a3 implements org.telegram.ui.ActionBar.z1 {
    public final int f24611a;
    public final Utilities.Callback f24612b;
    public final boolean[] f24613c;

    public a3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f24611a = i10;
        this.f24612b = callback;
        this.f24613c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f24611a) {
            case 0:
                this.f24612b.run(Boolean.valueOf(this.f24613c[0]));
                return;
            default:
                this.f24612b.run(Boolean.TRUE);
                this.f24613c[0] = true;
                c2Var.dismiss();
                return;
        }
    }
}
