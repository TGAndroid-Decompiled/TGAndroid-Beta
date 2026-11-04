package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n21 implements r9 {
    public TLObject f47855a = null;
    public TLRPC.TL_error f47856b = null;
    public final SessionsActivity f47857c;

    public n21(SessionsActivity sessionsActivity) {
        this.f47857c = sessionsActivity;
    }

    @Override
    public final void M(String str) {
        TLObject tLObject = this.f47855a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f47857c;
            if (z10) {
                sessionsActivity.f41987e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f41984a.f();
            sessionsActivity.f41990r.m(0L, this.f47855a, 11);
        } else if (this.f47856b != null) {
            org.telegram.messenger.g0.h3(new l21(this, 0));
        }
    }

    @Override
    public final String M0() {
        return null;
    }

    @Override
    public final boolean e1(String str, i9 i9Var) {
        this.f47855a = null;
        this.f47856b = null;
        org.telegram.messenger.g0.i3(new wy0(this, str, i9Var, 3), 750L);
        return true;
    }

    @Override
    public final void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
