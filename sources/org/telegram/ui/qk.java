package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class qk implements Runnable {
    public final fo f39183a;

    public qk(fo foVar) {
        this.f39183a = foVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        fo foVar = this.f39183a;
        MessageObject messageObject = foVar.f35617d5;
        if (messageObject != null && foVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (foVar.getConnectionsManager().getCurrentTime() - foVar.f35617d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            foVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(foVar.U8, 1000L);
        }
    }
}
