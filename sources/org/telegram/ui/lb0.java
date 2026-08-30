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
public final class lb0 extends org.telegram.ui.Cells.i3 {
    public boolean f36054x;
    public final nb0 f36055y;

    public lb0(nb0 nb0Var, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, false, false, -1, f6Var);
        this.f36055y = nb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f36054x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        nb0 nb0Var = this.f36055y;
        if (isEmpty) {
            nb0Var.f36568s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > nb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f36054x = true;
                parseLong = nb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f36054x = false;
            }
            TextView textView = nb0Var.f36568s;
            if (nb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.p2) nb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
