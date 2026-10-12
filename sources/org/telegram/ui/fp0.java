package org.telegram.ui;

import android.view.View;
public final class fp0 extends org.telegram.ui.Components.l91 {
    public final int f37818a;
    public final Object f37819b;

    public fp0(Object obj, int i10) {
        this.f37818a = i10;
        this.f37819b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f37818a) {
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
        switch (this.f37818a) {
            case 0:
                cq0 cq0Var = (cq0) this.f37819b;
                if (i10 == 1) {
                    return cq0Var.h;
                }
                if (i10 == 0) {
                    return cq0Var.f36492n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.j2) this.f37819b).f34913c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f37818a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.j2) this.f37819b).f34913c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f37818a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
