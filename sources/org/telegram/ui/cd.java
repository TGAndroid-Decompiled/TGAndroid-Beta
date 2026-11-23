package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f46764a;
    public final xd f46765b;

    public cd(xd xdVar, int i7) {
        this.f46764a = i7;
        this.f46765b = xdVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f46764a;
        boolean z11 = false;
        xd xdVar = this.f46765b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.gd.N0(2131748211, null));
                return;
            case 1:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.gd.N0(2131748177, null));
                return;
            case 2:
                org.telegram.ui.Components.g51 g51Var = xdVar.Y0;
                if (g51Var != null) {
                    boolean z12 = xdVar.f39707f0;
                    if (xdVar.S0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.b51 b51Var = g51Var.f35323g3;
                    if (z10 == xdVar.f53921b1.a()) {
                        z11 = true;
                    }
                    b51Var.O(z11);
                    if (z12 && xdVar.S0 != -1) {
                        xdVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                xdVar.l1 = xdVar.f53930k1;
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
                int i10 = xdVar.f53935p0;
                org.telegram.messenger.g0.r(xdVar.f53944t1);
                if (xdVar.f53930k1 != xdVar.l1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.mp.u1(i10).j1(-xdVar.f53937q0);
                    tL_channels_restrictSponsoredMessages.restricted = xdVar.f53930k1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new jd(xdVar, 0));
                    return;
                }
                return;
        }
    }
}
