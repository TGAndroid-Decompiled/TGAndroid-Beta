package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class lf extends org.telegram.ui.an {
    public boolean f35646rd;
    public final TLRPC.User f35647sd;
    public final TLRPC.User f35648td;
    public final long f35649ud;

    public lf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f35647sd = user;
        this.f35648td = user2;
        this.f35649ud = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f35646rd) {
            this.f35646rd = true;
            hc.a0(this).I(2131623989, org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f35647sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.f35648td)), new bi.r3(this, this.f35649ud, 21))).j();
        }
    }
}
