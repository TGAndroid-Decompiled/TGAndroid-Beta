package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class lf extends org.telegram.ui.cn {
    public boolean f35699td;
    public final TLRPC.User f35700ud;
    public final TLRPC.User f35701vd;
    public final long f35702wd;

    public lf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f35700ud = user;
        this.f35701vd = user2;
        this.f35702wd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f35699td) {
            this.f35699td = true;
            hc.a0(this).I(2131623989, org.telegram.messenger.id.a0(null, null, 2131751739, org.telegram.messenger.t10.p(this.f35700ud)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f35701vd)), new bi.r3(this, this.f35702wd, 21))).j();
        }
    }
}
