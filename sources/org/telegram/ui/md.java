package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class md implements Runnable {
    public final int f39647a;
    public final le f39648b;

    public md(le leVar, int i10) {
        this.f39647a = i10;
        this.f39648b = leVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f39647a;
        boolean z11 = false;
        le leVar = this.f39648b;
        switch (i10) {
            case 0:
                gf.f.r(leVar.getContext(), org.telegram.messenger.cd.L0(2131748419, null));
                return;
            case 1:
                gf.f.r(leVar.getContext(), org.telegram.messenger.cd.L0(2131748385, null));
                return;
            case 2:
                org.telegram.ui.Components.u51 u51Var = leVar.X0;
                if (u51Var != null) {
                    boolean z12 = leVar.f27914e0;
                    if (leVar.R0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.p51 p51Var = u51Var.f30819f3;
                    if (z10 == leVar.f39192a1.a()) {
                        z11 = true;
                    }
                    p51Var.O(z11);
                    if (z12 && leVar.R0 != -1) {
                        leVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                leVar.f39202k1 = leVar.f39201j1;
                return;
            case 4:
                leVar.J0.setLoading(false);
                return;
            case 5:
                leVar.Y0.setVisibility(8);
                return;
            case 6:
                leVar.Y0.setVisibility(8);
                return;
            default:
                int i11 = leVar.f39206o0;
                org.telegram.messenger.i0.r(leVar.f39215s1);
                if (leVar.f39201j1 != leVar.f39202k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.vp.r1(i11).g1(-leVar.f39208p0);
                    tL_channels_restrictSponsoredMessages.restricted = leVar.f39201j1;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_channels_restrictSponsoredMessages, new td(leVar, 0));
                    return;
                }
                return;
        }
    }
}
