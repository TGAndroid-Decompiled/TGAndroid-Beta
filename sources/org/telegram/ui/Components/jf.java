package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class jf extends org.telegram.ui.wm {
    public boolean f35056sd;
    public final TLRPC.User f35057td;
    public final TLRPC.User f35058ud;
    public final long f35059vd;

    public jf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f35057td = user;
        this.f35058ud = user2;
        this.f35059vd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f35056sd) {
            this.f35056sd = true;
            fc.a0(this).I(2131623989, org.telegram.messenger.bd.a0(null, null, 2131751740, org.telegram.messenger.l10.p(this.f35057td)), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131751741, org.telegram.messenger.l10.p(this.f35058ud)), new ci.e3(this, this.f35059vd, 21))).j();
        }
    }
}
