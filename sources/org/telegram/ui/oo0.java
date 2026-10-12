package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oo0 implements ap0 {
    public final Runnable f39018a;
    public final cp0 f39019b;

    public oo0(cp0 cp0Var, Runnable runnable) {
        this.f39019b = cp0Var;
        this.f39018a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        cp0 cp0Var = this.f39019b;
        cp0Var.f35034y0 = tL_paymentSavedCredentialsCard;
        cp0Var.f35030w0 = str;
        cp0Var.U0 = z10;
        cp0Var.f35032x0 = str2;
        cp0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = cp0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = cp0Var.f35032x0;
            if (str4 != null && str4.length() > 1) {
                str3 = cp0Var.f35032x0.substring(0, 1).toUpperCase() + cp0Var.f35032x0.substring(1);
            } else {
                str3 = cp0Var.f35032x0;
            }
            d9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.d9 d9Var3 = d9VarArr[1];
            if (d9Var3 != null) {
                d9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f39018a;
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
