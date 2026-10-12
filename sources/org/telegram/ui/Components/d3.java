package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.z1 {
    public final int f24278a;
    public final Utilities.Callback f24279b;
    public final boolean[] f24280c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f24278a = i10;
        this.f24279b = callback;
        this.f24280c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f24278a) {
            case 0:
                this.f24279b.run(Boolean.valueOf(this.f24280c[0]));
                return;
            default:
                this.f24279b.run(Boolean.TRUE);
                this.f24280c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
