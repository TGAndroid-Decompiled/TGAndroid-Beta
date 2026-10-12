package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class qk implements Runnable {
    public final eo f41348a;

    public qk(eo eoVar) {
        this.f41348a = eoVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        eo eoVar = this.f41348a;
        MessageObject messageObject = eoVar.f37238d5;
        if (messageObject != null && eoVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (eoVar.getConnectionsManager().getCurrentTime() - eoVar.f37238d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            eoVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(eoVar.U8, 1000L);
        }
    }
}
