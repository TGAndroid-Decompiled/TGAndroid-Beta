package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class en0 implements Runnable {
    public final int f35642a;
    public final fn0 f35643b;
    public final TLRPC.TL_error f35644c;
    public final TLObject d;

    public en0(fn0 fn0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f35642a = 0;
        this.f35643b = fn0Var;
        this.d = tLObject;
        this.f35644c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f35642a) {
            case 0:
                fn0 fn0Var = this.f35643b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f35644c;
                un0 un0Var = fn0Var.e;
                if (tLObject instanceof Vector) {
                    un0Var.f40774y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        un0Var.f40774y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    fn0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(un0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    un0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                un0Var.M1(true, false);
                return;
            case 1:
                fn0 fn0Var2 = this.f35643b;
                TLRPC.TL_error tL_error2 = this.f35644c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    fn0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    fn0Var2.b();
                    return;
                }
                fn0Var2.getClass();
                return;
            default:
                fn0 fn0Var3 = this.f35643b;
                TLRPC.TL_error tL_error3 = this.f35644c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    fn0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new uf0(fn0Var3, fn0Var3.f35868b, fn0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public en0(fn0 fn0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35642a = i10;
        this.f35643b = fn0Var;
        this.f35644c = tL_error;
        this.d = tLObject;
    }
}
