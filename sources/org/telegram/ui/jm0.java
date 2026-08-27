package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

public final class jm0 implements Runnable {

    public final int f39398a;

    public final km0 f39399b;

    public final TLRPC.TL_error f39400c;
    public final TLObject d;

    public jm0(km0 km0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f39398a = 0;
        this.f39399b = km0Var;
        this.d = tLObject;
        this.f39400c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f39398a) {
            case 0:
                km0 km0Var = this.f39399b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f39400c;
                xm0 xm0Var = km0Var.f39810e;
                if (tLObject instanceof Vector) {
                    xm0Var.f44535y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        xm0Var.f44535y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    km0Var.a();
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.y4.x0(xm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        xm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    xm0Var.N1(true, false);
                }
                break;
            case 1:
                km0 km0Var2 = this.f39399b;
                TLRPC.TL_error tL_error2 = this.f39400c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    km0Var2.f39810e.F = password;
                    TwoStepVerificationActivity.m0(password);
                    km0Var2.b();
                } else {
                    km0Var2.getClass();
                }
                break;
            default:
                km0 km0Var3 = this.f39399b;
                TLRPC.TL_error tL_error3 = this.f39400c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    km0Var3.f39810e.F = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new bf0(km0Var3, km0Var3.f39808b, km0Var3.d, 12));
                }
                break;
        }
    }

    public jm0(km0 km0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39398a = i10;
        this.f39399b = km0Var;
        this.f39400c = tL_error;
        this.d = tLObject;
    }
}
