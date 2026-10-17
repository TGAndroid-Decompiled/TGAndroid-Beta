package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i71 implements x9 {
    public TLObject f37770a = null;
    public TLRPC.TL_error f37771b = null;
    public final SessionsActivity f37772c;

    public i71(SessionsActivity sessionsActivity) {
        this.f37772c = sessionsActivity;
    }

    @Override
    public final void E(String str) {
        TLObject tLObject = this.f37770a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f37772c;
            if (z10) {
                sessionsActivity.f33832f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f33829a.l();
            sessionsActivity.f33835s.m(0L, this.f37770a, 11);
        } else if (this.f37771b != null) {
            AndroidUtilities.runOnUIThread(new g71(this, 0));
        }
    }

    @Override
    public final boolean U0(String str, n9 n9Var) {
        this.f37770a = null;
        this.f37771b = null;
        AndroidUtilities.runOnUIThread(new h71(this, str, n9Var, 0), 750L);
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
