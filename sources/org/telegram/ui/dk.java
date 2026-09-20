package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class dk implements Runnable {
    public final zn f33094a;

    public dk(zn znVar) {
        this.f33094a = znVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        zn znVar = this.f33094a;
        MessageObject messageObject = znVar.f40286d5;
        if (messageObject != null && znVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (znVar.getConnectionsManager().getCurrentTime() - znVar.f40286d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            znVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(znVar.U8, 1000L);
        }
    }
}
