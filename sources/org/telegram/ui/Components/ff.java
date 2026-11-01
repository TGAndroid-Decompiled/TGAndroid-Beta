package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ff extends org.telegram.ui.un {
    public boolean f26146kd;
    public final TLRPC.User f26147ld;
    public final TLRPC.User f26148md;
    public final long f26149nd;

    public ff(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f26147ld = user;
        this.f26148md = user2;
        this.f26149nd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f26146kd) {
            this.f26146kd = true;
            cc.a0(this).I(2131623989, org.telegram.messenger.dd.a0(null, null, 2131751740, org.telegram.messenger.i20.p(this.f26147ld)), org.telegram.messenger.i0.T2(org.telegram.messenger.dd.a0(null, null, 2131751741, org.telegram.messenger.i20.p(this.f26148md)), new bi.e(this, this.f26149nd, 10))).j();
        }
    }
}
