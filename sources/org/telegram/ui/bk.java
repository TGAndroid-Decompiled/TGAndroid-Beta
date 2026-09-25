package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class bk implements Runnable {
    public final wn f32446a;

    public bk(wn wnVar) {
        this.f32446a = wnVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        wn wnVar = this.f32446a;
        MessageObject messageObject = wnVar.f39453d5;
        if (messageObject != null && wnVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (wnVar.getConnectionsManager().getCurrentTime() - wnVar.f39453d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            wnVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(wnVar.U8, 1000L);
        }
    }
}
