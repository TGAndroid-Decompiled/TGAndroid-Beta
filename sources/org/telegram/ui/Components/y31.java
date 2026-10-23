package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class y31 implements Runnable {
    public final int f32800a;
    public final MessageObject f32801b;
    public final long f32802c;
    public final String d;

    public y31(String str, MessageObject messageObject, long j10, int i10) {
        this.f32800a = i10;
        this.f32801b = messageObject;
        this.f32802c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f32800a;
        String str = this.d;
        long j10 = this.f32802c;
        MessageObject messageObject = this.f32801b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                e41.g(messageObject, j10, str);
                return;
        }
    }
}
