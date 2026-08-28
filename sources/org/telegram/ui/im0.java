package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class im0 implements Runnable {
    public final int f39218a;
    public final jm0 f39219b;
    public final TLRPC.TL_error f39220c;
    public final TLObject d;

    public im0(jm0 jm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f39218a = 0;
        this.f39219b = jm0Var;
        this.d = tLObject;
        this.f39220c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f39218a) {
            case 0:
                jm0 jm0Var = this.f39219b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f39220c;
                wm0 wm0Var = jm0Var.f39531e;
                if (tLObject instanceof Vector) {
                    wm0Var.f44204y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        wm0Var.f44204y.values.add((TLRPC.TL_secureValue) vector.objects.get(i9));
                    }
                    jm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.y4.x0(wm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    wm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                wm0Var.N1(true, false);
                return;
            case 1:
                jm0 jm0Var2 = this.f39219b;
                TLRPC.TL_error tL_error2 = this.f39220c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    jm0Var2.f39531e.F = password;
                    TwoStepVerificationActivity.l0(password);
                    jm0Var2.b();
                    return;
                }
                jm0Var2.getClass();
                return;
            default:
                jm0 jm0Var3 = this.f39219b;
                TLRPC.TL_error tL_error3 = this.f39220c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    jm0Var3.f39531e.F = password2;
                    TwoStepVerificationActivity.l0(password2);
                    Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.f39529b, jm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public im0(jm0 jm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9) {
        this.f39218a = i9;
        this.f39219b = jm0Var;
        this.f39220c = tL_error;
        this.d = tLObject;
    }
}
