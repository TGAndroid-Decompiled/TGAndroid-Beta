package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b30 implements Runnable {
    public final u50 f35906a;

    public b30(u50 u50Var) {
        this.f35906a = u50Var;
    }

    @Override
    public final void run() {
        int i10;
        u50 u50Var = this.f35906a;
        org.telegram.ui.ActionBar.n5 n5Var = u50Var.U;
        y40 y40Var = u50Var.V;
        if (y40Var != null && !u50Var.isDismissed()) {
            ChatObject.Call call = u50Var.f42217a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = u50Var.f42260k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - u50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    y40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    y40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && n5Var.getTag() == null) {
                        n5Var.setTag(1);
                        n5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                u50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(u50Var.f42310w2, 1000L);
            }
        }
    }
}
