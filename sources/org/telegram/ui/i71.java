package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class i71 implements s9 {

    public TLObject f38990a = null;

    public TLRPC.TL_error f38991b = null;

    public final SessionsActivity f38992c;

    public i71(SessionsActivity sessionsActivity) {
        this.f38992c = sessionsActivity;
    }

    @Override
    public final void C(String str) {
        TLObject tLObject = this.f38990a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.f38991b != null) {
                AndroidUtilities.runOnUIThread(new h71(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.f38992c;
        if (z10) {
            sessionsActivity.f36180f.add(0, tL_authorization);
            sessionsActivity.R = 4;
            sessionsActivity.k0(false);
        } else {
            sessionsActivity.f36179e.add(0, tL_authorization);
        }
        sessionsActivity.m0();
        sessionsActivity.f36176a.l();
        sessionsActivity.f36183s.m(0L, this.f38990a, 11);
    }

    @Override
    public final boolean i1(String str, k9 k9Var) {
        this.f38990a = null;
        this.f38991b = null;
        AndroidUtilities.runOnUIThread(new bf0(this, str, k9Var, 29), 750L);
        return true;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
