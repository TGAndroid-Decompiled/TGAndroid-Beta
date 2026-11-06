package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class oj0 implements Runnable {
    public final int f48423a;
    public final pj0 f48424b;
    public final TLRPC.TL_error f48425c;
    public final TLObject d;

    public oj0(pj0 pj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f48423a = 0;
        this.f48424b = pj0Var;
        this.d = tLObject;
        this.f48425c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f48423a) {
            case 0:
                pj0 pj0Var = this.f48424b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f48425c;
                bk0 bk0Var = pj0Var.f48845e;
                if (tLObject instanceof Vector) {
                    bk0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        bk0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    pj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.v4.u0(bk0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                } else {
                    bk0Var.Q1(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                }
                bk0Var.R1(true, false);
                return;
            case 1:
                pj0 pj0Var2 = this.f48424b;
                TLRPC.TL_error tL_error2 = this.f48425c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    pj0Var2.f48845e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    pj0Var2.b();
                    return;
                }
                pj0Var2.getClass();
                return;
            default:
                pj0 pj0Var3 = this.f48424b;
                TLRPC.TL_error tL_error3 = this.f48425c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    pj0Var3.f48845e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f21333e.c(new mc0(pj0Var3, pj0Var3.f48843b, pj0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public oj0(pj0 pj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f48423a = i7;
        this.f48424b = pj0Var;
        this.f48425c = tL_error;
        this.d = tLObject;
    }
}
