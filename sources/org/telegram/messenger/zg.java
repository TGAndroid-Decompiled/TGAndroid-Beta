package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20013a;
    public final NotificationsController f20014b;
    public final int f20015c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20013a = i11;
        this.f20014b = notificationsController;
        this.f20015c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20013a) {
            case 0:
                this.f20014b.lambda$processDialogsUpdateRead$29(this.f20015c);
                return;
            case 1:
                this.f20014b.lambda$removeDeletedHisoryFromNotifications$12(this.f20015c);
                return;
            case 2:
                this.f20014b.lambda$processSeenStoryReactions$14(this.f20015c);
                return;
            case 3:
                this.f20014b.lambda$processNewMessages$24(this.f20015c);
                return;
            case 4:
                this.f20014b.lambda$processNewMessages$26(this.f20015c);
                return;
            case 5:
                this.f20014b.lambda$setLastOnlineFromOtherDevice$5(this.f20015c);
                return;
            case 6:
                this.f20014b.lambda$processLoadedUnreadMessages$32(this.f20015c);
                return;
            default:
                this.f20014b.lambda$removeDeletedMessagesFromNotifications$9(this.f20015c);
                return;
        }
    }
}
