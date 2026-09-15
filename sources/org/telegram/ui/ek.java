package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ek implements Runnable {
    public final bo f33362a;

    public ek(bo boVar) {
        this.f33362a = boVar;
    }

    @Override
    public final void run() {
        String formatPluralString;
        bo boVar = this.f33362a;
        MessageObject messageObject = boVar.f32280d5;
        if (messageObject != null && boVar.T8 != null) {
            int max = Math.max(0, messageObject.messageOwner.ttl_period - (boVar.getConnectionsManager().getCurrentTime() - boVar.f32280d5.messageOwner.date));
            if (max < 86400) {
                formatPluralString = AndroidUtilities.formatDuration(max, false, true);
            } else {
                formatPluralString = LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0]);
            }
            boVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, formatPluralString));
            AndroidUtilities.runOnUIThread(boVar.U8, 1000L);
        }
    }
}
