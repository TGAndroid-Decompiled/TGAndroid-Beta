package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g81 implements u9 {
    public TLObject f37024a = null;
    public TLRPC.TL_error f37025b = null;
    public final SessionsActivity f37026c;

    public g81(SessionsActivity sessionsActivity) {
        this.f37026c = sessionsActivity;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f37024a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z4 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f37026c;
            if (z4) {
                sessionsActivity.f34821f.add(0, tL_authorization);
                sessionsActivity.S = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34820e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34817a.l();
            sessionsActivity.f34824s.m(0L, this.f37024a, 11);
        } else if (this.f37025b != null) {
            AndroidUtilities.runOnUIThread(new f81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        this.f37024a = null;
        this.f37025b = null;
        AndroidUtilities.runOnUIThread(new if0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
