package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class bg extends org.telegram.ui.bn {
    public boolean f33682vd;
    public final TLRPC.User f33683wd;
    public final TLRPC.User f33684xd;
    public final long f33685yd;

    public bg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f33683wd = user;
        this.f33684xd = user2;
        this.f33685yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f33682vd) {
            this.f33682vd = true;
            lc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.f33683wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751729, org.telegram.messenger.o10.q(this.f33684xd)), new bi.y3(this, this.f33685yd, 22))).j();
        }
    }
}
