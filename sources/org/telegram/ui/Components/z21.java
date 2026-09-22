package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class z21 implements Runnable {
    public final int f30466a;
    public final MessageObject f30467b;
    public final long f30468c;
    public final String d;

    public z21(String str, MessageObject messageObject, long j3, int i10) {
        this.f30466a = i10;
        this.f30467b = messageObject;
        this.f30468c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30466a;
        String str = this.d;
        long j3 = this.f30468c;
        MessageObject messageObject = this.f30467b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                e31.g(messageObject, j3, str);
                return;
        }
    }
}
