package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class z21 implements Runnable {
    public final int f33702a;
    public final MessageObject f33703b;
    public final long f33704c;
    public final String d;

    public z21(String str, MessageObject messageObject, long j10, int i10) {
        this.f33702a = i10;
        this.f33703b = messageObject;
        this.f33704c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f33702a;
        String str = this.d;
        long j10 = this.f33704c;
        MessageObject messageObject = this.f33703b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                e31.g(messageObject, j10, str);
                return;
        }
    }
}
