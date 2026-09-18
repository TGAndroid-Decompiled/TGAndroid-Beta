package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o81 implements u9 {
    public TLObject f36126a = null;
    public TLRPC.TL_error f36127b = null;
    public final SessionsActivity f36128c;

    public o81(SessionsActivity sessionsActivity) {
        this.f36128c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f36126a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f36128c;
            if (z10) {
                sessionsActivity.f31743f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31740a.l();
            sessionsActivity.f31746s.m(0L, this.f36126a, 11);
        } else if (this.f36127b != null) {
            AndroidUtilities.runOnUIThread(new n81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        this.f36126a = null;
        this.f36127b = null;
        AndroidUtilities.runOnUIThread(new qf0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
