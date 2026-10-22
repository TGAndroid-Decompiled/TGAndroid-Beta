package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ya implements Runnable {
    public final int f20141a;
    public final NotificationCenter.NotificationCenterDelegate f20142b;
    public final long f20143c;
    public final int d;
    public final int e;
    public final boolean f20144f;

    public ya(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f20141a = i12;
        this.f20142b = messagesController;
        this.f20143c = j10;
        this.d = i10;
        this.e = i11;
        this.f20144f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f20141a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f20142b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f20143c, this.d, this.e, this.f20144f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f20143c, this.d, this.e, this.f20144f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23911n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f20144f, this.e, false, this.f20143c);
                return;
        }
    }

    public ya(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f20141a = 2;
        this.f20142b = chatActivityEnterView;
        this.f20144f = z10;
        this.d = i10;
        this.e = i11;
        this.f20143c = j10;
    }
}
