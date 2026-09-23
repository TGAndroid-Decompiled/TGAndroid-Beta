package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h81 implements t9 {
    public TLObject f33776a = null;
    public TLRPC.TL_error f33777b = null;
    public final SessionsActivity f33778c;

    public h81(SessionsActivity sessionsActivity) {
        this.f33778c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f33776a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f33778c;
            if (z10) {
                sessionsActivity.f31470f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31467a.l();
            sessionsActivity.f31473s.m(0L, this.f33776a, 11);
        } else if (this.f33777b != null) {
            AndroidUtilities.runOnUIThread(new g81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        this.f33776a = null;
        this.f33777b = null;
        AndroidUtilities.runOnUIThread(new kf0(this, str, l9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
