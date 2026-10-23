package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class c3 implements org.telegram.ui.ActionBar.a2 {
    public final int f25094a;
    public final Utilities.Callback f25095b;
    public final boolean[] f25096c;

    public c3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f25094a = i10;
        this.f25095b = callback;
        this.f25096c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25094a) {
            case 0:
                this.f25095b.run(Boolean.valueOf(this.f25096c[0]));
                return;
            default:
                this.f25095b.run(Boolean.TRUE);
                this.f25096c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
