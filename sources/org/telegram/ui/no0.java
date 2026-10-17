package org.telegram.ui;

import android.view.View;
public final class no0 extends org.telegram.ui.Components.u81 {
    public final int f39488a;
    public final Object f39489b;

    public no0(Object obj, int i10) {
        this.f39488a = i10;
        this.f39489b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f39488a) {
            case 0:
                return;
            default:
                if (view instanceof org.telegram.ui.Wallet.h2) {
                    ((org.telegram.ui.Wallet.h2) view).getClass();
                    return;
                }
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f39488a) {
            case 0:
                jp0 jp0Var = (jp0) this.f39489b;
                if (i10 == 1) {
                    return jp0Var.h;
                }
                if (i10 == 0) {
                    return jp0Var.f38254n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.j2) this.f39489b).f34348c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f39488a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.j2) this.f39489b).f34348c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f39488a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
