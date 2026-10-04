package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class x31 implements Runnable {
    public final int f32720a;
    public final MessageObject f32721b;
    public final long f32722c;
    public final String d;

    public x31(String str, MessageObject messageObject, long j3, int i10) {
        this.f32720a = i10;
        this.f32721b = messageObject;
        this.f32722c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f32720a;
        String str = this.d;
        long j3 = this.f32722c;
        MessageObject messageObject = this.f32721b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                c41.g(messageObject, j3, str);
                return;
        }
    }
}
