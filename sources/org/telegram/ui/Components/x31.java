package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class x31 implements Runnable {
    public final int f32508a;
    public final MessageObject f32509b;
    public final long f32510c;
    public final String d;

    public x31(String str, MessageObject messageObject, long j10, int i10) {
        this.f32508a = i10;
        this.f32509b = messageObject;
        this.f32510c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f32508a;
        String str = this.d;
        long j10 = this.f32510c;
        MessageObject messageObject = this.f32509b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                d41.g(messageObject, j10, str);
                return;
        }
    }
}
