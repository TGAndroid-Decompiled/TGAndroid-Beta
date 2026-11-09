package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f44918a;
    public final zd f44919b;

    public dd(zd zdVar, int i7) {
        this.f44918a = i7;
        this.f44919b = zdVar;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7 = this.f44918a;
        boolean z10 = false;
        zd zdVar = this.f44919b;
        switch (i7) {
            case 0:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.id.M0(2131748404, null));
                return;
            case 1:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.id.M0(2131748370, null));
                return;
            case 2:
                org.telegram.ui.Components.r41 r41Var = zdVar.X0;
                if (r41Var != null) {
                    boolean z11 = zdVar.f35139e0;
                    if (zdVar.R0 != -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.ui.Components.m41 m41Var = r41Var.f37556f3;
                    if (z9 == zdVar.f52504a1.a()) {
                        z10 = true;
                    }
                    m41Var.O(z10);
                    if (z11 && zdVar.R0 != -1) {
                        zdVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zdVar.f52514k1 = zdVar.f52513j1;
                return;
            case 4:
                zdVar.J0.setLoading(false);
                return;
            case 5:
                zdVar.Y0.setVisibility(8);
                return;
            case 6:
                zdVar.Y0.setVisibility(8);
                return;
            default:
                int i10 = zdVar.f52517o0;
                org.telegram.messenger.g0.r(zdVar.f52526s1);
                if (zdVar.f52513j1 != zdVar.f52514k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.qp.s1(i10).h1(-zdVar.f52519p0);
                    tL_channels_restrictSponsoredMessages.restricted = zdVar.f52513j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new kd(zdVar, 0));
                    return;
                }
                return;
        }
    }
}
