package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class jm0 implements Runnable {
    public final int f38246a;
    public final km0 f38247b;
    public final TLRPC.TL_error f38248c;
    public final TLObject d;

    public jm0(km0 km0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f38246a = 0;
        this.f38247b = km0Var;
        this.d = tLObject;
        this.f38248c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f38246a) {
            case 0:
                km0 km0Var = this.f38247b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f38248c;
                xm0 xm0Var = km0Var.e;
                if (tLObject instanceof Vector) {
                    xm0Var.f43238y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        xm0Var.f43238y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    km0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.f5.w0(xm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    xm0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                xm0Var.M1(true, false);
                return;
            case 1:
                km0 km0Var2 = this.f38247b;
                TLRPC.TL_error tL_error2 = this.f38248c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    km0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    km0Var2.b();
                    return;
                }
                km0Var2.getClass();
                return;
            default:
                km0 km0Var3 = this.f38247b;
                TLRPC.TL_error tL_error3 = this.f38248c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    km0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new xe0(km0Var3, km0Var3.f38587b, km0Var3.d, 13));
                    return;
                }
                return;
        }
    }

    public jm0(km0 km0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38246a = i10;
        this.f38247b = km0Var;
        this.f38248c = tL_error;
        this.d = tLObject;
    }
}
