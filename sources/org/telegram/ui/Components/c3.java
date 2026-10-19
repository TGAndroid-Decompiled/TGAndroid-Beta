package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class c3 implements org.telegram.ui.ActionBar.a2 {
    public final int f25063a;
    public final Utilities.Callback f25064b;
    public final boolean[] f25065c;

    public c3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25063a = i10;
        this.f25064b = callback;
        this.f25065c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25063a) {
            case 0:
                this.f25064b.run(Boolean.valueOf(this.f25065c[0]));
                return;
            default:
                this.f25064b.run(Boolean.TRUE);
                this.f25065c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
