package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j71 implements r9 {
    public TLObject f39393a = null;
    public TLRPC.TL_error f39394b = null;
    public final SessionsActivity f39395c;

    public j71(SessionsActivity sessionsActivity) {
        this.f39395c = sessionsActivity;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f39393a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f39395c;
            if (z10) {
                sessionsActivity.f36177f.add(0, tL_authorization);
                sessionsActivity.R = 4;
                sessionsActivity.j0(false);
            } else {
                sessionsActivity.f36176e.add(0, tL_authorization);
            }
            sessionsActivity.l0();
            sessionsActivity.f36173a.l();
            sessionsActivity.f36180s.m(0L, this.f39393a, 11);
        } else if (this.f39394b != null) {
            AndroidUtilities.runOnUIThread(new i71(this, 0));
        }
    }

    @Override
    public final boolean i1(String str, j9 j9Var) {
        this.f39393a = null;
        this.f39394b = null;
        AndroidUtilities.runOnUIThread(new ye0(this, str, j9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
