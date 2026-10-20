package org.telegram.messenger;

import java.util.ArrayList;
public final class yg implements Runnable {
    public final int f20183a;
    public final NotificationsController f20184b;
    public final ArrayList f20185c;

    public yg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20183a = i10;
        this.f20184b = notificationsController;
        this.f20185c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20183a) {
            case 0:
                this.f20184b.lambda$forceShowPopupForReply$7(this.f20185c);
                return;
            case 1:
                this.f20184b.lambda$processReadMessages$21(this.f20185c);
                return;
            case 2:
                this.f20184b.lambda$processDialogsUpdateRead$29(this.f20185c);
                return;
            case 3:
                this.f20184b.lambda$removeDeletedMessagesFromNotifications$9(this.f20185c);
                return;
            default:
                this.f20184b.lambda$removeDeletedHisoryFromNotifications$12(this.f20185c);
                return;
        }
    }
}
