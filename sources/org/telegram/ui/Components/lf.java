package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class lf extends org.telegram.ui.an {
    public boolean f35684rd;
    public final TLRPC.User f35685sd;
    public final TLRPC.User f35686td;
    public final long f35687ud;

    public lf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f35685sd = user;
        this.f35686td = user2;
        this.f35687ud = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f35684rd) {
            this.f35684rd = true;
            hc.a0(this).I(2131623989, org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f35685sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.f35686td)), new bi.r3(this, this.f35687ud, 21))).j();
        }
    }
}
