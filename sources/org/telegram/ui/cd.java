package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f46079a;
    public final xd f46080b;

    public cd(xd xdVar, int i7) {
        this.f46079a = i7;
        this.f46080b = xdVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f46079a;
        boolean z11 = false;
        xd xdVar = this.f46080b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.hd.M0(2131748404, null));
                return;
            case 1:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.hd.M0(2131748370, null));
                return;
            case 2:
                org.telegram.ui.Components.u41 u41Var = xdVar.Y0;
                if (u41Var != null) {
                    boolean z12 = xdVar.f35726f0;
                    if (xdVar.S0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.p41 p41Var = u41Var.f39895g3;
                    if (z10 == xdVar.f53179b1.a()) {
                        z11 = true;
                    }
                    p41Var.O(z11);
                    if (z12 && xdVar.S0 != -1) {
                        xdVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                xdVar.l1 = xdVar.f53188k1;
                return;
            case 4:
                xdVar.K0.setLoading(false);
                return;
            case 5:
                xdVar.Z0.setVisibility(8);
                return;
            case 6:
                xdVar.Z0.setVisibility(8);
                return;
            default:
                int i10 = xdVar.f53193p0;
                org.telegram.messenger.g0.r(xdVar.f53202t1);
                if (xdVar.f53188k1 != xdVar.l1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.np.s1(i10).h1(-xdVar.f53195q0);
                    tL_channels_restrictSponsoredMessages.restricted = xdVar.f53188k1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new jd(xdVar, 0));
                    return;
                }
                return;
        }
    }
}
