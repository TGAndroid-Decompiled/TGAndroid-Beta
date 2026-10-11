package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
public final class f41 implements Runnable {
    public final int f26313a;
    public final MessageObject f26314b;
    public final long f26315c;
    public final String d;

    public f41(String str, MessageObject messageObject, long j3, int i10) {
        this.f26313a = i10;
        this.f26314b = messageObject;
        this.f26315c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f26313a;
        String str = this.d;
        long j3 = this.f26315c;
        MessageObject messageObject = this.f26314b;
        switch (i10) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i11 = NotificationCenter.voiceTranscriptionUpdate;
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, messageObject, valueOf, str, bool, bool);
                return;
            default:
                k41.g(messageObject, j3, str);
                return;
        }
    }
}
