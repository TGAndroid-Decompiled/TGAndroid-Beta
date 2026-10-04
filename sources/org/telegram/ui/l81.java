package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements v9 {
    public TLObject f38201a = null;
    public TLRPC.TL_error f38202b = null;
    public final SessionsActivity f38203c;

    public l81(SessionsActivity sessionsActivity) {
        this.f38203c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void L(String str) {
        TLObject tLObject = this.f38201a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f38203c;
            if (z10) {
                sessionsActivity.f34474f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34473e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34470a.l();
            sessionsActivity.f34477s.m(0L, this.f38201a, 11);
        } else if (this.f38202b != null) {
            AndroidUtilities.runOnUIThread(new k81(this, 0));
        }
    }

    @Override
    public final boolean g1(String str, n9 n9Var) {
        this.f38201a = null;
        this.f38202b = null;
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
