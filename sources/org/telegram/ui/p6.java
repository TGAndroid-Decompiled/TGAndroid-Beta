package org.telegram.ui;

import android.content.Context;
public final class p6 extends org.telegram.ui.ActionBar.z2 {
    public static final int f40374j1 = 0;
    public final int f40375i1;

    public p6(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var, z10);
        this.f40375i1 = 2;
    }

    @Override
    public boolean I() {
        switch (this.f40375i1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    @Override
    public void s0() {
        switch (this.f40375i1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0);
                    if (this.G0 != w02) {
                        P(w02);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                super.s0();
                return;
        }
    }

    public p6(int i10, Context context, boolean z10) {
        super(context, z10);
        this.f40375i1 = i10;
    }
}
