package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class co0 implements oo0 {
    public final Runnable f32379a;
    public final qo0 f32380b;

    public co0(qo0 qo0Var, Runnable runnable) {
        this.f32380b = qo0Var;
        this.f32379a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        qo0 qo0Var = this.f32380b;
        qo0Var.f36522y0 = tL_paymentSavedCredentialsCard;
        qo0Var.f36518w0 = str;
        qo0Var.U0 = z10;
        qo0Var.f36520x0 = str2;
        qo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.e9[] e9VarArr = qo0Var.Y;
        org.telegram.ui.Cells.e9 e9Var = e9VarArr[0];
        if (e9Var != null) {
            e9Var.setVisibility(0);
            org.telegram.ui.Cells.e9 e9Var2 = e9VarArr[0];
            String str4 = qo0Var.f36520x0;
            if (str4 != null && str4.length() > 1) {
                str3 = qo0Var.f36520x0.substring(0, 1).toUpperCase() + qo0Var.f36520x0.substring(1);
            } else {
                str3 = qo0Var.f36520x0;
            }
            e9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.e9 e9Var3 = e9VarArr[1];
            if (e9Var3 != null) {
                e9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f32379a;
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
