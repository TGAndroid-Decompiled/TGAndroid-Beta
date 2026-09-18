package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class bn0 implements Runnable {
    public final int f32214a;
    public final cn0 f32215b;
    public final TLRPC.TL_error f32216c;
    public final TLObject d;

    public bn0(cn0 cn0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f32214a = 0;
        this.f32215b = cn0Var;
        this.d = tLObject;
        this.f32216c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f32214a) {
            case 0:
                cn0 cn0Var = this.f32215b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f32216c;
                qn0 qn0Var = cn0Var.e;
                if (tLObject instanceof Vector) {
                    qn0Var.f37002y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        qn0Var.f37002y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    cn0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.c5.x0(qn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    qn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                qn0Var.N1(true, false);
                return;
            case 1:
                cn0 cn0Var2 = this.f32215b;
                TLRPC.TL_error tL_error2 = this.f32216c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    cn0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    cn0Var2.b();
                    return;
                }
                cn0Var2.getClass();
                return;
            default:
                cn0 cn0Var3 = this.f32215b;
                TLRPC.TL_error tL_error3 = this.f32216c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    cn0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new rf0(cn0Var3, cn0Var3.f32845b, cn0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public bn0(cn0 cn0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f32214a = i10;
        this.f32215b = cn0Var;
        this.f32216c = tL_error;
        this.d = tLObject;
    }
}
