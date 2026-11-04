package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class lj0 implements Runnable {
    public final int f47348a;
    public final mj0 f47349b;
    public final TLRPC.TL_error f47350c;
    public final TLObject d;

    public lj0(mj0 mj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f47348a = 0;
        this.f47349b = mj0Var;
        this.d = tLObject;
        this.f47350c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f47348a) {
            case 0:
                mj0 mj0Var = this.f47349b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f47350c;
                yj0 yj0Var = mj0Var.f47688e;
                if (tLObject instanceof Vector) {
                    yj0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        yj0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i3));
                    }
                    mj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.t4.w0(yj0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                } else {
                    yj0Var.Q1(org.telegram.messenger.bd.M0(2131689472, null), tL_error.text);
                }
                yj0Var.R1(true, false);
                return;
            case 1:
                mj0 mj0Var2 = this.f47349b;
                TLRPC.TL_error tL_error2 = this.f47350c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    mj0Var2.f47688e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    mj0Var2.b();
                    return;
                }
                mj0Var2.getClass();
                return;
            default:
                mj0 mj0Var3 = this.f47349b;
                TLRPC.TL_error tL_error3 = this.f47350c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    mj0Var3.f47688e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f21387e.c(new hc0(mj0Var3, mj0Var3.f47686b, mj0Var3.d, 15));
                    return;
                }
                return;
        }
    }

    public lj0(mj0 mj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3) {
        this.f47348a = i3;
        this.f47349b = mj0Var;
        this.f47350c = tL_error;
        this.d = tLObject;
    }
}
