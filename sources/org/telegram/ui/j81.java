package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j81 implements t9 {
    public TLObject f34688a = null;
    public TLRPC.TL_error f34689b = null;
    public final SessionsActivity f34690c;

    public j81(SessionsActivity sessionsActivity) {
        this.f34690c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f34688a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f34690c;
            if (z10) {
                sessionsActivity.f31786f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31783a.l();
            sessionsActivity.f31789s.m(0L, this.f34688a, 11);
        } else if (this.f34689b != null) {
            AndroidUtilities.runOnUIThread(new i81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        this.f34688a = null;
        this.f34689b = null;
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
