package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class o90 extends an {
    public boolean f48333rd;
    public final TLRPC.User f48334sd;
    public final TLRPC.User[] f48335td;
    public final long f48336ud;

    public o90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f48334sd = user;
        this.f48335td = userArr;
        this.f48336ud = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f48333rd) {
            this.f48333rd = true;
            org.telegram.ui.Components.hc.a0(this).I(2131623989, org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f48334sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.f48335td[0])), new bi.r3(this, this.f48336ud, 27))).j();
        }
    }
}
