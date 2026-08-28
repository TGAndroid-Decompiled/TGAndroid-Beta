package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class d21 implements Runnable {
    public final int f27641a;
    public final MessageObject f27642b;
    public final long f27643c;
    public final String d;

    public d21(String str, MessageObject messageObject, long j10, int i9) {
        this.f27641a = i9;
        this.f27642b = messageObject;
        this.f27643c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i9 = this.f27641a;
        String str = this.d;
        long j10 = this.f27643c;
        MessageObject messageObject = this.f27642b;
        switch (i9) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i10 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, messageObject, valueOf, str, bool, bool);
                return;
            default:
                i21.g(messageObject, j10, str);
                return;
        }
    }
}
