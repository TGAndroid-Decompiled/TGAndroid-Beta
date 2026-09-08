package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jo0 implements vo0 {
    public final Runnable f37850a;
    public final xo0 f37851b;

    public jo0(xo0 xo0Var, Runnable runnable) {
        this.f37851b = xo0Var;
        this.f37850a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        xo0 xo0Var = this.f37851b;
        xo0Var.f42872y0 = tL_paymentSavedCredentialsCard;
        xo0Var.f42868w0 = str;
        xo0Var.U0 = z10;
        xo0Var.f42870x0 = str2;
        xo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = xo0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = xo0Var.f42870x0;
            if (str4 != null && str4.length() > 1) {
                str3 = xo0Var.f42870x0.substring(0, 1).toUpperCase() + xo0Var.f42870x0.substring(1);
            } else {
                str3 = xo0Var.f42870x0;
            }
            d9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.d9 d9Var3 = d9VarArr[1];
            if (d9Var3 != null) {
                d9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f37850a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
