package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o30 implements Runnable {
    public final e60 f36641a;

    public o30(e60 e60Var) {
        this.f36641a = e60Var;
    }

    @Override
    public final void run() {
        int i10;
        e60 e60Var = this.f36641a;
        org.telegram.ui.ActionBar.k5 k5Var = e60Var.R;
        k50 k50Var = e60Var.S;
        if (k50Var != null && !e60Var.isDismissed()) {
            ChatObject.Call call = e60Var.X0;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = e60Var.f33648h2;
            }
            if (i10 != 0) {
                int currentTime = i10 - e60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    k50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    k50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && k5Var.getTag() == null) {
                        k5Var.setTag(1);
                        k5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                e60Var.T.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(e60Var.f33697t2, 1000L);
            }
        }
    }
}
