package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a30 implements Runnable {
    public final s50 f35254a;

    public a30(s50 s50Var) {
        this.f35254a = s50Var;
    }

    @Override
    public final void run() {
        int i10;
        s50 s50Var = this.f35254a;
        org.telegram.ui.ActionBar.j5 j5Var = s50Var.U;
        x40 x40Var = s50Var.V;
        if (x40Var != null && !s50Var.isDismissed()) {
            ChatObject.Call call = s50Var.f40896a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = s50Var.f40939k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - s50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    x40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    x40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && j5Var.getTag() == null) {
                        j5Var.setTag(1);
                        j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                s50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(s50Var.f40989w2, 1000L);
            }
        }
    }
}
