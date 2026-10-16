package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class d3 implements org.telegram.ui.ActionBar.z1 {
    public final int f23953a;
    public final Utilities.Callback f23954b;
    public final boolean[] f23955c;

    public d3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f23953a = i10;
        this.f23954b = callback;
        this.f23955c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f23953a) {
            case 0:
                this.f23954b.run(Boolean.valueOf(this.f23955c[0]));
                return;
            default:
                this.f23954b.run(Boolean.TRUE);
                this.f23955c[0] = true;
                a2Var.dismiss();
                return;
        }
    }
}
