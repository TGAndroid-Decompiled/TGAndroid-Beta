package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o71 implements x9 {
    public TLObject f42007a = null;
    public TLRPC.TL_error f42008b = null;
    public final SessionsActivity f42009c;

    public o71(SessionsActivity sessionsActivity) {
        this.f42009c = sessionsActivity;
    }

    @Override
    public final void H(String str) {
        TLObject tLObject = this.f42007a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f42009c;
            if (z10) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.l0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.n0();
            sessionsActivity.f36235a.l();
            sessionsActivity.f36240r.m(0L, this.f42007a, 11);
        } else if (this.f42008b != null) {
            AndroidUtilities.runOnUIThread(new m71(this, 0));
        }
    }

    @Override
    public final String H0() {
        return null;
    }

    @Override
    public final boolean d1(String str, p9 p9Var) {
        this.f42007a = null;
        this.f42008b = null;
        AndroidUtilities.runOnUIThread(new t31(this, str, p9Var, 3), 750L);
        return true;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void R0(MrzRecognizer.Result result) {
    }
}
