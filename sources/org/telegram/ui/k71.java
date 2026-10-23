package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k71 implements v9 {
    public TLObject f38843a = null;
    public TLRPC.TL_error f38844b = null;
    public final SessionsActivity f38845c;

    public k71(SessionsActivity sessionsActivity) {
        this.f38845c = sessionsActivity;
    }

    @Override
    public final void E(String str) {
        TLObject tLObject = this.f38843a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f38845c;
            if (z10) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34145a.l();
            sessionsActivity.f34150r.m(0L, this.f38843a, 11);
        } else if (this.f38844b != null) {
            AndroidUtilities.runOnUIThread(new j71(this, 0));
        }
    }

    @Override
    public final boolean U0(String str, n9 n9Var) {
        this.f38843a = null;
        this.f38844b = null;
        AndroidUtilities.runOnUIThread(new h71(this, str, n9Var, 1), 750L);
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
