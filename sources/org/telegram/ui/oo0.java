package org.telegram.ui;

import android.view.View;
public final class oo0 extends org.telegram.ui.Components.u81 {
    public final int f39876a;
    public final Object f39877b;

    public oo0(Object obj, int i10) {
        this.f39876a = i10;
        this.f39877b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f39876a) {
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
        switch (this.f39876a) {
            case 0:
                kp0 kp0Var = (kp0) this.f39877b;
                if (i10 == 1) {
                    return kp0Var.h;
                }
                if (i10 == 0) {
                    return kp0Var.f38653n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.j2) this.f39877b).f34356c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f39876a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.j2) this.f39877b).f34356c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f39876a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
