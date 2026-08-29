package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m71 implements q9 {
    public TLObject f40482a = null;
    public TLRPC.TL_error f40483b = null;
    public final SessionsActivity f40484c;

    public m71(SessionsActivity sessionsActivity) {
        this.f40484c = sessionsActivity;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f40482a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f40484c;
            if (z10) {
                sessionsActivity.f36242f.add(0, tL_authorization);
                sessionsActivity.R = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f36241e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f36238a.l();
            sessionsActivity.f36245s.m(0L, this.f40482a, 11);
        } else if (this.f40483b != null) {
            AndroidUtilities.runOnUIThread(new l71(this, 0));
        }
    }

    @Override
    public final boolean d1(String str, i9 i9Var) {
        this.f40482a = null;
        this.f40483b = null;
        AndroidUtilities.runOnUIThread(new xe0(this, str, i9Var, 29), 750L);
        return true;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
