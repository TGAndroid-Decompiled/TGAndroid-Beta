package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class y31 implements Runnable {
    public final int f33166a;
    public final MessageObject f33167b;
    public final long f33168c;
    public final String d;

    public y31(String str, MessageObject messageObject, long j3, int i10) {
        this.f33166a = i10;
        this.f33167b = messageObject;
        this.f33168c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f33166a;
        String str = this.d;
        long j3 = this.f33168c;
        MessageObject messageObject = this.f33167b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                d41.g(messageObject, j3, str);
                return;
        }
    }
}
