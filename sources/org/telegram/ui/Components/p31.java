package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class p31 implements Runnable {
    public final int f27238a;
    public final MessageObject f27239b;
    public final long f27240c;
    public final String d;

    public p31(String str, MessageObject messageObject, long j3, int i10) {
        this.f27238a = i10;
        this.f27239b = messageObject;
        this.f27240c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f27238a;
        String str = this.d;
        long j3 = this.f27240c;
        MessageObject messageObject = this.f27239b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                u31.g(messageObject, j3, str);
                return;
        }
    }
}
