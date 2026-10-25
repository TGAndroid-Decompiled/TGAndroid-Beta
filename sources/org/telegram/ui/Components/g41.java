package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class g41 implements Runnable {
    public final int f28415a;
    public final MessageObject f28416b;
    public final long f28417c;
    public final String d;

    public g41(String str, MessageObject messageObject, long j10, int i10) {
        this.f28415a = i10;
        this.f28416b = messageObject;
        this.f28417c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f28415a;
        String str = this.d;
        long j10 = this.f28417c;
        MessageObject messageObject = this.f28416b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                l41.g(messageObject, j10, str);
                return;
        }
    }
}
