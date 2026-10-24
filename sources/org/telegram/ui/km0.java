package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class km0 implements Runnable {
    public final int f38943a;
    public final lm0 f38944b;
    public final TLRPC.TL_error f38945c;
    public final TLObject d;

    public km0(lm0 lm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f38943a = 0;
        this.f38944b = lm0Var;
        this.d = tLObject;
        this.f38945c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f38943a) {
            case 0:
                lm0 lm0Var = this.f38944b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f38945c;
                zm0 zm0Var = lm0Var.e;
                if (tLObject instanceof Vector) {
                    zm0Var.f44179y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        zm0Var.f44179y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    lm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.d5.w0(zm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    zm0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                zm0Var.M1(true, false);
                return;
            case 1:
                lm0 lm0Var2 = this.f38944b;
                TLRPC.TL_error tL_error2 = this.f38945c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    lm0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    lm0Var2.b();
                    return;
                }
                lm0Var2.getClass();
                return;
            default:
                lm0 lm0Var3 = this.f38944b;
                TLRPC.TL_error tL_error3 = this.f38945c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    lm0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new qe0(lm0Var3, lm0Var3.f39317b, lm0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public km0(lm0 lm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38943a = i10;
        this.f38944b = lm0Var;
        this.f38945c = tL_error;
        this.d = tLObject;
    }
}
