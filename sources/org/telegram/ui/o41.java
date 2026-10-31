package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o41 implements t9 {
    public TLObject f40138a = null;
    public TLRPC.TL_error f40139b = null;
    public final SessionsActivity f40140c;

    public o41(SessionsActivity sessionsActivity) {
        this.f40140c = sessionsActivity;
    }

    @Override
    public final void L(String str) {
        TLObject tLObject = this.f40138a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f40140c;
            if (z10) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.o0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.q0();
            sessionsActivity.f34034a.f();
            sessionsActivity.f34039r.m(0L, this.f40138a, 11);
        } else if (this.f40139b != null) {
            org.telegram.messenger.i0.g3(new n41(this, 0));
        }
    }

    @Override
    public final String P0() {
        return null;
    }

    @Override
    public final boolean i1(String str, k9 k9Var) {
        this.f40138a = null;
        this.f40139b = null;
        org.telegram.messenger.i0.h3(new k41(this, str, k9Var, 2), 750L);
        return true;
    }

    @Override
    public final void X0(org.telegram.messenger.is isVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
