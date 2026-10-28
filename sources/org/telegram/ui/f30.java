package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f30 implements Runnable {
    public final x50 f39145a;

    public f30(x50 x50Var) {
        this.f39145a = x50Var;
    }

    @Override
    public final void run() {
        int i10;
        x50 x50Var = this.f39145a;
        org.telegram.ui.ActionBar.b6 b6Var = x50Var.U;
        c50 c50Var = x50Var.V;
        if (c50Var != null && !x50Var.isDismissed()) {
            ChatObject.Call call = x50Var.f45491a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = x50Var.f45534k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - x50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    c50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    c50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && b6Var.getTag() == null) {
                        b6Var.setTag(1);
                        b6Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                x50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(x50Var.f45584w2, 1000L);
            }
        }
    }
}
