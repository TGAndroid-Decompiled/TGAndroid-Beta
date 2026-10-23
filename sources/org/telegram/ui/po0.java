package org.telegram.ui;

import android.view.View;
public final class po0 extends org.telegram.ui.Components.d91 {
    public final int f40514a;
    public final Object f40515b;

    public po0(Object obj, int i10) {
        this.f40514a = i10;
        this.f40515b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f40514a) {
            case 0:
                return;
            default:
                if (view instanceof org.telegram.ui.Wallet.g2) {
                    ((org.telegram.ui.Wallet.g2) view).getClass();
                    return;
                }
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f40514a) {
            case 0:
                lp0 lp0Var = (lp0) this.f40515b;
                if (i10 == 1) {
                    return lp0Var.h;
                }
                if (i10 == 0) {
                    return lp0Var.f39305n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.f40515b).f34595c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f40514a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.f40515b).f34595c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f40514a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
