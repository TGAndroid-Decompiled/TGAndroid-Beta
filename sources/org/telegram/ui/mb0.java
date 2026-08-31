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
public final class mb0 extends org.telegram.ui.Cells.i3 {
    public boolean f39070x;
    public final ob0 f39071y;

    public mb0(ob0 ob0Var, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, false, false, -1, g6Var);
        this.f39071y = ob0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f39070x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ob0 ob0Var = this.f39071y;
        if (isEmpty) {
            ob0Var.f39710s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ob0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f39070x = true;
                parseLong = ob0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f39070x = false;
            }
            TextView textView = ob0Var.f39710s;
            if (ob0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.p2) ob0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
