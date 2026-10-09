package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class e41 implements Runnable {
    public final int f25946a;
    public final MessageObject f25947b;
    public final long f25948c;
    public final String d;

    public e41(String str, MessageObject messageObject, long j3, int i10) {
        this.f25946a = i10;
        this.f25947b = messageObject;
        this.f25948c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f25946a;
        String str = this.d;
        long j3 = this.f25948c;
        MessageObject messageObject = this.f25947b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                j41.g(messageObject, j3, str);
                return;
        }
    }
}
