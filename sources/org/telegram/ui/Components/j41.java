package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class j41 implements Runnable {
    public final int f27361a;
    public final MessageObject f27362b;
    public final long f27363c;
    public final String d;

    public j41(String str, MessageObject messageObject, long j3, int i10) {
        this.f27361a = i10;
        this.f27362b = messageObject;
        this.f27363c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f27361a;
        String str = this.d;
        long j3 = this.f27363c;
        MessageObject messageObject = this.f27362b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                o41.g(messageObject, j3, str);
                return;
        }
    }
}
