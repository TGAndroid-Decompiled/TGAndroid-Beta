package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n30 implements Runnable {
    public final d60 f39168a;

    public n30(d60 d60Var) {
        this.f39168a = d60Var;
    }

    @Override
    public final void run() {
        int i10;
        d60 d60Var = this.f39168a;
        org.telegram.ui.ActionBar.l5 l5Var = d60Var.R;
        j50 j50Var = d60Var.S;
        if (j50Var != null && !d60Var.isDismissed()) {
            ChatObject.Call call = d60Var.X0;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = d60Var.f36022h2;
            }
            if (i10 != 0) {
                int currentTime = i10 - d60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    j50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && l5Var.getTag() == null) {
                        l5Var.setTag(1);
                        l5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                d60Var.T.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(d60Var.f36071t2, 1000L);
            }
        }
    }
}
