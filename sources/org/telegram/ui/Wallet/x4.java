package org.telegram.ui.Wallet;
public final class x4 extends org.telegram.ui.ActionBar.z2 {
    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0);
            v0(w02);
            if (this.G0 != w02) {
                P(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
