package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20014a;
    public final NotificationsController f20015b;
    public final int f20016c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20014a = i11;
        this.f20015b = notificationsController;
        this.f20016c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20014a) {
            case 0:
                this.f20015b.lambda$processDialogsUpdateRead$29(this.f20016c);
                return;
            case 1:
                this.f20015b.lambda$removeDeletedHisoryFromNotifications$12(this.f20016c);
                return;
            case 2:
                this.f20015b.lambda$processSeenStoryReactions$14(this.f20016c);
                return;
            case 3:
                this.f20015b.lambda$processNewMessages$24(this.f20016c);
                return;
            case 4:
                this.f20015b.lambda$processNewMessages$26(this.f20016c);
                return;
            case 5:
                this.f20015b.lambda$setLastOnlineFromOtherDevice$5(this.f20016c);
                return;
            case 6:
                this.f20015b.lambda$processLoadedUnreadMessages$32(this.f20016c);
                return;
            default:
                this.f20015b.lambda$removeDeletedMessagesFromNotifications$9(this.f20016c);
                return;
        }
    }
}
