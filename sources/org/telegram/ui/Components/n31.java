package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class n31 implements Runnable {
    public final int f26660a;
    public final MessageObject f26661b;
    public final long f26662c;
    public final String d;

    public n31(String str, MessageObject messageObject, long j3, int i10) {
        this.f26660a = i10;
        this.f26661b = messageObject;
        this.f26662c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26660a;
        String str = this.d;
        long j3 = this.f26662c;
        MessageObject messageObject = this.f26661b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                s31.g(messageObject, j3, str);
                return;
        }
    }
}
