package org.telegram.ui;

import android.view.View;
public final class dp0 extends org.telegram.ui.Components.f91 {
    public final int f37059a;
    public final Object f37060b;

    public dp0(Object obj, int i10) {
        this.f37059a = i10;
        this.f37060b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f37059a) {
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
        switch (this.f37059a) {
            case 0:
                aq0 aq0Var = (aq0) this.f37060b;
                if (i10 == 1) {
                    return aq0Var.h;
                }
                if (i10 == 0) {
                    return aq0Var.f35995n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.h2) this.f37060b).f34981c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f37059a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.h2) this.f37060b).f34981c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f37059a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
