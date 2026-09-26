package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ao0 implements mo0 {
    public final Runnable f32204a;
    public final oo0 f32205b;

    public ao0(oo0 oo0Var, Runnable runnable) {
        this.f32205b = oo0Var;
        this.f32204a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        oo0 oo0Var = this.f32205b;
        oo0Var.f36315y0 = tL_paymentSavedCredentialsCard;
        oo0Var.f36311w0 = str;
        oo0Var.U0 = z10;
        oo0Var.f36313x0 = str2;
        oo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = oo0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = oo0Var.f36313x0;
            if (str4 != null && str4.length() > 1) {
                str3 = oo0Var.f36313x0.substring(0, 1).toUpperCase() + oo0Var.f36313x0.substring(1);
            } else {
                str3 = oo0Var.f36313x0;
            }
            d9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.d9 d9Var3 = d9VarArr[1];
            if (d9Var3 != null) {
                d9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f32204a;
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
