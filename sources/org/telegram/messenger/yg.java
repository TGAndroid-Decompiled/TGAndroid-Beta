package org.telegram.messenger;

import java.util.ArrayList;
public final class yg implements Runnable {
    public final int f20177a;
    public final NotificationsController f20178b;
    public final ArrayList f20179c;

    public yg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f20177a = i10;
        this.f20178b = notificationsController;
        this.f20179c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20177a) {
            case 0:
                this.f20178b.lambda$forceShowPopupForReply$7(this.f20179c);
                return;
            case 1:
                this.f20178b.lambda$processReadMessages$21(this.f20179c);
                return;
            case 2:
                this.f20178b.lambda$processDialogsUpdateRead$29(this.f20179c);
                return;
            case 3:
                this.f20178b.lambda$removeDeletedMessagesFromNotifications$9(this.f20179c);
                return;
            default:
                this.f20178b.lambda$removeDeletedHisoryFromNotifications$12(this.f20179c);
                return;
        }
    }
}
