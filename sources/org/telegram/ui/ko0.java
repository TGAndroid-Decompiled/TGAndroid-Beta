package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ko0 implements wo0 {
    public final Runnable f35320a;
    public final yo0 f35321b;

    public ko0(yo0 yo0Var, Runnable runnable) {
        this.f35321b = yo0Var;
        this.f35320a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        yo0 yo0Var = this.f35321b;
        yo0Var.f39988y0 = tL_paymentSavedCredentialsCard;
        yo0Var.f39984w0 = str;
        yo0Var.U0 = z10;
        yo0Var.f39986x0 = str2;
        yo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = yo0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = yo0Var.f39986x0;
            if (str4 != null && str4.length() > 1) {
                str3 = yo0Var.f39986x0.substring(0, 1).toUpperCase() + yo0Var.f39986x0.substring(1);
            } else {
                str3 = yo0Var.f39986x0;
            }
            d9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.d9 d9Var3 = d9VarArr[1];
            if (d9Var3 != null) {
                d9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f35320a;
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
