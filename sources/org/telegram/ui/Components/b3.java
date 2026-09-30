package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.z1 {
    public final int f22839a;
    public final Utilities.Callback f22840b;
    public final boolean[] f22841c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f22839a = i10;
        this.f22840b = callback;
        this.f22841c = zArr;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f22839a) {
            case 0:
                this.f22840b.run(Boolean.valueOf(this.f22841c[0]));
                return;
            default:
                this.f22840b.run(Boolean.TRUE);
                this.f22841c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
