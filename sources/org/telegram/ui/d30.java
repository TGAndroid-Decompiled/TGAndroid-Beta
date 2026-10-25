package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d30 implements Runnable {
    public final v50 f38724a;

    public d30(v50 v50Var) {
        this.f38724a = v50Var;
    }

    @Override
    public final void run() {
        int i10;
        v50 v50Var = this.f38724a;
        org.telegram.ui.ActionBar.b6 b6Var = v50Var.U;
        a50 a50Var = v50Var.V;
        if (a50Var != null && !v50Var.isDismissed()) {
            ChatObject.Call call = v50Var.f44607a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = v50Var.f44650k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - v50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    a50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    a50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && b6Var.getTag() == null) {
                        b6Var.setTag(1);
                        b6Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                v50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(v50Var.f44700w2, 1000L);
            }
        }
    }
}
