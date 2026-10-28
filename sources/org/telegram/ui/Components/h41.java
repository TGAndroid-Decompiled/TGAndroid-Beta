package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class h41 implements Runnable {
    public final int f28852a;
    public final MessageObject f28853b;
    public final long f28854c;
    public final String d;

    public h41(String str, MessageObject messageObject, long j10, int i10) {
        this.f28852a = i10;
        this.f28853b = messageObject;
        this.f28854c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f28852a;
        String str = this.d;
        long j10 = this.f28854c;
        MessageObject messageObject = this.f28853b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                m41.g(messageObject, j10, str);
                return;
        }
    }
}
