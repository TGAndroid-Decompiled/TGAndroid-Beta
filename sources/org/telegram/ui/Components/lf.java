package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class lf extends org.telegram.ui.an {
    public boolean f35641rd;
    public final TLRPC.User f35642sd;
    public final TLRPC.User f35643td;
    public final long f35644ud;

    public lf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f35642sd = user;
        this.f35643td = user2;
        this.f35644ud = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f35641rd) {
            this.f35641rd = true;
            hc.a0(this).I(2131623989, org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f35642sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.f35643td)), new bi.r3(this, this.f35644ud, 21))).j();
        }
    }
}
