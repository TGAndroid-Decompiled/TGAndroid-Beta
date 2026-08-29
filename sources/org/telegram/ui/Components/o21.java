package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class o21 implements Runnable {
    public final int f31241a;
    public final MessageObject f31242b;
    public final long f31243c;
    public final String d;

    public o21(String str, MessageObject messageObject, long j10, int i10) {
        this.f31241a = i10;
        this.f31242b = messageObject;
        this.f31243c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f31241a;
        String str = this.d;
        long j10 = this.f31243c;
        MessageObject messageObject = this.f31242b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                t21.g(messageObject, j10, str);
                return;
        }
    }
}
