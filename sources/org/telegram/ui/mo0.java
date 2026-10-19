package org.telegram.ui;

import android.view.View;
public final class mo0 extends org.telegram.ui.Components.v81 {
    public final int f39316a;
    public final Object f39317b;

    public mo0(Object obj, int i10) {
        this.f39316a = i10;
        this.f39317b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f39316a) {
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
        switch (this.f39316a) {
            case 0:
                ip0 ip0Var = (ip0) this.f39317b;
                if (i10 == 1) {
                    return ip0Var.h;
                }
                if (i10 == 0) {
                    return ip0Var.f38088n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.j2) this.f39317b).f34371c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f39316a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.j2) this.f39317b).f34371c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f39316a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
