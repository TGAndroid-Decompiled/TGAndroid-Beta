package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class db0 extends org.telegram.ui.Cells.g3 {

    public boolean f37344x;

    public final fb0 f37345y;

    public db0(fb0 fb0Var, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, false, false, -1, c6Var);
        this.f37345y = fb0Var;
    }

    @Override
    public final void b(Editable editable) {
        if (this.f37344x) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        fb0 fb0Var = this.f37345y;
        if (zIsEmpty) {
            fb0Var.f38061s.setText("");
            return;
        }
        try {
            long j10 = Long.parseLong(editable.toString());
            if (j10 > fb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f37344x = true;
                j10 = fb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(j10));
                this.f37344x = false;
            }
            fb0Var.f38061s.setText(LocaleController.formatString(fb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice, BillingController.getInstance().formatCurrency((long) ((j10 / 1000.0d) * ((double) MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) fb0Var).currentAccount).starsUsdWithdrawRate1000)), "USD")));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
