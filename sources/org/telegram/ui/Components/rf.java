package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class rf extends org.telegram.ui.an {
    public boolean f38958ud;
    public final TLRPC.User f38959vd;
    public final TLRPC.User f38960wd;
    public final long f38961xd;

    public rf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f38959vd = user;
        this.f38960wd = user2;
        this.f38961xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f38958ud) {
            this.f38958ud = true;
            cc.a0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751739, org.telegram.messenger.q10.p(this.f38959vd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.q10.p(this.f38960wd)), new di.x2(this, this.f38961xd, 21))).j();
        }
    }
}
