package org.telegram.ui;

import android.content.Context;
public final class o6 extends org.telegram.ui.ActionBar.x2 {
    public static final int n1 = 0;
    public final int f50479m1;

    public o6(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(i7, context, i6Var, z10);
        this.f50479m1 = 2;
    }

    @Override
    public boolean I() {
        switch (this.f50479m1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    @Override
    public void s0() {
        switch (this.f50479m1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0);
                    if (this.H0 != w02) {
                        P(w02);
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

    public o6(int i7, Context context, boolean z10) {
        super(context, z10);
        this.f50479m1 = i7;
    }
}
