package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class dk implements Runnable {
    public final qn f36403a;

    public dk(qn qnVar) {
        this.f36403a = qnVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        qn qnVar = this.f36403a;
        MessageObject messageObject = qnVar.f40651d5;
        if (messageObject != null && qnVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (qnVar.getConnectionsManager().getCurrentTime() - qnVar.f40651d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            qnVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(qnVar.U8, 1000L);
        }
    }
}
