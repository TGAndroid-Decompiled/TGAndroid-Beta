package org.telegram.ui;

import android.view.View;
public final class ip0 extends org.telegram.ui.Components.d91 {
    public final int f36851a;
    public final Object f36852b;

    public ip0(Object obj, int i10) {
        this.f36851a = i10;
        this.f36852b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f36851a) {
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
        switch (this.f36851a) {
            case 0:
                eq0 eq0Var = (eq0) this.f36852b;
                if (i10 == 1) {
                    return eq0Var.h;
                }
                if (i10 == 0) {
                    return eq0Var.f35362n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.f36852b).f33009c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f36851a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.f36852b).f33009c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f36851a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
