package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class fk implements Runnable {
    public final sn f36969a;

    public fk(sn snVar) {
        this.f36969a = snVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        sn snVar = this.f36969a;
        MessageObject messageObject = snVar.f41210d5;
        if (messageObject != null && snVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (snVar.getConnectionsManager().getCurrentTime() - snVar.f41210d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            snVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(snVar.U8, 1000L);
        }
    }
}
