package org.telegram.ui;

import android.content.Context;
public final class p6 extends org.telegram.ui.ActionBar.v2 {
    public static final int f48660j1 = 0;
    public final int f48661i1;

    public p6(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(i7, context, f6Var, z9);
        this.f48661i1 = 2;
    }

    @Override
    public boolean H() {
        switch (this.f48661i1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override
    public void s0() {
        switch (this.f48661i1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0);
                    if (this.G0 != w02) {
                        O(w02);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                super.s0();
                return;
        }
    }

    public p6(int i7, Context context, boolean z9) {
        super(context, z9);
        this.f48661i1 = i7;
    }
}
