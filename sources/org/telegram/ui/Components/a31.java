package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class a31 implements Runnable {
    public final int f22305a;
    public final MessageObject f22306b;
    public final long f22307c;
    public final String d;

    public a31(String str, MessageObject messageObject, long j3, int i10) {
        this.f22305a = i10;
        this.f22306b = messageObject;
        this.f22307c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f22305a;
        String str = this.d;
        long j3 = this.f22307c;
        MessageObject messageObject = this.f22306b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                f31.g(messageObject, j3, str);
                return;
        }
    }
}
