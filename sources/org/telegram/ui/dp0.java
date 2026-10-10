package org.telegram.ui;

import android.view.View;
public final class dp0 extends org.telegram.ui.Components.g91 {
    public final int f37103a;
    public final Object f37104b;

    public dp0(Object obj, int i10) {
        this.f37103a = i10;
        this.f37104b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f37103a) {
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
        switch (this.f37103a) {
            case 0:
                aq0 aq0Var = (aq0) this.f37104b;
                if (i10 == 1) {
                    return aq0Var.h;
                }
                if (i10 == 0) {
                    return aq0Var.f36039n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.f37104b).f35072c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f37103a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.f37104b).f35072c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f37103a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
