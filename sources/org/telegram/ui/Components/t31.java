package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class t31 implements Runnable {
    public final int f30413a;
    public final MessageObject f30414b;
    public final long f30415c;
    public final String d;

    public t31(String str, MessageObject messageObject, long j10, int i10) {
        this.f30413a = i10;
        this.f30414b = messageObject;
        this.f30415c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30413a;
        String str = this.d;
        long j10 = this.f30415c;
        MessageObject messageObject = this.f30414b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                z31.g(messageObject, j10, str);
                return;
        }
    }
}
