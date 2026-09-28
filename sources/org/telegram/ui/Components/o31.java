package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class o31 implements Runnable {
    public final int f26919a;
    public final MessageObject f26920b;
    public final long f26921c;
    public final String d;

    public o31(String str, MessageObject messageObject, long j3, int i10) {
        this.f26919a = i10;
        this.f26920b = messageObject;
        this.f26921c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26919a;
        String str = this.d;
        long j3 = this.f26921c;
        MessageObject messageObject = this.f26920b;
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
