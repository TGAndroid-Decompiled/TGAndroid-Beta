package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o30 implements Runnable {
    public final f60 f35673a;

    public o30(f60 f60Var) {
        this.f35673a = f60Var;
    }

    @Override
    public final void run() {
        int i10;
        f60 f60Var = this.f35673a;
        org.telegram.ui.ActionBar.i5 i5Var = f60Var.U;
        k50 k50Var = f60Var.V;
        if (k50Var != null && !f60Var.isDismissed()) {
            ChatObject.Call call = f60Var.f33099a1;
            if (call != null) {
                i10 = call.call.schedule_date;
            } else {
                i10 = f60Var.f33141k2;
            }
            if (i10 != 0) {
                int currentTime = i10 - f60Var.d.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    k50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
                } else {
                    k50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                    if (currentTime < 0 && i5Var.getTag() == null) {
                        i5Var.setTag(1);
                        i5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
                    }
                }
                f60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
                AndroidUtilities.runOnUIThread(f60Var.f33191w2, 1000L);
            }
        }
    }
}
