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
public final class pb0 extends org.telegram.ui.Cells.j3 {
    public boolean f36490x;
    public final rb0 f36491y;

    public pb0(rb0 rb0Var, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, false, false, -1, d6Var);
        this.f36491y = rb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f36490x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        rb0 rb0Var = this.f36491y;
        if (isEmpty) {
            rb0Var.f37287s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > rb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f36490x = true;
                parseLong = rb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f36490x = false;
            }
            TextView textView = rb0Var.f37287s;
            if (rb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.m2) rb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
