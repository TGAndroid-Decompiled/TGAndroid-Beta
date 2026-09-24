package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j81 implements t9 {
    public TLObject f34673a = null;
    public TLRPC.TL_error f34674b = null;
    public final SessionsActivity f34675c;

    public j81(SessionsActivity sessionsActivity) {
        this.f34675c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f34673a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f34675c;
            if (z10) {
                sessionsActivity.f31771f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31768a.l();
            sessionsActivity.f31774s.m(0L, this.f34673a, 11);
        } else if (this.f34674b != null) {
            AndroidUtilities.runOnUIThread(new i81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        this.f34673a = null;
        this.f34674b = null;
        AndroidUtilities.runOnUIThread(new jf0(this, str, l9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
