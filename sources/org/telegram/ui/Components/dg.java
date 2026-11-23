package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class dg extends org.telegram.ui.bn {
    public boolean f34454vd;
    public final TLRPC.User f34455wd;
    public final TLRPC.User f34456xd;
    public final long f34457yd;

    public dg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f34455wd = user;
        this.f34456xd = user2;
        this.f34457yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f34454vd) {
            this.f34454vd = true;
            lc.b0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751727, org.telegram.messenger.p10.q(this.f34455wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131751728, org.telegram.messenger.p10.q(this.f34456xd)), new bi.e4(this, this.f34457yd, 22))).j();
        }
    }
}
