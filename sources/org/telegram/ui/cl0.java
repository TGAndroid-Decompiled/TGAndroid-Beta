package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cl0 implements kl0 {
    public final Runnable f46553a;
    public final ml0 f46554b;

    public cl0(ml0 ml0Var, Runnable runnable) {
        this.f46554b = ml0Var;
        this.f46553a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        ml0 ml0Var = this.f46554b;
        ml0Var.f49921z0 = tL_paymentSavedCredentialsCard;
        ml0Var.f49918x0 = str;
        ml0Var.V0 = z10;
        ml0Var.f49920y0 = str2;
        ml0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = ml0Var.Z;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = ml0Var.f49920y0;
            if (str4 != null && str4.length() > 1) {
                str3 = ml0Var.f49920y0.substring(0, 1).toUpperCase() + ml0Var.f49920y0.substring(1);
            } else {
                str3 = ml0Var.f49920y0;
            }
            y8Var2.b(2131232275, str3, org.telegram.messenger.gd.M0(2131747221, null), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f46553a;
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
