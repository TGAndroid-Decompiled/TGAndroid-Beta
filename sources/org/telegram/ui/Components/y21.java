package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class y21 implements Runnable {
    public final int f30837a;
    public final MessageObject f30838b;
    public final long f30839c;
    public final String d;

    public y21(String str, MessageObject messageObject, long j10, int i10) {
        this.f30837a = i10;
        this.f30838b = messageObject;
        this.f30839c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30837a;
        String str = this.d;
        long j10 = this.f30839c;
        MessageObject messageObject = this.f30838b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                d31.g(messageObject, j10, str);
                return;
        }
    }
}
