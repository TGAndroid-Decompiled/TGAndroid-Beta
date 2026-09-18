package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class o31 implements Runnable {
    public final int f26842a;
    public final MessageObject f26843b;
    public final long f26844c;
    public final String d;

    public o31(String str, MessageObject messageObject, long j3, int i10) {
        this.f26842a = i10;
        this.f26843b = messageObject;
        this.f26844c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26842a;
        String str = this.d;
        long j3 = this.f26844c;
        MessageObject messageObject = this.f26843b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                t31.g(messageObject, j3, str);
                return;
        }
    }
}
