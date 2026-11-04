package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class l90 extends wm {
    public boolean f47231sd;
    public final TLRPC.User f47232td;
    public final TLRPC.User[] f47233ud;
    public final long f47234vd;

    public l90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f47232td = user;
        this.f47233ud = userArr;
        this.f47234vd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f47231sd) {
            this.f47231sd = true;
            org.telegram.ui.Components.fc.a0(this).I(2131623989, org.telegram.messenger.bd.a0(null, null, 2131751740, org.telegram.messenger.l10.p(this.f47232td)), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131751741, org.telegram.messenger.l10.p(this.f47233ud[0])), new ci.e3(this, this.f47234vd, 27))).j();
        }
    }
}
