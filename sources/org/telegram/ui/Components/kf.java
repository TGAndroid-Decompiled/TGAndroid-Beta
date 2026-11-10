package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class kf extends org.telegram.ui.cn {
    public boolean f35301td;
    public final TLRPC.User f35302ud;
    public final TLRPC.User f35303vd;
    public final long f35304wd;

    public kf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.f35302ud = user;
        this.f35303vd = user2;
        this.f35304wd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f35301td) {
            this.f35301td = true;
            gc.a0(this).I(2131623989, org.telegram.messenger.id.a0(null, null, 2131751739, org.telegram.messenger.t10.p(this.f35302ud)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f35303vd)), new bi.r3(this, this.f35304wd, 21))).j();
        }
    }
}
