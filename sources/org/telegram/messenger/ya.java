package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ya implements Runnable {
    public final int f20210a;
    public final NotificationCenter.NotificationCenterDelegate f20211b;
    public final long f20212c;
    public final int d;
    public final int e;
    public final boolean f20213f;

    public ya(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f20210a = i12;
        this.f20211b = messagesController;
        this.f20212c = j10;
        this.d = i10;
        this.e = i11;
        this.f20213f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f20210a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f20211b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f20212c, this.d, this.e, this.f20213f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f20212c, this.d, this.e, this.f20213f);
                return;
            default:
                int i11 = ChatActivityEnterView.f24051r5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f20213f, this.e, false, this.f20212c);
                return;
        }
    }

    public ya(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f20210a = 2;
        this.f20211b = chatActivityEnterView;
        this.f20213f = z10;
        this.d = i10;
        this.e = i11;
        this.f20212c = j10;
    }
}
