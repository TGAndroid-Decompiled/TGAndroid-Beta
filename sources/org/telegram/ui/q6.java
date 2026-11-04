package org.telegram.ui;

import android.content.Context;
public final class q6 extends org.telegram.ui.ActionBar.t2 {
    public static final int k1 = 0;
    public final int f48759j1;

    public q6(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(i3, context, e6Var, z10);
        this.f48759j1 = 2;
    }

    @Override
    public boolean H() {
        switch (this.f48759j1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override
    public void s0() {
        switch (this.f48759j1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
                    if (this.H0 != w02) {
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

    public q6(int i3, Context context, boolean z10) {
        super(context, z10);
        this.f48759j1 = i3;
    }
}
