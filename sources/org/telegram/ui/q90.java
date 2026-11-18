package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class q90 extends bn {
    public boolean f51178vd;
    public final TLRPC.User f51179wd;
    public final TLRPC.User[] f51180xd;
    public final long f51181yd;

    public q90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f51179wd = user;
        this.f51180xd = userArr;
        this.f51181yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51178vd) {
            this.f51178vd = true;
            org.telegram.ui.Components.lc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.f51179wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751729, org.telegram.messenger.o10.q(this.f51180xd[0])), new bi.y3(this, this.f51181yd, 28))).j();
        }
    }
}
