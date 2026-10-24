package org.telegram.ui;

import android.view.View;
public final class oo0 extends org.telegram.ui.Components.d91 {
    public final int f40225a;
    public final Object f40226b;

    public oo0(Object obj, int i10) {
        this.f40225a = i10;
        this.f40226b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f40225a) {
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
        switch (this.f40225a) {
            case 0:
                kp0 kp0Var = (kp0) this.f40226b;
                if (i10 == 1) {
                    return kp0Var.h;
                }
                if (i10 == 0) {
                    return kp0Var.f39013n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.f40226b).f34597c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f40225a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.f40226b).f34597c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f40225a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
