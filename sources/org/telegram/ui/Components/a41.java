package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class a41 implements Runnable {
    public final int f23434a;
    public final MessageObject f23435b;
    public final long f23436c;
    public final String d;

    public a41(String str, MessageObject messageObject, long j10, int i10) {
        this.f23434a = i10;
        this.f23435b = messageObject;
        this.f23436c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f23434a;
        String str = this.d;
        long j10 = this.f23436c;
        MessageObject messageObject = this.f23435b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                f41.g(messageObject, j10, str);
                return;
        }
    }
}
