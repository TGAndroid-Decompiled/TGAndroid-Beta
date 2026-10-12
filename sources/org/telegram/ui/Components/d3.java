package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.z1 {
    public final int f25210a;
    public final Utilities.Callback f25211b;
    public final boolean[] f25212c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25210a = i10;
        this.f25211b = callback;
        this.f25212c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25210a) {
            case 0:
                this.f25211b.run(Boolean.valueOf(this.f25212c[0]));
                return;
            default:
                this.f25211b.run(Boolean.TRUE);
                this.f25212c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
