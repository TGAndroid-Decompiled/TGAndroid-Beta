package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p30 implements Runnable {
    public final g60 f40724a;

    public p30(g60 g60Var) {
        this.f40724a = g60Var;
    }

    @Override
    public final void run() {
        int i10;
        g60 g60Var = this.f40724a;
        org.telegram.ui.ActionBar.h5 h5Var = g60Var.U;
        l50 l50Var = g60Var.V;
        if (l50Var != null && !g60Var.isDismissed()) {
            ChatObject.Call call = g60Var.f37869a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = g60Var.f37912k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - g60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    l50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    l50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && h5Var.getTag() == null) {
                        h5Var.setTag(1);
                        h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                g60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(g60Var.f37962w2, 1000L);
            }
        }
    }
}
