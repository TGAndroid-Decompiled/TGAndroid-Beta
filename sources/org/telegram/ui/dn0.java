package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class dn0 implements Runnable {
    public final int f35086a;
    public final en0 f35087b;
    public final TLRPC.TL_error f35088c;
    public final TLObject d;

    public dn0(en0 en0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f35086a = 0;
        this.f35087b = en0Var;
        this.d = tLObject;
        this.f35088c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f35086a) {
            case 0:
                en0 en0Var = this.f35087b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f35088c;
                sn0 sn0Var = en0Var.e;
                if (tLObject instanceof Vector) {
                    sn0Var.f39909y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        sn0Var.f39909y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    en0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(sn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    sn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                sn0Var.M1(true, false);
                return;
            case 1:
                en0 en0Var2 = this.f35087b;
                TLRPC.TL_error tL_error2 = this.f35088c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    en0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    en0Var2.b();
                    return;
                }
                en0Var2.getClass();
                return;
            default:
                en0 en0Var3 = this.f35087b;
                TLRPC.TL_error tL_error3 = this.f35088c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    en0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new tf0(en0Var3, en0Var3.f35339b, en0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public dn0(en0 en0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35086a = i10;
        this.f35087b = en0Var;
        this.f35088c = tL_error;
        this.d = tLObject;
    }
}
