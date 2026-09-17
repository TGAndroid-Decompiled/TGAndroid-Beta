package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q81 implements v9 {
    public TLObject f36830a = null;
    public TLRPC.TL_error f36831b = null;
    public final SessionsActivity f36832c;

    public q81(SessionsActivity sessionsActivity) {
        this.f36832c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f36830a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f36832c;
            if (z10) {
                sessionsActivity.f31512f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31509a.l();
            sessionsActivity.f31515s.m(0L, this.f36830a, 11);
        } else if (this.f36831b != null) {
            AndroidUtilities.runOnUIThread(new p81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, n9 n9Var) {
        this.f36830a = null;
        this.f36831b = null;
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
