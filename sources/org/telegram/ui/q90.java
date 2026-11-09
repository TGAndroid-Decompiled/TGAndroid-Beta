package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class q90 extends cn {
    public boolean f48985td;
    public final TLRPC.User f48986ud;
    public final TLRPC.User[] f48987vd;
    public final long f48988wd;

    public q90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f48986ud = user;
        this.f48987vd = userArr;
        this.f48988wd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f48985td) {
            this.f48985td = true;
            org.telegram.ui.Components.hc.a0(this).I(2131623989, org.telegram.messenger.id.a0(null, null, 2131751739, org.telegram.messenger.t10.p(this.f48986ud)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f48987vd[0])), new bi.r3(this, this.f48988wd, 27))).j();
        }
    }
}
