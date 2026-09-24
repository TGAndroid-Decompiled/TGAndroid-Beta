package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class m31 implements Runnable {
    public final int f26341a;
    public final MessageObject f26342b;
    public final long f26343c;
    public final String d;

    public m31(String str, MessageObject messageObject, long j3, int i10) {
        this.f26341a = i10;
        this.f26342b = messageObject;
        this.f26343c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26341a;
        String str = this.d;
        long j3 = this.f26343c;
        MessageObject messageObject = this.f26342b;
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
