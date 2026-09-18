package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q81 implements v9 {
    public TLObject f36835a = null;
    public TLRPC.TL_error f36836b = null;
    public final SessionsActivity f36837c;

    public q81(SessionsActivity sessionsActivity) {
        this.f36837c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f36835a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f36837c;
            if (z10) {
                sessionsActivity.f31516f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31513a.l();
            sessionsActivity.f31519s.m(0L, this.f36835a, 11);
        } else if (this.f36836b != null) {
            AndroidUtilities.runOnUIThread(new p81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, n9 n9Var) {
        this.f36835a = null;
        this.f36836b = null;
        AndroidUtilities.runOnUIThread(new rf0(this, str, n9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
