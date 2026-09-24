package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m30 implements Runnable {
    public final d60 f35456a;

    public m30(d60 d60Var) {
        this.f35456a = d60Var;
    }

    @Override
    public final void run() {
        int i10;
        d60 d60Var = this.f35456a;
        org.telegram.ui.ActionBar.h5 h5Var = d60Var.U;
        i50 i50Var = d60Var.V;
        if (i50Var != null && !d60Var.isDismissed()) {
            ChatObject.Call call = d60Var.f32919a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = d60Var.f32961k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - d60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    i50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    i50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && h5Var.getTag() == null) {
                        h5Var.setTag(1);
                        h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                d60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(d60Var.f33011w2, 1000L);
            }
        }
    }
}
