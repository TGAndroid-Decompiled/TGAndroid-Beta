package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class y21 implements Runnable {
    public final int f32859a;
    public final MessageObject f32860b;
    public final long f32861c;
    public final String d;

    public y21(String str, MessageObject messageObject, long j3, int i10) {
        this.f32859a = i10;
        this.f32860b = messageObject;
        this.f32861c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f32859a;
        String str = this.d;
        long j3 = this.f32861c;
        MessageObject messageObject = this.f32860b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                d31.g(messageObject, j3, str);
                return;
        }
    }
}
