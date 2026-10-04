package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements v9 {
    public TLObject f38195a = null;
    public TLRPC.TL_error f38196b = null;
    public final SessionsActivity f38197c;

    public l81(SessionsActivity sessionsActivity) {
        this.f38197c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void L(String str) {
        TLObject tLObject = this.f38195a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f38197c;
            if (z10) {
                sessionsActivity.f34467f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34466e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34463a.l();
            sessionsActivity.f34470s.m(0L, this.f38195a, 11);
        } else if (this.f38196b != null) {
            AndroidUtilities.runOnUIThread(new k81(this, 0));
        }
    }

    @Override
    public final boolean g1(String str, n9 n9Var) {
        this.f38195a = null;
        this.f38196b = null;
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
