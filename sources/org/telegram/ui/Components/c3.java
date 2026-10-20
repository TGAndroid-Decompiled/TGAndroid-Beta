package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class c3 implements org.telegram.ui.ActionBar.a2 {
    public final int f25090a;
    public final Utilities.Callback f25091b;
    public final boolean[] f25092c;

    public c3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25090a = i10;
        this.f25091b = callback;
        this.f25092c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25090a) {
            case 0:
                this.f25091b.run(Boolean.valueOf(this.f25092c[0]));
                return;
            default:
                this.f25091b.run(Boolean.TRUE);
                this.f25092c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
