package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class lm0 implements Runnable {
    public final int f39275a;
    public final mm0 f39276b;
    public final TLRPC.TL_error f39277c;
    public final TLObject d;

    public lm0(mm0 mm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f39275a = 0;
        this.f39276b = mm0Var;
        this.d = tLObject;
        this.f39277c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f39275a) {
            case 0:
                mm0 mm0Var = this.f39276b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f39277c;
                an0 an0Var = mm0Var.e;
                if (tLObject instanceof Vector) {
                    an0Var.f35756y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        an0Var.f35756y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    mm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.f5.x0(an0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    an0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                an0Var.M1(true, false);
                return;
            case 1:
                mm0 mm0Var2 = this.f39276b;
                TLRPC.TL_error tL_error2 = this.f39277c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    mm0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    mm0Var2.b();
                    return;
                }
                mm0Var2.getClass();
                return;
            default:
                mm0 mm0Var3 = this.f39276b;
                TLRPC.TL_error tL_error3 = this.f39277c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    mm0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new re0(mm0Var3, mm0Var3.f39628b, mm0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public lm0(mm0 mm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39275a = i10;
        this.f39276b = mm0Var;
        this.f39277c = tL_error;
        this.d = tLObject;
    }
}
