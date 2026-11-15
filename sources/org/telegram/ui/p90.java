package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class p90 extends an {
    public boolean f50185ud;
    public final TLRPC.User f50186vd;
    public final TLRPC.User[] f50187wd;
    public final long f50188xd;

    public p90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f50186vd = user;
        this.f50187wd = userArr;
        this.f50188xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f50185ud) {
            this.f50185ud = true;
            org.telegram.ui.Components.cc.a0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751739, org.telegram.messenger.q10.p(this.f50186vd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.q10.p(this.f50187wd[0])), new di.x2(this, this.f50188xd, 27))).j();
        }
    }
}
