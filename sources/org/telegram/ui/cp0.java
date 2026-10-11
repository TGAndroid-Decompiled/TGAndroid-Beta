package org.telegram.ui;

import android.view.View;
public final class cp0 extends org.telegram.ui.Components.g91 {
    public final int f36834a;
    public final Object f36835b;

    public cp0(Object obj, int i10) {
        this.f36834a = i10;
        this.f36835b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f36834a) {
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
        switch (this.f36834a) {
            case 0:
                zp0 zp0Var = (zp0) this.f36835b;
                if (i10 == 1) {
                    return zp0Var.h;
                }
                if (i10 == 0) {
                    return zp0Var.f45086n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.j2) this.f36835b).f35136c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f36834a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.j2) this.f36835b).f35136c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f36834a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
