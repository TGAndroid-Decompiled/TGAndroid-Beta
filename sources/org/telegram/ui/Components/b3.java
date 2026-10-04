package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.a2 {
    public final int f24772a;
    public final Utilities.Callback f24773b;
    public final boolean[] f24774c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f24772a = i10;
        this.f24773b = callback;
        this.f24774c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24772a) {
            case 0:
                this.f24773b.run(Boolean.valueOf(this.f24774c[0]));
                return;
            default:
                this.f24773b.run(Boolean.TRUE);
                this.f24774c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
