package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class eg extends org.telegram.ui.bn {
    public boolean f34786vd;
    public final TLRPC.User f34787wd;
    public final TLRPC.User f34788xd;
    public final long f34789yd;

    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f34787wd = user;
        this.f34788xd = user2;
        this.f34789yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f34786vd) {
            this.f34786vd = true;
            lc.b0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751727, org.telegram.messenger.p10.q(this.f34787wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131751728, org.telegram.messenger.p10.q(this.f34788xd)), new bi.c4(this, this.f34789yd, 22))).j();
        }
    }
}
