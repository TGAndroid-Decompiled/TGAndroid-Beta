package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f46517a;
    public final xd f46518b;

    public cd(xd xdVar, int i7) {
        this.f46517a = i7;
        this.f46518b = xdVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f46517a;
        boolean z11 = false;
        xd xdVar = this.f46518b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.hd.N0(2131748211, null));
                return;
            case 1:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.hd.N0(2131748177, null));
                return;
            case 2:
                org.telegram.ui.Components.h51 h51Var = xdVar.Y0;
                if (h51Var != null) {
                    boolean z12 = xdVar.f40047f0;
                    if (xdVar.S0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.c51 c51Var = h51Var.f35789g3;
                    if (z10 == xdVar.f53834b1.a()) {
                        z11 = true;
                    }
                    c51Var.O(z11);
                    if (z12 && xdVar.S0 != -1) {
                        xdVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                xdVar.l1 = xdVar.f53843k1;
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
                int i10 = xdVar.f53848p0;
                org.telegram.messenger.g0.r(xdVar.f53857t1);
                if (xdVar.f53843k1 != xdVar.l1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.np.u1(i10).j1(-xdVar.f53850q0);
                    tL_channels_restrictSponsoredMessages.restricted = xdVar.f53843k1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new jd(xdVar, 0));
                    return;
                }
                return;
        }
    }
}
