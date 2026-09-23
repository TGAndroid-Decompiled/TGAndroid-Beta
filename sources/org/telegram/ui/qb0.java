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
public final class qb0 extends org.telegram.ui.Cells.i3 {
    public boolean f36381x;
    public final sb0 f36382y;

    public qb0(sb0 sb0Var, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, false, false, -1, d6Var);
        this.f36382y = sb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f36381x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        sb0 sb0Var = this.f36382y;
        if (isEmpty) {
            sb0Var.f37232s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > sb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f36381x = true;
                parseLong = sb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f36381x = false;
            }
            TextView textView = sb0Var.f37232s;
            if (sb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.n2) sb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
