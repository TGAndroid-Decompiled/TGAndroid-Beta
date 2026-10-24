package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j71 implements v9 {
    public TLObject f38485a = null;
    public TLRPC.TL_error f38486b = null;
    public final SessionsActivity f38487c;

    public j71(SessionsActivity sessionsActivity) {
        this.f38487c = sessionsActivity;
    }

    @Override
    public final void E(String str) {
        TLObject tLObject = this.f38485a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f38487c;
            if (z10) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34147a.l();
            sessionsActivity.f34152r.m(0L, this.f38485a, 11);
        } else if (this.f38486b != null) {
            AndroidUtilities.runOnUIThread(new i71(this, 0));
        }
    }

    @Override
    public final boolean U0(String str, n9 n9Var) {
        this.f38485a = null;
        this.f38486b = null;
        AndroidUtilities.runOnUIThread(new g71(this, str, n9Var, 1), 750L);
        return true;
    }

    @Override
    public final String p0() {
        return null;
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
