package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b3 implements org.telegram.ui.ActionBar.a2 {
    public final int f24824a;
    public final Utilities.Callback f24825b;
    public final boolean[] f24826c;

    public b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f24824a = i10;
        this.f24825b = callback;
        this.f24826c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24824a) {
            case 0:
                this.f24825b.run(Boolean.valueOf(this.f24826c[0]));
                return;
            default:
                this.f24825b.run(Boolean.TRUE);
                this.f24826c[0] = true;
                b2Var.dismiss();
                return;
        }
    }
}
