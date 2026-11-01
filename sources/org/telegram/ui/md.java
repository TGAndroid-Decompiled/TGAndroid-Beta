package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class md implements Runnable {
    public final int f39508a;
    public final le f39509b;

    public md(le leVar, int i10) {
        this.f39508a = i10;
        this.f39509b = leVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f39508a;
        boolean z11 = false;
        le leVar = this.f39509b;
        switch (i10) {
            case 0:
                gf.f.r(leVar.getContext(), org.telegram.messenger.dd.L0(2131748419, null));
                return;
            case 1:
                gf.f.r(leVar.getContext(), org.telegram.messenger.dd.L0(2131748385, null));
                return;
            case 2:
                org.telegram.ui.Components.v51 v51Var = leVar.X0;
                if (v51Var != null) {
                    boolean z12 = leVar.f28276e0;
                    if (leVar.R0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.q51 q51Var = v51Var.f31183f3;
                    if (z10 == leVar.f39201a1.a()) {
                        z11 = true;
                    }
                    q51Var.O(z11);
                    if (z12 && leVar.R0 != -1) {
                        leVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                leVar.f39211k1 = leVar.f39210j1;
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
                int i11 = leVar.f39215o0;
                org.telegram.messenger.i0.r(leVar.f39224s1);
                if (leVar.f39210j1 != leVar.f39211k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.wp.r1(i11).g1(-leVar.f39217p0);
                    tL_channels_restrictSponsoredMessages.restricted = leVar.f39210j1;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_channels_restrictSponsoredMessages, new td(leVar, 0));
                    return;
                }
                return;
        }
    }
}
