package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class bb0 extends org.telegram.ui.Cells.g3 {
    public boolean E;
    public final db0 F;

    public bb0(db0 db0Var, Context context, String str, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, str, false, false, -1, u6Var);
        this.F = db0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        db0 db0Var = this.F;
        if (isEmpty) {
            db0Var.f38821s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > db0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.E = true;
                parseLong = db0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = db0Var.f38821s;
            if (db0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.r2) db0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
