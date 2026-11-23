package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class q90 extends bn {
    public boolean f51384vd;
    public final TLRPC.User f51385wd;
    public final TLRPC.User[] f51386xd;
    public final long f51387yd;

    public q90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f51385wd = user;
        this.f51386xd = userArr;
        this.f51387yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51384vd) {
            this.f51384vd = true;
            org.telegram.ui.Components.kc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751727, org.telegram.messenger.n10.q(this.f51385wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.n10.q(this.f51386xd[0])), new bi.e4(this, this.f51387yd, 28))).j();
        }
    }
}
