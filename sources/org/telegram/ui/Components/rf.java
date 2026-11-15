package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class rf extends org.telegram.ui.an {
    public boolean f38961ud;
    public final TLRPC.User f38962vd;
    public final TLRPC.User f38963wd;
    public final long f38964xd;

    public rf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f38962vd = user;
        this.f38963wd = user2;
        this.f38964xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f38961ud) {
            this.f38961ud = true;
            cc.a0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751739, org.telegram.messenger.q10.p(this.f38962vd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.q10.p(this.f38963wd)), new di.x2(this, this.f38964xd, 21))).j();
        }
    }
}
