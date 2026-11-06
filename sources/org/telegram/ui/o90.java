package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class o90 extends an {
    public boolean f48334rd;
    public final TLRPC.User f48335sd;
    public final TLRPC.User[] f48336td;
    public final long f48337ud;

    public o90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f48335sd = user;
        this.f48336td = userArr;
        this.f48337ud = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f48334rd) {
            this.f48334rd = true;
            org.telegram.ui.Components.hc.a0(this).I(2131623989, org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f48335sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.f48336td[0])), new bi.r3(this, this.f48337ud, 27))).j();
        }
    }
}
