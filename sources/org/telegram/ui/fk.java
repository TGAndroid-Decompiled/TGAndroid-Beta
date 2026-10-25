package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class fk implements Runnable {
    public final un f39406a;

    public fk(un unVar) {
        this.f39406a = unVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        un unVar = this.f39406a;
        MessageObject messageObject = unVar.f44371p5;
        if (messageObject != null && unVar.f44251f9 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (unVar.getConnectionsManager().getCurrentTime() - unVar.f44371p5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            unVar.f44251f9.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(unVar.f44263g9, 1000L);
        }
    }
}
