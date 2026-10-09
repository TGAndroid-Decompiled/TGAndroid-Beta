package org.telegram.ui;

import android.view.View;
public final class dp0 extends org.telegram.ui.Components.f91 {
    public final int f37057a;
    public final Object f37058b;

    public dp0(Object obj, int i10) {
        this.f37057a = i10;
        this.f37058b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f37057a) {
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
        switch (this.f37057a) {
            case 0:
                aq0 aq0Var = (aq0) this.f37058b;
                if (i10 == 1) {
                    return aq0Var.h;
                }
                if (i10 == 0) {
                    return aq0Var.f35993n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.h2) this.f37058b).f34963c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f37057a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.h2) this.f37058b).f34963c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f37057a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
