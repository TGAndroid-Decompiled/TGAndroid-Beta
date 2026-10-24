package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ek implements Runnable {
    public final sn f36941a;

    public ek(sn snVar) {
        this.f36941a = snVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        sn snVar = this.f36941a;
        MessageObject messageObject = snVar.p5;
        if (messageObject != null && snVar.f41518f9 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (snVar.getConnectionsManager().getCurrentTime() - snVar.p5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            snVar.f41518f9.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(snVar.f41530g9, 1000L);
        }
    }
}
