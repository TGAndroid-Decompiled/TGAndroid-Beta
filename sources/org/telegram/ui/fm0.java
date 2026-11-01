package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class fm0 implements om0 {
    public final Runnable f37189a;
    public final qm0 f37190b;

    public fm0(qm0 qm0Var, Runnable runnable) {
        this.f37190b = qm0Var;
        this.f37189a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        qm0 qm0Var = this.f37190b;
        qm0Var.f40851y0 = tL_paymentSavedCredentialsCard;
        qm0Var.f40847w0 = str;
        qm0Var.U0 = z10;
        qm0Var.f40849x0 = str2;
        qm0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.a9[] a9VarArr = qm0Var.Y;
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[0];
        if (a9Var != null) {
            a9Var.setVisibility(0);
            org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[0];
            String str4 = qm0Var.f40849x0;
            if (str4 != null && str4.length() > 1) {
                str3 = qm0Var.f40849x0.substring(0, 1).toUpperCase() + qm0Var.f40849x0.substring(1);
            } else {
                str3 = qm0Var.f40849x0;
            }
            a9Var2.b(2131232272, str3, org.telegram.messenger.dd.L0(2131747430, null), true);
            org.telegram.ui.Cells.a9 a9Var3 = a9VarArr[1];
            if (a9Var3 != null) {
                a9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f37189a;
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
