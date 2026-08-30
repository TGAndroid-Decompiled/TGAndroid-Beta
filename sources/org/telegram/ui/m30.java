package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m30 implements Runnable {
    public final c60 f36180a;

    public m30(c60 c60Var) {
        this.f36180a = c60Var;
    }

    @Override
    public final void run() {
        int i10;
        c60 c60Var = this.f36180a;
        org.telegram.ui.ActionBar.k5 k5Var = c60Var.R;
        i50 i50Var = c60Var.S;
        if (i50Var != null && !c60Var.isDismissed()) {
            ChatObject.Call call = c60Var.X0;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = c60Var.f33129h2;
            }
            if (i10 != 0) {
                int currentTime = i10 - c60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    i50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    i50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && k5Var.getTag() == null) {
                        k5Var.setTag(1);
                        k5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                c60Var.T.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(c60Var.f33178t2, 1000L);
            }
        }
    }
}
