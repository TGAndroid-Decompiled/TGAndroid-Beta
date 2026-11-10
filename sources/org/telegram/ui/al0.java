package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class al0 implements il0 {
    public final Runnable f43715a;
    public final kl0 f43716b;

    public al0(kl0 kl0Var, Runnable runnable) {
        this.f43716b = kl0Var;
        this.f43715a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        kl0 kl0Var = this.f43716b;
        kl0Var.f47365y0 = tL_paymentSavedCredentialsCard;
        kl0Var.f47361w0 = str;
        kl0Var.U0 = z9;
        kl0Var.f47363x0 = str2;
        kl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = kl0Var.Y;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = kl0Var.f47363x0;
            if (str4 != null && str4.length() > 1) {
                str3 = kl0Var.f47363x0.substring(0, 1).toUpperCase() + kl0Var.f47363x0.substring(1);
            } else {
                str3 = kl0Var.f47363x0;
            }
            y8Var2.b(2131232273, str3, org.telegram.messenger.id.M0(2131747414, null), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f43715a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override
    public final void b() {
    }
}
