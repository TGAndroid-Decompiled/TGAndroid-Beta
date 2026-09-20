package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class n31 implements Runnable {
    public final int f26552a;
    public final MessageObject f26553b;
    public final long f26554c;
    public final String d;

    public n31(String str, MessageObject messageObject, long j3, int i10) {
        this.f26552a = i10;
        this.f26553b = messageObject;
        this.f26554c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26552a;
        String str = this.d;
        long j3 = this.f26554c;
        MessageObject messageObject = this.f26553b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                s31.g(messageObject, j3, str);
                return;
        }
    }
}
