package org.telegram.messenger;

import java.util.ArrayList;

public final class yg implements Runnable {

    public final int f22258a;

    public final NotificationsController f22259b;

    public final ArrayList f22260c;

    public yg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.f22258a = i10;
        this.f22259b = notificationsController;
        this.f22260c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22258a) {
            case 0:
                this.f22259b.lambda$removeDeletedHisoryFromNotifications$11(this.f22260c);
                break;
            case 1:
                this.f22259b.lambda$processReadMessages$20(this.f22260c);
                break;
            case 2:
                this.f22259b.lambda$forceShowPopupForReply$6(this.f22260c);
                break;
            case 3:
                this.f22259b.lambda$removeDeletedMessagesFromNotifications$8(this.f22260c);
                break;
            default:
                this.f22259b.lambda$processDialogsUpdateRead$28(this.f22260c);
                break;
        }
    }
}
