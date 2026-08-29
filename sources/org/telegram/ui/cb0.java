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
public final class cb0 extends org.telegram.ui.Cells.g3 {
    public boolean f37070x;
    public final eb0 f37071y;

    public cb0(eb0 eb0Var, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, false, false, -1, c6Var);
        this.f37071y = eb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f37070x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        eb0 eb0Var = this.f37071y;
        if (isEmpty) {
            eb0Var.f37781s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > eb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f37070x = true;
                parseLong = eb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f37070x = false;
            }
            TextView textView = eb0Var.f37781s;
            if (eb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.o2) eb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
