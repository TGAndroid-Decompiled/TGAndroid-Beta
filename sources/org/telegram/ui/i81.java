package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i81 implements v9 {
    public TLObject f37318a = null;
    public TLRPC.TL_error f37319b = null;
    public final SessionsActivity f37320c;

    public i81(SessionsActivity sessionsActivity) {
        this.f37320c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void L(String str) {
        TLObject tLObject = this.f37318a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f37320c;
            if (z10) {
                sessionsActivity.f34487f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34486e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34483a.l();
            sessionsActivity.f34490s.m(0L, this.f37318a, 11);
        } else if (this.f37319b != null) {
            AndroidUtilities.runOnUIThread(new h81(this, 0));
        }
    }

    @Override
    public final boolean g1(String str, n9 n9Var) {
        this.f37318a = null;
        this.f37319b = null;
        AndroidUtilities.runOnUIThread(new nf0(this, str, n9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
