package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hm0 implements qm0 {
    public final Runnable f37997a;
    public final sm0 f37998b;

    public hm0(sm0 sm0Var, Runnable runnable) {
        this.f37998b = sm0Var;
        this.f37997a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        sm0 sm0Var = this.f37998b;
        sm0Var.f41585y0 = tL_paymentSavedCredentialsCard;
        sm0Var.f41581w0 = str;
        sm0Var.U0 = z10;
        sm0Var.f41583x0 = str2;
        sm0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.a9[] a9VarArr = sm0Var.Y;
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[0];
        if (a9Var != null) {
            a9Var.setVisibility(0);
            org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[0];
            String str4 = sm0Var.f41583x0;
            if (str4 != null && str4.length() > 1) {
                str3 = sm0Var.f41583x0.substring(0, 1).toUpperCase() + sm0Var.f41583x0.substring(1);
            } else {
                str3 = sm0Var.f41583x0;
            }
            a9Var2.b(2131232272, str3, org.telegram.messenger.cd.L0(2131747430, null), true);
            org.telegram.ui.Cells.a9 a9Var3 = a9VarArr[1];
            if (a9Var3 != null) {
                a9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f37997a;
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
