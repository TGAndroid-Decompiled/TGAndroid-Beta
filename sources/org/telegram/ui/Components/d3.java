package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.a2 {
    public final int f25575a;
    public final Utilities.Callback f25576b;
    public final boolean[] f25577c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25575a = i10;
        this.f25576b = callback;
        this.f25577c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25575a) {
            case 0:
                this.f25576b.run(Boolean.valueOf(this.f25577c[0]));
                return;
            default:
                this.f25576b.run(Boolean.TRUE);
                this.f25577c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
