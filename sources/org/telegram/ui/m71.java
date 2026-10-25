package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m71 implements x9 {
    public TLObject f41482a = null;
    public TLRPC.TL_error f41483b = null;
    public final SessionsActivity f41484c;

    public m71(SessionsActivity sessionsActivity) {
        this.f41484c = sessionsActivity;
    }

    @Override
    public final void H(String str) {
        TLObject tLObject = this.f41482a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f41484c;
            if (z10) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.l0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.n0();
            sessionsActivity.f36208a.l();
            sessionsActivity.f36213r.m(0L, this.f41482a, 11);
        } else if (this.f41483b != null) {
            AndroidUtilities.runOnUIThread(new k71(this, 0));
        }
    }

    @Override
    public final String H0() {
        return null;
    }

    @Override
    public final boolean d1(String str, p9 p9Var) {
        this.f41482a = null;
        this.f41483b = null;
        AndroidUtilities.runOnUIThread(new h71(this, str, p9Var, 2), 750L);
        return true;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void R0(MrzRecognizer.Result result) {
    }
}
