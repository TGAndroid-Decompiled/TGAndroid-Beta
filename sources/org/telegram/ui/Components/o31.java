package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class o31 implements Runnable {
    public final int f26920a;
    public final MessageObject f26921b;
    public final long f26922c;
    public final String d;

    public o31(String str, MessageObject messageObject, long j3, int i10) {
        this.f26920a = i10;
        this.f26921b = messageObject;
        this.f26922c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26920a;
        String str = this.d;
        long j3 = this.f26922c;
        MessageObject messageObject = this.f26921b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                t31.g(messageObject, j3, str);
                return;
        }
    }
}
