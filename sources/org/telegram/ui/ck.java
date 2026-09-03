package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ck implements Runnable {
    public final zn f33180a;

    public ck(zn znVar) {
        this.f33180a = znVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        zn znVar = this.f33180a;
        MessageObject messageObject = znVar.f40515a5;
        if (messageObject != null && znVar.Q8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (znVar.getConnectionsManager().getCurrentTime() - znVar.f40515a5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            znVar.Q8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(znVar.R8, 1000L);
        }
    }
}
