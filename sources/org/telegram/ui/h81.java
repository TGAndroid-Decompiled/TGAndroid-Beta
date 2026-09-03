package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h81 implements w9 {
    public TLObject f34604a = null;
    public TLRPC.TL_error f34605b = null;
    public final SessionsActivity f34606c;

    public h81(SessionsActivity sessionsActivity) {
        this.f34606c = sessionsActivity;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f34604a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z4 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f34606c;
            if (z4) {
                sessionsActivity.f32258f.add(0, tL_authorization);
                sessionsActivity.S = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f32255a.l();
            sessionsActivity.f32261s.m(0L, this.f34604a, 11);
        } else if (this.f34605b != null) {
            AndroidUtilities.runOnUIThread(new g81(this, 0));
        }
    }

    @Override
    public final boolean a1(String str, o9 o9Var) {
        this.f34604a = null;
        this.f34605b = null;
        AndroidUtilities.runOnUIThread(new jf0(this, str, o9Var, 29), 750L);
        return true;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
