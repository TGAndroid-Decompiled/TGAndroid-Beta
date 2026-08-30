package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class om0 implements Runnable {
    public final int f36937a;
    public final pm0 f36938b;
    public final TLRPC.TL_error f36939c;
    public final TLObject d;

    public om0(pm0 pm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f36937a = 0;
        this.f36938b = pm0Var;
        this.d = tLObject;
        this.f36939c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f36937a) {
            case 0:
                pm0 pm0Var = this.f36938b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f36939c;
                dn0 dn0Var = pm0Var.e;
                if (tLObject instanceof Vector) {
                    dn0Var.f33737y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        dn0Var.f33737y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    pm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.z4.x0(dn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    dn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                dn0Var.N1(true, false);
                return;
            case 1:
                pm0 pm0Var2 = this.f36938b;
                TLRPC.TL_error tL_error2 = this.f36939c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    pm0Var2.e.G = password;
                    TwoStepVerificationActivity.m0(password);
                    pm0Var2.b();
                    return;
                }
                pm0Var2.getClass();
                return;
            default:
                pm0 pm0Var3 = this.f36938b;
                TLRPC.TL_error tL_error3 = this.f36939c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    pm0Var3.e.G = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new hf0(pm0Var3, pm0Var3.f37376b, pm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public om0(pm0 pm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36937a = i10;
        this.f36938b = pm0Var;
        this.f36939c = tL_error;
        this.d = tLObject;
    }
}
