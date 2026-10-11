package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.z1 {
    public final int f25594a;
    public final Utilities.Callback f25595b;
    public final boolean[] f25596c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25594a = i10;
        this.f25595b = callback;
        this.f25596c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25594a) {
            case 0:
                this.f25595b.run(Boolean.valueOf(this.f25596c[0]));
                return;
            default:
                this.f25595b.run(Boolean.TRUE);
                this.f25596c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
