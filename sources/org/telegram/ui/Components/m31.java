package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class m31 implements Runnable {
    public final int f25156a;
    public final MessageObject f25157b;
    public final long f25158c;
    public final String d;

    public m31(String str, MessageObject messageObject, long j3, int i10) {
        this.f25156a = i10;
        this.f25157b = messageObject;
        this.f25158c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f25156a;
        String str = this.d;
        long j3 = this.f25158c;
        MessageObject messageObject = this.f25157b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                r31.g(messageObject, j3, str);
                return;
        }
    }
}
