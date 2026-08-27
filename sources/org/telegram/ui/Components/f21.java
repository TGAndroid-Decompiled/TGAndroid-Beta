package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

public final class f21 implements Runnable {

    public final int f28239a;

    public final MessageObject f28240b;

    public final long f28241c;
    public final String d;

    public f21(String str, MessageObject messageObject, long j10, int i10) {
        this.f28239a = i10;
        this.f28240b = messageObject;
        this.f28241c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f28239a;
        String str = this.d;
        long j10 = this.f28241c;
        MessageObject messageObject = this.f28240b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long lValueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, lValueOf, str, bool, bool);
                break;
            default:
                k21.g(messageObject, j10, str);
                break;
        }
    }
}
