package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m41 implements t9 {
    public TLObject f39430a = null;
    public TLRPC.TL_error f39431b = null;
    public final SessionsActivity f39432c;

    public m41(SessionsActivity sessionsActivity) {
        this.f39432c = sessionsActivity;
    }

    @Override
    public final void L(String str) {
        TLObject tLObject = this.f39430a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f39432c;
            if (z10) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f34041a.f();
            sessionsActivity.f34046r.m(0L, this.f39430a, 11);
        } else if (this.f39431b != null) {
            org.telegram.messenger.i0.g3(new l41(this, 0));
        }
    }

    @Override
    public final String P0() {
        return null;
    }

    @Override
    public final boolean i1(String str, k9 k9Var) {
        this.f39430a = null;
        this.f39431b = null;
        org.telegram.messenger.i0.h3(new i41(this, str, k9Var, 2), 750L);
        return true;
    }

    @Override
    public final void X0(org.telegram.messenger.js jsVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
