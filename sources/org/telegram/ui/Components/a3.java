package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class a3 implements org.telegram.ui.ActionBar.a2 {
    public final int f22330a;
    public final Utilities.Callback f22331b;
    public final boolean[] f22332c;

    public a3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f22330a = i10;
        this.f22331b = callback;
        this.f22332c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f22330a) {
            case 0:
                this.f22331b.run(Boolean.valueOf(this.f22332c[0]));
                return;
            default:
                this.f22331b.run(Boolean.TRUE);
                this.f22332c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
