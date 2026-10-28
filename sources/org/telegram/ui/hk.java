package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class hk implements Runnable {
    public final wn f39924a;

    public hk(wn wnVar) {
        this.f39924a = wnVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        wn wnVar = this.f39924a;
        MessageObject messageObject = wnVar.f45291t5;
        if (messageObject != null && wnVar.f45171j9 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (wnVar.getConnectionsManager().getCurrentTime() - wnVar.f45291t5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            wnVar.f45171j9.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(wnVar.f45183k9, 1000L);
        }
    }
}
