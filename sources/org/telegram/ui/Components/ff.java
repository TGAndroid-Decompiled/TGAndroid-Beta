package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ff extends org.telegram.ui.un {
    public boolean f26047jd;
    public final TLRPC.User f26048kd;
    public final TLRPC.User f26049ld;
    public final long f26050md;

    public ff(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f26048kd = user;
        this.f26049ld = user2;
        this.f26050md = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f26047jd) {
            this.f26047jd = true;
            cc.a0(this).I(2131623989, org.telegram.messenger.cd.a0(null, null, 2131751740, org.telegram.messenger.h20.p(this.f26048kd)), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131751741, org.telegram.messenger.h20.p(this.f26049ld)), new bi.e(this, this.f26050md, 10))).j();
        }
    }
}
