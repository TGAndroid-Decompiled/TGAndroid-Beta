package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class g41 implements Runnable {
    public final int f26602a;
    public final MessageObject f26603b;
    public final long f26604c;
    public final String d;

    public g41(String str, MessageObject messageObject, long j3, int i10) {
        this.f26602a = i10;
        this.f26603b = messageObject;
        this.f26604c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26602a;
        String str = this.d;
        long j3 = this.f26604c;
        MessageObject messageObject = this.f26603b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                l41.g(messageObject, j3, str);
                return;
        }
    }
}
