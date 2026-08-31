package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a81 implements u9 {
    public TLObject f35061a = null;
    public TLRPC.TL_error f35062b = null;
    public final SessionsActivity f35063c;

    public a81(SessionsActivity sessionsActivity) {
        this.f35063c = sessionsActivity;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f35061a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z4 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f35063c;
            if (z4) {
                sessionsActivity.f34821f.add(0, tL_authorization);
                sessionsActivity.S = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34820e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34817a.l();
            sessionsActivity.f34824s.m(0L, this.f35061a, 11);
        } else if (this.f35062b != null) {
            AndroidUtilities.runOnUIThread(new z71(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        this.f35061a = null;
        this.f35062b = null;
        AndroidUtilities.runOnUIThread(new if0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
