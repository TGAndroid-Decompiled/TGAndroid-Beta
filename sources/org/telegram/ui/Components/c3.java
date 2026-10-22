package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class c3 implements org.telegram.ui.ActionBar.a2 {
    public final int f25093a;
    public final Utilities.Callback f25094b;
    public final boolean[] f25095c;

    public c3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25093a = i10;
        this.f25094b = callback;
        this.f25095c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25093a) {
            case 0:
                this.f25094b.run(Boolean.valueOf(this.f25095c[0]));
                return;
            default:
                this.f25094b.run(Boolean.TRUE);
                this.f25095c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
