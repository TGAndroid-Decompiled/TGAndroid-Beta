package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.z1 {
    public final int f25202a;
    public final Utilities.Callback f25203b;
    public final boolean[] f25204c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25202a = i10;
        this.f25203b = callback;
        this.f25204c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25202a) {
            case 0:
                this.f25203b.run(Boolean.valueOf(this.f25204c[0]));
                return;
            default:
                this.f25203b.run(Boolean.TRUE);
                this.f25204c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
