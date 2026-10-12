package org.telegram.ui;

import android.view.View;
public final class kp0 extends org.telegram.ui.Components.c91 {
    public final int f37703a;
    public final Object f37704b;

    public kp0(Object obj, int i10) {
        this.f37703a = i10;
        this.f37704b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f37703a) {
            case 0:
                return;
            default:
                if (view instanceof org.telegram.ui.Wallet.f2) {
                    ((org.telegram.ui.Wallet.f2) view).getClass();
                    return;
                }
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f37703a) {
            case 0:
                gq0 gq0Var = (gq0) this.f37704b;
                if (i10 == 1) {
                    return gq0Var.h;
                }
                if (i10 == 0) {
                    return gq0Var.f36463n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.h2) this.f37704b).f33226c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f37703a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.h2) this.f37704b).f33226c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f37703a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
