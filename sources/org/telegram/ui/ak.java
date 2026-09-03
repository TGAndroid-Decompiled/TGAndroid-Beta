package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ak implements Runnable {
    public final xn f35207a;

    public ak(xn xnVar) {
        this.f35207a = xnVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        xn xnVar = this.f35207a;
        MessageObject messageObject = xnVar.f43095a5;
        if (messageObject != null && xnVar.Q8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (xnVar.getConnectionsManager().getCurrentTime() - xnVar.f43095a5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            xnVar.Q8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(xnVar.R8, 1000L);
        }
    }
}
