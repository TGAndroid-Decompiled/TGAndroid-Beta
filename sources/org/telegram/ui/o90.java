package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class o90 extends an {
    public boolean f48335rd;
    public final TLRPC.User f48336sd;
    public final TLRPC.User[] f48337td;
    public final long f48338ud;

    public o90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f48336sd = user;
        this.f48337td = userArr;
        this.f48338ud = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f48335rd) {
            this.f48335rd = true;
            org.telegram.ui.Components.hc.a0(this).I(2131623989, org.telegram.messenger.hd.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f48336sd)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751741, org.telegram.messenger.t10.p(this.f48337td[0])), new bi.r3(this, this.f48338ud, 27))).j();
        }
    }
}
