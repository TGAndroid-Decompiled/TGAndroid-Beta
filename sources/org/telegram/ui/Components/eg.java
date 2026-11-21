package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class eg extends org.telegram.ui.bn {
    public boolean f34788vd;
    public final TLRPC.User f34789wd;
    public final TLRPC.User f34790xd;
    public final long f34791yd;

    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f34789wd = user;
        this.f34790xd = user2;
        this.f34791yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f34788vd) {
            this.f34788vd = true;
            lc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751727, org.telegram.messenger.o10.q(this.f34789wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.f34790xd)), new bi.c4(this, this.f34791yd, 22))).j();
        }
    }
}
