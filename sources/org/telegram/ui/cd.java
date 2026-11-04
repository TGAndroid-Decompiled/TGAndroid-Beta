package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f44318a;
    public final xd f44319b;

    public cd(xd xdVar, int i3) {
        this.f44318a = i3;
        this.f44319b = xdVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i3 = this.f44318a;
        boolean z11 = false;
        xd xdVar = this.f44319b;
        switch (i3) {
            case 0:
                sf.c.t(xdVar.getContext(), org.telegram.messenger.bd.M0(2131748412, null));
                return;
            case 1:
                sf.c.t(xdVar.getContext(), org.telegram.messenger.bd.M0(2131748378, null));
                return;
            case 2:
                org.telegram.ui.Components.l41 l41Var = xdVar.Y0;
                if (l41Var != null) {
                    boolean z12 = xdVar.f34196f0;
                    if (xdVar.S0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.f41 f41Var = l41Var.f35594g3;
                    if (z10 == xdVar.f51915b1.a()) {
                        z11 = true;
                    }
                    f41Var.O(z11);
                    if (z12 && xdVar.S0 != -1) {
                        xdVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                xdVar.f51924l1 = xdVar.k1;
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
                int i10 = xdVar.f51929p0;
                org.telegram.messenger.g0.r(xdVar.f51938t1);
                if (xdVar.k1 != xdVar.f51924l1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.hp.s1(i10).h1(-xdVar.f51931q0);
                    tL_channels_restrictSponsoredMessages.restricted = xdVar.k1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new jd(xdVar, 0));
                    return;
                }
                return;
        }
    }
}
