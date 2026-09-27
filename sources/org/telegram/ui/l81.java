package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements w9 {
    public TLObject f35283a = null;
    public TLRPC.TL_error f35284b = null;
    public final SessionsActivity f35285c;

    public l81(SessionsActivity sessionsActivity) {
        this.f35285c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f35283a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f35285c;
            if (z10) {
                sessionsActivity.f31787f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31784a.l();
            sessionsActivity.f31790s.m(0L, this.f35283a, 11);
        } else if (this.f35284b != null) {
            AndroidUtilities.runOnUIThread(new k81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        this.f35283a = null;
        this.f35284b = null;
        AndroidUtilities.runOnUIThread(new mf0(this, str, o9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
