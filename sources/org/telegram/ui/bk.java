package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class bk implements Runnable {
    public final yn f35162a;

    public bk(yn ynVar) {
        this.f35162a = ynVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        yn ynVar = this.f35162a;
        MessageObject messageObject = ynVar.f43281b5;
        if (messageObject != null && ynVar.R8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (ynVar.getConnectionsManager().getCurrentTime() - ynVar.f43281b5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            ynVar.R8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(ynVar.S8, 1000L);
        }
    }
}
