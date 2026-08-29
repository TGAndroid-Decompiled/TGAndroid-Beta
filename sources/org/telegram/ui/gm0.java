package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class gm0 implements Runnable {
    public final int f38622a;
    public final hm0 f38623b;
    public final TLRPC.TL_error f38624c;
    public final TLObject d;

    public gm0(hm0 hm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f38622a = 0;
        this.f38623b = hm0Var;
        this.d = tLObject;
        this.f38624c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f38622a) {
            case 0:
                hm0 hm0Var = this.f38623b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f38624c;
                vm0 vm0Var = hm0Var.f38964e;
                if (tLObject instanceof Vector) {
                    vm0Var.f43678y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        vm0Var.f43678y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    hm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.c5.x0(vm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    vm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                vm0Var.N1(true, false);
                return;
            case 1:
                hm0 hm0Var2 = this.f38623b;
                TLRPC.TL_error tL_error2 = this.f38624c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    hm0Var2.f38964e.F = password;
                    TwoStepVerificationActivity.m0(password);
                    hm0Var2.b();
                    return;
                }
                hm0Var2.getClass();
                return;
            default:
                hm0 hm0Var3 = this.f38623b;
                TLRPC.TL_error tL_error3 = this.f38624c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    hm0Var3.f38964e.F = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.f38962b, hm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public gm0(hm0 hm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38622a = i10;
        this.f38623b = hm0Var;
        this.f38624c = tL_error;
        this.d = tLObject;
    }
}
