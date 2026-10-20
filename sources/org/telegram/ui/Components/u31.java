package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class u31 implements Runnable {
    public final int f30833a;
    public final MessageObject f30834b;
    public final long f30835c;
    public final String d;

    public u31(String str, MessageObject messageObject, long j10, int i10) {
        this.f30833a = i10;
        this.f30834b = messageObject;
        this.f30835c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30833a;
        String str = this.d;
        long j10 = this.f30835c;
        MessageObject messageObject = this.f30834b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                a41.g(messageObject, j10, str);
                return;
        }
    }
}
