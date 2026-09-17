package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class y21 implements Runnable {
    public final int f32860a;
    public final MessageObject f32861b;
    public final long f32862c;
    public final String d;

    public y21(String str, MessageObject messageObject, long j3, int i10) {
        this.f32860a = i10;
        this.f32861b = messageObject;
        this.f32862c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f32860a;
        String str = this.d;
        long j3 = this.f32862c;
        MessageObject messageObject = this.f32861b;
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
