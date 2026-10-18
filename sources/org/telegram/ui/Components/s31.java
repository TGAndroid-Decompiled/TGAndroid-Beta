package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class s31 implements Runnable {
    public final int f30187a;
    public final MessageObject f30188b;
    public final long f30189c;
    public final String d;

    public s31(String str, MessageObject messageObject, long j10, int i10) {
        this.f30187a = i10;
        this.f30188b = messageObject;
        this.f30189c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30187a;
        String str = this.d;
        long j10 = this.f30189c;
        MessageObject messageObject = this.f30188b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                y31.g(messageObject, j10, str);
                return;
        }
    }
}
