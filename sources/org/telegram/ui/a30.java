package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a30 implements Runnable {
    public final r50 f36415a;

    public a30(r50 r50Var) {
        this.f36415a = r50Var;
    }

    @Override
    public final void run() {
        int i10;
        r50 r50Var = this.f36415a;
        org.telegram.ui.ActionBar.h5 h5Var = r50Var.Q;
        w40 w40Var = r50Var.R;
        if (w40Var != null && !r50Var.isDismissed()) {
            ChatObject.Call call = r50Var.W0;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = r50Var.f41896g2;
            }
            if (i10 != 0) {
                int currentTime = i10 - r50Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    w40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    w40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && h5Var.getTag() == null) {
                        h5Var.setTag(1);
                        h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                r50Var.S.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(r50Var.f41945s2, 1000L);
            }
        }
    }
}
