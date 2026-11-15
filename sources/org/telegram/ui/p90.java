package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class p90 extends an {
    public boolean f50162ud;
    public final TLRPC.User f50163vd;
    public final TLRPC.User[] f50164wd;
    public final long f50165xd;

    public p90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f50163vd = user;
        this.f50164wd = userArr;
        this.f50165xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f50162ud) {
            this.f50162ud = true;
            org.telegram.ui.Components.cc.a0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751739, org.telegram.messenger.q10.p(this.f50163vd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.q10.p(this.f50164wd[0])), new di.x2(this, this.f50165xd, 27))).j();
        }
    }
}
