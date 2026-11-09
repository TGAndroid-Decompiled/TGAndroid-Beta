package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class qj0 implements Runnable {
    public final int f49069a;
    public final rj0 f49070b;
    public final TLRPC.TL_error f49071c;
    public final TLObject d;

    public qj0(rj0 rj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f49069a = 0;
        this.f49070b = rj0Var;
        this.d = tLObject;
        this.f49071c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f49069a) {
            case 0:
                rj0 rj0Var = this.f49070b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f49071c;
                dk0 dk0Var = rj0Var.f49497e;
                if (tLObject instanceof Vector) {
                    dk0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        dk0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    rj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.v4.u0(dk0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                } else {
                    dk0Var.Q1(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
                }
                dk0Var.R1(true, false);
                return;
            case 1:
                rj0 rj0Var2 = this.f49070b;
                TLRPC.TL_error tL_error2 = this.f49071c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    rj0Var2.f49497e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    rj0Var2.b();
                    return;
                }
                rj0Var2.getClass();
                return;
            default:
                rj0 rj0Var3 = this.f49070b;
                TLRPC.TL_error tL_error3 = this.f49071c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    rj0Var3.f49497e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f21336e.c(new oc0(rj0Var3, rj0Var3.f49495b, rj0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public qj0(rj0 rj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f49069a = i7;
        this.f49070b = rj0Var;
        this.f49071c = tL_error;
        this.d = tLObject;
    }
}
