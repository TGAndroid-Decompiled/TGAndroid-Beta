package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class an0 implements Runnable {
    public final int f34484a;
    public final bn0 f34485b;
    public final TLRPC.TL_error f34486c;
    public final TLObject d;

    public an0(bn0 bn0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f34484a = 0;
        this.f34485b = bn0Var;
        this.d = tLObject;
        this.f34486c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f34484a) {
            case 0:
                bn0 bn0Var = this.f34485b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f34486c;
                pn0 pn0Var = bn0Var.f34850e;
                if (tLObject instanceof Vector) {
                    pn0Var.f39605y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        pn0Var.f39605y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    bn0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.e5.x0(pn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    pn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                pn0Var.N1(true, false);
                return;
            case 1:
                bn0 bn0Var2 = this.f34485b;
                TLRPC.TL_error tL_error2 = this.f34486c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    bn0Var2.f34850e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    bn0Var2.b();
                    return;
                }
                bn0Var2.getClass();
                return;
            default:
                bn0 bn0Var3 = this.f34485b;
                TLRPC.TL_error tL_error3 = this.f34486c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    bn0Var3.f34850e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new pf0(bn0Var3, bn0Var3.f34848b, bn0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public an0(bn0 bn0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f34484a = i10;
        this.f34485b = bn0Var;
        this.f34486c = tL_error;
        this.d = tLObject;
    }
}
