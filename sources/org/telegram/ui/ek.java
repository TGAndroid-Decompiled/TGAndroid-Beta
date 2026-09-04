package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ek implements Runnable {
    public final co f36102a;

    public ek(co coVar) {
        this.f36102a = coVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        co coVar = this.f36102a;
        MessageObject messageObject = coVar.f35229d5;
        if (messageObject != null && coVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (coVar.getConnectionsManager().getCurrentTime() - coVar.f35229d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            coVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(coVar.U8, 1000L);
        }
    }
}
