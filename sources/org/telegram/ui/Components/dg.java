package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class dg extends org.telegram.ui.bn {
    public boolean f34322vd;
    public final TLRPC.User f34323wd;
    public final TLRPC.User f34324xd;
    public final long f34325yd;

    public dg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f34323wd = user;
        this.f34324xd = user2;
        this.f34325yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f34322vd) {
            this.f34322vd = true;
            kc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751727, org.telegram.messenger.n10.q(this.f34323wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.n10.q(this.f34324xd)), new bi.e4(this, this.f34325yd, 22))).j();
        }
    }
}
